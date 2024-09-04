
import forms.SecondWindow;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SecondWindowTest {

    @Test
    public void testCalcularDataParcela() {
        SecondWindow secondWindow = new SecondWindow();

        String dataVencimento = "2024-08-31";
        int parcela = 2;
        String expectedData = "2024-09-30"; // data esperada após adicionar um mês

        // Atribui a forma de pagamento que influencia no cálculo
        secondWindow.formaPagamento = "2x";

        //String result = secondWindow.calcularDataParcela(dataVencimento, parcela);
        String result = secondWindow.DataParcelaCalculator(dataVencimento, parcela);

        assertEquals(expectedData, result, "A data da parcela não está sendo calculada corretamente.");
    }

    @Test
    public void testCalcularDataParcelaComFormaPagamentoInvalida() {
        SecondWindow secondWindow = new SecondWindow();

        String dataVencimento = "2024-08-31";
        int parcela = 2;

        // Atribui uma forma de pagamento inválida
        secondWindow.formaPagamento = "10x"; // Forma de pagamento que não deve existir

        //String result = secondWindow.calcularDataParcela(dataVencimento, parcela);
        String result = secondWindow.DataParcelaCalculator(dataVencimento, parcela);

        assertEquals("Erro ao calcular data da parcela", result, "A validação para forma de pagamento inválida não funcionou corretamente.");
    }
}
