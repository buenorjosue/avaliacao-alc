package questaoum;

public class QuestaoUm {

    public static void main(String[] args) {
        int [][] tab = new int [10][9];
        for(int i=0; i< 10; i++){
            for(int j=0; j < 9; j++){
                  tab[i][j] = i*j;
                  System.out.println(tab[i][j]);
            }
        }
    }
    
}
