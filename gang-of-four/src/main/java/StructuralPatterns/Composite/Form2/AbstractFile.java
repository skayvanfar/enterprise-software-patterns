package StructuralPatterns.Composite.Form2;

/**
 * Define a "lowest common denominator"
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 9/29/2016.
 */
// Can use Abstract Class
public interface AbstractFile {
    void ls();

    // less safety, more transparency
    void add(AbstractFile abstractFile);
    AbstractFile get(int i);
    void remove(AbstractFile abstractFile);
}
