package classes;

public class Index {
    public static void main(String[] args) {
        Time t = new Time();
        Jogador j1 = new Jogador("Neymar", PosicaoTatica.ATACANTE);
        
        t.defineQtdPosicoes(PosicaoTatica.ATACANTE, 2);
        
    }
}
