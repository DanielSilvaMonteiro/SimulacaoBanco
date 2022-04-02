public class ContaPoupanca extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println("\n***Extrato Conta Poupança***");
        super.imprimirInfosComuns();
    }

}
