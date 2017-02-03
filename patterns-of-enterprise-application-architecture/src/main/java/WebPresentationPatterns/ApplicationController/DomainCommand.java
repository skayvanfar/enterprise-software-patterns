package WebPresentationPatterns.ApplicationController;

import java.util.Map;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 2/3/2017.
 */
public interface DomainCommand {
    void run(Map params);
}
