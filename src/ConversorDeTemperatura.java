import java.util.Scanner;

public class ConversorDeTemperatura {
        public double celcius;
        public double fahrenheit; /*Altura será inserida em centimetros*/
        public double kelvin; /* resultado da conta*/

        public void ObterDados(){
            Scanner leitorInt = new Scanner(System.in);
            Scanner leitorString = new Scanner(System.in);

            System.out.println("qual a temperatura em graus celcius?");
            celcius = leitorInt.nextInt();
            ExibirResultados();
        }
        public void CalcularImc(){
            double grausEmCelcius;
            grausEmCelcius = celcius / 100.0;
            fahrenheit = (celcius*1.8) + 32;
            kelvin = celcius + 273.15;
        }
        public void ExibirResultados(){
            CalcularImc();
            System.out.println("***************");
            System.out.println(celcius+ "°C equivalem a: ");
            System.out.println(fahrenheit+ "°F (fahrenheit)");
            System.out.println(kelvin+" kelvin");
            System.out.println("***************");
        }
    }

