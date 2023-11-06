public class Concatenar implements Markdown {
    Markdown inputTextA, inputTextB;
    Concatenar(Markdown inputTextA, Markdown inputTextB) {
        this.inputTextA = inputTextA;
        this.inputTextB = inputTextB;
    }
    @Override
    public String exibe() {return inputTextA.exibe() + inputTextB.exibe();}
}
