package command.anonyous;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

import command.command.Command;
import command.command.MacroCommand;
import command.drawer.DrawCanvas;
import command.drawer.DrawCommand;

public class Main extends JFrame implements ActionListener, MouseMotionListener, WindowListener {
    
    private static final long serialVersionUID = 1L;
    
    // 그림 그린 이력
    private MacroCommand history = new MacroCommand();
    // 그림 그리는 영역
    private DrawCanvas canvas = new DrawCanvas(400, 400, history);
    // 제거 버튼
    private JButton clearButton = new JButton("clear");
    // 컬러 선택 버튼
    private JButton colorButton = new JButton("color");
    // 취소 버튼
    private JButton undoButton = new JButton("undo");
    
    
    public Main(String title) {
        super(title);
        
        this.addWindowListener(this);
        canvas.addMouseMotionListener(this);
        clearButton.addActionListener(this);
        colorButton.addActionListener(this);
        undoButton.addActionListener(this);
        
        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
        buttonBox.add(colorButton);
        buttonBox.add(undoButton);
        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);
        getContentPane().add(mainBox);
        
        pack();
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clearButton) {
            history.clear();
            canvas.repaint();
        } else if (e.getSource() == colorButton) {
            Color newColor = JColorChooser.showDialog(null, "Choose a color", Color.RED);
            if (newColor != null) {
                canvas.setCurrentColor(newColor);
            }
        } else if (e.getSource() == undoButton) {
            history.undo();
            canvas.repaint();
        }
    }
    
    @Override
    public void mouseMoved(MouseEvent e) {
        
    }
    
    @Override
    public void mouseDragged(MouseEvent e) {
        Command cmd = new DrawCommand(canvas, e.getPoint());
        history.append(cmd);
        cmd.execute();
    }
    
    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowOpened(WindowEvent e) {}
    @Override
    public void windowClosed(WindowEvent e) {}
    @Override
    public void windowIconified(WindowEvent e) {}
    @Override
    public void windowDeiconified(WindowEvent e) {}
    @Override
    public void windowActivated(WindowEvent e) {}
    @Override
    public void windowDeactivated(WindowEvent e) {}
    
    public static void main(String[] args) {
        new Main("Command Pattern Sample");
    }
    
    
    
}
