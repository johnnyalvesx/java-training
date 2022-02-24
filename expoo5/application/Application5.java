package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;
import util.CurrencyConverter;

public class Application5 {

    public static void main(String[] args) {

	Locale.setDefault(Locale.US);
	Scanner in = new Scanner(System.in);

	System.out.print("Qual é o preço do dolar? ");
	double dolar = in.nextDouble();

	System.out.print("Quantos dólares você vai comprar? ");
	double quantidade = in.nextDouble();

	double valorConvertido = CurrencyConverter.conversao(dolar, quantidade);

	System.out.printf("O valor a ser pago é de %.2f%n", valorConvertido);
    }
}
