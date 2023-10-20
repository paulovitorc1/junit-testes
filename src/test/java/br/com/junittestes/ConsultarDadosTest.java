package br.com.junittestes;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConsultarDadosTest {

	@BeforeAll
	static void configuraConexao() {
		BancoDeDados.iniciarConexão();
		System.out.println("Rodou configuraConexao");
	}

	@BeforeEach
	void insereDadosParaTeste() {
		BancoDeDados.insereDados(new Pessoa("João", LocalDate.of(2020, 2, 10)));
	}

	@AfterEach
	void removeDadosParaTeste() {
		BancoDeDados.removeDados(new Pessoa("João", LocalDate.of(2020, 2, 10)));
	}

	@Test
	void validarDadosDeRetorno() {
		Assertions.assertTrue(true);
	}

	@AfterAll
	static void finalizarConexao() {
		BancoDeDados.finalizarConexao();
		System.out.println("Rodou finalizar conexão.");
	}

}
