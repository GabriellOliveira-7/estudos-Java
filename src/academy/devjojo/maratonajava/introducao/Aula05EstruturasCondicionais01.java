package academy.devjojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isMaiorIdade = idade >= 18;
        if (isMaiorIdade){
            System.out.println("Maior de Idade");
        } else{
            System.out.println("Menor de Idade");
        }
        if (!isMaiorIdade)
            System.out.println("Menor de Idade");

        /* ! = se não
        pode tambem ser usado o (isMaiorIdade) == false
         */


    }

}
