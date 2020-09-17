public class Animal {
    private String nome;
    private int qtdPatas;

    public Animal() {

    }

    public Animal(String nome) {

    }
    public Animal(int qtdPatas, String nome){
        
    }

    public int getQtdPatas() {
        return qtdPatas;
    }

    public void setQtdPatas(int qtdPatas) {
        this.qtdPatas = qtdPatas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
