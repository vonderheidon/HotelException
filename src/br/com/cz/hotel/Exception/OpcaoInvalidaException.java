package br.com.cz.hotel.Exception;

public class OpcaoInvalidaException extends RuntimeException{
    public OpcaoInvalidaException() {
        super("Opção inválida. Tente novamente.");
    }
}
