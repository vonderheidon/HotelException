package br.com.cz.hotel.Model;

import br.com.cz.hotel.Interface.IExibeInfo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reserva implements IExibeInfo {
    public LocalDate checkIn;
    public LocalDate checkOut;
    public Cliente cliente;
    public Quarto quarto;
    public Hotel hotel;

    public Reserva(LocalDate checkIn, LocalDate checkOut, Cliente cliente, Quarto quarto, Hotel hotel){
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.cliente = cliente;
        this.quarto = quarto;
        this.hotel = hotel;
    }

    public void exibirInfo() {
        System.out.printf("\nReserva feita para: %s\n", this.cliente.nome);
        System.out.printf("Nome do hotel: %s\n", this.hotel.nome);
        System.out.printf("Data do checkin: %s\n", this.checkIn.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.printf("Data do checkout: %s\n", this.checkOut.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.printf("Numero do quarto: %d", this.quarto.numeroDoQuarto);
    }
    public void calcularTotal () {
        double valorTotal;
        valorTotal = this.quarto.precoPorNoite * (this.checkOut.getDayOfMonth() - this.checkIn.getDayOfMonth());
        System.out.printf("\nValor total: R$ %.2f", valorTotal);
    }
}