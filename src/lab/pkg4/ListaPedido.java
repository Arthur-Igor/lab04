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
public class ListaPedido {

    ArrayList<Pedido> pedidosCadastrados = new ArrayList<>();

    public void listarPedidos() {
        System.out.println("Pedidos: \n");
        if (pedidosCadastrados.size() > 0) {
            System.out.println(Arrays.toString(pedidosCadastrados.toArray()));
        } else {
            System.err.println("Não existem pedidos cadastrados");
        }

    }
}
