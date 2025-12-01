package system.interfaces;

public interface FileSystemComponent {
    public void showDetails(String ident);
    public FileSystemComponent getChild(String name);
    public void addChild(FileSystemComponent component);
    public void removeChild(String name);
    public String getName();
}
