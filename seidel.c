//Código do Seidel para ser usado na prova
#include <stdio.h>
#include <math.h>

void seidel(int m, double A[m][m], double b[m], double inicial[m]){
    double e = 0.0001;//criação do criterio de parada
    double before[m];//criando o vetor da proxima aproximacao
    double dis[m];//criando o medidor da distancia
    double maior = 1;//variavel para comparar com o criterio de parada
    int k = 0;

    for(int i; i < m; i++){//iniciando a aproximacao inicial com 0's
        inicial[i] = 0;
    }
   
    for (int i = 0; i < m; i++){
        for (int j = 0; j < m; j++){
            A[i][j] = 0;
        }  
    }

    A[0][0] = -2.02;
    A[0][1] = 1;

    for(int i = 0; i < m; i++){
        b[i] = 0;
    }

    b[0] = 1;
    b[1] = 0;
    b[2] = 1;

    for(int i = 1; i < m; i++){
        A[i][i-1] = 1;
        A[i][i] = -2.02;
        A[i][i+1] = 1;
    }

    while(maior > e){

        for(int i = 0; i < m; i++){
            before[i] = inicial[i];
        }

        for(int i = 0; i < m; i++){ //linhas
            double bi = b[i];
            for(int j = 0; j < m; j++){ //termos
                if(j != i){
                    bi -= A[i][j] * inicial[j];
                }
            }
            bi /= A[i][i];
            printf("x_%d^(%d) = %.5lf", i + 1, k + 1, bi);
            printf("\n");
            inicial[i] = bi;
        }

        printf("\n");
        for(int i = 0; i < m; i++){
            dis[i] = fabs(inicial[i] - before[i]);
            }

        maior = dis[0];
        for (int i = 0; i < m; i++) {
             if (dis[i] > maior)
                maior = dis[i];
             }
        
        k++;
    }
}

int main (void){

    int m = 30;//definindo o tamanho

    double A[m][m], b[m];
    double inicial[m];

    seidel(m, A, b, inicial);

    return 0;

}