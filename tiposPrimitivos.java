package fundamentos;

public class tiposPrimitivos {

    public static void main(String[] args) {
        //tipos numericos inteiros
        byte idade = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_134_845_223L;

        //tipos numericos reais / ponto flutuante
        float salario = 2344.55F;
        double vendasAcumuladas = 2_99_600_100.01;

        //tipo booleano
        boolean estaDeFerias = false;

        //tipo caractere
        char status = 'A';

        System.out.println(idade * 365);

        System.out.println(numeroDeVoos / 2);

        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha -> " + salario);

        System.out.println("ferias?" + estaDeFerias);

        System.out.println("status: " + status);






    }
}