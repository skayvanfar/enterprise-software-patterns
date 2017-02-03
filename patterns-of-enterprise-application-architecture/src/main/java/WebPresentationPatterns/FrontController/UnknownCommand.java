package WebPresentationPatterns.FrontController;

import javax.servlet.ServletException;
import java.io.IOException;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 2/3/2017.
 */
public class UnknownCommand extends FrontCommand {
    @Override
    public void process() throws ServletException, IOException {
        forward("/unknown.jsp");
    }
}
