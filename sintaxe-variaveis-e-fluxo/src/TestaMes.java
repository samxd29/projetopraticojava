public class TestaMes {

    public static void main(String[] args) {

        int mes = 13;

        switch (mes) {
            case 1:
                System.out.println("O m�s � Janeiro");
                break;
            case 2:
                System.out.println("O m�s � Fevereiro");
                break;
            case 3:
                System.out.println("O m�s � Mar�o");
                break;
            case 4:
                System.out.println("O m�s � Abril");
                break;
            case 5:
                System.out.println("O m�s � Maio");
                break;
            case 6:
                System.out.println("O m�s � Junho");
                break;
            case 7:
                System.out.println("O m�s � Julho");
                break;
            case 8:
                System.out.println("O m�s � Agosto");
                break;
            case 9:
                System.out.println("O m�s � Setembro");
                break;
            case 10:
                System.out.println("O m�s � Outubro");
                break;
            case 11:
                System.out.println("O m�s � Novembro");
                break;
            case 12:
                System.out.println("O m�s � Dezembro");
                break;
            default:
                System.out.println("M�s inv�lido");
                break;
        }
    }
    //O break ir� interromper a execu��o do caso que o cont�m, para os outros n�o serem executados, e se nenhuma condi��o for aceita,
    //o c�digo do default � que ser� executado;
    //A impress�o ser� M�s inv�lido. Ent�o, o switch � uma solu��o para os ifs encadeados;
    
}
