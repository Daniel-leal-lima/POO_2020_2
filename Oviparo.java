public class Oviparo extends Animal{
    private String botaOvos;
    private int qtdOvos;

    public Oviparo(String nome, String botaOvos, int qtdOvos) {
        setNome(nome);
        setBotaOvos(botaOvos);
        setQtdOvos(qtdOvos);
    }
    public Oviparo(String nome,int qtdPatas, String botaOvos, int qtdOvos) {
        setNome(nome);
        setQtdPatas(qtdPatas);
        setBotaOvos(botaOvos);
        setQtdOvos(qtdOvos);
    }

    public int getQtdOvos() {
        return qtdOvos;
    }

    public void setQtdOvos(int qtdOvos) {
        this.qtdOvos = qtdOvos;
    }

    public String getBotaOvos() {
        return botaOvos;
    }

    public void setBotaOvos(String botaOvos) {
        this.botaOvos = botaOvos;
    }
}
