public class Italico implements Markdown {
    private Markdown inputText;
    public Italico(Markdown a) { inputText = a;}
    @Override
    public String exibe() {return "*" + inputText.exibe() + "*";}
}
