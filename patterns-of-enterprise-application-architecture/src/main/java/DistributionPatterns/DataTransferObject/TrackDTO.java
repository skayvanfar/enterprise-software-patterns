package DistributionPatterns.DataTransferObject;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 1/20/2017.
 */
public class TrackDTO implements Serializable {

    private String title;

    private List<String> performers;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getPerformers() {
        return performers;
    }

    public void setPerformers(List<String> performers) {
        this.performers = performers;
    }

    public Map writeMap() {
        Map result = new HashMap();
        result.put("title", title);
        result.put("performers", performers);
        return result;
    }

    public static TrackDTO readMap(Map arg) {
        TrackDTO result = new TrackDTO();
        result.title = (String) arg.get("title");
        result.performers = (List<String>) arg.get("performers");
        return result;
    }
}
