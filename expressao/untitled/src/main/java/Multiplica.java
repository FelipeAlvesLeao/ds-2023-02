public class Multiplica implements Expressao{
    public float valor;
    public Multiplica(Expressao valor1, Expressao valor2) {this.valor = valor1.valor() * valor2.valor();}
    @Override
    public float valor() { return valor;}
}
