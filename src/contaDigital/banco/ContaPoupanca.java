package contaDigital.banco;

public class ContaPoupanca extends Conta{
	  // Construtor
    public ContaPoupanca(String titular) {
        super(titular);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de " + valor + " realizado na Conta Poupança de " + titular);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado da Conta Poupança de " + titular);
        } else {
            System.out.println("Saldo insuficiente para saque na Conta Poupança de " + titular);
        }
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (valor <= saldo) {
            saldo -= valor;
            contaDestino.depositar(valor);
            System.out.println("Transferência de " + valor + " realizada da Conta Poupança de " + titular + " para a conta de " + contaDestino.getTitular());
        } else {
            System.out.println("Saldo insuficiente para transferência da Conta Poupança de " + titular);
        }
    }
	

}
