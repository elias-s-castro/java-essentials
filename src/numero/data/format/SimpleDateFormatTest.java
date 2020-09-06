package numero.data.format;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleDateFormatTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        String mascara = "yyyy.MM.dd G 'as' HH:mm:ss z";
        SimpleDateFormat formatador = new SimpleDateFormat(mascara);
        System.out.println(formatador.format(c.getTime()));

        String mascara2 = "'São Paulo,' dd 'de' MMMM 'de' YYYY";
        SimpleDateFormat formatador2 = new SimpleDateFormat(mascara2);

        System.out.println(formatador2.format(c.getTime()));

    }
}
