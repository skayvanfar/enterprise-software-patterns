package StructuralPatterns.Composite.Form2;

/**
 * File implements the "lowest common denominator"
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 9/29/2016.
 */
public class File implements AbstractFile {

    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void ls() {
        System.out.println("File " + name);
    }

    @Override
    public void add(AbstractFile abstractFile) {
        throw new UnsupportedOperationException("This is File (Leaf)");
    }

    @Override
    public AbstractFile get(int i) {
        throw new UnsupportedOperationException("This is File (Leaf)");
    }

    @Override
    public void remove(AbstractFile abstractFile) {
        throw new UnsupportedOperationException("This is File (Leaf)");
    }
}
