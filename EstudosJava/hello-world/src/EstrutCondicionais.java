public class EstrutCondicionais {
    
    public static void main(String[] argas) {
        //write your code here

        //---------------------------------------------
        //int nota = 7;

        // se nota maior ou igual a 7, então aprovado
        //if-else
        //if(nota >= 7){
            //System.out.println("Aluno Aprovado!");
        //}else{
            //System.out.println("Aluno Reprovado");
        //----------------------------------------------

        int nota = 60;
        String graduacao;
        
        //A 80  B 70  C 60  D 0
        if (nota >= 80){
            graduacao = "A";
        }else if(nota < 80 && nota >= 70){
            graduacao = "B";
        }else if(nota < 70 && nota >= 60){
            graduacao = "Graduacao C";
        }else if(nota < 60 && nota >= 0){
            graduacao = "Graduacao D";
        }else{
            graduacao = "";
        }

        switch (graduacao){
            case "A":
            case "B":
                System.out.println("Aluno Aprovado");
                break;
            case "C":
            case "D":
                System.out.println("Nao Aprovado");
                break;
            default:
                System.out.println("Graduacao Invalida");
        }   
    }

}

