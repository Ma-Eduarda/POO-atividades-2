import java.util.Random;

public class Guerreiro {
    private int codigo;
    private String nome;
    private int energia;

    public Guerreiro(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.energia = 5;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        if(energia >= 0 && energia <= 5) {
            this.energia = energia;
        } 
    }

    public void incrementaEnergia() {
        if (energia < 5) {
            energia++;
        } else {
            System.out.println(nome + " está com energia maxima!");
        }
    }

    public void reduzirEnergia() {
        if(energia > 0) {
            energia--;
        }
        if (energia == 0) {
            System.out.println(nome + " está sem energia!");
        }
    }

    public void alimentar() {
        System.out.println(nome + " está se alimentando");
        incrementaEnergia();
    }

    public int atacar() {
        Random gerador = new Random();
        return gerador.nextInt(2);
    }

    public void lutar(Guerreiro oponente) {
        System.out.println("\nLuta entre " + nome + " e " + oponente.getNome());
        while (this.energia > 0 && oponente.getEnergia() > 0) {
            if (this.atacar() == 1) {
                oponente.reduzirEnergia();
                System.out.println(nome + " acertou um ataque em " + oponente.getNome());
            }
            if (oponente.atacar() == 1) {
                this.reduzirEnergia();
                System.out.println(oponente.getNome() + " acertou um ataque em " + nome);
            }
        }
        if (this.energia == 0) {
            System.out.println(oponente.getNome() + " venceu!");
        } else {
            System.out.println(nome + " venceu!");
        }
    }

    public void lutarRecursivo(Guerreiro oponente) {
        if (this.energia == 0) {
            System.out.println(oponente.getNome() + " venceu!");
            return;
        }

        if (oponente.getEnergia() == 0) {
            System.out.println(this.nome + " venceu!");
            return;
        }

        if (this.atacar() == 1) {
            oponente.reduzirEnergia();
            System.out.println(this.nome + " acertou um ataque em " + oponente.getNome());
        }

        if (oponente.atacar() == 1) {
            this.reduzirEnergia();
            System.out.println(oponente.getNome() + " acertou um ataque em " + this.nome);
        }

        lutarRecursivo(oponente);
    }

    @Override
    public String toString(){
        return "Guerreiro: " + nome + "\nEnergia: " + energia + "\nCodigo: " + codigo;
    }
}
