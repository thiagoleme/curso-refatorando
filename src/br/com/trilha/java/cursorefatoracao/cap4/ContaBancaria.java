package br.com.trilha.java.cursorefatoracao.cap4;

public abstract class ContaBancaria {
	protected double saldo;
	protected String titular;

	public ContaBancaria(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}

	public void saca(double valor) {
		saldo -= valor;
	}

	public void deposita(double valor) {
		saldo += valor;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}

}
