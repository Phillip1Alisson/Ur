import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

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
        String dados = null;
        int valor1, valor2;

        while((dados = BitToBit.entrada().readLine())!= null){
            valor1 = Integer.parseInt(String.valueOf(dados.split("\\s+[0]")));
        }

    }
}
