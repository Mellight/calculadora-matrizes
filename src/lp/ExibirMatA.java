package lp;

import java.util.Scanner;

public class ExibirMatA {

    public void exibirmat(String[] args) {
        // determinar a matriz com tamanho informado pelo usuário
        System.out.println("");
        System.out.println("||                  TAMANHO DA MATRIZ A                   ||");
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("------------------------------------------------------------");
        System.out.print("        Número de linhas: ");
        int L = sc.nextInt();
        System.out.print("        Número de colunas: ");
        int C = sc.nextInt();
        System.out.println("------------------------------------------------------------");

        // alocação da matriz A
        int[][] A = new int[L][C];

        // leitura da matriz A
        System.out.println("");
        System.out.println("||                  LEITURA DA MATRIZ A                   ||");
        System.out.println("");
        System.out.println("------------------------------------------------------------");
        leituraMatriz(A);
        System.out.println("------------------------------------------------------------");
        
        // Exibir a Matriz A
        System.out.println("");
        System.out.println("||                  EXIBIÇÃO DA MATRIZ A                  ||");
        System.out.println("");
        System.out.println("------------------------------------------------------------");
        for (int l = 0; l < L; l++) {
            for (int c = 0; c < C; c++) {
                System.out.printf("%5d", A[l][c]);
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------------------");
    }
        // Inserção de valores da matriz (linha / coluna)
        public static void leituraMatriz(int[][] matriz) {
        Scanner sc = new Scanner(System.in);
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.printf("        Matriz [%d][%d]=? ", l, c);
                matriz[l][c] = sc.nextInt();
            }
        }
    }
}
