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

        Produto[] listaProdutos = new Produto[3];

        for (int i = 0; i < 3; i++) {

            listaProdutos[i] = new Produto();

            System.out.println("\n--- Cadastro do Produto " + (i + 1) + " ---");

            System.out.println("Digite o nome do produto: ");

            String nome = entrada.nextLine();
            listaProdutos[i].setNome(nome);

            System.out.println("Digite o preco do produto: ");
            double preco = entrada.nextDouble();
            listaProdutos[i].setPreco(preco);

            entrada.nextLine();

            System.out.println("Digite a quantidade em estoque do produto: ");
            int qtdestq = entrada.nextInt();
            listaProdutos[i].setQtdEstoque(qtdestq);

            entrada.nextLine();

            System.out.println("Digite o codigo deste produto: ");
            String cod = entrada.nextLine();
            listaProdutos[i].setCod(cod);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("\n--- Detalhes do Produto " + (i + 1) + "---");
            System.out.println("Nome: " + listaProdutos[i].getNome());
            System.out.println("Preco: R$ " + listaProdutos[i].getPreco());
            System.out.println("Quantidade em estoque: " + listaProdutos[i].getQtdEstoque());
            System.out.println("Codigo: " + listaProdutos[i].getCod());
        }
    }
}
