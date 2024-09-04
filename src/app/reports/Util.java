package app.reports;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;

public class Util {

    private static final Logger LOGGER = Logger.getLogger(Util.class.getName());

    public static boolean isNumeric(String Numero) {
        try {
            Integer.valueOf(Numero);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public static BigDecimal convertStringToBigDecimal(String str) {
        try {
            // Remove espaços em branco e substitui a vírgula por ponto, se necessário
            String formattedStr = str.trim().replace(",", ".");
            // Converte a string para BigDecimal
            return new BigDecimal(formattedStr);
        } catch (NumberFormatException e) {
            // Retorna BigDecimal.ZERO em caso de erro
            return BigDecimal.ZERO;
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

    //->-----------------------MÉTODOS DATAS---------------------------<-//
    public static LocalDate parseDataCustom(String text, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        try {
            return LocalDate.parse(text, formatter);
        } catch (DateTimeParseException e) {
            LOGGER.log(Level.SEVERE, "Erro ao parsear data com padrão {0}: {1}", new Object[]{pattern, text});
            throw e;
        }
    }

    public static String getDataAtualFormatada() {
        LocalDate dataAtual = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dataAtual.format(formatter);
    }

    public static LocalDate parseData(String dataVencimento) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            return LocalDate.parse(dataVencimento, formatter);
        } catch (DateTimeParseException e) {
            LOGGER.log(Level.SEVERE, "Erro ao parsear data: {0}", dataVencimento);
            throw e;
        }
    }

    public static LocalDate parseDataISO(String text) {
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
        try {
            return LocalDate.parse(text, formatter);
        } catch (DateTimeParseException e) {
            LOGGER.log(Level.SEVERE, "Erro ao parsear data ISO: {0}", text);
            throw e;
        }
    }

    public static Date convertStringToDate(String text) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date utilDate = formato.parse(text);
        return new java.sql.Date(utilDate.getTime());
    }

    public static java.sql.Date convertStringToDate2(String text) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date utilDate = formato.parse(text);
        return new java.sql.Date(utilDate.getTime());
    }

    public static java.util.Date convertStringToDate3(String text) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.parse(text);
    }
}
