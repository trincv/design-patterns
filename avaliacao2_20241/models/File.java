package avaliacao2_20241.models;

import java.time.LocalDateTime;

import avaliacao2_20241.interfaces.Component;


public class File implements Component {
    
    protected String name;
    protected Long size;
    protected LocalDateTime creationDate;

    public File(String name, Long size, LocalDateTime creationDate) {
        this.creationDate = creationDate;
        this.name = name;
        this.size = size;
    }

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException("Cannot add files nor folder in a file");
    }

    @Override
    public Long getSize() {
        return this.size;
    }

    @Override
    public void showDetails(String ident) {
        System.out.println(ident + name);
    }

    @Override
    public void ler(Credential credential) {
        System.out.println("The file was read by " + credential.getId() + " credential");
    }
}
