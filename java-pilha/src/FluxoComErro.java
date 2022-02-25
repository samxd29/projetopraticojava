public class FluxoComErro {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        //Para tratarmos uma exceção, que pode ocorrer enquanto nosso programa esta sendo executado, precisamos 
        //tratá-la antecipadamente com um bloco de código específico.
        try {
            metodo1();
        } catch(ArithmeticException| MinhaExcecao ex) {
            String msg = ex.getMessage();
            System.out.println("Exception " + msg);
            ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExcecao {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }
    //O compilador faz uma verificação sintática para ver quem dá throw nessas exceções. 
    //Isso significa que a exceção exige que fique explícito na assinatura do método que estamos jogando a exceção
    private static void metodo2() throws MinhaExcecao {
        	System.out.println("Ini metodo 2");
        	throw new ArithmeticException();
        	//throw new MinhaExcecao("deu muito errado!");
        }
        
    //A ideia é que o "perigo" — a exceção — fique explícita na assinatura do método.
    //Com isso, temos duas categorias novas de Exception. A primeira é a que estende de RuntimeException e se chama Unchecked.
    //A segunda categoria é a que estende diretamente de Exception, chamada de Checked.
    //Na categoria Unchecked, o compilador não dá muita importância. Se dermos throws ou não, ele não toma atitude, ou seja, 
    //ele não verifica — unchecked (não verificado pelo compilador).

    //Já a categoria Checked é verificada pelo compilador. No metodo2(), somos obrigados a colocar throws na assinatura do método,
    //pois a exceção do tipo MinhaExcecao estende diretamente de Exception e, por isso, é verificada pelo compilador.
}