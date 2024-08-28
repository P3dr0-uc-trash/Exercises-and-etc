#include <stdio.h>

void calc(int* a, int* b, char* c){
if (*c == '+')
{
    printf("O resultado da sua soma e: %d", (*a+*b));
}    else if (*c == '-')
{
    printf("O resultado da sua subtracao e igual a: %d", (*a - *b));
}    else if (*c == '*')
{
    printf("O resultado da sua multiplicacao e igual a: %d", (*a * *b));
}    else if (*c == '/')
{ 
    printf("O resultado da sua divisao e igual a: %d", (*a / *b));
} else 
{
    printf("opcao invalida");
}

}
int main(){
char resposta;
int a,b;
char c;
    printf("Bem vindo a minha calculadora.\n");
    printf("Quer fazer algum calculo? ( S ou N)\n");
    scanf(" %c", &resposta);
if (resposta == 'S')
{
printf("Me de o calculo que queres realizar ( +, -, *, / )\n");
scanf(" %c", &c);
printf("Agora me de o primeiro numero: \n");
scanf("%d", &a);
printf("Agora me de o segundo numero: \n");
scanf("%d", &b);
calc(&a,&b,&c);
} else if (resposta == 'N')
{
printf("ok entao, tchau\n");
}
 return 0;

};
