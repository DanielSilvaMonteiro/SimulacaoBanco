public class ContaCorrente extends Conta{


    @Override
    public void imprimirExtrato() {
        System.out.println("\n***Extrato Conta Corrente***");
        super.imprimirInfosComuns();

    }

}
