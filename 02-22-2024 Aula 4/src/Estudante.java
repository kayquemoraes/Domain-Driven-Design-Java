import java.util.Scanner;

public class Estudante {

    double cp1;
    double gs1;
    double cp2;
    double gs2;
    double ms1;
    double ms2;
    double media_anual;
    String situacao;

    public Estudante() {
        this.cp1 = 0;
        this.gs1 = 0;
        this.cp2 = 0;
        this.gs2 = 0;
    }

    void lerNotasEstudante()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a nota do CP1: ");
        this.cp1 = input.nextDouble();

        System.out.print("\nDigite a nota da GS1: ");
        this.gs1 = input.nextDouble();

        System.out.print("\nDigite a nota do CP2: ");
        this.cp2 = input.nextDouble();

        System.out.print("\nDigite a nota da GS2: ");
        this.gs2 = input.nextDouble();
    }

    void calcularMediaSem1(){
        ms1 = (cp1 * 0.4) + (gs1 * 0.6);
    }

    void calcularMediaSem2(){
        ms2 = (cp2 * 0.4) + (gs2 * 0.6);
    }

    void calcularMediaAnual(){
        media_anual = (ms1 * 0.4) + (ms2 * 0.6);
    }

    void definirSituacao() {
        if (media_anual <= 3.9) {
            situacao = "Reprovado";
        } else if (media_anual <= 5.9) {
            situacao = "Exame";
        } else {
            situacao = "Aprovado";
        }
    }
}
