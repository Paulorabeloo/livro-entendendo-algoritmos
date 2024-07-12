/*Em Java, uma pilha (ou stack) é uma estrutura de dados que segue o princípio LIFO (Last In, First Out), 
onde o último elemento inserido é o primeiro a ser removido. A classe Stack em Java, que faz parte do pacote java.util, 
oferece uma implementação padrão de uma pilha.

Operações Básicas
push: Adiciona um elemento no topo da pilha.
pop: Remove e retorna o elemento do topo da pilha.
peek: Retorna o elemento do topo da pilha sem removê-lo.
isEmpty: Verifica se a pilha está vazia.
search: Retorna a posição de um elemento na pilha, contando a partir do topo.

Exemplo de Uso da Classe Stack
Vamos explorar um exemplo simples que demonstra as operações básicas de uma pilha:
*/

import java.util.Stack;

public class ExemploPilha 
{

    public static void main(String[] args) 
    {
        // Criação de uma pilha de inteiros
        Stack<Integer> pilha = new Stack<>();

        // Adicionando elementos à pilha
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        // Exibindo o elemento do topo da pilha
        System.out.println("Elemento no topo da pilha: " + pilha.peek());

        // Removendo o elemento do topo da pilha
        System.out.println("Elemento removido: " + pilha.pop());

        // Exibindo o elemento do topo após a remoção
        System.out.println("Novo elemento no topo: " + pilha.peek());

        // Verificando se a pilha está vazia
        System.out.println("A pilha está vazia? " + pilha.isEmpty());

        // Adicionando mais elementos
        pilha.push(40);
        pilha.push(50);

        // Procurando um elemento na pilha
        System.out.println("Posição do elemento 40 na pilha (a partir do topo): " + pilha.search(40));

        // Exibindo todos os elementos da pilha
        System.out.println("Elementos na pilha: " + pilha);
    }
}


