package br.com.cz.hotel.Model;

public class HotelBeiraMar extends Hotel {
    public boolean possuiPiscinaComBordaInfinita;
    public HotelBeiraMar(String nome, String endereco, boolean possuiPiscinaComBordaInfinita) {
        super(nome, endereco);
        this.possuiPiscinaComBordaInfinita = possuiPiscinaComBordaInfinita;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.printf("\nPossui piscina com borda infinita: %s", this.possuiPiscinaComBordaInfinita ? "Sim" : "Nao");
    }
}
