public class Sistema {
    public static void main(String[] args) {
        Helicoptero helicoptero1 = new Helicoptero(2);
        Helicoptero helicoptero2 = new Helicoptero(5);

        System.out.println("Helicoptero 1");

        System.out.println("Estado inicial:");
        System.out.println(helicoptero1.toString());
        System.out.println();
        

        helicoptero1.entra();
        helicoptero1.entra();
        helicoptero1.entra();

        helicoptero1.ligar();
        helicoptero1.decolar(500);
        System.out.println();

        System.out.println("Estado do Helicoptero:");
        System.out.println(helicoptero1.toString());
        System.out.println();

        helicoptero1.aterrissar();

        helicoptero1.desligar();
        helicoptero1.sai();
        helicoptero1.sai();
        helicoptero1.sai();
        System.out.println();

        System.out.println("Estado final:");
        System.out.println(helicoptero1.toString());
        System.out.println();

        System.out.println("-----------------------------------------------------------------------\n");
        System.out.println("Helicoptero 2");

        System.out.println("Estado inicial:");
        System.out.println(helicoptero2.toString());
        System.out.println();
        

        helicoptero2.entra();
        helicoptero2.entra();
        helicoptero2.entra();

        helicoptero2.ligar();
        helicoptero2.decolar(1000);
        System.out.println();

        System.out.println("Estado do Helicoptero:");
        System.out.println(helicoptero2.toString());
    }
}
