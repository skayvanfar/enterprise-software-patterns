package CreationalPatterns.FactoryMethod.MainForm.Factory;

import CreationalPatterns.FactoryMethod.MainForm.Document;

/**
 * Framework declaration
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 9/28/2016
 */
public abstract class Application {

    private int index;
    private Document[] documents = new Document[10];

    public void newDocument(String name) {
        System.out.println("Application: NewDocument()");
        documents[index] = createDocument(name);
        index++;
    }

    public abstract Document createDocument(String name);

}
