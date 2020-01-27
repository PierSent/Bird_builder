import java.awt.*;

public class Sparrow extends Bird
{
    private static int sparrowSize = 10;
    private static int numspa = 0;
    public Sparrow()
    {
        color = Color.orange;
        size = sparrowSize;
        //System.out.println("Кол-во ваших малых да удалых воробьев - " + ++numspa);
    }

    public int getType()
    {
        return 2;
    }

    public static int getSize()
    {
        return sparrowSize;
    }
}
