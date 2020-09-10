
public class TesteCarro {
    public static void main(String[] args) {
        int velocidade = 0;
        String corAzul = "Azul";
        String corVermelha = "Vermelho";
        Carro carroA = new Carro();
        Carro carroB = new Carro();

        carroA.setCor(corAzul);
        carroA.setVelocidade(velocidade);
        carroA.trocaDeCor("Cinza");
        System.out.println("a cor do carro A agora é: "+ carroA.getCor());

        carroB.setCor(corVermelha);
        carroB.setVelocidade(velocidade);
        carroB.trocaDeCor("Rosa");
        System.out.println("a cor do carro B agora é: "+ carroB.getCor());
        
    }
}