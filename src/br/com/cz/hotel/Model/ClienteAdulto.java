package br.com.cz.hotel.Model;

public class ClienteAdulto extends Cliente {
    public int quantidadeDeTerrenosHerdadosDeUmAvoQueMoravaNoInteriorDeUmaCidadeBastanteLongeEPacata;
    public ClienteAdulto(String nome, int id, String email, int quantidadeDeTerrenosHerdadosDeUmAvoQueMoravaNoInteriorDeUmaCidadeBastanteLongeEPacata) {
        super(nome, id, email);
        this.quantidadeDeTerrenosHerdadosDeUmAvoQueMoravaNoInteriorDeUmaCidadeBastanteLongeEPacata = quantidadeDeTerrenosHerdadosDeUmAvoQueMoravaNoInteriorDeUmaCidadeBastanteLongeEPacata;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.printf("\nQuantidade de terrenos herdados de um avo que morava no interior de uma cidade bastante longe e pacata: %d", this.quantidadeDeTerrenosHerdadosDeUmAvoQueMoravaNoInteriorDeUmaCidadeBastanteLongeEPacata);
    }
}
