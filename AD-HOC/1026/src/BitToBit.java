import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by gita on 08/02/17.
 */
public class BitToBit {

    public static BufferedReader entrada(){
        InputStream       is  = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        return new BufferedReader(isr);

    }

    public static void main(String[] args) throws IOException {
        String[] valores = new String[2];
        String   aux;
        long[]   numeros = new long[2];
        long     resultado;

        aux = BitToBit.entrada().readLine();

        while(aux != null && !(aux.isEmpty())){
            valores   = aux.split(" ", 2);

            int count = 0;

            for (String ax: valores) {
                numeros[count] = Long.parseLong(ax);
                count += 1;
            }

            resultado = numeros[0] ^ numeros[1];

            System.out.println(resultado);

            numeros[0] = 0;
            numeros[1] = 0;
            resultado  = 0;
            aux = BitToBit.entrada().readLine();
        }


    }
}
