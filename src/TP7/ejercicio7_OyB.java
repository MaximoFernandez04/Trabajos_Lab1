package TP7;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class ejercicio7_OyB {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            //Ejercicio 1
        /*Integer [] array_enteros =new Integer [5];
        System.out.println("Ingrese numeros enteros: ");
        for (int i=0;i<5;i++){
            array_enteros[i]= sc.nextInt();
        }
        System.out.println("Array ordenado de menor a mayor");
        Arrays.sort(array_enteros);
        for(Integer a : array_enteros)
            System.out.print(a + ", ");*/

            //Ejercicio 2
        /*Integer [] array_enteros =new Integer [5];
        System.out.println("Ingrese numeros enteros: ");
        for (int i=0;i<5;i++){
            array_enteros[i]= sc.nextInt();
        }
        System.out.println("Array ordenado de mayor a menor");
        Arrays.sort(array_enteros, Collections.reverseOrder());
        for (Integer a : array_enteros) {
            System.out.print(a + ", ");
        }*/

            //Ejercicio 3
        /*Float [] array_flotantes =new Float [5];
        System.out.println("Ingrese numeros flotantes: ");
        for (int i=0;i<5;i++){
            array_flotantes[i]= sc.nextFloat();
        }
        System.out.println("Array ordenado de menor a mayor");
        Arrays.sort(array_flotantes);
        for(Float a : array_flotantes)
            System.out.print(a + ", ");*/

            //Ejercicio 4
        /*Float [] array_flotantes =new Float [5];
        System.out.println("Ingrese numeros flotantes: ");
        for (int i=0;i<5;i++){
            array_flotantes[i]= sc.nextFloat();
        }
        System.out.println("Array ordenado de mayor a menor");
        Arrays.sort(array_flotantes, Collections.reverseOrder());
        for(Float a : array_flotantes)
            System.out.print(a + ", ");*/

            //Ejercicio 5
        /*String [] array_cadenas = new String [5];
        System.out.println("Ingrese palabras: ");
        for (int i=0;i<5;i++){
            array_cadenas[i]= sc.nextLine();
        }

        System.out.println("Array ordenado alfabeticamente ");
        Arrays.sort(array_cadenas);
        for(String a : array_cadenas)
            System.out.print(a + ", ");*/

            //Ejercicio 6
        /*String [] array_cadenas = new String [5];
        System.out.println("Ingrese palabras: ");
        for (int i=0;i<5;i++){
            array_cadenas[i]= sc.nextLine();
        }

        System.out.println("Array ordenado alfabeticamente inverso ");
        Arrays.sort(array_cadenas, Collections.reverseOrder());
        for(String a : array_cadenas)
            System.out.print(a + ", ");*/

            //Ejercicio 9
        /*Integer [] array_enteros =new Integer [5];
        System.out.println("Ingrese numeros enteros: ");
        for (int i=0;i<5;i++){
            array_enteros[i]= sc.nextInt();
        }
        for (int i = 0; i < array_enteros.length - 1; i++) {
            for (int j = 0; j < array_enteros.length - i - 1; j++) {
                if (array_enteros[j + 1] < array_enteros[j]) {
                    int aux = array_enteros[j + 1];
                    array_enteros[j + 1] = array_enteros[j];
                    array_enteros[j] = aux;
                }
            }
        }
        System.out.println("Array ordenado ");
        for (int i=0;i<5;i++){
            System.out.print(array_enteros[i]+ ", ");
        }*/

            //Ejercicio 10
        /*Integer [] array_enteros =new Integer [5];
        System.out.println("Ingrese numeros enteros: ");
        for (int i=0;i<5;i++){
            array_enteros[i]= sc.nextInt();
        }

        for (int i = 0; i < array_enteros.length - 1; i++) {
            int menor = array_enteros[i];
            int pos = i;
            for ( int j = i + 1; j < array_enteros.length; j++){
                if (array_enteros[j] < menor) {
                    menor = array_enteros[j];
                    pos = j;
                }
            }
            if (pos != i){
                int tmp = array_enteros[i];
                array_enteros[i] = array_enteros[pos];
                array_enteros[pos] = tmp;
            }
        }
        System.out.println("Array ordenado ");
        for (int i=0;i<5;i++){
            System.out.print(array_enteros[i]+ ", ");
        }*/

            //Ejercicio 11
        /*Integer [] array_enteros =new Integer [5];
        System.out.println("Ingrese numeros enteros: ");
        for (int i=0;i<5;i++){
            array_enteros[i]= sc.nextInt();
        }
        for (int p = 1; p < array_enteros.length; p++){
            int aux = array_enteros[p];
            int j = p - 1;
            while ((j >= 0) && (aux < array_enteros[j])){

                array_enteros[j + 1] = array_enteros[j];
                j--;
            }
            array_enteros[j + 1] = aux;
        }
        System.out.println("Array ordenado ");
        for (int i=0;i<5;i++){
            System.out.print(array_enteros[i]+ ", ");
        }*/

            //Ejercicio 12
        /*int [] array_enteros =new int [5];
        System.out.println("Ingrese numeros enteros: ");
        for (int i=0;i<5;i++){
            array_enteros[i]= sc.nextInt();
        }
        mergesort(array_enteros, 0, array_enteros.length - 1);
        System.out.println("Array ordenado:");
        for (int num : array_enteros) {
            System.out.print(num + ", ");
        }*/

            //Ejercicio 13
        /*Integer [] array_enteros =new Integer [5];
        System.out.println("Ingrese numeros enteros: ");
        for (int i=0;i<5;i++){
            array_enteros[i]= sc.nextInt();
        }
        for (int salto = array_enteros.length / 2; salto != 0; salto /= 2) {
            boolean cambios = true;
            while (cambios) {
                cambios = false;
                for (int i = salto; i < array_enteros.length; i++) {
                    if (array_enteros[i - salto] > array_enteros[i]) {
                        int aux = array_enteros[i];
                        array_enteros[i] = array_enteros[i - salto];
                        array_enteros[i - salto] = aux;
                        cambios = true;
                    }
                }
            }
        }
            System.out.println("Array ordenado ");
            for (int i=0;i<5;i++){
                System.out.print(array_enteros[i]+ ", ");
            }*/

            //Ejercicio 14
        /*Integer [] array_enteros =new Integer [20];
        Integer [] array_ordenado =new Integer [20];
        boolean condicion=true;
        System.out.println("Ingrese numeros enteros ");
        for (int i=0;i<20;i++){
            System.out.println("Ingrese un numero: ");
            array_enteros[i]= sc.nextInt();
            array_ordenado[i]=array_enteros[i];
        }
        System.out.println("Como desea ordenar el array? (ingrese el numero de la operacion) 1)Ascendente 2)Descendente");
         int op1=sc.nextInt();
        sc.nextLine();
        System.out.println("Que metodo desea usar? (ingrese el numero de la operacion) 1)Insercion 2)Metodo de la Burbuja 3)Seleccion");
        int op2=sc.nextInt();

            if(op1==1 && op2==1){
                System.out.println("FORMA ASCENDENTE Y METODO INSERCION ");
                for (int p = 1; p < array_ordenado.length; p++){
                    int aux = array_ordenado[p];
                    int j = p - 1;
                    while ((j >= 0) && (aux < array_ordenado[j])){

                        array_ordenado[j + 1] = array_ordenado[j];
                        j--;
                    }
                    array_ordenado[j + 1] = aux;
                }
                System.out.println("Array Original ");
                for (int i=0;i<20;i++){
                    System.out.print(array_enteros[i]+ ", ");
                }
                System.out.println(" ");
                System.out.println("Array Ordenado ");
                for (int i=0;i<20;i++){
                    System.out.print(array_ordenado[i]+ ", ");
                }
        }else if(op1==1 && op2==2){
                System.out.println("FORMA ASCENDENTE Y METODO DE LA BURBUJA ");
                for (int i = 0; i < array_ordenado.length - 1; i++) {
                    for (int j = 0; j < array_ordenado.length - i - 1; j++) {
                        if (array_ordenado[j + 1] < array_ordenado[j]) {
                            int aux = array_ordenado[j + 1];
                            array_ordenado[j + 1] = array_ordenado[j];
                            array_ordenado[j] = aux;
                        }
                    }
                }
                System.out.println("Array Original ");
                for (int i=0;i<20;i++){
                    System.out.print(array_enteros[i]+ ", ");
                }
                System.out.println(" ");
                System.out.println("Array Ordenado ");
                for (int i=0;i<20;i++){
                    System.out.print(array_ordenado[i]+ ", ");
                }
        } else if(op1==1 && op2==3){
                System.out.println("FORMA ASCENDENTE Y METODO SELECCION");
                for (int i = 0; i < array_ordenado.length - 1; i++) {
                    int menor = array_ordenado[i];
                    int pos = i;
                    for ( int j = i + 1; j < array_ordenado.length; j++){
                        if (array_ordenado[j] < menor) {
                            menor = array_ordenado[j];
                            pos = j;
                        }
                    }
                    if (pos != i){
                        int tmp = array_ordenado[i];
                        array_ordenado[i] = array_ordenado[pos];
                        array_ordenado[pos] = tmp;
                    }
                }
                System.out.println("Array Original ");
                for (int i=0;i<20;i++){
                    System.out.print(array_enteros[i]+ ", ");
                }
                System.out.println(" ");
                System.out.println("Array Ordenado ");
                for (int i=0;i<20;i++){
                    System.out.print(array_ordenado[i]+ ", ");
                }
            } else if(op1==2 && op2==1){
                System.out.println("FORMA DESCENDENTE Y METODO INSERCION ");
                for (int p = 1; p < array_ordenado.length; p++) {
                    int aux = array_ordenado[p];
                    int j = p - 1;
                    while ((j >= 0) && (aux > array_ordenado[j])) {
                        array_ordenado[j + 1] = array_ordenado[j];
                        j--;
                    }
                    array_ordenado[j + 1] = aux;
                }
                System.out.println("Array Original ");
                for (int i=0;i<20;i++){
                    System.out.print(array_enteros[i]+ ", ");
                }
                System.out.println(" ");
                System.out.println("Array Ordenado ");
                for (int i=0;i<20;i++){
                    System.out.print(array_ordenado[i]+ ", ");
                }
            } else if(op1==2 && op2==2){
                System.out.println("FORMA DESCENDENTE Y METODO DE LA BURBUJA ");
                for (int i = 0; i < array_ordenado.length - 1; i++) {
                    for (int j = 0; j < array_ordenado.length - i - 1; j++) {
                        if (array_ordenado[j + 1] > array_ordenado[j]) { // Cambiamos "<" a ">"
                            int aux = array_ordenado[j + 1];
                            array_ordenado[j + 1] = array_ordenado[j];
                            array_ordenado[j] = aux;
                        }
                    }
                }
                System.out.println("Array Original ");
                for (int i=0;i<20;i++){
                    System.out.print(array_enteros[i]+ ", ");
                }
                System.out.println(" ");
                System.out.println("Array Ordenado ");
                for (int i=0;i<20;i++){
                    System.out.print(array_ordenado[i]+ ", ");
                }
            } else if(op1==2 && op2==3){
                System.out.println("FORMA DESCENDENTE Y METODO SELECCION ");
                for (int i = 0; i < array_ordenado.length - 1; i++) {
                    int mayor = array_ordenado[i];
                    int pos = i;
                    for (int j = i + 1; j < array_ordenado.length; j++) {
                        if (array_ordenado[j] > mayor) {
                            mayor = array_ordenado[j];
                            pos = j;
                        }
                    }
                    if (pos != i) {
                        int tmp = array_ordenado[i];
                        array_ordenado[i] = array_ordenado[pos];
                        array_ordenado[pos] = tmp;
                    }
                }
                System.out.println("Array Original ");
                for (int i=0;i<20;i++){
                    System.out.print(array_enteros[i]+ ", ");
                }
                System.out.println(" ");
                System.out.println("Array Ordenado ");
                for (int i=0;i<20;i++){
                    System.out.print(array_ordenado[i]+ ", ");
                }
            }else{
                System.out.println("La opciones elegidas no son validas");
            }*/
        }

        public static void merge(int array_enteros[],int izq, int m, int der){
            int i, j, k;
            int [] array_auxiliar = new int[array_enteros.length];
            for (i=izq; i<=der; i++)
                array_auxiliar[i]=array_enteros[i];

            i=izq; j=m+1; k=izq;

            while (i<=m && j<=der)
                if (array_auxiliar[i]<=array_auxiliar[j])
                    array_enteros[k++]=array_auxiliar[i++];
                else
                    array_enteros[k++]=array_auxiliar[j++];

            while (i<=m)
                array_enteros[k++]=array_auxiliar[i++];
        }

        public static void mergesort(int array_enteros[],int izq, int der){
            if (izq < der){
                int m=(izq+der)/2;
                mergesort(array_enteros,izq, m);
                mergesort(array_enteros,m+1, der);
                merge(array_enteros,izq, m, der);
            }
        }
}
