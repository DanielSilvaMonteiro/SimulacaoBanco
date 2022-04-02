/*Interface é uma classe abstrata com todos os métodos abstratos
quem implementa esta classe recebe todos os métodos contidos nela.*/

public interface Iconta {

    //public void seria redundante, devido a interface ser public

    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, Conta contaDestino );
    void imprimirExtrato();
    void abrirConta();
    void fecharConta();


}
