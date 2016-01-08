package br.com.trilha.java.cursorefatoracao.cap5;

public class Fatura {

	private double valorMensal;
	private String cliente;

	public Fatura() {}

	public Fatura(double valorMensal, String cliente) {
		this.valorMensal = valorMensal;
		this.cliente = cliente;
	}
	public double getValorMensal() {
		return valorMensal;
	}
	public void setValorMensal(double valorMensal) {
		this.valorMensal = valorMensal;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double emDolar(){
		double taxa = 2.7;
		return converteValor(taxa);
	}
	public double emReal() {
		double taxa = 1;
		return converteValor(taxa);
	}

	private double converteValor(double taxa) {
		return valorMensal * taxa;
	}
}
