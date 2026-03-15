package academy.devjojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / * (operadores basicos)

        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / numero02;
        System.out.println(resultado);

        /*SOMA DISSO DAR 0.0 PORQUE A SOMA DE 2 NUMEROS INTEIROS DAR 1 NUMERO INTEIRO, AGORA SE FIZER ASSIM:
        DAR A SOMA CORRETA POIS TEM UM DOUBLE E UM INTEIRO

        int numero01 = 10;
        double numero02 = 20;
        double resultado = numero01 / numero02;
        System.out.println(resultado);
        RESULTADO = 0.5 E NÃO 0.0
        */

        // operador de resto %, identificar por exemplo se um num é par ou impar

        int resto = 20 % 2;
        System.out.println(resto);

        // operadores logicos sempre retornam valor booleano : <  > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualQueVinte "+isDezIgualQueVinte);
        System.out.println("isDezDiferenteDez "+isDezDiferenteDez);

        // && (and) || (or) ! (negação)
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta "+ isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+ isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);

        double bonus = 1800;
        bonus = bonus + 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        System.out.println(bonus);
        // bonus = bonus + 1000; pode ser abreviado para bonus += 1000;

        // ++ and --
        int contador = 0;
        contador += 1; // contador recebe contador + 1
        contador ++; // forma abreviada, mas só funciona de 1 em 1
        contador --;
        System.out.println(contador);

        int contador2 = 0;
        System.out.println(contador2++);
        System.out.println(contador2);
        //  imprime 0 e depois ele soma o 1, pois o ++ ele lê depois, agora se o ++ tiver antes do "contador" ele soma e já imprime








    }




}

