package materiais.oop.tratamentoexcecoes;

import java.util.Scanner;

public class TesteContaExcecao {

	public static void main(String[] args) throws ContaExcecao{
		
		Scanner scan = new Scanner(System.in);
		
		Conta minhaConta =  new Conta();
		
//		minhaConta.depositar(100);
//		minhaConta.setLimite(200);
		minhaConta.Saque(150);
		
		try {
			System.out.println(" digite valor para saque");
			double vlSaque = scan.nextDouble();
			minhaConta.Saque(vlSaque);
		}
		catch(ContaExcecao e) {
			System.out.println(" Favor depositar valor");
			double valor = scan.nextDouble();
			minhaConta.depositar(valor);
			minhaConta.Saque(250);
			minhaConta.setLimite(350);
			
			minhaConta.consultarSaldo();
			System.out.println(" O limite é " + minhaConta.getLimite());
			
		}
	}

}
