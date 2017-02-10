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

    public static int xor(String valor){
        String[] valores;
        valores = valor.split(" ");
        try {
            return Integer.parseInt(valores[0]) ^ Integer.parseInt(valores[1]);
        }catch(ArrayIndexOutOfBoundsException a){
            return Integer.parseInt(valores[0]);
        }catch(NumberFormatException n){
            return 0;
        }
    }

    public static void main(String[] args) throws IOException {
        String dados = null;

        while((dados = BitToBit.entrada().readLine())!= null){
            System.out.println(BitToBit.xor(dados));
        }

    }
}
