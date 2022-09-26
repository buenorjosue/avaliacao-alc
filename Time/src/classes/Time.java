package classes;

public class Time {
   private Jogador[] jogadores = new Jogador[100];
   private PosicaoTatica[] posicoesTaticas = new PosicaoTatica[100]; 
   private int[] qtdPosicoes = new int[100];
   
   public Time(){
       this.posicoesTaticas = new PosicaoTatica[100];
       this.qtdPosicoes = new int[PosicaoTatica.values().length];
    }

    public PosicaoTatica[] getPosicoesTaticas() {
        return posicoesTaticas;
    }

    public void setPosicoesTaticas(PosicaoTatica[] posicoesTaticas) {
        this.posicoesTaticas = posicoesTaticas;
    }
   
   public void adicionarJogador(Jogador j){
       if(qtdPosicoes[j.getPosicao().getValor()] > 0){
          
       }
       else{
           System.out.println("Posição sem vaga!");
       }
   }
   
   public void defineQtdPosicoes(PosicaoTatica p, int num){
       this.qtdPosicoes[p.getValor()] = num;
   }
}
