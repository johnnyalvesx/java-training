package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Application3 {

    public static void main(String[] args) {

	Locale.setDefault(Locale.US);
	Scanner in = new Scanner(System.in);

	Student student = new Student();

	student.name = in.nextLine();
	student.nota1 = in.nextDouble();
	student.nota2 = in.nextDouble();
	student.nota3 = in.nextDouble();

	System.out.printf("NOTA FINAL: %.2f\n", student.notaFinal());

	if (student.notaFinal() < 60.0) {
	    System.out.println("NÃO PASSOU");
	    System.out.printf("FALTAM %.2f PONTOS", student.pontosQueFaltam());
	} else {
	    System.out.println("PASSOU");
	}
    }
}
