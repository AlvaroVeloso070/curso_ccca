package com.course.ccca.domain.cliente.useCase.validatorCPF;

import com.course.ccca.domain.Util;

public class ValidatorCPFImpl implements ValidatorCPF{

    public static int FATOR_DIGITO_1 = 10;
    public static int FATOR_DIGITO_2 = 11;
    @Override
    public boolean isValidCPF(String cpf) {
        if(Util.isNullOuVazio(cpf)) return false;

        cpf = removeSeparators(cpf);

        if(isTamanhoInvalido(cpf)) return false;

        if(isNumerosRepetidos(cpf)) return false;

        return isNumeroVerificadorValido(cpf);
    }

    private String removeSeparators(String cpf) {
        return cpf.replaceAll("\\D", "");
    }

    private boolean isNumerosRepetidos(String cpf) {
        return cpf.matches("(\\d)\\1{10}");
    }

    private boolean isTamanhoInvalido(String cpf) {
        return cpf.length() != 11;
    }

    private String getNumeroVerificador(String cpf) {
        return cpf.substring(9);
    }

    private String calcularNumeroVerificador(String cpf) {
        String digito1 = calculateDigit(cpf, FATOR_DIGITO_1);
        String digito2 = calculateDigit(cpf, FATOR_DIGITO_2);
        return digito1+digito2;
    }

    private String calculateDigit(String cpf, int digitoFactor) {
        long total = 0;
        for (int i = 0; i < cpf.length(); i++){
            if(digitoFactor > 1){
                total += Long.parseLong(String.valueOf(cpf.charAt(i))) * digitoFactor--;
            }
        }
        long resto = total % 11;
        return String.valueOf(resto < 2 ? 0 : 11 - resto);
    }

    private boolean isNumeroVerificadorValido(String cpf) {
        return getNumeroVerificador(cpf).equals(calcularNumeroVerificador(cpf));
    }
}
