import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("_________________________________________________________\n" +
                "Выберите континент:\n" + "Если хотите отправиться в тропический лес, напишите: лес\n" + "Если хотите попасть на северный полюс, напишите: пол\n" + "_________________________________________________________");
        Flock FirstFlock = new Flock();
        new Frame(FirstFlock);
    }
}
