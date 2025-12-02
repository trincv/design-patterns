package avaliacao2_20171.supermercado.interfaces;

public abstract class Leaf implements Component {

    protected double preco;

    public Leaf(double preco) {
        this.preco = preco;
    }

    @Override
    public void add(Component composite) {
        throw new UnsupportedOperationException("Cannot add composites to a leaf");
    }
    
    @Override
    public void aumentar(double aumento) {
        this.preco += preco * aumento;
    }

    @Override
    public double getPreco() {
        return this.preco;
    }
}
