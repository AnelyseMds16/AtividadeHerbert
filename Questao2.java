import java.io.*;
import java.util.Scanner;

public class Teste{
    
    public static void main(String args[]) throws IOException {
        Scanner ler = new Scanner(System.in);
        String caminho;
        caminho = ler.next();

        FileInputStream stream = new FileInputStream(caminho); //caminho para chegar no arquivo (tem que colocar pasta)
        InputStreamReader reader = new InputStreamReader(stream); //ponteiro de leitura para o arquivo 
        BufferedReader br = new BufferedReader(reader); //janelas de leitura 
        String linha = br.readLine(); //faz a leitura linha a linha


        //não entendi essa 

    }
}
