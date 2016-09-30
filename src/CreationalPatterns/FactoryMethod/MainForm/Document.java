package CreationalPatterns.FactoryMethod.MainForm;

/**
 * Abstract base class declared by framework
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 9/28/2016
 */
public class Document {

    private String name;

    public String getName() {
        return name;
    }

    public Document(String name) {
        this.name = name;
    }
}
