import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.LocalDateTime;


public class Stringsedata {
    public static void main(String[] args) {
        //write your code here
       
        /*
                          
        String nome = "Cleinaldo";
        System.out.println(nome.toUpperCase());  //converte para letra maiúscula
        System.out.println(nome.toLowerCase());  //converte para letra minúscula
        System.out.println(nome.length());       //retorna o "tamanho" e contagem quantas letras possui

        String nomeOutro = "CleinaldO";

        //equals - ele compara os objetos
        System.out.println(nome.equals(nomeOutro)); 

        //equalsIgnoreCase - ele ignora a sensibilidade de maiúsculo e minúsculo
        System.out.println(nome.equalsIgnoreCase(nomeOutro)); 
    } */
            
              
       // ISO 8601 - ELA VAI DIZER COMO REPRESENTAR UMA DATA DE FORMATO PADRÃO. O JAVA FORMATA ESSE PADRÃO CONFORME ABAIXO: obs: para usar ele, precisamos importar a classe desse LocalDate - esse import ja apareceu bem no inicio do código acima!!

       //PODEMOS TRADUZIR PARA PORTUGUÊS O NOME DO DIA DA SEMANA PASSANDO AS FUNÇÕES ABAIXO E NÃO ESQUECER OS IMPORT DELAS ACIMA.
        
       //importante: O "println" - ele escreve cada linha uma abaixo da outra
        //importante: o "printf" - precisamos definir o formato e depois os valores ou seja precisamos definir os valores para serem exibidos.

       //Olá, {nome}, Hoje é {dia-da-semana}, BOM DIA.

       String nome = "Cleinaldo";

       LocalDate hoje = LocalDate.now();
       Locale brasil = new Locale("pt", "BR");
       System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
       String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
       String saudacao;
       LocalDateTime agora = LocalDateTime.now();
       if(agora.getHour() >= 0 && agora.getHour() < 12){
            saudacao = "Bom dia";
       }else if(agora.getHour() >= 12 && agora.getHour() < 18){
            saudacao = "Boa tarde";
       }else if(agora.getHour() >= 18 && agora.getHour() < 24){
            saudacao = "Boa Noite";
       }else{
            saudacao = "ola";
       }

       System.out.printf("Ola, %s. Hoje e %s, %s.%n", nome, diaSemana, saudacao.toUpperCase()); //%s (se refere a string e %n (quebra de linha))
    }
}