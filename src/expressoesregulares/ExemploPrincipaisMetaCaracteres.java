package expressoesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExemploPrincipaisMetaCaracteres {

    public static void main(String[] args) {
        // \d - todos os digitos
        // \D - tudo o que nao for digito
        // \s - Espaços em branco (\t \n \f \r)
        // \S - Caractere que nao e branco
        // \w - Caracteres de palavras: a-z A-Z, digitos e o "underline" _
        // \W - Tudo o que nao for caractere de palavra

        // Troque aqui pelas expreçoes
        String regex = "\\w";

        String texto = "3lias1 31";
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
