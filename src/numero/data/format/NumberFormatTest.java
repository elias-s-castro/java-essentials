package numero.data.format;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest {

    public static void main(String[] args) {
        float valor = 123.4567f;

        //Formatando o valor conforme sua localidade
        Locale locJP = new Locale("jp");
        NumberFormat[] nf = new NumberFormat[4];
        nf[0] = NumberFormat.getInstance();
        nf[1] = NumberFormat.getInstance(locJP);
        nf[2] = NumberFormat.getCurrencyInstance();
        nf[3] = NumberFormat.getCurrencyInstance(locJP);

        for(NumberFormat number : nf){
            System.out.println(number.format(valor));
        }

        // Verificando e aumentando a quantidade de números decimais
        NumberFormat nfa = NumberFormat.getInstance();
        System.out.println("getMaximumFractionDigits() = " + nfa.getMaximumFractionDigits());
        nfa.setMaximumFractionDigits(5);
        System.out.println(nfa.format(valor));

        String valorString = "12.34567";
        try {
            System.out.println("parse(valorString) = " + nfa.parse(valorString));
            nfa.setParseIntegerOnly(true);
            System.out.println("parse apenas inteiro = " + nfa.parse(valorString));

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
