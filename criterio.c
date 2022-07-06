#include <stdio.h>
#include <math.h>

void jacobi(int m, double A[m][m], double b[m], double inicial[m], int iteracao){
    double e = 0.05;//criação do criterio de parada
    double next[m];//criando o vetor da proxima aproximacao
    double dis[m];//criando o medidor da distancia
    double maior = 1;//variavel para comparar com o criterio de parada
    int k = 0;

    for(int i; i < m; i++){//iniciando a aproximacao inicial com 0's
        inicial[i] = 0;
    }
   
    for (int i = 0; i < m; i++){
        for (int j = 0; j < m; j++){
            printf("Digite os valores de A: \n");
            scanf("%lf", &A[i][j]);
        }  
    }

    for(int i = 0; i < m; i++){
        printf("Digite os valores de b: \n");
            scanf("%lf", &b[i]);
    }

    while(maior > e){

        for(int i = 0; i < m; i++){ //linhas
            double bi = b[i];
            for(int j = 0; j < m; j++){ //termos
                if(j != i){
                    bi -= A[i][j] * inicial[j];
                }
            }
            bi /= A[i][i];
            printf("x_%d^(%d) = %.5lf\t", i + 1, k + 1, bi);
            next[i] = bi;
        }

        printf("\n");
        for(int i = 0; i < m; i++){
            dis[i] = fabs(next[i] - inicial[i]);
            }

        maior = dis[0];
        for (int i = 0; i < m; i++) {
             if (dis[i] > maior)
                maior = dis[i];
             }
        
        //atualizando a aproximacao inicial
        for(int i = 0; i < m; i++){
            inicial[i] = next[i];
        }
        k++;
    }
}

int main (void){

    int m, iteracao;

    printf("Digite o tamanho: ");
    scanf("%d", &m);

    //printf("Digite quantas iterações: ");
    //scanf("%d", &iteracao);

    double A[m][m], b[m];
    double inicial[m];

    jacobi(m, A, b, inicial, iteracao);

    return 0;

}