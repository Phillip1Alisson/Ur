import java.util.Scanner;

/**
 * Created by gita on 26/01/17.
 */
public class DistanciaDoisPontos {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        double x1 = 0.0, x2 = 0.0, y1 = 0.0, y2 = 0.0;
        double distancia;

        System.out.print('\0');
        x1 = entrada.nextDouble();
        System.out.print('\0');
        y1 = entrada.nextDouble();
        x2 = entrada.nextDouble();
        y2 = entrada.nextDouble();

        distancia = Math.sqrt(Math.pow(x2-x1,2.0)+Math.pow(y2-y1,2));

        System.out.printf("%.4f", distancia);


    }
}
