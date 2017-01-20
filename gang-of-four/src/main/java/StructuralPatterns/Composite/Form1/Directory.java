package StructuralPatterns.Composite.Form1;

import java.util.ArrayList;
import java.util.List;

/**
 * Directory implements the "lowest common denominator"
 * Recursive Composition
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 9/29/2016.
 */
public class Directory implements AbstractFile {

    private List<AbstractFile> abstractFiles = new ArrayList<>();

    private String name;

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public void ls() {
        System.out.println("Directory " + name);

        for (AbstractFile file : abstractFiles)
            file.ls();
    }

    // More safety, less transparency

    public void add(AbstractFile abstractFile) {
        abstractFiles.add(abstractFile);
    }

    public AbstractFile get(int i) {
        return abstractFiles.get(i);
    }

    public void remove(AbstractFile abstractFile) {
        abstractFiles.remove(abstractFile);
    }
}
