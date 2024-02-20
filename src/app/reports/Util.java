package app.reports;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Util {

    public static boolean isNumeric(String Numero) {
        try {
            Integer.valueOf(Numero);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public static double convertStringToDouble(String str) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }

    public static int objectToInt(Object obj) {
        int NumInt = Integer.parseInt(objectToString(obj));
        return NumInt;
    }

    public static double objectToDouble(Object obj) {
        String str = obj.toString();
        double NumDoule = Double.parseDouble(str);
        return NumDoule;
    }

    public static boolean objectToBoolean(Object obj) {
        String CadBool = objectToString(obj);
        Boolean bool = Boolean.valueOf(CadBool);
        return bool;
    }

    public static String objectToString(Object obj) {
        String str = "";
        if (obj != null) {
            str = obj.toString();
        }
        return str;
    }

    public static String extractFormattedNumber(String barcode) {
        StringBuilder formattedNumber = new StringBuilder();

        for (char c : barcode.toCharArray()) {
            // Verifica se o caractere é um dígito numérico, ponto ou espaço
            if (Character.isDigit(c) || c == '.' || c == ' ') {
                formattedNumber.append(c);
            }
        }

        return formattedNumber.toString();
    }

    public static double parseFloatWithComma(String numberString) {
        String number = numberString.replace(",", ".");
        double parsedNumber = Double.parseDouble(number);
        return Math.floor(parsedNumber * 100) / 100; // Mantém exatamente duas casas decimais
    }

    public static Date convertLongToDate(long timestamp) {
        return new Date(timestamp);
    }

    public static String convertStringToString(String str) {
        return str;
    }

    //-------------------------------------------------------------------------------//
    //->-------------------------------MÉTODOS DATAS--------------------------------//
    //-----------------------------------------------------------------------------//   
    public String DataFormatada() {
        Date dataAtual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(dataAtual);
    }

    public static LocalDate dataFormatada(String dataVencimento) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formato.parse(dataVencimento);
        return data.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
    }

    public static Date convertStringToDate(String text) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
        return formato.parse(text);
    }
    //->------------------------FIM MÉTODOS DATAS-----------------------------------//
}
