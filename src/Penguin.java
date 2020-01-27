import java.awt.*;

public class Penguin extends Bird
{
    private static int penguinSize = 20;
    private static int numpop = 0;

    /*public Penguin()
    {
        System.out.println("Кол-во ваших пингвинчиков - " + ++numpop);
    }*/

    public int getType()
    {
        return 1;
    }

    public void draw(Graphics g)
    {
        size = penguinSize;
        g.setColor(Color.BLUE);
        g.fillOval(x, y, size, size);
    }

    public static int getSize()
    {
        return penguinSize;
    }


}
