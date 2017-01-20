package CreationalPatterns.FactoryMethod.MainForm;

import CreationalPatterns.FactoryMethod.MainForm.Factory.Application;
import CreationalPatterns.FactoryMethod.MainForm.Factory.MyApplication;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 9/28/2016
 */
public class Main {

    public static void main(String[] args) {
        // Client's customization of the Framework
        Application application = new MyApplication();
        application.newDocument("foo");
        application.newDocument("bar");
    }
}
