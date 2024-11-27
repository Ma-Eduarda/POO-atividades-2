import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------------------------");
        System.out.println("       Cadastro de Guerreiros       ");
        System.out.println("------------------------------------");
        System.out.println(); 

        System.out.println("Insira os dados do Guerreiro 1:");
        System.out.print("Código: ");
        int codigo1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nome: ");
        String nome1 = scanner.nextLine();

        System.out.println(); 

        System.out.println("Insira os dados do Guerreiro 2:");
        System.out.print("Código: ");
        int codigo2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nome: ");
        String nome2 = scanner.nextLine();

        System.out.println(); 

        System.out.println("Cadastro realizado com sucesso!");
        System.out.println("---------------------------------------------------");
        System.out.println("Guerreiro 1 - Código: " + codigo1 + ", Nome: " + nome1);
        System.out.println("Guerreiro 2 - Código: " + codigo2 + ", Nome: " + nome2);
        System.out.println("---------------------------------------------------");

        Guerreiro guerreiro1 = new Guerreiro(codigo1, nome1);
        Guerreiro guerreiro2 = new Guerreiro(codigo2, nome2);

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Alimentar Guerreiro");
            System.out.println("2 - Exibir Guerreiro");
            System.out.println("3 - Iniciar Luta (com laço)");
            System.out.println("4 - Iniciar Luta (com recursividade)");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            System.out.println();

            switch (opcao) {
                case 1:
                    System.out.print("Qual guerreiro deseja alimentar? (1 ou 2): ");
                    int escolha = scanner.nextInt();
                    if (escolha == 1) {
                        guerreiro1.alimentar();
                    } else if (escolha == 2) {
                        guerreiro2.alimentar();
                    } else {
                        System.out.println("Escolha inválida!");
                    }
                    break;

                case 2:
                    System.out.print("Qual guerreiro deseja exibir? (1 ou 2): ");
                    escolha = scanner.nextInt();
                    if (escolha == 1) {
                        System.out.println(guerreiro1.toString());
                    } else if (escolha == 2) {
                        System.out.println(guerreiro2.toString());
                    } else {
                        System.out.println("Escolha inválida!");
                    }
                    break;

                case 3:
                    guerreiro1.lutar(guerreiro2);
                    break;

                case 4:
                    guerreiro1.lutarRecursivo(guerreiro2);
                    break;

                case 0:
                    System.out.println("Encerrando o jogo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
