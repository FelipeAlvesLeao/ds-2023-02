public class Negrito implements Markdown {
    private Markdown inputText;
    public Negrito(Markdown a) { inputText = a;}
    @Override
    public String exibe() {return "**" + inputText.exibe() + "..";}
}
