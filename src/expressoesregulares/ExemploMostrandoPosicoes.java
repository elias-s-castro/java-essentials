package expressoesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExemploMostrandoPosicoes {

    public static void main(String[] args) {
        //Mostrando a posicao do texto encontrado
        String regex = "aba";
        String texto = "abababababc";
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
