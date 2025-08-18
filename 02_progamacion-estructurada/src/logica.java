
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;

public class logica {

    //CONSTANTES EJERCICIO 4
    final static double discA = 0.9;
    final static double discB = 0.85;
    final static double discC = 0.80;
    
    //CONSTANTES EJERCICIO 10
    final static double discEspecial = 0.10;
    
       
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // EJERCITACIÓN 1:​ Verificación de Año Bisiesto.
        /* 
        String text = "Ingrese un año para verificar si es bisiesto";    // se lo paso al metodo de solicitud de valor   
        int yearInput = yearRequest(input, text); // llamo al método para solicitar y verificar input.
       
        boolean bisiesto = bisiestoValidate(yearInput); //llamo al método para verificar si es bisiesto
                        
        //Dependiendo si es o no bisiesto imprimo un mensaje específico.
        if (bisiesto){
            System.out.println("El año ingresado es bisiesto!");    
        } else {
            System.out.println("El año ingresado no es bisiesto!");    
        }  
         */
        
                
        //EJERCITACIÓN 2: Determinar el Mayor de Tres Números.
        /*   
        //variable con la cantidad maxima de numeros a solicitar.
        int amountNum = 3;
        
        //vector, su tamaño debe coincidir con los numeros a solicitar.
        int[] userNumbers = new int[amountNum];
        
        //Desde el vector, llamo al metodo que agrega numeros al vector; metodo
        //que a su vez llama a otro metodo que solicita numeros al usuario y los valida.
        userNumbers= appendNum(amountNum, input, userNumbers);
        
        //Imprimo el vector para chequear que los numeros fueron ingresados correctamente.
        System.out.println(Arrays.toString(userNumbers));
        
        //Llamo al metodo que realiza la comparación.
        String minMaxResult = minMax(userNumbers, amountNum);
        
        //Imprimo resultados.
        System.out.println(minMaxResult);
        */
        
        //EJERCITACIÓN 3: Clasificación de edades.
        /*
        String text = "Ingrese su edad: ";
        
        //uso método de validación de números ya utilizado en el ejercicio 2
        int age = numRequest(input, text);
        
        //Si el usuario ingresa un número negativo, se vuelve a llamar al método anterior.
        while (age < 0){
            System.out.println("Ha ingresado un valor inválido.");
            age = numRequest(input, text);
        }
        
        //Llamado al método que compara la edad.
        String ageResult = agesCompare(age);
        
        
        System.out.println("Eres un "+ageResult);
        */
        
        //EJERCITACIÓN 4: Calculadora de descuento.
        /*
        double prisePro;
        String catPro, resultCal;
       
        String textPrice = "Ingrese el precio del producto: ";
        
        //Llamo al metodo que pide al usuario un numero y lo verifica
        prisePro = priceRequest(input, textPrice); 
        
        input.nextLine(); //limpiar el buffer
        
        System.out.print("\n");
        
        //Pido ingreso de una categoria        
        System.out.print("Según la categoría de su producto:\n"
                + "(A) > Categoría A: 10% de descuento \n"
                + "(B) > Categoría B: 15% de descuento \n"
                + "(C) > Categoría C: 20% de descuento \n\n"
                + "Ingrese \"A\", \"B\" o \"C\" : ");
        catPro = input.nextLine();
        
        //Si el input no es A ni B ni C, pido nuevamente el ingreso de la categ.
        while ((!catPro.equalsIgnoreCase("A")) &&
              (!catPro.equalsIgnoreCase("B")) &&
              (!catPro.equalsIgnoreCase("C"))){

            System.out.print("Entrada inválida. Ingrese \"A\", \"B\" o \"C\": ");
            catPro = input.nextLine();
        }

        //Según la categoría, calculo promo
        if(catPro.equalsIgnoreCase("A")){
            promoCalculate(prisePro, discA, "10%");
        }else{
            if((catPro.equalsIgnoreCase("B"))){
               promoCalculate(prisePro, discB, "15%");
            }else {
                if(catPro.equalsIgnoreCase("C")){
                    promoCalculate(prisePro, discC, "20%");
                }
            }    
        } 
        */
        
        //EJERCITACIÓN 5: Suma números pares.
        /*
        String partext ="Ingrese un número (0 para terminar): ";
  
        int numInput= 1;
        int sumEven = 0;
        
        while (numInput!=0){
            
            //Solicito num a través del método ya utilizado anteriormente    
            numInput = numRequest(input, partext);
            
            if (numInput % 2 == 0){
                sumEven+=numInput;
            }
        } 
        System.out.println("La suma de números pares ingresados es: "+sumEven);
        */
        
        
        //EJERCITACIÓN 6: Suma números negativos, positivos y ceros.
        /*
        System.out.println("A continuación deberá ingresar 10 números enteros:"); 
        
        integerCounter(10,input);
        */
        
        
        //EJERCITACIÓN 7: Validación de notas.
                
        /*String gradetext ="Ingrese una nota (0-10): ";
        
        //Solicito num a través del método que valida que no sea mayor a 10, 
        //menor a cero y tampoco un dato no numérico.
        
        gradeValidate(input, gradetext);
        */
            
        //EJERCITACIÓN 8: Cálculo del Precio Final con impuesto y descuento.   
        
        /*
        double basisPrice, taxPercent, discPercent, finalPrice;
        
        basisPrice = finalPriceValidate(input, "Ingrese el precio base del producto: ");
        taxPercent = finalPriceValidate(input, "Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        discPercent = finalPriceValidate(input, "Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        
        finalPrice = calcularPrecioFinal(basisPrice, taxPercent, discPercent);
        System.out.println("El precio final con impuesto y descuento es: "+finalPrice);
        
         */  
        
        //EJERCITACIÓN 9: Composición de funciones: calculo costo de envío y total de compra.
        /*
        double packageWeight, packagePrice, shippingPrice, totalToPay;
        String zone;
        
        System.out.println("Siga los siguientes pasos para calcular el costo total con envío:");
        
        //Solicito precio del producto.
        System.out.print("(1) Ingrese el precio del producto: ");
        packagePrice = input.nextDouble();
        input.nextLine();
        
        //Solicito peso del producto.
        System.out.print("(2) Ingrese el peso del producto en Kg: ");
        packageWeight = input.nextDouble();
        input.nextLine();
        
        //Consulto si el pedido es nacional o internacional.
        System.out.print("(3) Para envío Nacional ingrese (N).\n"
                           + "Para envío Internacional ingrese (I).\n"
                           + "Envío: ");
        zone = input.nextLine();
        
        
        //Si el usuario ingresa una letra inválida, se le solicita nuevamente una entrada válida.
        while ((!zone.equalsIgnoreCase("N")) && (!zone.equalsIgnoreCase("I"))){
            System.out.println("Entrada Inválida. Debe ingresar (N) para envíos "
                             + "nacionales o (I) para envíos internacionales.");
            zone = input.nextLine();
        }
       
        //llamado al método q calcula el costo de envío.        
        shippingPrice = calcularCostoEnvio(packageWeight, zone);  
        
        //llamado al método q calcula precio total. 
        totalToPay = calcularTotalCompra (packagePrice, shippingPrice);
        
        System.out.println("El costo de envío es: "+shippingPrice);
        System.out.println("El total a abonar es: "+totalToPay);
        */
    
        //EJERCITACIÓN 10: Actualización de stock a partir de venta y recepción de productos.
        /*
        int unitInStock, unitSold, unitReceived, newStock;
        String textStock;
        
        //Pido info al usuario y valido en todos los casos que lo ingresado no sea 
        //un dato no numérico o un número negativo.
        
        textStock = "Ingrese el stock actual del producto: ";
        unitInStock =  stockRequest(input, textStock);
        
        textStock = "Ingrese la cantidad de unidades vendidas: ";
        unitSold = stockRequest(input, textStock);
        
        textStock = "Ingrese la cantidad de unidades recibidas: ";
        unitReceived = stockRequest(input, textStock); 
        
        //Llamado al método que calcula el stock vigente
        newStock = actualizarStock(unitInStock, unitSold, unitReceived);
        
        System.out.println("El nuevo stock del producto es: "+newStock);   
        */
        
        //EJERCITACIÓN 11: Cálculo de descuento especial usando variable global.
        /*
        double productPrice;
        String textProduct = "Ingrese el precio del producto: ";  
        
        //Llamado al método que solicita un valor y verifica que no sea negativo, cero 
        //o un dato no numérico (Ya empleado en el ejercicio 4).
        productPrice = priceRequest(input, textProduct);     
        
        //Llamado al método que hace el cálculo del precio final.
        calcularDescuentoEspecial(productPrice);
       */
        
        
        //EJERCITACIÓN 12: Modificación de un array de precios y visualización de resultados. 
        /*
        double [] priceList = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        arrayPrint(priceList, "Precios originales:");
        
        priceList[2] =129.99;
        
        arrayPrint(priceList, "Precios modificados:");
        */
        
        
        //EJERCITACIÓN 13: Impresión Recursiva de arrays.    
        double [] priceList = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("PRECIOS ORIGINALES: "); 
        recursividad(priceList, 0);
        
        priceList[2]=129.99;
        System.out.println("PRECIOS MODIFICADOS: "); 
        recursividad(priceList, 0);
        
    }
       
    //MÉTODOS EJERCICIO 1 - AÑO BISIESTO 
    public static int yearRequest(Scanner input, String text) {
        /**
         * Solicita un número y verifica si es negativo, cero o un dato no
         * numérico.
         *
         * @param Scanner input utilizado para leer la entrada del usuario.
         * @throws InputMismatchException si el usuario ingresa un valor que no
         * es numérico.
         * @throws Exception Si el usuario ingresa cero o valores negativos.
         * @return el año ingresado por el usuario y validado.
         */

        int numInput = -1;
        boolean validation = false;

        while (!validation) {

            try {
                System.out.print(text);
                numInput = input.nextInt();

                if (numInput == 0 || numInput < 0) {
                    throw new Exception("ERROR, ha ingresado un valor numérico inválido!.");
                }

                validation = true;

            } catch (InputMismatchException e) {
                System.out.println("Solo se permite ingresar valores numéricos.");
                input.nextLine(); // limpiar buffer

            } catch (Exception e) {
                System.out.println(e.getMessage());
                input.nextLine(); // limpiar buffer
            }
        }
        return numInput;
    }

    public static boolean bisiestoValidate(int yearInput) {
        /**
         * Solicita un número y verifica si es bisiesto.
         * 
         * @param int input  el año ingresado por el usuario ya validado.
         * @return true si es bisiesto o false si no lo es.
         */

        return (yearInput % 4 == 0 && (yearInput % 100 != 0 || yearInput % 400 == 0));
    }

   
    //METODOS EJERCICIO 2 - MAYOR Y MENOR
    public static int[] appendNum(int num, Scanner input, int[] uVector) {
        /**
         * Llama al metodo que solicita números y luego los agrega a un vector.
         * 
         * @param Scanner input  utilizado para leer la entrada del usuario.
         * @param int num como limite para el ciclo for.
         * @return vector con los numeros ingresados por el usuario.
         */
         
        int[] vector = uVector;

        for (int i = 0; i < num; i++) {
            
            String text = "Ingrese el valor N°" + (i + 1)+": ";
            int numOk = numRequest(input, text);
            vector[i] = numOk;
        }
        return vector;
    }

    public static String minMax (int [] uVector, int limit){
        /**
         * Itera un vector con un for y obtiene el núm mayor y el menor.
         * 
         * @param int[] uVector que se itera para obtener su num mayor y menor.
         * @param int limit es el rango limite para el for.
         * @return el numero mayor (tambien podria entregar el menor).
         */
        
        
        int [] vector = uVector;
        int menor, mayor;
        menor = vector[0];
        mayor = vector[0];
        
        for(int i = 1; i < limit; i++){
            if (vector[i] > mayor){
                menor=mayor;
                mayor=vector[i];
                
            }else {
                if (vector[i] < menor){
                    menor=vector[i];
                }
            }
        }
        return ("El valor mayor es: "+mayor);
    }
    
    
    //METODOS EJERCICIOS 2 y 3 y 5
    public static int numRequest(Scanner input, String text) {
        /**
         * Solicita un número y verifica si el dato es no numérico.
         *
         * @param Scanner input  utilizado para leer la entrada del usuario.
         * @param String text para indicar al usuario lo que debe ingresar.
         * @return el numero ingresado por el usuario y validado.
         */

        int numInput = -1;
        boolean validation = false;

        while (!validation) {
            try {
                System.out.print(text);
                numInput = input.nextInt();
               
                validation = true;
               
            } catch (InputMismatchException e) {
                System.out.println("ERROR, solo se permite ingresar valores numéricos.");
                input.nextLine();
            }
        }
        return numInput;
    }
    
   
    //METODOS EJERCICIO 3: Clasificación de edades.
    public static String agesCompare(int edad){
        /**
         * Solicita una edad y evalúa a que etapa de la vida corresponde.
         *
         * @param int edad.
         * @return un texto de la etapa correspondiente a la edad ingresada.
         */
        
        String etapa = "";
        
        if(edad >= 60){
            etapa = "Adulto mayor";
        }else {
            if(edad >= 18 && edad < 60 ){
                etapa = "Adulto";
            }else {
                if(edad >=12  && edad < 18 ){
                    etapa = "Adolescente";
                } else {
                    if(edad >=0 && edad < 12){
                        etapa = "Niño";
                    }
                }
            }
        }
        return etapa;
    }  
    
    
    //METODOS EJERCICIO 4: Calculadora de descuento.
    public static void promoCalculate(double prise, double disc, String category){
        /**
         * Calcula el descuento que debe hacerse sobre un precio original.
         *
         * @param double prise representa el precio original del producto.
         * @param double disc representa el descuento que debe hacerse a <prise>.
         * @return imprime el precio original, el descuento y el resultado del descuento.
         */
        
        double pFinal = prise*disc;
        System.out.println("El precio original del producto: "+prise+"\n"
                            + "Descuento aplicado: "+category+"\n"
                            + "El precio final del producto: "+ pFinal+"\n");  
    }
        
    //METODOS EJERCICIOS 4 y 10
    public static double priceRequest(Scanner input, String text) {
        /**
         * Solicita un número y verifica si es negativo, cero o un dato no
         * numérico.
         *
         * @param Scanner input utilizado para leer la entrada del usuario.
         * @throws InputMismatchException si el usuario ingresa un valor que no
         * es numérico.
         * @throws Exception Si el usuario ingresa cero o valores negativos.
         * @return el valor ingresado por el usuario y validado.
         */

        double numInput = -1;
        boolean validation = false;

        while (!validation) {

            try {
                System.out.print(text);
                numInput = input.nextDouble();

                if (numInput == 0 || numInput < 0) {
                    throw new Exception("ERROR, ha ingresado un valor numérico inválido!.");
                }

                validation = true;

            } catch (InputMismatchException e) {
                System.out.println("Solo se permite ingresar valores numéricos.");
                input.nextLine(); // limpiar buffer

            } catch (Exception e) {
                System.out.println(e.getMessage());
                input.nextLine(); // limpiar buffer
            }
        }
        return numInput;
    }
    
    
    //METODOS EJERCICIO 6: Suma positivos, negativos y ceros.    
    public static void integerCounter(int limit, Scanner input){
        /**
         * Solicita x cantidad de números y suma si son negativos, positivos o ceros o un dato no         * numérico.
         *
         * @param Scanner input utilizado para leer la entrada del usuario.
         * @param int limit utilizado como limite para el ciclo for. 
         * @return cantidad de positivos, negativos y ceros.
         */
        int pos = 0;
        int neg = 0;
        int zero = 0;
        
        for (int i = 0; i < limit; i++) {
            String text = "Ingrese el valor N°" + (i + 1)+": ";
            
            //llamo al método para verificar que el usuario no ingrese valores no numéricos.
            int numOk = numRequest(input, text);
            
            if (numOk == 0){
                zero++;          
            } else {
                if(numOk%2==0){
                    pos++;
                } else neg++;
            }   
        }
        System.out.println("Resultados: \n"
                            + "Positivos: " +pos+"\n"
                            + "Negativos: " +neg+"\n"
                            + "Ceros: " +zero);          
    }
    
    
    //METODOS EJERCICIO 7: Validaciones de notas.
    public static void gradeValidate(Scanner input, String text){
       
        /**
         * Solicita un número y verifica si esta entre 0 y 10
         *
         * @param Scanner input utilizado para leer la entrada del usuario.
         * @throws InputMismatchException si el usuario ingresa un valor que no
         * es numérico.
         * @throws Exception Si el usuario ingresa valores inferiores a cero o superiores a 10.
         * @return imprime un mensaje con el valor ingresado por el usuario y validado.
         */

        int numInput = 0;
        boolean validation = false;

        while (!validation) {

            try {
                System.out.print(text);
                numInput = input.nextInt();

                if (numInput > 10 || numInput < 0) {
                    throw new Exception("ERROR. Nota inválida. Ingrese una nota entre 0 y 10.");
                }

                validation = true;

            } catch (InputMismatchException e) {
                System.out.println("Solo se permite ingresar valores numéricos.");
                input.nextLine(); // limpiar buffer

            } catch (Exception e) {
                System.out.println(e.getMessage());
                input.nextLine(); // limpiar buffer
            }
        }
        System.out.println("La nota ("+numInput+") fue guardada correctamente.");
    }
         
    
    //METODOS EJERCICIO 8: Calculo Precio Final con impuesto y descuento.
    public static double finalPriceValidate(Scanner input, String text){
       
        /**
         * Solicita un número y verifica si es negativo o valor no numérico.
         *
         * @param Scanner input utilizado para leer la entrada del usuario.
         * @throws InputMismatchException si el usuario ingresa un valor que no
         * es numérico.
         * @throws Exception Si el usuario ingresa valores inferiores a cero.
         * @return el valor ingresado por el usuario y validado.
         */

        double numInput = 0;
        boolean validation = false;

        while (!validation) {

            try {
                System.out.print(text);
                numInput = input.nextDouble();

                if (numInput < 0) {
                    throw new Exception("ERROR. Ha ingresado un valor negativo.");
                }

                validation = true;

            } catch (InputMismatchException e) {
                System.out.println("Solo se permite ingresar valores numéricos.");
                input.nextLine(); // limpiar buffer

            } catch (Exception e) {
                System.out.println(e.getMessage());
                input.nextLine(); // limpiar buffer
            }
        }
        return numInput;
    }
    
    public static double calcularPrecioFinal(double price, double tax, double disc){
        double finalPrise = price + (price*(tax/100)) - (price*(disc/100));
        return finalPrise; 
    }    
    
       
    //METODOS EJERCICIO 9: Cálculo costo de envío y total de compra.
    public static double calcularCostoEnvio (double peso, String zona){
        double payForShipping;  
        if(zona.equalsIgnoreCase("N")){
            payForShipping = peso * 5;   
        }else{
            payForShipping = peso * 10;
        }

        return payForShipping;
    }
    
    public static double calcularTotalCompra(double precioProducto, double costoEnvio){
        double toPay = precioProducto + costoEnvio;
        return toPay;
    }
     
    
    //METODOS EJERCICIO 10: Actualización de stock a partir de venta y recepción de productos.
    public static int stockRequest(Scanner input, String text) {
        /**
         * Solicita un número y verifica si es negativo o un dato no
         * numérico.
         *
         * @param Scanner input utilizado para leer la entrada del usuario.
         * @throws InputMismatchException si el usuario ingresa un valor que no
         * es numérico.
         * @throws Exception Si el usuario ingresa valores negativos.
         * @return el valor ingresado por el usuario y validado.
         */

        int numInput = 0;
        boolean validation = false;

        while (!validation) {

            try {
                System.out.print(text);
                numInput = input.nextInt();

                if (numInput < 0) {
                    throw new Exception("ERROR, ha ingresado un valor numérico inválido!.");
                }

                validation = true;

            } catch (InputMismatchException e) {
                System.out.println("Solo se permite ingresar valores numéricos.");
                input.nextLine(); // limpiar buffer

            } catch (Exception e) {
                System.out.println(e.getMessage());
                input.nextLine(); // limpiar buffer
            }
        }
        return numInput;
    }
    
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida){
        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        return nuevoStock;        
    }
    
    
    //MÉTODOS EJERCICIO 11: Cálculo de descuento especial usando variable global.
    public static void calcularDescuentoEspecial (double precio) {
        double descuentoAplicado = precio-(precio*discEspecial);
           
        System.out.println("El descuento especial aplicado es: "+(precio*discEspecial)
                +"\nEl precio final con descuento es: "+descuentoAplicado);            
    }
    
    
    
    // MÉTODOS EJERCICIO 12: Modificación de un array de precios y visualización de resultados.
    
    public static void arrayPrint (double[] array, String text){
        System.out.println(text);
        
        for(double valor:array){
            System.out.println("Precio: $"+valor);     
        }  
        System.out.println("\n");
    }
    
    
    
    // MÉTODOS EJERCICIO 13: Impresión Recursiva de arrays. 
    
    public static void recursividad(double[] array, int indice){
        int longitud = array.length;
       
        if(indice == longitud-1){
            System.out.println("Precio: "+array[indice]);
            
        }else {
            System.out.println("Precio: "+array[indice]);
            recursividad(array, (indice+1));
        }   
    }
   
    
    
   
}


