package academy.devjojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        //€ 0	€ 34.712	       9,70%
        //€ 34.713	€ 68.507    37,35%
        //€ 68.508	            49,50%
        double salario = 100000;
        String impostoPagoAnual;

        if (salario <= 34712) {
            impostoPagoAnual = "9.70% de Taxa Total";
        } else if (salario > 34712 && salario <= 68507) {
            impostoPagoAnual = "Continuo pagando 37,35% de Taxa Total";
        } else {
            impostoPagoAnual = "49,50% de Taxa Total";
        }

        System.out.println(impostoPagoAnual);
    }
}

/* JEITO MAIS FACIL E PROPOSTO DE FAZER
   public static void main(String[] args) {
        double salarioAnual = 45;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;
        if (salarioAnual <= 34712){
            salarioAnual = SalarioAnual * primeiraFaixa;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507);{
        }else{
            salarioAnual = salarioAnual * terceiraFaixa;
        }
        System.out.println(salarioAnual);
        }
     }

















 */
