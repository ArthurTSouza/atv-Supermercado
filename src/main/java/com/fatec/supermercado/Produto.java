/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatec.supermercado;

/**
 *
 * @author fatec-dsm2
 */
public class Produto {

    private String nome;
    private double preco;
    private int qtdEstoque;
    private String Cod;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setCod(String Cod) {
        this.Cod = Cod;
    }

    public String getCod() {
        return Cod;
    }
}
