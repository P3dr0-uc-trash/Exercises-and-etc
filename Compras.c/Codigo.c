#include <stdio.h>

typedef struct { 
int codigo;
char nome[30]; 
float preco; 
} Produto;

typedef struct { 
Produto produto;
int quantidade; 
} Carrinho;

