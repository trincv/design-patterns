package system.implementations;

import java.util.ArrayList;
import java.util.List;

import system.interfaces.FileSystemComponent;

public class Folder implements FileSystemComponent {
    
    private String name;
    private List<FileSystemComponent> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void showDetails(String ident) {
        System.out.println(ident + "Folder: " + name);
        for (FileSystemComponent child : children){
            child.showDetails(ident + " ");
        }
    }

    @Override
    public FileSystemComponent getChild(String name) {
        
        for (FileSystemComponent child : children) {
            if (child.getName().equals(name))
                return child;
        }

        return null;
    }

    @Override
    public void addChild(FileSystemComponent component) {
        this.children.add(component);
    }

    @Override
    public void removeChild(String name) throws NullPointerException {
        this.children.remove(this.getChild(name));
    }

    @Override
    public String getName() {
        return this.name;
    }

}
