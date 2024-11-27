public class Helicoptero {
    private boolean ligado;
    private int altitude;
    private int capacidade;
    private int pessoas;

    public Helicoptero(int capacidade) {
        this.ligado = false;
        this.altitude = 0;
        this.capacidade = capacidade;
        this.pessoas = 0;
    }

    public boolean isLigado() {
        return ligado;
    }

    public int getAltitude() {
        return altitude;
    }

    public int getPessoas() {
        return pessoas;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
    }

    public void entra() {
        if(pessoas < capacidade) {
            pessoas++;
            System.out.println("uma pessoa entrou no helicoptero");
        } else {
            System.out.println("Helicoptero cheio");
        }
    }

    public void sai() {
        if(pessoas > 0) {
            pessoas--;
            System.out.println("uma pessoa saiu do helicoptero");
        } else {
            System.out.println("Helicoptero vazio");
        }
    }

    public void ligar() {
        if(!ligado) {
            ligado = true;
            System.err.println("Helicoptero ligado");
        } 
    }

    public void desligar() {
        if(ligado && altitude == 0) {
            ligado = false;
            System.out.println("Helicoptero desligado");
        } else {
            System.out.println("Nao é possivel desligar o helicoptero");
        }
    }

    public void decolar(int novaAltitude) {
        if(ligado && altitude == 0) {
            altitude = novaAltitude;
            System.out.println("Helicoptero decolou para " + novaAltitude + " metros de altitude");
        } else {
            System.out.println("Nao decolou");
        }
    }

    public void aterrissar() {
        if(ligado && altitude > 0) {
            altitude = 0;
            System.out.println("Helicoptero aterrissou");
        }
    }

    @Override
    public String toString() {
        String estado = ligado ? "Ligado" : "Desligado";
        return "Helicoptero [Estado: " + estado + ", Altitude: " + altitude + 
        ", Capacidade: " + capacidade + ", Pessoas: " + pessoas + "]";
    }
}