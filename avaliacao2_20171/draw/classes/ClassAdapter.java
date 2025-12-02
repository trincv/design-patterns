package avaliacao2_20171.draw.classes;

import avaliacao2_20171.draw.interfaces.DrawClass;
import avaliacao2_20171.draw.interfaces.DrawingFigures;

public class ClassAdapter implements DrawClass {
    
    private DrawingFigures figure;

    public ClassAdapter(DrawingFigures figure) {
        this.figure = figure;
    }

    @Override
    public void drawFigure() {
        System.out.println("Drawing a figure with class adapter: ");
        this.figure.draw();    
    }

    @Override
    public void setFigure(DrawingFigures figure) {
        this.figure = figure;
    }
}
