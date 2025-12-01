package system.implementations;

import system.interfaces.FileSystemComponent;

public class File implements FileSystemComponent {
    
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void showDetails(String ident) {
        System.out.println(ident + name);
    }

    @Override
    public FileSystemComponent getChild(String name) {
        return null;
    }

    @Override
    public void addChild(FileSystemComponent component) {
        throw new UnsupportedOperationException("You cannot add childs to files");
    }

    @Override
    public void removeChild(String name) {
        throw new UnsupportedOperationException("You cannot remove childs from files");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
