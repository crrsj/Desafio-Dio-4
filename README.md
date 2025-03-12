Banco - Sistema de Contas Bancárias
Este projeto simula um sistema bancário simples com duas tipos de contas: Conta Corrente e Conta Poupança. O sistema permite realizar operações como depósitos, saques e transferências entre contas da mesma instituição.

Conceitos Utilizados
1. Abstração
A abstração é um dos pilares da programação orientada a objetos. Neste projeto, a classe Conta foi criada como uma abstração para representar as contas bancárias. A classe Conta define métodos gerais como depositar, sacar e transferir, mas deixa a implementação específica para suas subclasses, como ContaCorrente e ContaPoupanca.
2. Encapsulamento
O encapsulamento é utilizado para proteger os dados internos das classes e permitir o acesso controlado através de métodos. Por exemplo, o saldo das contas é armazenado de forma privada e só pode ser acessado ou alterado através dos métodos fornecidos pela classe.
3. Herança
O conceito de herança foi utilizado para criar as classes ContaCorrente e ContaPoupanca, que herdam da classe Conta. Isso permite reutilizar o código da classe base (Conta), enquanto personaliza o comportamento de cada tipo de conta.
4. Polimorfismo
O polimorfismo é utilizado para tratar tanto uma ContaCorrente quanto uma ContaPoupanca como uma instância genérica de Conta. Isso permite que os métodos comuns, como depositar, sacar e transferir, sejam chamados de forma uniforme, independentemente do tipo específico de conta.
Estrutura do Projeto
Classes:
Conta (classe abstrata):

Classe base que define métodos comuns para todas as contas, como depositar, sacar e transferir.
Contém o saldo e o titular da conta.
ContaCorrente (classe concreta):

Representa uma conta corrente, herdando de Conta.
Implementa os métodos depositar, sacar e transferir de acordo com as regras da conta corrente.
ContaPoupanca (classe concreta):

Representa uma conta poupança, também herdando de Conta.
Implementa os métodos depositar, sacar e transferir de acordo com as regras da conta poupança.
Banco (classe principal):

Contém o método main onde as operações do sistema bancário são realizadas.
Cria instâncias das contas e simula depósitos, saques e transferências.
Funcionalidades
Depósito: Permite adicionar um valor ao saldo da conta.
Saque: Permite retirar um valor da conta, desde que o saldo seja suficiente.
Transferência: Permite transferir valores entre contas da mesma instituição.
Como Usar
Clone este repositório para o seu computador:

git clone https://github.com/seuusuario/banco-sistema-de-contas.git
Abra o projeto em sua IDE favorita (por exemplo, IntelliJ IDEA, Eclipse, etc.).

Compile e execute a classe Banco para testar as funcionalidades do sistema bancário.

O método main irá realizar algumas operações como depósito, saque e transferência entre contas, exibindo os saldos das contas no console.

Explicação do Código
Classe Conta: A classe abstrata define a estrutura básica das contas, como o saldo e o titular. Métodos como depositar, sacar e transferir são definidos, mas suas implementações são deixadas para as subclasses.

Classe ContaCorrente: Implementa a lógica de depósito, saque e transferência para contas correntes. Um saque só é permitido se houver saldo suficiente.

Classe ContaPoupanca: Implementa a lógica de depósito, saque e transferência para contas poupança. A lógica de saque segue as mesmas regras que a conta corrente, mas você pode adicionar regras diferentes, como rendimento de juros, caso deseje expandir.

Classe Banco: No método main, contas de diferentes tipos são criadas e operações como depósitos, saques e transferências são realizadas. A classe Banco também exibe o saldo de cada conta após as operações.
