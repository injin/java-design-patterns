package command.drawer;

import java.awt.Color;

import command.command.Command;

public class ColorCommand implements Command {
    protected Drawable drawable;
    private Color color;
    
    public ColorCommand(Drawable drawable, Color color) {
        this.drawable = drawable;
        this.color = color;
    }
    
    public void execute() {
        drawable.setColor(color);
    }
}
