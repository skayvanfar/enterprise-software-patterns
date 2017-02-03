package WebPresentationPatterns.ApplicationController;

import java.util.Map;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 2/3/2017.
 */
public interface ApplicationController {
    DomainCommand getDomainCommand (String commandString, Map params);
    String getView (String commandString, Map params);
}
