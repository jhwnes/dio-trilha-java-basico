import java.util.Scanner;

public class AppMusica {

    public void menuMusica() {
        String opcao1 = "Play na musica";
        String opcao2 = "Pausar musica";
        String opcao3 = "Selecionar musica";
        Scanner terminal = new Scanner(System.in);
        
        System.out.println("Você deseja: \n 1. Dar play na música \n 2. Pausar a música \n 3. Selecionar outra música \n Digite a opção desejada");
        String opcao = terminal.nextLine();

        if(opcao.equals(opcao1))
            System.out.println("Tocando música...");
        else if(opcao.equals(opcao2))
            System.out.println("Pausando música...");
        else if(opcao.equals(opcao3))
            System.out.println("Digite o nome da música:");
            String musica = terminal.nextLine();
            System.out.println("Tocando " + musica + "...");

        terminal.close();
    }
}
