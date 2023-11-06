public class Item implements Markdown {
    private Markdown inputText;
    public Item(Markdown a) { inputText = a;}
    @Override
    public String exibe() {return "* " + inputText.exibe() + "\n";}
}
