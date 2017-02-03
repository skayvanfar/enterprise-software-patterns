package WebPresentationPatterns.FrontController;

import javax.servlet.ServletException;
import java.io.IOException;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 2/3/2017.
 */
public class ArtistCommand extends FrontCommand {

    @Override
    public void process() throws ServletException, IOException {
        Artist artist = Artist.findNamed(request.getParameter("name"));
        request.setAttribute("helper", new ArtistHelper(artist));
        forward("/artist.jsp"); // Template View
    }
}
