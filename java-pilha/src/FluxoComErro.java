public class FluxoComErro {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        //Para tratarmos uma exce��o, que pode ocorrer enquanto nosso programa esta sendo executado, precisamos 
        //trat�-la antecipadamente com um bloco de c�digo espec�fico.
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
    //O compilador faz uma verifica��o sint�tica para ver quem d� throw nessas exce��es. 
    //Isso significa que a exce��o exige que fique expl�cito na assinatura do m�todo que estamos jogando a exce��o
    private static void metodo2() throws MinhaExcecao {
        	System.out.println("Ini metodo 2");
        	throw new ArithmeticException();
        	//throw new MinhaExcecao("deu muito errado!");
        }
        
    //A ideia � que o "perigo" � a exce��o � fique expl�cita na assinatura do m�todo.
    //Com isso, temos duas categorias novas de Exception. A primeira � a que estende de RuntimeException e se chama Unchecked.
    //A segunda categoria � a que estende diretamente de Exception, chamada de Checked.
    //Na categoria Unchecked, o compilador n�o d� muita import�ncia. Se dermos throws ou n�o, ele n�o toma atitude, ou seja, 
    //ele n�o verifica � unchecked (n�o verificado pelo compilador).

    //J� a categoria Checked � verificada pelo compilador. No metodo2(), somos obrigados a colocar throws na assinatura do m�todo,
    //pois a exce��o do tipo MinhaExcecao estende diretamente de Exception e, por isso, � verificada pelo compilador.
}