package util;

public class CurrencyConverter {

    public static final double IOF = 6.00 / 100;

    public static double conversao(double dolar, double quantidade) {
	double valor = dolar * quantidade;
	return valor = valor + valor * IOF;
    }
}
