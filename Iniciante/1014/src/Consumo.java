import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by gita on 26/01/17.
 */
public class Consumo {
    public static void main(String[] args){
        Scanner entrada       = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.#");
        String transformar;
        double  combustivel   = 0.0;
        int     km            = 0;
        double  consumo       = 0.0;

        km          = entrada.nextInt();
        combustivel = entrada.nextDouble();

        consumo = (combustivel > 0.0)? km / Double.parseDouble(formato.format(combustivel)) : 0.0;

        System.out.printf("%.3f Km/l", consumo);

    }
}
