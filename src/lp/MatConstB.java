package lp;

import java.util.Scanner;

public class MatConstB {

    public void constmat(String[] args) {
        // declarar a matriz B
        int B[][]; // matriz de duas dimensões

        // determinar as matrizes com tamanho informado pelo usuário
        System.out.println("");
        System.out.println("||                  TAMANHO DA MATRIZ B                   ||");
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("------------------------------------------------------------");
        System.out.print("        Número de linhas: ");
        int L = sc.nextInt();
        System.out.print("        Número de colunas: ");
        int C = sc.nextInt();
        System.out.println("------------------------------------------------------------");

        // matriz alocada
        B = new int[L][C];

        // Declarar uma constante (k)
        final int k = 5;

        // leitura da matriz B
        System.out.println("");
        System.out.println("||                  LEITURA DA MATRIZ B                   ||");
        System.out.println("");
        System.out.println("------------------------------------------------------------");
        leituraMatriz(B);
        System.out.println("------------------------------------------------------------");

        // Multiplicar a Matriz B por uma constante
        for (int l = 0; l < L; l++) {
            for (int c = 0; c < C; c++) {
                B[l][c] = B[l][c] * k;
            }
        }

        // Exibir a Matriz B
        System.out.println("");
        System.out.println("||       MULTIPLICAÇÃO DA MATRIZ B POR UMA CONSTANTE       ||");
        System.out.println("");
        System.out.println("------------------------------------------------------------");
        for (int l = 0; l < L; l++) {
            for (int c = 0; c < C; c++) {
                System.out.printf("%5d", B[l][c]);
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
