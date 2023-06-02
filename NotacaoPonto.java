package fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {
        String s = "jfjfjf";
        s = s.replace("f", "R");
        s = s.toUpperCase();
        s = s.concat("!!!");
        System.out.println(s);
    }
}