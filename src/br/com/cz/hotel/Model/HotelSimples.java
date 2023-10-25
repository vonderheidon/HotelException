package br.com.cz.hotel.Model;

public class HotelSimples extends Hotel {
    public int qtdVagasGaragem;
    public HotelSimples(String nome, String endereco, int qtdVagasGaragem) {
        super(nome, endereco);
        this.qtdVagasGaragem = qtdVagasGaragem;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.printf("\nQuantidade de vagas na garagem: %d", this.qtdVagasGaragem);
    }
}
