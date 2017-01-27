import java.util.Scanner;

/**
 * Created by Phillip Alisson Volpi on 25/01/17.
 */
public class Maior {
    public static void main(String[] args){
        //Obtem valores do usuario
        Scanner entrada = new Scanner(System.in);

        int primeiro = 0, segundo = 0, terceiro = 0;
        int maiorAB = 0;
        primeiro = entrada.nextInt();
        segundo = entrada.nextInt();
        terceiro = entrada.nextInt();

        maiorAB = (primeiro + segundo + Math.abs(primeiro-segundo))/2;

        maiorAB = (maiorAB > terceiro)? maiorAB : terceiro;

        System.out.println(maiorAB+" eh o maior");

    }
}
