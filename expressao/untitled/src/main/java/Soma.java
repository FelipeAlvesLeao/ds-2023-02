public class Soma implements Expressao{
    public float valor;
    public Soma(Expressao valor1, Expressao valor2) {this.valor = valor1.valor() + valor2.valor();}
    @Override
    public float valor() { return valor;}
}
