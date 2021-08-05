package lp;

import java.util.Scanner;
import lp.DefMatA;
import lp.DefMatB;
import lp.TrocaMatAB;
import lp.LerMatA;
import lp.LerMatB;
import lp.ExibirMatA;
import lp.ExibirMatB;
import lp.MatSoma;
import lp.MatSub;
import lp.MatConstA;
import lp.MatConstB;
import lp.MatMult;
import lp.MatSomaA;
import lp.MatSomaB;
import lp.MatSomaLinhaA;
import lp.MatSomaLinhaB;
import lp.MatSomaColunaA;
import lp.MatSomaColunaB;

public class CalcMain {

    public static void main(String[] args) {
        // Preparação
        int opcao = 0;
        Scanner sc = new Scanner(System.in);
        // Repetição
        do {
            exibirMenuOp();
            opcao = capOp();
            switch (opcao) {
                case 1:
                    DefMatA op1 = new DefMatA();
                    op1.defmat(args);
                    break;
                case 2:
                    DefMatB op2 = new DefMatB();
                    op2.defmat(args);
                    break;
                case 3:
                    LerMatA op3 = new LerMatA();
                    op3.lermat(args);
                    break;
                case 4:
                    LerMatB op4 = new LerMatB();
                    op4.lermat(args);
                    break;
                case 5:
                    ExibirMatA op5 = new ExibirMatA();
                    op5.exibirmat(args);
                    break;
                case 6:
                    ExibirMatB op6 = new ExibirMatB();
                    op6.exibirmat(args);
                    break;
                case 7:
                    TrocaMatAB op7 = new TrocaMatAB();
                    op7.trocamat(args);
                    break;
                case 8:
                    MatSoma op8 = new MatSoma();
                    op8.somamat(args);
                    break;
                case 9:
                    MatSub op9 = new MatSub();
                    op9.submat(args);
                    break;
                case 10:
                    MatConstA op10 = new MatConstA();
                    op10.constmat(args);
                    break;
                case 11:
                    MatConstB op11 = new MatConstB();
                    op11.constmat(args);
                    break;
                case 12:
                    MatMult op12 = new MatMult();
                    op12.multmat(args);
                    break;
                case 13:
                    MatSomaA op13 = new MatSomaA();
                    op13.somamat(args);
                    break;
                case 14:
                    MatSomaB op14 = new MatSomaB();
                    op14.somamat(args);
                    break;
                case 15:
                    MatSomaLinhaA op15 = new MatSomaLinhaA();
                    op15.somalinhamat(args);
                    break;
                case 16:
                    MatSomaLinhaB op16 = new MatSomaLinhaB();
                    op16.somalinhamat(args);
                    break;
                case 17:
                    MatSomaColunaA op17 = new MatSomaColunaA();
                    op17.somacolunamat(args);
                    break;
                case 18:
                    MatSomaColunaB op18 = new MatSomaColunaB();
                    op18.somacolunamat(args);
                    break;
                case 19:
                    System.out.println("============================================================");
                    System.out.println("||    Obrigada por utilizar a calculadora de matrizes!    ||");
                    System.out.println("||             Construída por Melissa L. Silva            ||");
                    break;
                default:
                    System.out.println("||     Opção Inválida!                                    ||");
                    System.out.println("||     Por favor, digite um nº correspondente ao menu     ||");
            }
            System.out.println("============================================================");
        } while (opcao != 19);
    }

    private static void exibirMenuOp() {
        // Exibir uma lista de opções
        System.out.println("                ### CALCULADORA DE MATRIZES ###");
        System.out.println("============================================================");
        System.out.println("||     Escolha uma opção:                                 ||");
        System.out.println("============================================================");
        System.out.println("||      1. Definir Matriz A                               ||");
        System.out.println("||      2. Definir Matriz B                               ||");
        System.out.println("||      3. Ler Matriz A                                   ||");
        System.out.println("||      4. Ler Matriz B                                   ||");
        System.out.println("||      5. Exibir Matriz A                                ||");
        System.out.println("||      6. Exibir Matriz B                                ||");
        System.out.println("||      7. Trocar Matriz A por B                          ||");
        System.out.println("||      8. Somar Matrizes A e B                           ||");
        System.out.println("||      9. Subtrair Matrizes A e B                        ||");
        System.out.println("||      10. Multiplicar a Matriz A por uma constante      ||");
        System.out.println("||      11. Multiplicar a Matriz B por uma constante      ||");
        System.out.println("||      12. Multiplicar Matrizes A e B                    ||");
        System.out.println("||      13. Somar e Exibir os elementos da Matriz A       ||");
        System.out.println("||      14. Somar e Exibir os elementos da Matriz B       ||");
        System.out.println("||      15. Exibir a soma de uma linha da Matriz A        ||");
        System.out.println("||      16. Exibir a soma de uma linha da Matriz B        ||");
        System.out.println("||      17. Exibir a soma de uma coluna da Matriz A       ||");
        System.out.println("||      18. Exibir a soma de uma coluna da Matriz B       ||");
        System.out.println("||      19. Sair                                          ||");
        System.out.println("============================================================");
    }

    private static int capOp() {
        // Capturar (ler) opção do usuário
        System.out.print("        DIGITE O NÚMERO DA SUA OPÇÃO: ");
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        System.out.println("============================================================");
        sc.nextLine();
        return op;
    }
}
