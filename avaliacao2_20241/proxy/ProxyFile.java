package avaliacao2_20241.proxy;

import java.util.HashMap;
import java.util.Map;

import avaliacao2_20241.interfaces.Component;
import avaliacao2_20241.models.Credential;
import avaliacao2_20241.models.File;

public class ProxyFile implements Component {
    
    private File file;
    private Map<String, Integer> credentialsAccess = new HashMap<>();

    public ProxyFile(File file) { this.file = file; }

    @Override
    public void ler(Credential credential) {

        String id = credential.getId();
        int currentCount = credentialsAccess.getOrDefault(id, 0);

        if (currentCount < 3) {

            credentialsAccess.put(id, currentCount + 1);
            file.ler(credential);

        } else 
            System.out.println("A credencial não pode mais ler o arquivo (Limite excedido)");
        
    }

    @Override
    public Long getSize() {
        return this.file.getSize();
    }

    @Override
    public void add(Component component) {
        this.file.add(component);
    }

    @Override
    public void showDetails(String ident) {
        this.file.showDetails(ident);
    }

}
