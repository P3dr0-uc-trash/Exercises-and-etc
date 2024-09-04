#include<stdio.h>

void buble(int vetor[], int tamanho){
int a,b,temp;
int troca;
for ( a = 0; a < tamanho - 1; a++)
{
    troca = 0;
    for ( b = 0; b < tamanho - a - 1; b++)
    {
        if (vetor[b]>vetor[b+1])
        {
            temp = vetor[b];
            vetor[b] = vetor[b+1];
            vetor[b+1]=temp;
            troca=1;
        }
        
    }
    if (troca == 0)
    {
        break;
    }
    
}

}


int main(){
    int vetor[6];
for (int i = 0; i<6 ; i++)
{
	printf("Me diga o valor: \n");
	scanf("%d", &vetor[i]);
}
buble(vetor,6);
  printf("vetor ordenado:\n");
for (int i = 0; i < 6; i++)

{
  printf(" %d\n",vetor[i]);
}


}