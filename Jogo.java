public class Jogo {
    public static void main(String[] args) {

        System.out.println();
        
        Guerreiro guerreiro1 = new Guerreiro(1111, "goku");

        Guerreiro guerreiro2 = new Guerreiro(2222, "loki");

        System.out.println(guerreiro1.toString());
                
        System.out.println(guerreiro2.toString());
          
        System.out.println();
        System.out.println("Luta Laço: ");
        guerreiro1.lutar(guerreiro2);
        System.out.println();

        System.out.println(guerreiro1.toString());
        System.out.println(guerreiro2.toString());

        System.out.println();
        System.out.println("Recursivo: ");
        System.out.println();

        guerreiro1.alimentar();
        guerreiro2.alimentar();
        System.out.println();

        System.out.println(guerreiro1.toString());
        System.out.println(guerreiro2.toString());
        System.out.println();

        guerreiro1.lutarRecursivo(guerreiro2);

        System.out.println();
        System.out.println(guerreiro1.toString());
        System.out.println(guerreiro2.toString());

    }
}
