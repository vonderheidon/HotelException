package br.com.cz.hotel.Exception;

public class DadoInvalidoException extends RuntimeException{
    public DadoInvalidoException() {
        super("A informacao inserida eh invalida.");
    }
}
