import java.awt.*;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public abstract class Bird
{
    protected int num = 0;
    protected int x;
    protected int y;
    protected int size = 25;
    protected Color color = Color.BLACK;

    public Bird()
    {
        num = num + 1;
        x = (int)((Frame.length - 20 * 2 - 25 - size/2)*Math.random() + 25 + 20);
        y = (int)((Frame.height - 20 * 2 - 25 - size/2)*Math.random() + 25 + 20);

    }

    public int getType()
    {
        return 100;
    }

    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }

    public void draw(Graphics g)
    {
        g.setColor(color);
        g.fillOval(x, y, size, size);
        g.setColor(Color.black);
    }
}