package br.com.cz.hotel.Model;

import br.com.cz.hotel.Interface.IExibeInfo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Hotel implements IExibeInfo {
    public String nome;
    public String endereco;
    public Quarto[] quartos = new Quarto[5];

    public Hotel(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void exibirInfo(){
        String disponibilidade;
        System.out.printf("\nNome do hotel: %s \n", this.nome);
        System.out.printf("Endereco: %s \n", this.endereco);
        System.out.print("Opcoes de quartos: ");
        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] != null) {
                System.out.print("\n-------------------------------\n");
                System.out.printf("Numero do quarto: %d \n", this.quartos[i].numeroDoQuarto);
                System.out.printf("Tipo de quarto: %s \n", this.quartos[i].tipoDeQuarto);
                System.out.printf("Disponibilidade do quarto: %s \n", this.quartos[i].disponibilidade ? "Disponivel" : "Indisponivel");
                System.out.printf("Preco por noite: %.2f", this.quartos[i].precoPorNoite);
            }
        }
    }
    public void verificarDisponibilidade() {
        int cont = 0;
        for (int i = 0; i < this.quartos.length; i++) {
            if (this.quartos[i] != null) {
                if (this.quartos[i].disponibilidade == true) {
                    cont++;
                }
            }
        }
        if (cont > 0) {
            System.out.printf("\nAtualmente tem %d quartos disponiveis.", cont);
        } else {
            System.out.print("\nNao tem quartos disponiveis.");
        }
    }
    public void localizarQuartoPorTipo(String tipoDeQuarto) {
        boolean encontrado = false;
        for (int i = 0; i < this.quartos.length; i++) {
            if (this.quartos[i] != null) {
                if (this.quartos[i].tipoDeQuarto.equalsIgnoreCase(tipoDeQuarto) && this.quartos[i].disponibilidade == true) {
                    if (encontrado == false) {
                        System.out.printf("\nQuartos disponiveis do tipo \"%s\":", tipoDeQuarto);
                        encontrado = true;
                    }
                    System.out.print("\n - Quarto nº " + this.quartos[i].numeroDoQuarto);
                }
            }
        }
        if (encontrado == false) {
            System.out.printf("\nNao foi encontrado nenhum quarto do tipo \"%s\" disponivel.", tipoDeQuarto);
        }
    }
    public void adicionarQuarto(Quarto quarto) {
        for (int i = 0; i < this.quartos.length; i++) {
            if (this.quartos[i] == null) {
                this.quartos[i] = quarto;
                break;
            }
        }
    }
    public void fazerReserva(Reserva reserva) {
        if (reserva.cliente.adicionarReserva(reserva) == true) {
            reserva.quarto.disponibilidade = false;
            System.out.printf("\nO cliente %s reservou o quarto nº %d com sucesso.", reserva.cliente.nome, reserva.quarto.numeroDoQuarto);
        }
    }
    public void cancelarReserva(Cliente cliente, int nmrQuarto, String nomeDoHotel) {
        for (int i = 0; i < cliente.reservas.length; i++) {
            if (cliente.reservas[i] != null) {
                if (cliente.reservas[i].quarto.numeroDoQuarto == nmrQuarto && cliente.reservas[i].hotel.nome.equalsIgnoreCase(nomeDoHotel)) {
                    cliente.reservas[i].quarto.disponibilidade = true;
                    cliente.reservas[i] = null;
                    System.out.print("\nA reserva do quarto foi cancelada com sucesso!");
                }
            }
        }
    }
}
