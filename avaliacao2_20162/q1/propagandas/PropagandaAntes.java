package avaliacao2_20162.q1.propagandas;

import avaliacao2_20162.q1.abstracoes.IComponent;

public class PropagandaAntes implements IComponent {

    private IComponent component;

    public PropagandaAntes(IComponent component) { this.component = component; }
    
    @Override
    public void play() {
        System.out.println("Playing commercial before");
        this.component.play();
    }
}
