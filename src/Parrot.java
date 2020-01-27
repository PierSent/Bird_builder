import java.awt.*;

public class Parrot extends Bird
{
    private static int numpar = 0;
    private static int parrotSize = 20;

    public Parrot()
    {
        size = parrotSize;
        color = Color.red;
        //System.out.println("Кол-во ваших гордых попугаев - " + ++numpar);
    }

    public int getType()
    {
        return 0;
    }

    public static int getSize()
    {
        return parrotSize;
    }
}
