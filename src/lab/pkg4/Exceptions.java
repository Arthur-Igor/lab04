/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4;

/**
 *
 * @author Artu
 *
 * @author Arthur Igor Morais do Nascimento 
 * Matricula: 161080219
 */
public class Exceptions extends Exception {

    /**
     * Creates a new instance of <code>Exceptions</code> without detail message.
     */
    public Exceptions() {
    }

    /**
     * Constructs an instance of <code>Exceptions</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    String msg;

    public Exceptions(String msg) {

        super(msg);
        this.msg = msg;
    }

    public static class produtoNaoCadastrado extends Exception {

        public produtoNaoCadastrado() {
            super("O produto nao está cadastrado");
        }
    }

    public static class pedidoInexistente extends Exception {

        public pedidoInexistente() {
            super(" O pedido nao está cadastrado");
        }
    }

    public static class QuantidadeInvalida extends Exception {

        public QuantidadeInvalida() {
            super("nao pode por valores negativos ou acima de 101 para quantidades.");
        }

        
    }

    public class Negativo extends RuntimeException {

        public Negativo() {
            System.out.println("Numero negativo.");
        }
//        try
//{
//	if(num < 0)
//	{
//		throw new Negativo();
//	}
//}
//catch(Negativo e)
//{
//	e.Negativo();
//}
        
    }
}
