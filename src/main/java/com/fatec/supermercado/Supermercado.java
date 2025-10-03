/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.fatec.supermercado;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Supermercado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // 1. CORREÇÃO: Cria um ARRAY de 3 objetos Produto para armazenar a lista de itens.
        Produto[] listaProdutos = new Produto[3];

        // --- LOOP DE CADASTRO ---
        for (int i = 0; i < 3; i++) {
            // 2. CORREÇÃO: Cria um NOVO objeto Produto em cada iteração do loop
            // e o armazena na posição 'i' do array.
            listaProdutos[i] = new Produto();

            System.out.println("\n--- Cadastro do Produto " + (i + 1) + " ---");

            System.out.println("Digite o nome do produto: ");
            // 3. CORREÇÃO: Usa nextLine() para aceitar nomes com espaços
            String nome = entrada.nextLine();
            listaProdutos[i].setNome(nome);

            System.out.println("Digite o preco do produto: ");
            double preco = entrada.nextDouble();
            listaProdutos[i].setPreco(preco);

            // LIMPEZA: Consome a quebra de linha (Enter) deixada pelo nextDouble()
            entrada.nextLine();

            System.out.println("Digite a quantidade em estoque do produto: ");
            int qtdestq = entrada.nextInt();
            listaProdutos[i].setQtdEstoque(qtdestq);

            // LIMPEZA: Consome a quebra de linha (Enter) deixada pelo nextInt()
            entrada.nextLine();

            System.out.println("Digite o codigo deste produto: ");
            // CORREÇÃO: Usa nextLine()
            String cod = entrada.nextLine();
            listaProdutos[i].setCod(cod);
        }

        // --- LOOP DE EXIBIÇÃO ---
        for (int i = 0; i < 3; i++) {
            System.out.println("\n--- Detalhes do Produto " + (i + 1) + "---");
            // Agora, acessamos os dados do objeto na posição 'i' do array.
            System.out.println("Nome: " + listaProdutos[i].getNome());
            System.out.println("Preco: R$ " + listaProdutos[i].getPreco());
            System.out.println("Quantidade em estoque: " + listaProdutos[i].getQtdEstoque());
            System.out.println("Codigo: " + listaProdutos[i].getCod());
        }
    }
}
