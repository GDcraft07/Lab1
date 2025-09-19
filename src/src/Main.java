import java.util.Scanner;
import java.io.PrintStream;


public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = new PrintStream(System.out);

    public static void main(String[] args) {
        double X = in.nextDouble(), A = in.nextDouble(), B = in.nextDouble(), C = in.nextDouble();

        if (X - A < 0) {
            if (X - B < 0) {
                if (X - C < 0){
                    out.println(0);
                }

                else {
                    out.println(1);
                }
            }

            else {
                if (X - B - C < 0) {
                    out.println(1);
                }

                else {
                    out.println(2);
                }
            }
        }

        else {
            if (X - A - B < 0) {
                if (X - A - C < 0) {
                    out.println(1);
                }

                else {
                    out.println(2);
                }
            }

            else {
                if (X - A - B - C < 0) {
                    out.println(2);
                }

                else {
                    out.println(3);
                }
            }
        }
    }
}