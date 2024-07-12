/*  
A recursão em Java (ou em qualquer outra linguagem de programação) é uma técnica onde um método chama a si mesmo para resolver um problema. Um problema é dividido em subproblemas menores do mesmo tipo, e a função continua a se chamar recursivamente até atingir uma condição de base, que é o ponto em que a recursão para.

Estrutura de um Método Recursivo
Um método recursivo geralmente possui duas partes principais:

Condição de base: A condição que termina a recursão. Sem essa condição, a recursão entraria em um loop infinito.
Passo recursivo: A parte do método que chama a si mesmo com um subproblema menor.
Exemplo: Fatorial de um Número
Vamos considerar um exemplo clássico de recursão: calcular o fatorial de um número. O fatorial de n (denotado n!) é o produto de todos os números positivos menores ou iguais a n. Por definição, 0! é 1.

A fórmula do fatorial é:
n!= n × (n−1)!

 */

public class FatorialRecursivo 
{

    public static void main(String[] args) 
    {
        int numero = 5;
        int resultado = fatorial(numero);
        System.out.println("Fatorial de " + numero + " é " + resultado);
    }

    public static int fatorial(int n) 
    {
        // Condição de base: fatorial de 0 ou 1 é 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Passo recursivo: n * fatorial(n - 1)
        return n * fatorial(n - 1);
    }
}
