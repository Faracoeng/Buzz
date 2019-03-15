package poo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        int opcao = 0;
        Buzz buzzlightyear[] = new Buzz[3];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            buzzlightyear[i] = new Buzz();
        }


        do {

            System.out.println("\n         ========================");
            System.out.println("        |     1 - Abrir visor    |");
            System.out.println("        |     2 - Fechar visor   |");
            System.out.println("        |     3 - Falar          |");
            System.out.println("        |     4 - Disparar laser |");
            System.out.println("        |     5 - Golpear        |");
            System.out.println("        |     6 - Abrir asas     |");
            System.out.println("        |     0 - Sair           |");
            System.out.println("         ========================\n");
            System.out.print("\n");
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1:buzzlightyear[0].abrirVisor();
                        break;

                case 2: buzzlightyear[0].fecharVisor();
                        break;
                case 3: buzzlightyear[0].falar();
                        break;
                case 4: buzzlightyear[0].disparaLaser();
                        break;
                case 5: buzzlightyear[0].golpear();
                        break;
                case 6: buzzlightyear[0].asas();
                        break;
                case 0:
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        } while (opcao != 0);
    }
}