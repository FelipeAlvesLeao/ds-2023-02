public class Main {
    public static void main(String[] args) {
    Expressao resultado = (new Soma(new Constante(5), new Multiplica( new Constante(2), new Constante(3))));
    System.out.println(resultado.valor());
    }
}
