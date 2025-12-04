package avaliacao2_20162.q1.propagandas;

import avaliacao2_20162.q1.abstracoes.IComponent;

public class PropagandaDepois implements IComponent {

    private IComponent component;
    
    public PropagandaDepois(IComponent component) { this.component = component; }
    
    @Override
    public void play() {
        this.component.play();
        System.out.println("Playing commercial after");
    }
}
