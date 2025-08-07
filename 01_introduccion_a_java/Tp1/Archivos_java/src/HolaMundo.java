
import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {
        
       //EJERCICIO 2
       // System.out.println("Hola, Java!"); 
        
       //EJERCICIO 3
       /* String nombre = "Nela";
        int edad = 38;
        double altura = 1.65;
        boolean estudiante = true;
        
        System.out.println("Nombre : " + nombre);
        System.out.println("Edad : " + edad);
        System.out.println("Altura : " + altura);
        System.out.println("Estudiante activo : " + estudiante); */
       
       
       //EJERCICIO 4            
       
       /*creo una instancia de clase de tipo Scanner, la cual se usará
       tambien en los ejercicios subsiguientes*/
       Scanner input = new Scanner (System.in);
       
       /*
        //declaro variables
        String name;
        int age;
        boolean esValido;
        
        //solicito nombre e inicializo variable
        System.out.print("Ingrese su nombre: ");
        name = input.nextLine();
        
        //valido que el nombre no tenga valores numéricos
        esValido = false;
        
        while (!esValido){
        
            for(char c: name.toCharArray()){
                if(!Character.isLetter(c) && c != ' '){
                    System.out.print("No se permiten valores numéricos. "
                            + "Ingrese nuevamente su nombre: ");
                    name = input.nextLine();
                }else {
                    esValido = true;
                }
            }   
        }
                 
        //solicito edad e inicializo variable
        System.out.print("Ingrese su edad: ");
        age = input.nextInt();
       
        //imprimo en pantalla
        System.out.println("El nombre ingresado es: " + name);
        System.out.println("La edad ingresada es: " + age);
        */
        
       /*
        //EJERCICIO 5 
        
        //declaro las variables
        int num1, num2, suma, resta, multiplicacion;
        double division;
        
        //solicito los numeros al usuario
        System.out.print("Ingrese el primer número: ");
        num1 = input.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        num2 = input.nextInt();
        
        //valido que el segundo numero no sea cero.
        while(num2 == 0){
            System.out.print("No se puede efectuar una división por cero. Ingrese un número mayor a cero: ");
            num2 = input.nextInt();
        }
        
        //inicializo las variables
        suma = num1+num2;
        resta = num1-num2;
        multiplicacion = num1*num2;
        division = ((double)num1) / num2;
        
        //imprimo
        System.out.println(num1+ "+"+num2+" = "+suma);
        System.out.println(num1+ "-"+num2+" = "+resta);
        System.out.println(num1+ "*"+num2+" = "+multiplicacion);
        System.out.println(num1+ "/"+num2+" = "+division);
        */
        
        /*
        //EJERCICIO 6 
        
        //declaro las variables
        String user = "Juan Perez";
        int edadUser = 30;
        String domicilio = "Calle Falsa 123";
       
        System.out.println("Nombre: "+user+"\nEdad: "+edadUser+"años\nDirección: "+ domicilio);

        */
        
        /*
        //EJERCICIO 8 
    
        //declaro las variables
        int number1, number2;
        double div;
        
        //solicito los numeros al usuario
        System.out.print("Ingrese el primer número: ");
        number1 = input.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        number2 = input.nextInt();
        
        //valido que el segundo numero no sea cero.
        while(number2 == 0){
            System.out.print("No se puede efectuar una división por cero. Ingrese un número mayor a cero: ");
            number2 = input.nextInt();
        }
        
        //conversion explicita
        div=(double)number1 / number2;
      
        System.out.println(number1+ "/"+number2+" = "+div);
        */
        
        
        /*
        //EJERCICIO 9
        
        System.out.print("Ingresa tu nombre: ");
        String nombre = input.nextLine(); // CORRECCIÓN
        System.out.println("Hola, " + nombre);
        
        */
        
        /*
        //EJERCICIO 10
        
        int a = 5;
        int b = 2;
        int resultado = a / b;
        System.out.println("Resultado: " + resultado);
        */
    }   
}
