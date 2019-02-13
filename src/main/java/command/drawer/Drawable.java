package command.drawer;

import java.awt.Color;

public interface Drawable {
    void init();
    void draw(int x, int y, Color color);
    void setCurrentColor(Color color);
    Color getCurrentColor();
}
