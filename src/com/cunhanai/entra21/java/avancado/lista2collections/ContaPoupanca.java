package com.cunhanai.entra21.java.avancado.lista2collections;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca> {

	private String situacao;

	public ContaPoupanca() {
		super();
	}
	
	public ContaPoupanca(int numero, double saldo, String nome, String situacao) {
		super(numero, saldo, nome);
		this.situacao = situacao;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

//	@Override
//	public int compareTo(ContaPoupanca outraConta) {
//		if (super.getNumero() < outraConta.getNumero()) {
//			return -1;
//		}
//		
//		if (super.getNumero() > outraConta.getNumero()) {
//			return 1;
//		}
//		return 0;
//	}

//	@Override
//	public int compareTo(ContaPoupanca outraConta) {
//		return super.getNome().compareTo(outraConta.getNome());
//	}
	
	@Override
	public int compareTo(ContaPoupanca outraConta) {
		if (super.getSaldo() < outraConta.getSaldo()) {
			return -1;
		}
		
		if (super.getSaldo() > outraConta.getSaldo()) {
			return 1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return super.toString() + "\nSituacao: " + situacao + "\n\n";
	}
	
	

	
}
