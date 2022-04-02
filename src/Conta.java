public abstract class Conta implements Iconta{

    /*conta implementa Iconta - sendo assim
    necesário implementar
    os métodos abstratos da interface Iconta*/

    /*classe conta abstrata para não receber new,
    (não ser estanciada)apenas as classes filhas
     ContaPoupança e
     ContaCorrente
     */

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;


    /*Foi utilizado o protected para encapsular de uma forma adequada
    e poder acessar das classes filhas.*/

        public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;

    }


    @Override
    public void sacar(double valor) {
        this.saldo -= valor;

    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
    this.sacar(valor);
    contaDestino.depositar(valor);

    }

    @Override
    public void abrirConta() {


    }

    @Override
    public void fecharConta() {

    }


    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns() {

        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numero));
        System.out.println(String.format("Saldo: %2f", this.saldo));
    }
}
