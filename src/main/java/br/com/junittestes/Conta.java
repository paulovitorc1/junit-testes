package br.com.junittestes;

public class Conta {

	private String numero;
	private int saldo;

	public Conta(String numero, int saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}

	public String getNumero() {
		return numero;
	}

	public int getSaldo() {
		return saldo;
	}

}
