#include <stdio.h>

void calculo(int tam, float a, float x[tam], float y[tam]){

    printf("Digite a constante: ");
    scanf("%f", &a);

    for(int i = 0; i < tam; i++){
        printf("Digite o elemento %d de x: ", i);
        scanf("%f", &x[i]);
    }

    for(int i = 0; i < tam; i++){
        printf("Digite o elemento %d de y: ", i);
        scanf("%f", &y[i]);
    }

    for(int i = 0; i < tam; i++){
        y[i] = (a*x[i]) + y[i];
    }

    for(int i = 0; i < tam; i++){
        printf("Elemento %d do vetor y: %.2f\n", i, y[i]);
    }
}

int main (void){

    int tam; 

    printf("Digite o tamanho dos vetores: ");
    scanf("%d", &tam);

    float a, x[tam], y[tam];

    calculo(tam, a, x, y);

    return 0;
}