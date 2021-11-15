import java.io.*;
import java.util.Scanner;

public class Questao3{

   public static void main(String args[]) throws IOException {
        Scanner ler = new Scanner(System.in);

        String vetor, arquivo = ler.nextLine();
        BufferedReader leitura = new BufferedReader(new FileReader(arquivo));
        int j = 0;

        int vetor1[][] = new int[2][2];
        int vetor2[][] = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                vetor = leitura.readLine();
                vetor1[i][j] = Integer.parseInt(vetor);
            }
        }

        for (int i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                vetor = leitura.readLine();
                vetor2[i][j] = Integer.parseInt(vetor);
            }
        }
        if ((vetor1[0][1] < vetor1[1][0]) || (vetor1[1][1] < vetor1[0][0]) || (vetor2[0][1] < vetor2[1][0]) || (vetor2[1][1] < vetor1[1][1])
                || (vetor1[1][0] > vetor1[0][1]) || (vetor2[0][0] > vetor2[1][1]) || (vetor2[1][0] > vetor2[0][1])) {
            System.out.print('1');
        } else {
            System.out.print('0');
        }
        ler.close();
        leitura.close();
    }
}
