package avaliacao2_20171.draw.classes;

import avaliacao2_20171.draw.figures.Rectangle;
import avaliacao2_20171.draw.interfaces.DrawClass;
import avaliacao2_20171.draw.interfaces.DrawingFigures;

public class ObjectAdapter extends Rectangle implements DrawClass {

    @Override
    public void drawFigure() {
        System.out.println("Drawing a figure with object adapter: ");
        this.draw();   
    }

    @Override
    public void setFigure(DrawingFigures figure) {
        throw new UnsupportedOperationException("Cannot set a drawing figure to obj adapter");
    }
}
