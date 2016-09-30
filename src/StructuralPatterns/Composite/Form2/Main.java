package StructuralPatterns.Composite.Form2;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 9/29/2016.
 */
public class Main {
    public static void main(String[] args) {
        // less safety, more transparency
        AbstractFile file1 = new File("a");
        AbstractFile file2 = new File("b");

        AbstractFile directory1 = new Directory("c");
        AbstractFile directory2 = new Directory("d");

        // Whole - Part
        directory1.add(file1);
        directory1.add(file2);
        directory1.add(directory2);

        directory1.ls();

    }
}
