#include <stdio.h>
void shell_sort(int vetor[], int tam) {
    for (int grupo = tam / 2; grupo > 0; grupo /= 2) {
        for (int i = grupo; i < tam; i++) {
            int troca = vetor[i];
            int j = i;
            while (j >= grupo && vetor[j - grupo] > troca) {
                vetor[j] = vetor[j - grupo];
                j -= grupo;
            }
            vetor[j] = troca;
        }
    }
}
int main() {
    int vetor[6] = {8, 3, 1, 42, 12, 5};
    shell_sort(vetor, 6);
    for (int i = 0; i < 6; i++) {
        printf("%d\n", vetor[i]);
    }
    return 0;
}
