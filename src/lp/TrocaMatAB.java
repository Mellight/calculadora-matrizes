package lp;

import java.util.Scanner;

public class TrocaMatAB {

    public void trocamat(String[] args) {
        // determinar as matrizes com tamanho informado pelo usuário
        System.out.println("");
        System.out.println("||                 TAMANHO DAS MATRIZES                   ||");
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("------------------------------------------------------------");
        System.out.print("        Número de linhas: ");
        int L = sc.nextInt();
        System.out.print("        Número de colunas: ");
        int C = sc.nextInt();
        System.out.println("------------------------------------------------------------");

        // matrizes alocadas separadamente
        int[][] A = new int[L][C];
        int[][] B = new int[L][C];

        // Ler matrizes
        System.out.println("");
        System.out.println("||                 LEITURA DAS MATRIZES                   ||");
        System.out.println("");
        System.out.println("------------------------------------------------------------");
        leituraMatriz(A);
        leituraMatriz(B);
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

        // Exibir a Matriz B
        System.out.println("");
        System.out.println("||                  EXIBIÇÃO DA MATRIZ B                  ||");
        System.out.println("");
        System.out.println("------------------------------------------------------------");
        for (int l = 0; l < L; l++) {
            for (int c = 0; c < C; c++) {
                System.out.printf("%5d", B[l][c]);
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------------------");

        // efetuando a troca da matriz a pela b
        System.out.println("");
        System.out.println("||           NOVA MATRIZ A COM OS VALORES DE B            ||");
        System.out.println("");
        System.out.println("------------------------------------------------------------");
        for (int l = 0; l < L; l++) {
            for (int c = 0; c < C; c++) {
                System.out.printf(" %3d ", A[l][c] = B[l][c]);
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
