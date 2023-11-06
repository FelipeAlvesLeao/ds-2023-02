public class Texto implements Markdown {
    private String inputText;
    public Texto(String a) { inputText = a;}
    @Override
    public String exibe() {return inputText;}
}
