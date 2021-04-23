package expressoesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExemploRangerCaracteres_2 {

    public static void main(String[] args) {
        // Buscando todos as letras de A ate z minusculo e todas as letras de A a Z e todos os numeros 0 ate 9
        String regex = "[a-zA-Z0-9]";

        String texto = "abcwddABdC31aB";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto:  " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("expressão utilizada: " + matcher.pattern());
        System.out.println("Posicões encontradas: ");
        while (matcher.find()){
            System.out.print(matcher.start() + " ");
        }
    }
}
