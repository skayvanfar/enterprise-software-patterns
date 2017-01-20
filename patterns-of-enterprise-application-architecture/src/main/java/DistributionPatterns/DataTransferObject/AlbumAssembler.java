package DistributionPatterns.DataTransferObject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 1/20/2017.
 */
public class AlbumAssembler {

    public AlbumDTO writeDTO(Album subject) {
        AlbumDTO result = new AlbumDTO();
        result.setTitle(subject.getTitle());
        result.setArtist(subject.getArtist().getName());
        writeTracks(result, subject);
        return result;
    }

    private void writeTracks(AlbumDTO result, Album subject) {
        List<TrackDTO> newTracks = new ArrayList<>();
        Iterator it = subject.getTracks().iterator();
        while (it.hasNext()) {
            TrackDTO newDTO = new TrackDTO();
            Track thisTrack = (Track) it.next();
            newDTO.setTitle(thisTrack.getTitle());
            writePerformers(newDTO, thisTrack);
            newTracks.add(newDTO);
        }
        result.setTracks(newTracks);
    }

    private void writePerformers(TrackDTO dto, Track subject) {
        List<String> result = new ArrayList<>();
        Iterator it = subject.getPerformers().iterator();
        while (it.hasNext()) {
            Artist each = (Artist) it.next();
            result.add(each.getName());
        }
        dto.setPerformers(result);
    }

    public void createAlbum(String id, AlbumDTO source) {
        Artist artist = Registry.findArtistNamed(source.getArtist());
        if (artist == null)
            throw new RuntimeException("No artist named " + source.getArtist());
        Album album = new Album(source.getTitle(), artist);
        createTracks(source.getTracks(), album);
        Registry.addAlbum(id, album);
    }

    private void createTracks(List<TrackDTO> tracks, Album album) {
        for (TrackDTO trackDTO : tracks) {
            Track newTrack = new Track(trackDTO.getTitle());
            album.addTrack(newTrack);
            createPerformers(newTrack, trackDTO.getPerformers());
        }
    }

    private void createPerformers(Track newTrack, List<String> performerArray) {
        for (int i = 0; i < performerArray.size(); i++) {
            Artist performer = Registry.findArtistNamed(performerArray.get(i));
            if (performer == null)
                throw new RuntimeException("No artist named " + performerArray.get(i));
            newTrack.addPerformer(performer);
        }
    }

    public void updateAlbum(String id, AlbumDTO source) {
        Album current = Registry.findAlbum(id);
        if (current == null)
            throw new RuntimeException("Album does not exist: " + source.getTitle());
        if (source.getTitle() != current.getTitle()) current.setTitle(source.getTitle());
        if (source.getArtist() != current.getArtist().getName()) {
            Artist artist = Registry.findArtistNamed(source.getArtist());
            if (artist == null)
                throw new RuntimeException("No artist named " + source.getArtist());
            current.setArtist(artist);
            updateTracks(source, current);
        }
    }

    private void updateTracks(AlbumDTO source, Album current) {
        for (int i = 0; i < source.getTracks().size(); i++) {
            current.getTracks().get(i).setTitle(source.getTracks().get(i).getTitle());
            current.getTracks().get(i).clearPerformers();
            createPerformers(current.getTracks().get(i), source.getTracks().get(i).getPerformers());
        }
    }
}
