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
        String[] valores ;
        String   aux;
        long[]   numeros;
        long     resultado;

        aux = BitToBit.entrada().readLine();

        valores   = new String[aux.split(" ").length];
        valores   = aux.split(" ");
        numeros   = new long[aux.split(" ").length];
        int count = 0;

        for (String ax: valores) {
             numeros[count] = Long.parseLong(ax);
             count += 1;
        }

        for(int coun = 0; coun < valores.length;coun= coun + 2){
            resultado = numeros[coun]^numeros[coun+1];
            System.out.println(resultado);
        }
    }
}
