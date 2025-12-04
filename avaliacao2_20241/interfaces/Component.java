package avaliacao2_20241.interfaces;

import avaliacao2_20241.models.Credential;

public interface Component {
    public Long getSize();
    public void add(Component component);
    public void showDetails(String ident);
    public void ler(Credential credential);
}
