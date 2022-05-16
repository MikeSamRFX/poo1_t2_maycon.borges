#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct No_cliente {
    int cpf[12];
    char nome[100];
    int data;
    int cep;
    int compras;
    struct No_cliente *proximo;
} No_cliente;

typedef struct 
{
    No_cliente *inicio, *fim;
    int tam;
} Lista_cliente;

// inserção no início da lista
void inserirInicioCliente(Lista_cliente *lista, int cpf[11], char nome[100], int data, int cep) {
    No_cliente *novo = (No_cliente*)malloc(sizeof(No_cliente)); // cria um novo nó
    
    for(int i = 0; i < 11; i++){
        novo->cpf[i] = cpf[i];
    }
    strcpy(novo->nome,nome);
    novo->data = data;
    novo->cep = cep;
    novo->compras = 0;

    if(lista->inicio == NULL) { // a lista está vazia
        novo->proximo = NULL;
        lista->inicio = novo;
        lista->fim = novo;
    } else { // a lista não está vazia
        novo->proximo = lista->inicio;
        lista->inicio = novo;
    }
    lista->tam++;
}

// imprimir a lista
void imprimircliente(Lista_cliente *lista) {
    No_cliente *inicio = lista->inicio;
    printf("Tamanho da lista: %d\n", lista->tam);
    while(inicio != NULL) {
        for(int i = 0; i < 11; i++){
            printf("%d", inicio->cpf[i]);
        }
        printf("%s", inicio->nome);
        printf("%d",inicio->data);
        printf("%d",inicio->cep);
        inicio = inicio->proximo;
    }
    printf("\n\n");
}

void buscar_cliente (int cpf[11], Lista_cliente *lista, No_cliente *no) {
    No_cliente *inicio = lista->inicio;
    while(inicio != NULL) {
        if(inicio->cpf[0] == cpf[0] && inicio->cpf[1] == cpf[1] && inicio->cpf[2] == cpf[2] && inicio->cpf[3] == cpf[3] && inicio->cpf[4] == cpf[4] && inicio->cpf[5] == cpf[5] && inicio->cpf[6] == cpf[6] && inicio->cpf[7] == cpf[7] && inicio->cpf[8] == cpf[8] && inicio->cpf[9] == cpf[9] && inicio->cpf[10] == cpf[10]) {
            strcpy(no->nome,inicio->nome);
            no->data = inicio->data;
            no->cep = inicio->cep;
            for(int i = 0; i < 11; i++){
                no->cpf[i] = inicio->cpf[i];
            }
            return;
        }
        inicio = inicio->proximo;
    }
    printf("\nCliente nao encontrado!\n");
    return;
}

typedef struct No_funcionario {
    int cpf[12];
    char nome[100];
    int data_n;
    int data_i;
    int vendas;
    struct No_funcionario *proximo;
} No_funcionario;

typedef struct 
{
    No_funcionario *inicio, *fim;
    int tam;
} Lista_funcionario;

// inserção no início da lista
void inserirIniciofuncionario(Lista_funcionario *lista, int cpf[11], char nome[100], int data_n, int data_i) {
    No_funcionario *novo = (No_funcionario*)malloc(sizeof(No_funcionario)); // cria um novo nó
    
    for(int i = 0; i < 11; i++){
        novo->cpf[i] = cpf[i];
    }
    strcpy(novo->nome,nome);
    novo->data_n = data_n;
    novo->data_i = data_i;
    novo->vendas = 0;

    if(lista->inicio == NULL) { // a lista está vazia
        novo->proximo = NULL;
        lista->inicio = novo;
        lista->fim = novo;
    } else { // a lista não está vazia
        novo->proximo = lista->inicio;
        lista->inicio = novo;
    }
    lista->tam++;
}

// imprimir a lista
void imprimirfuncionario(Lista_funcionario *lista) {
    No_funcionario *inicio = lista->inicio;
    printf("Tamanho da lista: %d\n", lista->tam);
    while(inicio != NULL) {
        for(int i = 0; i < 11; i++){
            printf("%d", inicio->cpf[i]);
        }
        printf("%s", inicio->nome);
        printf("%d",inicio->data_n);
        printf("%d",inicio->data_i);
        inicio = inicio->proximo;
    }
    printf("\n\n");
}

void buscar_funcionario (int cpf[11], Lista_funcionario *lista, No_funcionario *no) {
    No_funcionario *inicio = lista->inicio;
    while(inicio != NULL) {
        if(inicio->cpf[0] == cpf[0] && inicio->cpf[1] == cpf[1] && inicio->cpf[2] == cpf[2] && inicio->cpf[3] == cpf[3] && inicio->cpf[4] == cpf[4] && inicio->cpf[5] == cpf[5] && inicio->cpf[6] == cpf[6] && inicio->cpf[7] == cpf[7] && inicio->cpf[8] == cpf[8] && inicio->cpf[9] == cpf[9] && inicio->cpf[10] == cpf[10]) {
            strcpy(no->nome,inicio->nome);
            no->data_n = inicio->data_n;
            no->data_i = inicio->data_i;
            for(int i = 0; i < 11; i++){
                no->cpf[i] = inicio->cpf[i];
            }
            return;
        }
        inicio = inicio->proximo;
    }
    printf("\nFuncionario nao encontrado!\n");
    return;
}

typedef struct No_produto {
    int codigo;
    char nome[100];
    char fabricante[100];
    double preco;
    int vendeu;
    struct No_produto *proximo;
} No_produto;

typedef struct 
{
    No_produto *inicio, *fim;
    int tam;
} Lista_produto;

// inserção no início da lista
void inserirInicioproduto(Lista_produto *lista, int codigo, char nome[100], char fabricante[100], double preco) {
    No_produto *novo = (No_produto*)malloc(sizeof(No_produto)); // cria um novo nó
    
    novo->codigo = codigo;
    strcpy(novo->nome,nome);
    strcpy(novo->fabricante,fabricante);
    novo->preco = preco;
    novo->vendeu = 0;

    if(lista->inicio == NULL) { // a lista está vazia
        novo->proximo = NULL;
        lista->inicio = novo;
        lista->fim = novo;
    } else { // a lista não está vazia
        novo->proximo = lista->inicio;
        lista->inicio = novo;
    }
    lista->tam++;
}

// imprimir a lista
void imprimirproduto(Lista_produto *lista) {
    No_produto *inicio = lista->inicio;
    printf("Tamanho da lista: %d\n", lista->tam);
    while(inicio != NULL) {
        printf("%d\n",inicio->codigo);
        printf("%s\n", inicio->nome);
        printf("%s\n", inicio->fabricante);
        printf("%.2lf\n",inicio->preco);
        inicio = inicio->proximo;
    }
    printf("\n\n");
}

void buscar_produto (int codigo, Lista_produto *lista, No_produto *no) {
    No_produto *inicio = lista->inicio;
    while(inicio != NULL) {
        if(inicio->codigo == codigo) {
            no->codigo = inicio->codigo;
            strcpy(no->nome,inicio->nome);
            strcpy(no->fabricante,inicio->fabricante);
            no->preco = inicio->preco;
            return;
        }
        inicio = inicio->proximo;
    }
    printf("\nProduto nao encontrado!\n");
    return;
}

typedef struct No_venda{
    int key;
    int cpf_cliente[11];
    int cpf_funcionario[11];
    int produto;
    int quantidade;
    double valor;
    struct No_venda *proximo;
} No_venda;

typedef struct 
{
    No_venda *inicio, *fim;
    int tam;
} Lista_venda;

// inserção no início da lista
void inserirIniciovenda(Lista_venda *lista, int cpf_cliente[11], int cpf_funcionario[11], int produto, int quantidade, double valor) {
    No_venda *novo = (No_venda*)malloc(sizeof(No_venda)); // cria um novo nó
    
    for(int i = 0; i < 11; i++){
        novo->cpf_cliente[i] = cpf_cliente[i];
        novo->cpf_funcionario[i] = cpf_funcionario[i];
    }
    novo->produto = produto;
    novo->quantidade = quantidade;
    novo->valor = valor;
    novo->key = lista->tam + 1;

    if(lista->inicio == NULL) { // a lista está vazia
        novo->proximo = NULL;
        lista->inicio = novo;
        lista->fim = novo;
    } else { // a lista não está vazia
        novo->proximo = lista->inicio;
        lista->inicio = novo;
    }
    lista->tam++;
}

// imprimir a lista
void imprimirvenda(Lista_venda *lista) {
    No_venda *inicio = lista->inicio;
    printf("Tamanho da lista: %d\n", lista->tam);
    while(inicio != NULL) {
        printf("\nCpf do cliente:");
        for(int i = 0; i < 11; i++){
            printf("%d", inicio->cpf_cliente[i]);
        }
        printf("\nCpf do funcionario:");
        for(int i = 0; i < 11; i++){
            printf("%d", inicio->cpf_funcionario[i]);
        }
        printf("\nCodigo do produto:%d\n", inicio->produto);
        printf("Quantidade:%d\n",inicio->quantidade);
        printf("Valor da compra:%.2lf\n",inicio->valor);
        inicio = inicio->proximo;
    }
    printf("\n\n");
}

void incriasevenda_compra(Lista_produto *produto,int codigo, Lista_funcionario *funcionario, int cpf_funcionario[11], Lista_cliente *cliente, int cpf_cliente[11]){
    No_cliente *no_cl = cliente->inicio;
    No_funcionario *no_fun = funcionario->inicio;
    No_produto *no_pro = produto->inicio;
    while(no_cl != NULL){
        if(no_cl->cpf[0] == cpf_cliente[0] && no_cl->cpf[1] == cpf_cliente[1] && no_cl->cpf[2] == cpf_cliente[2] && no_cl->cpf[3] == cpf_cliente[3] && no_cl->cpf[4] == cpf_cliente[4] && no_cl->cpf[5] == cpf_cliente[5] && no_cl->cpf[6] == cpf_cliente[6] && no_cl->cpf[7] == cpf_cliente[7] && no_cl->cpf[8] == cpf_cliente[8] && no_cl->cpf[9] == cpf_cliente[9] && no_cl->cpf[10] == cpf_cliente[10]){
            no_cl->compras++;
            break;
        }
        no_cl = no_cl->proximo;
    }
    while(no_fun != NULL){
        if(no_fun->cpf[0] == cpf_funcionario[0] && no_fun->cpf[1] == cpf_funcionario[1] && no_fun->cpf[2] == cpf_funcionario[2] && no_fun->cpf[3] == cpf_funcionario[3] && no_fun->cpf[4] == cpf_funcionario[4] && no_fun->cpf[5] == cpf_funcionario[5] && no_fun->cpf[6] == cpf_funcionario[6] && no_fun->cpf[7] == cpf_funcionario[7] && no_fun->cpf[8] == cpf_funcionario[8] && no_fun->cpf[9] == cpf_funcionario[9] && no_fun->cpf[10] == cpf_funcionario[10]){
            no_fun->vendas++;
            break;
        }
        no_fun = no_fun->proximo;
    }
    while(no_pro != NULL){
        if(codigo == no_pro->codigo){
            no_pro->vendeu++;
            break;
        }
        no_pro = no_pro->proximo;
    }
}

int main () {

    Lista_produto produto;
    produto.inicio = NULL;
    produto.fim = NULL;
    produto.tam = 0;

    Lista_cliente cliente;
    cliente.inicio = NULL;
    cliente.fim = NULL;
    cliente.tam = 0;

    Lista_funcionario funcionario;
    funcionario.inicio = NULL;
    funcionario.fim = NULL;
    funcionario.tam = 0;

    Lista_venda venda;
    venda.inicio = NULL;
    venda.fim = NULL;
    venda.tam = 0;
    
    while (1){
        system("cls");

        printf("1-Cadastro_funcionario\n");
        printf("2-Cadastro_cliente\n");
        printf("3-Cadastro_produto\n");
        printf("4-Vender\n");
        printf("5-Quem mais compra\n");
        printf("6-Quem mais venda\n");
        printf("7-Mais vendido\n");
        printf("8-Mostrar vendas\n");

        int choise;
        scanf("%d",&choise);

        system("cls");

        //Cadastro funcionario
        if (choise == 1){
            char cpf_str[12];
            printf("\nInsira o cpf do funcionario:");
            scanf("%s", cpf_str);
            int cpf[12];
            for(int i = 0; i < 11; i++){
                cpf[i] = cpf_str[i] - 48;
            }
            
            char nome[100];
            printf("\nInsira o nome do funcionario:");
            scanf("%s", nome);
            int data_n;
            int data_i;
            int dia, mes, ano;
            printf("\nInsira a data de nascimento no formato DD MM AAAA : ");
            scanf("%d %d %d", &dia, &mes, &ano);
            data_n = dia+(30*mes)+(360*ano);
            printf("\nInsira a data de ingresso no formato DD MM AAAA : ");
            scanf("%d %d %d", &dia, &mes, &ano);
            data_i = dia+(30*mes)+(360*ano);

            inserirIniciofuncionario(&funcionario,cpf,nome,data_n,data_i);
        }
        
        //cadastro cliente
        if(choise == 2){
            char cpf_str[12];
            printf("\nInsira Cpf do cliente:");
            scanf("%s", cpf_str);
            int cpf[12];
            for(int i = 0; i < 11; i++){
                cpf[i] = cpf_str[i] - 48;
            }
            
            char nome[100];
            printf("\nInsira o nome do cliente:");
            scanf("%s", nome);
            int data;
            int dia, mes, ano;
            printf("\nInsira a data de nascimento no formato DD MM AAAA : ");
            scanf("%d %d %d", &dia, &mes, &ano);
            data = dia+(30*mes)+(360*ano);
            int cep;
            printf("\nInsira o cep do cliente:");
            scanf("%d", &cep);
            

            inserirInicioCliente(&cliente,cpf,nome,data,cep);
        }

        //cadastro produto
        if(choise == 3){
            int codigo;
            char nome[100];
            char fabricante[100];
            double preco;
            printf("\nInsira codigo do produto:");
            scanf("%d",&codigo);
            printf("\nInsira o nome do produto:");
            scanf("%s",nome);
            printf("\nInsira a fabricante do produto:");
            scanf("%s",fabricante);
            printf("\nInsira o preco do produto:");
            scanf("%lf",&preco);

            inserirInicioproduto(&produto,codigo,nome,fabricante,preco);
        }

        if(choise == 4){
            printf("\n\nVender\n\n");
            char cpf_str_clt[12];
            printf("\nInsira o CPF do cliente:");
            scanf("%s", cpf_str_clt);
            int cpf_cliente[12];
            for(int i = 0; i < 11; i++){
                cpf_cliente[i] = cpf_str_clt[i] - 48;
            }
            char cpf_str_fun[12];
            printf("\nInsira o CPF do funcionario:");
            scanf("%s", cpf_str_fun);
            int cpf_funcionario[12];
            for(int i = 0; i < 11; i++){
                cpf_funcionario[i] = cpf_str_fun[i] - 48;
            }
            int codigo;
            printf("\nInsira o codigo do produto:");
            scanf("%d", &codigo);
            int quantidade;
            printf("\nInsira a quantidade:");
            scanf("%d", &quantidade);
            
            No_produto aux;
            buscar_produto(codigo, &produto, &aux);

            double valor = aux.preco * quantidade;

            inserirIniciovenda(&venda, cpf_cliente, cpf_funcionario, codigo, quantidade, valor);

            incriasevenda_compra(&produto,codigo, &funcionario,cpf_funcionario, &cliente , cpf_cliente);
        }

        //quem mais compra
        if(choise == 5){
            int maior;
            No_cliente *clt;
            clt = cliente.inicio;
            No_cliente aux;
            while(clt != NULL){
                if(maior < clt->compras){
                    maior = clt->compras;
                    for(int i = 0; i < 11; i++){
                        aux.cpf[i] = clt->cpf[i];
                    }
                    strcpy(aux.nome,clt->nome);
                }
                clt = clt->proximo;
            }
            printf("\nTop 1 Cliente\n");
            for(int i = 0; i < 11; i++){
                printf("%d", aux.cpf[i]);
            }
            printf("\n%s\n", aux.nome);
            system("pause");
        }

        //quem mais vende
        if(choise == 6){
            int maior = 0;
            No_funcionario *fun;
            fun = funcionario.inicio;
            No_funcionario aux;
            while(fun != NULL){
                if(maior < fun->vendas){
                    maior = fun->vendas;
                    for(int i = 0; i < 11; i++){
                        aux.cpf[i] = fun->cpf[i];
                    }
                    strcpy(aux.nome,fun->nome);
                }
                fun = fun->proximo;
            }
            printf("\nTop 1 Funcionario\n");
            for(int i = 0; i < 11; i++){
                printf("%d", aux.cpf[i]);
            }
            printf("\n%s\n", aux.nome);
            system("pause");
        }

        //qual mais vende
        if(choise == 7){
            int maior = 0;
            No_produto *pro;
            pro = produto.inicio;
            No_produto aux;
            while(pro != NULL){
                if(maior < pro->vendeu){
                    maior = pro->vendeu;
                    aux.codigo = pro->codigo;
                    strcpy(aux.nome, pro->nome);
                }
                pro = pro->proximo;
            }
            printf ("Top 1 produto");
            printf("\n%d\n", aux.codigo);
            printf("\n%s\n", aux.nome);
            system("pause");
        }

        //vendas
        if(choise == 8){
            imprimirvenda(&venda);
            system("pause");
        }
        
        if(choise == 0){
            return 0;
        }
    }
}