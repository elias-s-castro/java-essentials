package expressoesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExemploEncontrarNumerosHexadecimais {

    public static void main(String[] args) {
        /* Representacao de um numero hexadecimal
            comeca com 0
            depois um x maiusculo ou minusculo
            pode conter numeros de 0 a 9 ou qualquer letra de "A" ate "F" (Maiusculo/Minusculo)
            Exemplo: 0X100, 0x100F
         */

        // ? Zero ou uma
        // * Zero ou mais
        // + Uma ou mais
        // {n,M} de n ate m
        // ( ) Utilizado para agrupar
        // | OU
        // $ Fim de linha

        /*
            Traduzindo: Buscar todas as sequencias que comecem com 0 seguido de x ou X "[xX]",
            que contenham numeros de 0 a 9 e letras de A ate F uma ou mais vezes "([0-9a-fA-F])+"
            seguidos de espaço ou no final da linha "(\s|$)".
        */

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";

        String texto = "12 0x 0X 0xffab 0X10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto:  " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("expressão utilizada: " + matcher.pattern());
        System.out.println("Posicões encontradas: ");
        while (matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}
