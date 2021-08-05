package lp;

import java.util.Scanner;

public class DefMatB {

    public void defmat(String a[]) {
        // determinar a matriz com tamanho informado pelo usuário
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

        // saída da definição da Matriz B
        System.out.println("");
        System.out.println("||          A matriz possui " + L + " linhas e " + C + " colunas          ||");
        System.out.println("");
    }
}
