public class Main {
    public static void main(String[] args) {

        Cliente jhones = new Cliente();
        jhones.setNome("Jhones");

        Conta cc = new ContaCorrente(jhones);
        Conta poupanca = new ContaPoupanca(jhones);
        
        cc.depositar(100);
        cc.transferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
