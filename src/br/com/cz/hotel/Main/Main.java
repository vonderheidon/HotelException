package br.com.cz.hotel.Main;

import br.com.cz.hotel.Exception.OpcaoInvalidaException;
import br.com.cz.hotel.Model.*;

import java.util.Scanner;

public class Main {
    static Scanner numScanner = new Scanner(System.in);
    static Scanner lineScanner = new Scanner(System.in);
    public static void main(String[] args) {

        HotelBeiraMar hotelBeiraMar = new HotelBeiraMar(
                "Hotel Max",
                "Rua Santa 32",
                true
        );
        QuartoLuxo quartoLuxo = new QuartoLuxo(
                25,
                "Luxo",
                160,
                true,
                true,
                true
        );
        hotelBeiraMar.adicionarQuarto(quartoLuxo);
        menuHotel(hotelBeiraMar);
    }

    static void menuHotel(Hotel hotel) {
        int opcao = -1;
        while (opcao != 0) {
            System.out.printf("Bem vindo ao %s!\n", hotel.nome);
            System.out.println("1. Exibir informacoes do Hotel");
            System.out.println("2. Ver disponibilidade de quartos");
            System.out.println("3. Localizar quarto por tipo");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = numScanner.nextInt();

                switch (opcao) {
                    case 1:
                        hotel.exibirInfo();
                        apertarEnterParaContinuar();
                        break;
                    case 2:
                        hotel.verificarDisponibilidade();
                        apertarEnterParaContinuar();
                        break;
                    case 3:
                        System.out.print("Digite qual tipo de quarto deseja buscar: ");
                        String tipo = lineScanner.next();
                        hotel.localizarQuartoPorTipo(tipo);
                        lineScanner.nextLine();
                        apertarEnterParaContinuar();
                        break;
                    case 0:
                        System.out.println("Saindo do sistema. Obrigado!");
                        break;
                    default:
                        throw new OpcaoInvalidaException();
                }
            } catch (OpcaoInvalidaException e) {
                System.err.println(e);
                apertarEnterParaContinuar();

            } catch (java.util.InputMismatchException e) {
                System.err.println("Por favor insira um numero valido.");
                apertarEnterParaContinuar();

            } catch (Exception e) {
                System.err.println("Algo deu errado. Tente novamente.");
            }
        }
    }
    static void apertarEnterParaContinuar(){
        System.out.println();
        System.out.print("\nAperte ENTER para continuar...");
        lineScanner.nextLine();
        numScanner.nextLine();
        System.out.println();
    }
}