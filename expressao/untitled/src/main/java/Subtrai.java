public class Subtrai implements Expressao{
    public float valor;
    public Subtrai(Expressao valor1, Expressao valor2) {this.valor = valor1.valor() - valor2.valor();}
    @Override
    public float valor() { return valor;}
}
