import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta poupanca = new ContaPoupanca();




        cc.depositar(100);
        cc.transferir(10,poupanca);
        //cc.sacar(200);


        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
