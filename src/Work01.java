import java.util.Scanner;

public class Work01 {
    public static void main(String[] args) {
        float x, y;
        System.out.print("Введите координату x: ");
        Scanner in = new Scanner(System.in);
        x = in.nextFloat();
        System.out.print("Введите координату y: ");
        y = in.nextFloat();
        if (y>x*x && x*x+y*y<1) {
            System.out.println("Точка попала в зону M1");
        }
        else if (x>0 && x<1 && y>-x && y<0 && y>-1 && x*x+y*y<1) {
            System.out.println("Точка попала в зону M2");
        }
        else if (x>-1 && x<0 && y<0 && y>-1 && x*x+y*y<1){
            System.out.println("Точка попала в зону M3");
        }
        else if (y==0 || y==-x || (x==0 && y<=0 && y>=-1) || y==x*x || x*x+y*y==1){
            System.out.println("Точка попала на линию разграничения");
        }
        else if (x*x+y*y<1 && x!=y){
            System.out.println("Точка попала в зону M4");
        }
        else {
            System.out.println("Точка попала за круг");
        }
    }
}