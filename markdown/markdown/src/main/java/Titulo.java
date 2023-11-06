public class Titulo implements Markdown {
    private Markdown inputText;
    public Titulo(Markdown a) { inputText = a;}
    @Override
    public String exibe() {return "# " + inputText.exibe() + "\n";}
}
