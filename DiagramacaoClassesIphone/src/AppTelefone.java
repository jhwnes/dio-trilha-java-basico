import java.util.Scanner;

public class AppTelefone {

    public void menuLigar() {
        String opcao1 = "Ligar";
        String opcao2 = "Atender";
        String opcao3 = "Iniciar correio de voz";
        Scanner terminal = new Scanner(System.in);

        System.out.println("O que deseja fazer? \n 1. Ligar \n 2. Atender \n 3. Iniciar correio de voz");
        String opcao = terminal.nextLine();

        if(opcao.equals(opcao1))
            System.out.println("Ligando...");
        else if(opcao.equals(opcao2))
            System.out.println("Atendendo...");
        else if(opcao.equals(opcao3))
            System.out.println("Iniciando correio de voz...");

        terminal.close();
    }
}
