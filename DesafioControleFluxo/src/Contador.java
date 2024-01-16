import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		try {
			contar(parametroUm, parametroDois);
		
		}catch (Exception e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		int numero = parametroDois - parametroUm;
        if(numero <= 0)
            throw new ParametrosInvalidosException();
        for(int contagem = 1; contagem <= numero; contagem++){
            System.out.println("Imprimindo o número " + contagem);
        }
	}
    static class ParametrosInvalidosException extends Exception{}
}