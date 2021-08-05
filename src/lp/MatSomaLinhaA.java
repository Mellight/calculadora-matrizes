package lp;

import java.util.Scanner;

public class MatSomaLinhaA {
    public void somalinhamat(String[] args) {
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
        
        // variável para somar a linha
        int somaL = 0;
        
        // leitura da matriz A
        System.out.println("");
        System.out.println("||                  LEITURA DA MATRIZ A                   ||");
        System.out.println("");
        System.out.println("------------------------------------------------------------");
        leituraMatriz(A);
        System.out.println("------------------------------------------------------------");
        
        // determinar a linha indicada pelo usuário na matriz A
        System.out.println("");
        System.out.println("------------------------------------------------------------");
        System.out.print("        Indique a linha que será somada: ");
        int lind = sc.nextInt();
        System.out.println("------------------------------------------------------------");
        
        // laço de repetição para executar a soma da linha
        for (int l = 0; l < L; l++) {
            for (int c = 0; c < C; c++) {
                if (l == lind) {
                    somaL += A [l][c];
                }
            }
        }
        // exibição do resultado da soma
        System.out.println("");
        System.out.println("||         A soma dos elementos da linha " + lind + " é: " + somaL + "           ||");
        System.out.println("");
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
