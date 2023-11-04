package TP6;

public class ejercicio_6_arrays {
    public static void main(String[] args) {
        //Ejercicio 1
        /*
        int [] num;
        num = new int[10];
        int acum_num_pos, cont_pos, acum_num_neg, cont_neg;
        acum_num_pos = 0;
        cont_pos = 0;
        cont_neg = 0;
        acum_num_neg = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <= 9 ; i++) {
            System.out.println("Ingrese un número "+(i+1)+" :");
            num[i] = scanner.nextInt();
            if (num[i] < 0){
                acum_num_neg= acum_num_neg + num[i];
                cont_neg += 1;
            }else{
                acum_num_pos = acum_num_pos + num[i];
                cont_pos += 1;
            }

        }
        System.out.println("El promedio de los números  positivos ingresados es: "+(acum_num_pos/cont_pos));
        System.out.println("El promedio de los números  negativos ingresados es: "+acum_num_neg/cont_neg);

        scanner.close();
        */

        //Ejercicio 2
        /*
        int [] num;
        num = new int[10];
        int acum_num_par,cont_num_par;
        acum_num_par = 0;
        cont_num_par = 0;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <= 9 ; i++) {
            System.out.println("Ingrese un número "+(i+1)+" :");
            num[i] = scanner.nextInt();
            if (num[i] % 2 == 0){
                acum_num_par = acum_num_par + num[i];
                cont_num_par += 1;
            }
        }

        System.out.println("El promedio de los números pares ingresados es: "+acum_num_par/cont_num_par);

        scanner.close();
        */
        //Ejercicio 3
        /*
        Scanner scanner = new Scanner(System.in);
        double acum_notas = 0;
        double promedio;
        System.out.print("Ingrese la cantidad de alumnos: ");
        int num_elementos = scanner.nextInt();
        double [] notas = new double[num_elementos];

        for (int i = 0; i < num_elementos ; i++) {
            System.out.println("Ingrese la nota "+(i+1)+" :");
            notas[i] = scanner.nextInt();
            acum_notas = acum_notas + notas[i];
        }
        promedio = acum_notas / num_elementos;
        System.out.println("La media de las notas es: "+promedio);
        for (int i = 0; i < num_elementos; i++) {
            if(notas[i] > promedio){
                System.out.println("La nota del alumno "+(i+1)+" es superior a la media");
            }
        }
        scanner.close();
        */

        //Ejercicio 4
        /*
        int [] pares = {2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40};

        for (int i = 0; i < 20; i++) {
            System.out.println(pares[i]);
        }
        */

        //Ejercicio 5
        /*
        int [] num;
        num = new int[10];
        int num_neg, num_pos, cont_neg,cont_pos;
        num_neg = 0;
        cont_neg = 0;
        num_pos = 0;
        cont_pos = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un número entero: ");
            num[i] = scanner.nextInt();
            if (num[i] < 0){
                num_neg= num_neg + num[i];
                cont_neg += 1;
            }else{
                num_pos = num_pos + num[i];
                cont_pos += 1;
            }
        }
        System.out.println("Promedio de números positivos: "+(num_pos/cont_pos));
        System.out.println("Promedio de números negativos: "+(num_neg/cont_neg));
        scanner.close();
         */

        //Ejercicio 7
        /*
        Scanner scanner = new Scanner(System.in);
        double acum_altura = 0;
        int personas_menor_media = 0;
        System.out.println("Ingrese la cantidad de personas: ");
        int cant_personas = scanner.nextInt();
        int [] altura = new int[cant_personas];

        for (int i = 0; i < cant_personas; i++) {
            System.out.println("Ingrese la altura de cada persona en cm: ");
            altura[i] = scanner.nextInt();
            acum_altura = acum_altura + altura[i];
        }
        double promedio = acum_altura /cant_personas;
        System.out.println("El promedio de la altura es: "+promedio);

        for (int i = 0; i < cant_personas; i++) {
            if (altura[i] < promedio){
                personas_menor_media += 1;
            }
        }
        System.out.println("La cantidad de personas que no supera la media son: "+personas_menor_media);
        System.out.println("La cantidad de personas que supera la media son: "+ (cant_personas - personas_menor_media));
        scanner.close();
        */

        //Ejercicio 8
        /*
        Scanner scanner = new Scanner(System.in);
        String [] empleado = new String[20];
        float [] salario = new float[20];
        float mayor_sueldo = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Ingrese el nombre del empleado "+(i+1));
            empleado[i] = scanner.next();
            System.out.println("Cual es el salario de "+empleado[i].toUpperCase());
            salario[i] =  scanner.nextInt();

            if (salario[i] > mayor_sueldo){
                mayor_sueldo = salario[i];
            }
        }

        for (int i = 0; i < 20; i++) {
            System.out.println("Empleado "+(i+1)+" : "+ empleado[i].toUpperCase());
            System.out.println("Salario : "+salario[i]);
        }
        System.out.println("El mayor salario que recibe un empleado es de: "+mayor_sueldo);
        scanner.close();
        */

        //Ejercicio 9
        /*
        int desde = 1;
        int hasta = 10;
        int size = 5;

        int [] array_num = Metodos_tp6.llenar_array_aleat(desde,hasta, size);

        for (int numero: array_num){
            System.out.print(numero);
        }
        */

        //Ejercicio 10 A
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de filas que tendra su matriz: ");
        int rows = scanner.nextInt();
        System.out.println("Ingrese la cantidad de columnas que tendra su matriz: ");
        int columns = scanner.nextInt();

        //Llenado de la primera matriz
        int [][] matriz_a = new int[rows][columns];
        System.out.println("Matriz A");
        for (int i = 0; i < rows; i++) {
            System.out.println("Fila "+(i+1));
            for (int j = 0; j < columns; j++) {
                System.out.println("Ingrese un numero: ");
                matriz_a[i][j]= scanner.nextInt();
            }

        }
        //Llenado de la segunda matriz
        int [][] matriz_b = new int[rows][columns];
        System.out.println("Matriz B");
        for (int i = 0; i < rows; i++) {
            System.out.println("Fila "+(i+1));
            for (int j = 0; j < columns; j++) {
                System.out.println("Ingrese un numero: ");
                matriz_b[i][j]= scanner.nextInt();
            }

        }

        int [][] matriz_c = new  int[rows][columns];
        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < columns; j++) {
                matriz_c[i][j] = matriz_a[i][j] + matriz_b[i][j];
            }
        }

        for (int i = 0; i < rows+1; i++) {
            for (int j = 0; j < columns+1; j++) {
                System.out.print(matriz_c[i][j]+" ");
            }
            System.out.println();

        }
        */

        //Ejercicio 10 B
        /*
        int filas, columnas;

        System.out.println("Matriz 1:");
        filas = Metodos_tp6.leerEntero();
        columnas = Metodos_tp6.leerEntero();
        int[][] matriz1 = Metodos_tp6.crearMatriz(filas, columnas);
        Metodos_tp6.llenarMatriz(matriz1);

        System.out.println("Matriz 2:");
        filas = Metodos_tp6.leerEntero();
        columnas = Metodos_tp6.leerEntero();
        int[][] matriz2 = Metodos_tp6.crearMatriz(filas, columnas);
        Metodos_tp6.llenarMatriz(matriz2);

        Metodos_tp6.mostrarMatriz(matriz1);
        Metodos_tp6.mostrarMatriz(matriz2);

        int[][] resultado =Metodos_tp6.sumarMatrices(matriz1, matriz2);

        System.out.println("Resultado de la suma de matrices:");
        Metodos_tp6.mostrarMatriz(resultado);
         */

        //Ejercicio 11
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de filas de la matriz: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el número de columnas de la matriz: ");
        int columnas = scanner.nextInt();

        int[][] matriz = new int[filas][columnas];

        System.out.println("Ingrese los elementos de la matriz:");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matriz original:");
        Metodos_tp6.mostrar_matriz(matriz);

        int[][] matrizTranspuesta = Metodos_tp6.obtenerMatrizTranspuesta(matriz);

        System.out.println("Matriz transpuesta:");
        Metodos_tp6.mostrar_matriz(matrizTranspuesta);

         */
    }

}

