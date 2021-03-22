package com.validar.cpf.validadorCPF;

import com.validar.cpf.validadorCPF.models.Cliente;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class ValidadorCpfApplicationTests {

	@Test
	@DisplayName("Quando eu passar um cpf válido o valor precisa ser verdadeiro")
	void paraValidarCPF() {
		Cliente cliente = new Cliente("Leandro Santos", "43545768058");
		assertEquals(true, cliente.validarCPF());
	}

    @Test
    @DisplayName("Quando eu passar um CPF válido, o valor precisa ser falso")
	void paraValidarCPFInvalido() {
        Cliente cliente = new Cliente("Leandro Santos", "56546463");
		assertEquals(false, cliente.validarCPF());
	}

    @Test
    @DisplayName("Quando eu passar um CPF inválido e formatado, o valor precisa ser falso")
	void paraValidarCPFInvalidoFormatado() {
        Cliente cliente = new Cliente("Leandro Santos", "587.704.980-158");
		assertEquals(false, cliente.validarCPF());
	}

	@Test
    @DisplayName("Quando eu passar um CPF nulo")
	void paraValidarCPFNulo() {
        Cliente cliente = new Cliente("Leandro Santos", null);
		assertEquals(false, cliente.validarCPF());
	}

    @Test
    @DisplayName("Quando eu passar um CPF válido e formatado, o valor precisa ser verdadeiro")
	void paraValidarCPFValidoFormatado() {
        Cliente cliente = new Cliente("Leandro Santos", "587.704.980-16");
		assertEquals(true, cliente.validarCPF());
	}

}
