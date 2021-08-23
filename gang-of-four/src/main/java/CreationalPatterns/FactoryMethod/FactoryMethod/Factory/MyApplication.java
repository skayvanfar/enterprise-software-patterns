package CreationalPatterns.FactoryMethod.FactoryMethod.Factory;

import CreationalPatterns.FactoryMethod.FactoryMethod.Document;
import CreationalPatterns.FactoryMethod.FactoryMethod.MyDocument;

/**
 * Customization of framework defined by client
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 9/28/2016
 */
public class MyApplication extends Application {
    @Override
    public Document createDocument(String name) {
        return new MyDocument(name);
    }
}
