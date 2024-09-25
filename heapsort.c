#include <stdio.h>

void heapify(int vetor[], int tam, int i) {
    int maior = i; 
    int esquerda = 2 * i + 1; 
    int direita = 2 * i + 2;  
    if (esquerda < tam && vetor[esquerda] > vetor[maior]) {
        maior = esquerda;
    }
    if (direita < tam && vetor[direita] > vetor[maior]) {
        maior = direita;
    }
    if (maior != i) {
        int temp = vetor[i];
        vetor[i] = vetor[maior];
        vetor[maior] = temp;

        heapify(vetor, tam, maior);
    }
}
void heap_sort(int vetor[], int tam) {
    for (int i = tam / 2 - 1; i >= 0; i--) {
        heapify(vetor, tam, i);
    }

    for (int i = tam - 1; i >= 0; i--) {
        int temp = vetor[0];
        vetor[0] = vetor[i];
        vetor[i] = temp;
        heapify(vetor, i, 0);
    }
}
int main() {
    int vetor[] = {21,2,145,12,45,7};
    heap_sort(vetor, 6);
    for (int i = 0; i < 6; i++) {
        printf("%d\n", vetor[i]);
    }
    return 0;
}