package StructuralPatterns.Composite.Form1;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 9/29/2016.
 */
public class Main {
    public static void main(String[] args) {
        // More safety, less transparency
        File file1 = new File("a");
        File file2 = new File("b");

        Directory directory1 = new Directory("c");
        Directory directory2 = new Directory("d");

        // Whole - Part
        directory1.add(file1);
        directory1.add(file2);
        directory1.add(directory2);

        directory1.ls();

    }
}
