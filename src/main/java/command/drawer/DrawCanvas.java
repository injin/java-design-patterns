package command.drawer;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import command.command.MacroCommand;

public class DrawCanvas extends Canvas implements Drawable {

    private static final long serialVersionUID = 1L;
    
    private Color color = Color.red;
    private int radius = 6;
    private MacroCommand history;
    
    public DrawCanvas(int width, int height, MacroCommand history) {
        setSize(width, height);
        setBackground(Color.white);
        this.history = history;
    }
    
    // 이력 전체를 다시 그리기
    public void paint(Graphics g) {
        history.execute();
    }
    
    @Override
    public void draw(int x, int y) {
        Graphics g = getGraphics();
        g.setColor(color);
        g.fillOval(x-radius, y-radius, radius*2, radius*2);
    }

}
