package avaliacao2_20171.supermercado.composite;

import java.util.ArrayList;
import java.util.List;

import avaliacao2_20171.supermercado.interfaces.Component;

public class Composite implements Component {

    private List<Component> children = new ArrayList<>();

    @Override
    public void add(Component component) {
        this.children.add(component);
    }

    @Override
    public void aumentar(double aumento) {
        for (Component child : this.children)
            child.aumentar(aumento);
    }
    
    @Override
    public double getPreco() {
        throw new UnsupportedOperationException("A class cannot return a price");
    }
}
