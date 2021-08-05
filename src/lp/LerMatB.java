package lp;

import java.util.Scanner;

public class LerMatB {

    public void lermat(String[] args) {
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

        // alocação da matriz B
        int[][] B = new int[L][C];

        // leitura da matriz B
        System.out.println("");
        System.out.println("||                  LEITURA DA MATRIZ B                   ||");
        System.out.println("");
        System.out.println("------------------------------------------------------------");
        leituraMatriz(B);
        System.out.println("------------------------------------------------------------");
    }

    // Leitura da Matriz
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
