package com.course.ccca.domain.cliente.useCase.validatorCPF;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidatorCPFTest {
    public static final String CPF_VALIDO_COM_SEPARATORS = "979.713.770-88";
    public static final String CPF_VALIDO_SEM_SEPARATORS = "68864388087";
    public static final String CPF_INVALIDO_MENOS_DIGITOS = "6886438808";
    public static final String CPF_INVALIDO_MAIS_DIGITOS = "688643880877";
    public static final String CPF_INVALIDO_MAIS_DIGITOS_COM_SEPARATOR = "97923.713.770-88";
    public static final String CPF_INVALIDO_MENOS_DIGITOS_COM_SEPARATOR = "979.713.770-8";
    public static final String CPF_INVALIDO_DIGITOS_IGUAIS = "11111111111";
    public static final String CPF_INVALIDO_DIGITOS_IGUAIS_COM_SEPARATOR = "777.777.777-77";

    private ValidatorCPF validatorCPF;

    @BeforeEach
    public void setUp(){
        validatorCPF = new ValidatorCPFImpl();
    }

    @Test
    public void deve_validar_cpf_valido_com_separators(){
        assertTrue(validatorCPF.isValidCPF(CPF_VALIDO_COM_SEPARATORS));
    }

    @Test
    public void deve_validar_cpf_valido_sem_separators(){
        assertTrue(validatorCPF.isValidCPF(CPF_VALIDO_SEM_SEPARATORS));
    }

    @Test
    public void deve_validar_cpf_invalido_se_null_ou_vazio(){
        assertFalse(validatorCPF.isValidCPF(null));
        assertFalse(validatorCPF.isValidCPF(""));
        assertFalse(validatorCPF.isValidCPF(" "));
    }

    @Test
    public void deve_validar_cpf_invalido_com_menos_digitos(){
        assertFalse(validatorCPF.isValidCPF(CPF_INVALIDO_MENOS_DIGITOS));
    }

    @Test
    public void deve_validar_cpf_invalido_com_menos_digitos_com_separator(){
        assertFalse(validatorCPF.isValidCPF(CPF_INVALIDO_MENOS_DIGITOS_COM_SEPARATOR));
    }

    @Test
    public void deve_validar_cpf_invalido_com_mais_digitos(){
        assertFalse(validatorCPF.isValidCPF(CPF_INVALIDO_MAIS_DIGITOS));
    }

    @Test
    public void deve_validar_cpf_invalido_com_mais_digitos_com_separator(){
        assertFalse(validatorCPF.isValidCPF(CPF_INVALIDO_MAIS_DIGITOS_COM_SEPARATOR));
    }

    @Test
    public void deve_validar_cpf_invalido_digitos_iguais(){
        assertFalse(validatorCPF.isValidCPF(CPF_INVALIDO_DIGITOS_IGUAIS));
    }

    @Test
    public void deve_validar_cpf_invalido_digitos_iguais_com_separator(){
        assertFalse(validatorCPF.isValidCPF(CPF_INVALIDO_DIGITOS_IGUAIS_COM_SEPARATOR));
    }

}