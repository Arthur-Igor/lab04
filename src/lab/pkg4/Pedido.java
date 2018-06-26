/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Arthur Igor Morais do Nascimento 
 * Matricula: 161080219
 */
public class Pedido {

    int codigo;
    ArrayList<Item> itensCadastrados = new ArrayList<>();
    double valorTotal;

    public void listarItens() {
        System.out.println("Itens: \n");
        if (itensCadastrados.size() > 0) {
            System.out.println(Arrays.toString(itensCadastrados.toArray()));
        } else {
            System.err.println("Não existem itens cadastrados");
        }

    }

    public void cadastrarItens(Item item) {
        itensCadastrados.add(item);

    }

    public void removerItem(String nome) {
        boolean ok = false;
        for (int i = 0; i < itensCadastrados.size(); i++) {
            if (itensCadastrados.get(i).getNome().equals(nome)) {
                itensCadastrados.remove(i);
                System.err.println("Produto remvido");
                ok = true;

            }

        }
        if (!ok) {
            System.err.println("Produto " + nome + "nao está cadastrado");
        }

    }
}
