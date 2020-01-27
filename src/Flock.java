import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Flock {
    private ArrayList<Bird> flock;
    private int max;
    private int min;

    public Flock() {
        Scanner read = new Scanner(System.in);
        flock = new ArrayList<>();
        int kol = 0;
        int sp = 0;
        int pen = 0;
        int par = 0;



            String answer = read.nextLine();

            if (answer.equals("лес")) {

                flock.add(new Penguin());
                for (int r = 0; r < 5; r++){
                    flock.add(new Parrot());
                    flock.add(new Sparrow());
                }
                flock.add(new Penguin());
            }
            if (answer.equals("пол")) {
                flock.add(new Penguin());
                for (int r = 0; r < 6; r++){
                    flock.add(new Penguin());
                }
                for (int r = 0; r < 3; r++){
                    flock.add(new Parrot());
                    flock.add(new Sparrow());
                }
            }


        /*for (int i = 0; ; i++) {
            String answer = read.nextLine();

            if (answer.equals("поп")) {
                for (int r = 0; r < 5; r++){
                    flock.add(new Parrot());
                    flock.add(new Penguin());
                    flock.add(new Sparrow());
                }
            }
            if (answer.equals("пин")) {
                pen++;
                kol++;
                flock.add(new Penguin());
            }
            if (answer.equals("вор")) {
                sp++;
                kol++;
                flock.add(new Sparrow());
            }
            if (answer.equals("все")) {

                System.out.println("Ваша стая состоит из " + kol + " птиц!");
                break;

            }
        }*/
    }


    public int parrotXMax() {
        max = -40000;
        for (int i = 0; i < flock.size(); i++) {
            if (flock.get(i).getType() == 0) {
                if (flock.get(i).getX() > max)
                    max = flock.get(i).getX();
            }
        }
        return max;
    }

    public int parrotYMax() {
        max = -40000;
        for (int i = 0; i < flock.size(); i++) {
            if (flock.get(i).getType() == 0) {
                if (flock.get(i).getY() > max)
                    max = flock.get(i).getY();
            }
        }
        return max;
    }

    public int parrotXMin() {
        min = 40000;
        for (int i = 0; i < flock.size(); i++) {
            if (flock.get(i).getType() == 0) {
                if (flock.get(i).getX() < min)
                    min = flock.get(i).getX();
            }
        }
        return min;
    }

    public int parrotYMin() {
        min = 40000;
        for (int i = 0; i < flock.size(); i++) {
            if (flock.get(i).getType() == 0) {
                if (flock.get(i).getY() < min)
                    min = flock.get(i).getY();
            }
        }
        return min;
    }

    public int penguinXMax() {
        max = -40000;
        for (int i = 0; i < flock.size(); i++) {
            if (flock.get(i).getType() == 1) {
                if (flock.get(i).getX() > max)
                    max = flock.get(i).getX();
            }
        }
        return max;
    }

    public int penguinYMax() {
        max = -40000;
        for (int i = 0; i < flock.size(); i++) {
            if (flock.get(i).getType() == 1) {
                if (flock.get(i).getY() > max)
                    max = flock.get(i).getY();
            }
        }
        return max;
    }

    public int penguinXMin() {
        min = 40000;
        for (int i = 0; i < flock.size(); i++) {
            if (flock.get(i).getType() == 1) {
                if (flock.get(i).getX() < min)
                    min = flock.get(i).getX();
            }
        }
        return min;
    }

    public int penguinYMin() {
        min = 40000;
        for (int i = 0; i < flock.size(); i++) {
            if (flock.get(i).getType() == 1) {
                if (flock.get(i).getY() < min)
                    min = flock.get(i).getY();
            }
        }
        return min;
    }

    public int sparrowXMax() {
        max = -40000;
        for (int i = 0; i < flock.size(); i++) {
            if (flock.get(i).getType() == 2) {
                if (flock.get(i).getX() > max)
                    max = flock.get(i).getX();
            }
        }
        return max;
    }

    public int sparrowYMax() {
        max = -40000;
        for (int i = 0; i < flock.size(); i++) {
            if (flock.get(i).getType() == 2) {
                if (flock.get(i).getY() > max)
                    max = flock.get(i).getY();
            }
        }
        return max;
    }

    public int sparrowXMin() {
        min = 40000;
        for (int i = 0; i < flock.size(); i++) {
            if (flock.get(i).getType() == 2) {
                if (flock.get(i).getX() < min)
                    min = flock.get(i).getX();
            }
        }
        return min;
    }

    public int sparrowYMin() {
        min = 40000;
        for (int i = 0; i < flock.size(); i++) {
            if (flock.get(i).getType() == 2) {
                if (flock.get(i).getY() < min)
                    min = flock.get(i).getY();
            }
        }
        return min;
    }




    public void draw(Graphics g) {
        for (int i = 0; i < flock.size(); i++) {
            flock.get(i).draw(g);
        }
        g.setColor(Color.RED);
        g.drawRect(parrotXMin(), parrotYMin(), parrotXMax() - parrotXMin() + Parrot.getSize(), parrotYMax() - parrotYMin() + Parrot.getSize());            //прямоугольник попугаев
        g.setColor(Color.orange);
        g.drawRect(sparrowXMin(), sparrowYMin(), sparrowXMax() - sparrowXMin() + Sparrow.getSize(), sparrowYMax() - sparrowYMin() + Sparrow.getSize());    //прямоугольник воробеев
        g.setColor(Color.BLUE);
        g.drawRect(penguinXMin(), penguinYMin(), penguinXMax() - penguinXMin() + Penguin.getSize(), penguinYMax() - penguinYMin() + Penguin.getSize());   //прямоугольник пингвинов
        //g.setColor(Color.black);
        //g.drawLine(0, 900 / 2, 0, -900 / 2);

    }
}