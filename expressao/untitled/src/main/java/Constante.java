public class Constante implements Expressao{
    public float valor;
    public Constante(float valor) {this.valor = valor;}
    @Override
    public float valor() { return valor;}
}
