import java.awt.*;
import javax.swing.JFrame;

public class Frame extends JFrame
{
    private Flock flock;
    protected static int length = 900;
    protected static int height = 900;
    protected static Color backgroundColor = Color.white;


    public Frame(Flock flock)
    {
        super("Стая");
        this.setSize(length, height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.flock = flock;

    }

    public void paint(Graphics g)
    {
        Rectangle s = this.getBounds();
        g.setColor(backgroundColor);
        //g.fillRect(0, 0, s.width, s.height);
        g.setColor(Color.pink);
        g.drawLine(length / 2, 0, -height / 2, 0);
        flock.draw(g);
    }
    public void drawer(Graphics c){
        c.setColor(Color.black);
        c.drawLine(0, length / 2, 0, -height / 2);
        flock.draw(c);
    }
}
