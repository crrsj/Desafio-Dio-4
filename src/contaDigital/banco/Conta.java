package contaDigital.banco;

abstract class Conta {

	 protected double saldo;
	    protected String titular;

	    // Construtor
	    public Conta(String titular) {
	        this.titular = titular;
	        this.saldo = 0.0;
	    }

	    // Métodos essenciais
	    public abstract void depositar(double valor);
	    public abstract void sacar(double valor);
	    public abstract void transferir(double valor, Conta contaDestino);

	    // Método para exibir saldo
	    public void exibirSaldo() {
	        System.out.println("Saldo da conta de " + titular + ": " + saldo);
	    }

	    // Método comum a todas as contas
	    public String getTitular() {
	        return titular;
	    }
	}


