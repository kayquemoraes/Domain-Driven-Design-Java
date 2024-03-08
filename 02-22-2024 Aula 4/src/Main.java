import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Estudante aluno = new Estudante();

        aluno.lerNotasEstudante();
        aluno.calcularMediaSem1();
        aluno.calcularMediaSem2();
        aluno.calcularMediaAnual();
        aluno.definirSituacao();

        System.out.println("Situação: " + aluno.situacao);


    }
}