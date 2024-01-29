import java.util.Scanner;

public class Iphone {
    public static void main(String[] args){
        String app1 = "Musica";
        String app2 = "Telefone";
        String app3 = "Internet";
        
        AppMusica msc = new AppMusica();
        AppTelefone tel = new AppTelefone();
        AppInternet intern = new AppInternet();

        Scanner terminal = new Scanner(System.in);

        System.out.println("Qual App deseja usar? \n 1. Música \n 2. Telefone \n 3. Internet");
        String app = terminal.next();

        if(app1.equals(app)){
            msc.menuMusica();
        }
        else if(app2.equals(app)){
            tel.menuLigar();
        }
        else if(app3.equals(app)){
            intern.menuInternet();
        }
        terminal.close();
    }
}
