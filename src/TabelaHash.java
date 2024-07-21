/* uma tabela hash é frequentemente implementada usando a classe HashMap, que faz parte da biblioteca de coleções do Java.
 Uma tabela hash mapeia chaves a valores, permitindo acesso rápido aos dados */

import java.util.HashMap;

public class TabelaHash
 {
    public static void main(String[] args) 
    {
        // Criando uma tabela hash (HashMap)
        HashMap<String, Integer> tabelaHash = new HashMap<>();

        // Adicionando pares chave-valor à tabela hash
        tabelaHash.put("Alice", 30);
        tabelaHash.put("Bob", 25);
        tabelaHash.put("Charlie", 35);

        // Acessando valores na tabela hash
        System.out.println("Idade de Alice: " + tabelaHash.get("Alice"));
        System.out.println("Idade de Bob: " + tabelaHash.get("Bob"));

        // Verificando se uma chave existe na tabela hash
        if (tabelaHash.containsKey("Charlie")) 
        {
            System.out.println("Charlie está na tabela hash.");
        }

        // Removendo um par chave-valor da tabela hash
        tabelaHash.remove("Bob");

        // Iterando sobre os pares chave-valor na tabela hash
        for (String chave : tabelaHash.keySet()) 
        {
            System.out.println("Chave: " + chave + ", Valor: " + tabelaHash.get(chave));
        }
    }
}

