/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4;

/**
 * @author Arthur Igor Morais do Nascimento 
 * Matricula: 161080219
 */
public class Item {

    private int quantidade;
    private Produto produto;
    private String nome;

    /**
     *
     * @param quantidade
     * @param produto
     * @param nome
     */
    public Item(int quantidade, Produto produto, String nome) {
        this.quantidade = quantidade;
        this.produto = produto;
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantiidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
