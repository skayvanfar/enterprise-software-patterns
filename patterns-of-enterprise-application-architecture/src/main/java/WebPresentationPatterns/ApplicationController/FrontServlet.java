package WebPresentationPatterns.ApplicationController;

import javax.servlet.*;
import java.io.IOException;
import java.util.Map;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 2/3/2017.
 */
public class FrontServlet implements Servlet {

    @Override
    public void init(ServletConfig config) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        ApplicationController appController = getApplicationController(request);
        String commandString = request.getParameter("command");
        DomainCommand comm = appController.getDomainCommand(commandString, getParameterMap(request));
        comm.run(getParameterMap(request));
        String viewPage = "/" + appController.getView(commandString, getParameterMap(request)) + ".jsp";
        forward(viewPage, request, response);
    }

    private void forward(String viewPage, ServletRequest request, ServletResponse response) {

    }

    private ApplicationController getApplicationController(ServletRequest request) {
        return null;
    }

    private Map getParameterMap(ServletRequest request) {
        return null;
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
