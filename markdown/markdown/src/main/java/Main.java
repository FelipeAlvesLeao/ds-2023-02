public class Main {
    public static void main(String[] args) {

        Markdown titulo = new Titulo(new Texto("Título"));
        Markdown negrito = new Negrito(new Texto("negrito"));
        Markdown italico = new Italico(new Texto("itálico"));
        Markdown negritoEItalico = new Concatenar(negrito, italico);
        Markdown item = new Item(new Concatenar(new Texto("Primeiro item da linha com"), italico));
        Markdown linha = new Concatenar(new Texto("Uma simples linha, com "), negritoEItalico);

        System.out.println(titulo.exibe() + linha.exibe() + item.exibe());
    }
}