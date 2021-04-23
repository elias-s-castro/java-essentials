package expressoesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExemploRangerCaracteres_1 {

    public static void main(String[] args) {
        // []

        // Troque aqui pelas expreçoes
        String regex = "[abcABC]"; // buscando todos os a, b, c, A, B, C

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
