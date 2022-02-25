public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try{
            metodo1();
        } catch(Exception ex) {
            String msg = ex.getMessage();
            System.out.println("Exception " + msg);
            ex.printStackTrace();
        } 
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo 2");
        metodo2();    
        System.out.println("Fim do metodo 2");
    }
  //Exce��o : Para tratarmos uma exce��o, � preciso sinalizar para a m�quina virtual que isso pode acontecer,
  //por meio de um c�digo espec�fico (try). Assim, ela entender� que deve tentar executar esse c�digo, entre chaves ({})
}    

