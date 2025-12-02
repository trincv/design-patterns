package avaliacao2_20171;

import avaliacao2_20171.draw.classes.ClassAdapter;
import avaliacao2_20171.draw.classes.ObjectAdapter;
import avaliacao2_20171.draw.figures.Circle;
import avaliacao2_20171.draw.figures.Rectangle;
import avaliacao2_20171.draw.interfaces.DrawClass;
import avaliacao2_20171.draw.interfaces.DrawingFigures;
import avaliacao2_20171.supermercado.composite.Composite;
import avaliacao2_20171.supermercado.interfaces.Component;
import avaliacao2_20171.supermercado.leafs.Camisa;
import avaliacao2_20171.supermercado.leafs.Leite;

public class Main {

    public static void q1() {
        Component laticinios = new Composite();
        Component vestuario = new Composite();
        Component todosOsProdutos = new Composite();
        Leite l = new Leite(2.0); // Preço = R$ 2.00
        Camisa c = new Camisa(30.0); // Preço = R$ 30.00
        laticinios.add(l);
        vestuario.add(c);
        todosOsProdutos.add(laticinios);
        todosOsProdutos.add(vestuario);
        todosOsProdutos.aumentar(0.1); // Aumenta todos os produtos em 10%
        laticinios.aumentar(0.1); // Aumenta somente laticinios em 10%
        System.out.println(l.getPreco()); // O preço do leite agora deve ser R$ 2.42
        System.out.println(c.getPreco()); // O preço da camisa agora deve ser R$ 33.0
    }

    public static void q2() {
        Rectangle rectangle = new Rectangle();
        DrawClass objAdapter = new ObjectAdapter();
        objAdapter.drawFigure();

        DrawingFigures circle = new Circle();
        DrawClass classAdapter = new ClassAdapter(circle);
        classAdapter.drawFigure();
        classAdapter.setFigure(rectangle);
        classAdapter.drawFigure();
    }
    public static void main(String[] args) {
        q1();
        q2();
    }
}
