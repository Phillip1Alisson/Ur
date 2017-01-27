import java.util.Scanner;

/**
 * Created by gita on 25/01/17.
 */
public class Ball {

    public static void main(String[] args){
        Scanner raioEntrada = new Scanner(System.in);
        double raio;
        double PI = 3.14159;

        raio = raioEntrada.nextDouble();

        System.out.printf("VOLUME = %.3f", (4/3.0) * PI * Math.pow(raio, 3.0));

    }
}
