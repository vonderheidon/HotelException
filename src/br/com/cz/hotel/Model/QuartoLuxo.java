package br.com.cz.hotel.Model;

public class QuartoLuxo extends Quarto {
    public boolean possuiHidromassagem;
    public boolean possuiMiniBar;

    public QuartoLuxo(int numeroDoQuarto, String tipoDeQuarto, double precoPorNoite, boolean disponibilidade,
                      boolean possuiHidromassagem, boolean possuiMiniBar) {
        super(numeroDoQuarto, tipoDeQuarto, precoPorNoite, disponibilidade);
        this.possuiHidromassagem = possuiHidromassagem;
        this.possuiMiniBar = possuiMiniBar;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.printf("\nPossui Hidromassagem: %s\n", this.possuiHidromassagem ? "Sim" : "Nao");
        System.out.printf("Possui mini-bar: %s", this.possuiMiniBar ? "Sim" : "Nao");
    }
}
