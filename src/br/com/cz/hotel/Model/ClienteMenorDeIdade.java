package br.com.cz.hotel.Model;

public class ClienteMenorDeIdade extends Cliente {
    public int quantidadeDeVacinasTomadasDuranteOs6PrimeirosMesesDeVidaQueFizeramADiferencaNaErradicacaoDeDoencasComoAPoliomielite;
    public ClienteMenorDeIdade(String nome, int id, String email) {
        super(nome, id, email);
        this.quantidadeDeVacinasTomadasDuranteOs6PrimeirosMesesDeVidaQueFizeramADiferencaNaErradicacaoDeDoencasComoAPoliomielite = quantidadeDeVacinasTomadasDuranteOs6PrimeirosMesesDeVidaQueFizeramADiferencaNaErradicacaoDeDoencasComoAPoliomielite;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.printf("\nQuantidade de vacinas tomadas durante os 6 primeiros meses de vida que fizeram a diferenca na erradicacao de doencas como a poliomielite: %d", this.quantidadeDeVacinasTomadasDuranteOs6PrimeirosMesesDeVidaQueFizeramADiferencaNaErradicacaoDeDoencasComoAPoliomielite);
    }
}
