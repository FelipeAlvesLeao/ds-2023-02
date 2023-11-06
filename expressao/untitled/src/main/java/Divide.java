public class Divide implements Expressao{
    public float valor;
    public Divide(Expressao valor1, Expressao valor2) {this.valor = valor1.valor() / valor2.valor();}
    @Override
    public float valor() { return valor;}
}
