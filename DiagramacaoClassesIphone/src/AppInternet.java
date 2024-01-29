import java.util.Scanner;

public class AppInternet {
    
    public void menuInternet() {
        String opcao1 = "Exibir pagina";
        String opcao2 = "Adicionar nova aba";
        String opcao3 = "Atualizar pagina";
        Scanner terminal = new Scanner(System.in);

        System.out.println("O que deseja fazer? \n 1. Exibir página \n 2. Adicionar nova aba \n 3. Atualizar página");
        String opcao = terminal.nextLine();

        if(opcao.equals(opcao1))
            System.out.println("Exibindo página...");
        else if(opcao.equals(opcao2))
            System.out.println("Adicionando nova aba...");
        else if(opcao.equals(opcao3))
            System.out.println("Atualizando página...");

        terminal.close();
    }
}
