package contaDigital.banco;

public class Banco {
	 public static void main(String[] args) {
	        // Criação de contas
	        Conta conta1 = new ContaCorrente("João");
	        Conta conta2 = new ContaPoupanca("Maria");

	        // Realizando operações
	        conta1.depositar(500);
	        conta2.depositar(1000);

	        conta1.transferir(200, conta2);
	        conta1.exibirSaldo();
	        conta2.exibirSaldo();

	        conta2.sacar(300);
	        conta2.exibirSaldo();
	    }
}
