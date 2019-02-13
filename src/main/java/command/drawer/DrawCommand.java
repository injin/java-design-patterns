package command.drawer;

import java.awt.Color;
import java.awt.Point;

import command.command.Command;

public class DrawCommand implements Command {
    
    // 그림 그리는 대상
    protected Drawable drawable;
    // 그림 그리는 위치
    private Point position;
    // 색상
    private Color color;
    
    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
        this.color = drawable.getCurrentColor();
    }

    @Override
    public void execute() {
        drawable.draw(position.x, position.y, color);
    }

}
