package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
	/*System.out.println("Type your name: ");

	Scanner entrada = new Scanner(System.in);
	String nome = entrada.nextLine();

	System.out.println("Type your age: ");
        int idade = entrada.nextInt();

	System.out.println("Seu nome é " + nome);
	System.out.println("E tem " + idade + "anos");
	
	entrada.close();*/

	    Scanner teclado = new Scanner(System.in);
     
                System.out.println("Qual a sua idade?");
                int idade = teclado.nextInt();
		teclado.nextLine();
                System.out.println("Qual o seu nome?");
                String nome = teclado.nextLine();
                System.out.println("Qual o seu sobrenome?");
                String sobrenome = teclado.nextLine();
     
                teclado.close();
 
    }
}
