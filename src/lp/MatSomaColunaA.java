package lp;

import java.util.Scanner;

public class MatSomaColunaA {
    
    public void somacolunamat(String[] args) {
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
        
        // variável para somar a coluna
        int somaC = 0;
        
        // leitura da matriz A
        System.out.println("");
        System.out.println("||                  LEITURA DA MATRIZ A                   ||");
        System.out.println("");
        System.out.println("------------------------------------------------------------");
        leituraMatriz(A);
        System.out.println("------------------------------------------------------------");
        
        // determinar a coluna indicada pelo usuário na matriz A
        System.out.println("");
        System.out.println("------------------------------------------------------------");
        System.out.print("        Indique a coluna que será somada: ");
        int cind = sc.nextInt();
        System.out.println("------------------------------------------------------------");
        
        // laço de repetição para executar a soma da coluna
        for (int c = 0; c < C; c++) {
             for (int l = 0; l < L; l++){
                if (l == cind) {
                    somaC += A [c][l];
                }
            }
        }
        // exibição do resultado da soma
        System.out.println("");
        System.out.println("||         A soma dos elementos da coluna " + cind + " é: " + somaC + "          ||");
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
