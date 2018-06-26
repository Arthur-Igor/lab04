/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Arthur Igor Morais do Nascimento 
 * Matricula: 161080219
 */
public class ListaProduto {

    ArrayList<Produto> produtosCadastrados = new ArrayList<>();

    private int codigo = 0;

    public void cadastratProduto(Produto produto) {
        
        produtosCadastrados.add(produto);
        codigo++;
        System.out.println("CADASTRO CONCLUiDO! \n");

    }

    public void listarProdutos() {
        System.out.println("Produtos: \n");
        if (produtosCadastrados.size() > 0) {
            System.out.println(Arrays.toString(produtosCadastrados.toArray()));
        } else {
            System.err.println("Não existem produtoss cadastrados");
        }
    }

    public void removerProdutos(String nome) {
        boolean ok = false;
        for (int i = 0; i < produtosCadastrados.size(); i++) {
            if (produtosCadastrados.get(i).getNome().equals(nome)) {//pega o indice i do objeo produtos, pega o nome e compara com o nome digitado
                produtosCadastrados.remove(i); //Remove o produto pelo nome com o indice i
                System.err.println("Produto removido");
                ok = true;

            }

        }
        if (!ok) {
            System.err.println("Produto " + nome + "nao está cadastrado");
        }

    }
}
