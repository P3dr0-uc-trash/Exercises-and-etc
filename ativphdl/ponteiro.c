#include <stdio.h>

void incrementa(int *valor){
printf("antes de incrementar.\n");
printf("o contador vale %d.\n", (*valor));
printf("O endereco de memoria e %p\n", valor);
printf("depois de incrementar.\n");
printf("O contador vale %d\n", ++(*valor));
printf("O endereco de memoria e %p\n", valor);
}

int main(){
int cont = 10;

printf("antes de incrementar.\n");
printf("o contador vale %d.\n", cont);
printf("O endereco de memoria e %p\n", &cont);

incrementa(&cont);

printf("depois de incrementar.\n");
printf("O contador vale %d\n",cont);
printf("O endereco de memoria e %p\n", &cont);
return 0;
}