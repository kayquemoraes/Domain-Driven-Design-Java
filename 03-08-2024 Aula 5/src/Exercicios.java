public class Exercicios {

    private int somaDosInteirosImpares;

    private Exercicios(int valorMaximo)
    {
        this.somaDosInteirosImpares = resultadoSoma(valorMaximo);
    }

    private int resultadoSoma(int valorMaximo)
    {
        int soma = 0;

        for (int i = 0; i <= valorMaximo; i++) {
            if (i % 2 != 0)
            {
                soma += i;
            }
        }
        return soma;
    }

    private void imprimindoNumerosInteiros(int valorMaximo)
    {
        int i = 1;
        while(i <= valorMaximo)
        {
            System.out.print(i + "\t");
            if (i % 5 == 0)
            {
                System.out.println();
            }
            i++;
        }
    }

    public static void main(String[] args) {

        Exercicios ex = new Exercicios(99);

        System.out.println("A soma é: " + ex.somaDosInteirosImpares);

        ex.imprimindoNumerosInteiros(20);

    }

}
