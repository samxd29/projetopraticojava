public class ContaReferencia { 
    public static void main(String[] args) {
        conta primeiraConta = new conta(); 
        primeiraConta.saldo = 300;

        System.out.println("saldo da primeira: " + primeiraConta.saldo);
        // Referencia seria um direcionamento a um tipo de objeto;
        conta segundaConta = primeiraConta;

        System.out.println("saldo da segunda conta: " + segundaConta.saldo);

        segundaConta.saldo += 100;
        System.out.println("saldo da segunda conta " + segundaConta.saldo); 

        System.out.println(primeiraConta.saldo); 
        
        if(primeiraConta == segundaConta) {
        	System.out.println("mesma conta ");
        }
    }
}
