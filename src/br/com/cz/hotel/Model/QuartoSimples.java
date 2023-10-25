package br.com.cz.hotel.Model;

public class QuartoSimples extends Quarto {
    public boolean possuiArCondicionado;
    public boolean wifiGratis;

    public QuartoSimples(int numeroDoQuarto, String tipoDeQuarto, double precoPorNoite, boolean disponibilidade,
                         boolean possuiArCondicionado, boolean wifiGratis) {
        super(numeroDoQuarto, tipoDeQuarto, precoPorNoite, disponibilidade);
        this.possuiArCondicionado = possuiArCondicionado;
        this.wifiGratis = wifiGratis;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.printf("\nPossui ar-condicionado: %s\n", this.possuiArCondicionado ? "Sim" : "Nao");
        System.out.printf("Wifi gratis: %s", this.wifiGratis ? "Sim" : "Nao");
    }
}
