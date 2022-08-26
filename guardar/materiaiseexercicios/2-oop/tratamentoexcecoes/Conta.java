package materiais.oop.tratamentoexcecoes;

public class Conta {

	private double saldo = 300;
	private double limite = 0;
	
	public Conta() {
		
	}
	
	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public void Saque(double qtdSaque) throws ContaExcecao {
		
		if(this.saldo >= qtdSaque ){ // tem saldo em conta
			this.saldo -=qtdSaque;
			System.out.println("Saque efetuado com sucesso.");
		}else { // não tem saldo em conta suficiente
			throw new ContaExcecao();	
		}
	}
	
	public void depositar(double valor) {	
		this.saldo += valor;
	}
	
	public void consultarSaldo() {
		System.out.println("Saldo atual da conta é " + this.saldo);
	}

		
}
