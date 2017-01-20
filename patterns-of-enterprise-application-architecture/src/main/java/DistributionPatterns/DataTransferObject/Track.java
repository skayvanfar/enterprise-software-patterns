package DistributionPatterns.DataTransferObject;

import java.util.List;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 1/20/2017.
 */
public class Track {

    private String title;

    private List<Artist> performers;

    public Track(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Artist> getPerformers() {
        return performers;
    }

    public void setPerformers(List<Artist> performers) {
        this.performers = performers;
    }

    public void addPerformer(Artist performer) {
        if (!performers.contains(performer))
            performers.add(performer);
    }

    public void clearPerformers() {

    }
}
