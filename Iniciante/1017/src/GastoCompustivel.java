import java.util.Scanner;

/**
 * Created by Phillip Alisson Volpi on 30/01/17.
 */
public class GastoCompustivel {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double horas = 0.0, velocidadeKm = 0.0;
        final double kmL = 12.0;

        horas        = entrada.nextDouble();
        velocidadeKm = entrada.nextDouble();

        System.out.printf("%.3f",(horas * velocidadeKm) / kmL);

    }

}
