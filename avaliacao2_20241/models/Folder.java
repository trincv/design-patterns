package avaliacao2_20241.models;

import java.util.ArrayList;
import java.util.List;

import avaliacao2_20241.interfaces.Component;

public class Folder implements Component {

    private String name;
    private List<Component> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void add(Component component) {
        this.children.add(component);
    }
    
    public Long getSize() {
        Long size = (long) 0;

        for (Component child : this.children) 
            size += child.getSize(); 

        return size;
    }

     @Override
    public void showDetails(String ident) {
        System.out.println(ident + "Folder: " + name);
        for (Component child : this.children){
            child.showDetails(ident + " ");
        }
    }

    @Override
    public void ler(Credential credential) {
        throw new UnsupportedOperationException("cannot read a folder");
    }
}
