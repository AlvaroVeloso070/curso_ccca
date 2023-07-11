package com.course.ccca.exceptions;

public class CPFInvalidoException extends RuntimeException{
    public CPFInvalidoException(String mensagem){
        super(mensagem);
    }
}
