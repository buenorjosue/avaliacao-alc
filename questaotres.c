#include <stdio.h>

void calculo(int m, int n, float A[m][n], float y[m], float x[n], float Ax[m]){
    for (int i = 0; i < m; i++){
    for (int k = 0; k < n; k++){
        printf("Digite os valores de A: \n");
        scanf("%f", &A[i][k]);
    }  
   }

    for(int i = 0; i < n; i++){
        printf("Digite os valores de x: \n");
        scanf("%f", &x[i]);
    }

    for(int i = 0; i < m; i++){
        printf("Digite os valores de y: \n");
        scanf("%f", &y[i]);
    }

    for (int i = 0; i < m; i++){
        Ax[i] = 0;
    }
    
    for(int i = 0; i < m; i++){
        for (int j = 0; j < n; j++){
            Ax[j] = A[j][i] * x[i] + Ax[j];
        }     
    }

    for(int i = 0; i < m; i++){
        y[i] = Ax[i] + y[i];
    }

    for(int i = 0; i < m; i++){
        printf("O vetor y eh: %.0f\n", y[i]);
    }
}

int main (void){

   int m, n;

   printf("Digite o tamanho das linhas: ");
   scanf("%d", &m);

   printf("Digite o tamanho das colunas: ");
   scanf("%d", &n);

   float A[m][n], y[m], x[n], Ax[m];

   calculo(m, n, A, y, x, Ax);

    return 0;
}