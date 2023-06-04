package fundamentos;

public class ObjetoVsPrimitivo {

    public static void main(String args[]) {

	//tudo em java é um objeto
	//menos os tipos primitivos

	//os wrapers sao a versao objeto
	//dos tipos primitivos

	String s = new String("texto");
	s.toUpperCase();

	System.out.println(s);
	
	int a = new int(123);
	System.out.println(a);		
    }
}
