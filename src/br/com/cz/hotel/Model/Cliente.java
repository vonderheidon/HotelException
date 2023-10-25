package br.com.cz.hotel.Model;

import br.com.cz.hotel.Interface.IExibeInfo;

public abstract class Cliente implements IExibeInfo {
    public String nome;
    public int id;
    public String email;
    public Reserva[] reservas = new Reserva[2];

    public Cliente(String nome, int id, String email){
        this.nome = nome;
        this.id = id;
        this.email = email;
    }

    public void exibirInfo(){
        System.out.printf("\nNome: %s \n", this.nome);
        System.out.printf("Id: %d \n", this.id);
        System.out.printf("Email: %s  \n", this.email);
        System.out.print("Reservas:");
        boolean encontrado = false;
        for (int i = 0; i < this.reservas.length; i++) {
            if (this.reservas[i] != null) {
                System.out.printf("\n - Hotel: %s - Quarto: %d", this.reservas[i].hotel.nome, this.reservas[i].quarto.numeroDoQuarto);
                encontrado = true;
            }
        }
        if (encontrado == false) {
            System.out.print(" Nenhuma");
        }
    }
    public boolean adicionarReserva(Reserva reserva) {
        for (int i = 0; i < this.reservas.length; i++) {
            if (this.reservas[i] == null) {
                this.reservas[i] = reserva;
                return true;
            }
        }
        System.out.print("\nEsse cliente nao pode mais reservar quartos.");
        return false;
    }
}