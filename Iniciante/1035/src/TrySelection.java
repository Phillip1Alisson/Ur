import java.util.Scanner;

/**
 * Created by Phillip Alisson Volpi on 13/02/17.
 */
public class TrySelection {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int A, B, C, D;
        A = entrada.nextInt();
        B = entrada.nextInt();
        C = entrada.nextInt();
        D = entrada.nextInt();

        if((B > C) && (D > A) && ( (C + D) > (A + B) ) && ( A%2 == 0 ) && ( C >= 0 ) && ( D >= 0 ) )
            System.out.println("Valores aceitos");
        else
            System.out.println("Valores não aceitos");


    }
}
