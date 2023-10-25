package br.com.cz.hotel.Model;

import br.com.cz.hotel.Interface.IExibeInfo;

public abstract class Quarto implements IExibeInfo {
    public int numeroDoQuarto;
    public String tipoDeQuarto;
    public double precoPorNoite;
    public boolean disponibilidade;

    public Quarto(int numeroDoQuarto, String tipoDeQuarto, double precoPorNoite, boolean disponibilidade){
        this.numeroDoQuarto = numeroDoQuarto;
        this.tipoDeQuarto = tipoDeQuarto;
        this.precoPorNoite = precoPorNoite;
        this.disponibilidade = disponibilidade;
    }

    public void exibirInfo(){
        System.out.printf("\nNumero do quarto: %d \n", this.numeroDoQuarto);
        System.out.printf("Tipo de quarto: %s \n", this.tipoDeQuarto);
        System.out.printf("Preco por noite: %.2f  \n", this.precoPorNoite);
        System.out.printf("Disponibilidade: %s", this.disponibilidade ? "Disponivel" : "Indisponivel");
    }
}