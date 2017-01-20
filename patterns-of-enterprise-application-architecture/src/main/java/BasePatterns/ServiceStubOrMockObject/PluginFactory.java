package BasePatterns.ServiceStubOrMockObject;

import java.util.Properties;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 1/20/2017.
 */
public class PluginFactory {

    private static Properties props = new Properties();

    static {
        try {
            props.load(PluginFactory.class.getResourceAsStream("/plugins.properties"));
        } catch (Exception ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Object getPlugin(Class iface) {
        String implName = props.getProperty(iface.getName());
        if (implName == null) {
            throw new RuntimeException("implementation not specified for " +
                    iface.getName() + " in PluginFactory propeties.");
        }
        try {
            return Class.forName(implName).newInstance();
        } catch (Exception ex) {
            throw new RuntimeException("factory unable to construct instance of " +
                    iface.getName());
        }
    }
}
