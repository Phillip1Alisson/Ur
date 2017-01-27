import java.util.Scanner;

/**
 * Created by Phillip Alisson Volpi on 25/01/17.
 */
public class Area {
    public static void main(String[] args){
        //Instancia para receber os valores de entrada, ponto flutuante.
        Scanner entrada = new Scanner(System.in);

        //Receberão os valores para calculo das áreas
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;

        double TRIANGULO = 0.0, CIRCULO = 0.0, TRAPEZIO = 0.0, QUADRADO = 0.0, RETANGULO = 0.0;

        a = entrada.nextDouble();
        b = entrada.nextDouble(); 
        c = entrada.nextDouble();

        TRIANGULO = (a * c)/2;
        CIRCULO   = Math.pow(c,2.0) * Math.PI;
        TRAPEZIO  = ((a + b) * c)/2;
        QUADRADO  = b * b;
        RETANGULO = a * b;

        System.out.printf("TRIANGULO: %.3f\n", TRIANGULO);
        System.out.printf("CIRCULO: %.3f\n", CIRCULO);
        System.out.printf("TRAPEZIO: %.3f\n", TRAPEZIO);
        System.out.printf("QUADRADO: %.3f\n", QUADRADO);
        System.out.printf("RETANGULO: %.3f\n", RETANGULO);

    }
}
