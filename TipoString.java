package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        String s = "Bom dia";
       
        System.out.println(s.concat("!!!"));
	System.out.println(s.startsWith("boa"));
	System.out.println(s.endsWith("tarde"));
	System.out.println(s.toLowerCase().startsWith("boa"));
	System.out.println(s.toUpperCase().endsWith("TARDE"));
	System.out.println(s.length());
	System.out.println(s.toLowerCase().equals("boa tarde"));
	System.out.println(s.equalsIgnoreCase("boa tarde"));

	var nome = "pedro";
	var sobrenome = "santos";
	var idade = 33;
	var salario = 12345.987;
	
	System.out.println("Nome: " + nome + "\nsobrenome: "
		+ sobrenome + "\nidade: " + idade +
		"\nSalario: " + salario + "\n\n");

	System.out.printf("O senhor %s %s tem %d e ganha %f.", nome, sobrenome, idade, salario);

    }
}
