package academy.devjojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long e boolean

        int idade = 10; // 4 bytes
        long numeroGrande = 100000; // 8 bytes
        double salario = 2000.0; // 8 bytes
        float salarioFloat = 2500.0F; // 4  bytes
        byte idadeByte = 127; // 1 byte
        short idadeShort = 32000; // 2 bytes
        boolean verdadeiro = true; // 1 byte
        boolean falso = false; // 1 byte
        char caractere = 'M'; // 2 byte
        String nome = "Goku";


        System.out.println("A idade é "+idade+" anos");
        System.out.println(falso);
        System.out.println("char "+caractere);
        System.out.println("Oi meu nome é " +nome); //sout + tab = System.out.println





        /* PARA FAZER CASTING (FORÇAR UMA NUMERAÇÃO ENTRAR EM ALGUM PRIMITIVO) É DESSA FORMA
        MAS NÃO É UMA PRÁTICA BOA, É MAIS FÁCIL SEGUIR O PADRÃO
        float salarioFloat = (float) 2500.0D;
        long numeroGrande = (long) 155.23; isso é um double
        */











    }
}
