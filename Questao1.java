import java.io.*;
import java.util.Scanner;

public class Questao1{
    
    public static void main(String args[]) throws IOException {
        int num = 0, n, k, vetor[] = new int[10010];

        Scanner ler = new Scanner(System.in);
        String n0, k0, vetor0, endereco = ler.nextLine();
        BufferedReader leitura = new BufferedReader(new FileReader(endereco));

        a = leitura.readLine();
        b = leitura.readLine();
        n = Integer.parseInt(a);
        k = Integer.parseInt(b);

        for (int i = 0; i < k; i++) {
            vetor0 = leitura.readLine();
            vetor[i] = Integer.parseInt(vetor0);
            if (vetor[i] > num) {
                num = vetor[i];
            }
        }

        int i = 1;
        int saida = 0;
        while(i<=num) {
            int q = (i + num)/2;
            if(verifica(q, n, vetor, k)){
                if(q > saida) {
                    saida = q;
                }
                i = q + 1;
            }else {
                num = q - 1;
            }
        }

        System.out.print(saida);
        leitura.close();
        ler.close();
    }

    public static boolean verifica(int q, int n, int[] vet, int k) {
        int qtd = 0;
        for (int i = 0; i < k; i++) {
            qtd += vet[i] / q;
            if (qtd >= n)
                return true;
        }
        return false;
    }
}