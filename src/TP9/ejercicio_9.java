package TP9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;
public class ejercicio_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Trabajo Practico Número 9

        //Ejercicio 1
        ArrayList<Integer> num_ar = new ArrayList<>();
        num_ar.add(2);
        num_ar.add(4);
        num_ar.add(155);
        num_ar.add(11);
        num_ar.add(61);

        //Ejercicio 2
        ArrayList<String> str_arr = new ArrayList<>();
        str_arr.add("Gaston Edul");
        str_arr.add("Javier Milei");
        str_arr.add("Miriam Bregman");

        //Ejercicio 3
        System.out.println("Ejercicio 3");
        for (int num : num_ar) {
            System.out.println(num);
        }

        //Ejercicio 4
        System.out.println("Ejercicio 4");
        System.out.println(str_arr.size());

        //Ejercicio 5
        System.out.println("Ejercicio 5");
        str_arr.remove(2);
        for (String word : str_arr) {
            System.out.println(word);
        }

        //Ejercicio 6
        System.out.println("Ejercicio 6");
        if (num_ar.isEmpty() == true) {
            System.out.println("El array está vacio");
        } else {
            System.out.println("El array no está vacio");
        }

        //Ejercicio 7
        System.out.println("Ejercicio 7");
        int max = 0;
        for (int num : num_ar) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println(max);

        //Ejercicio 8
        ArrayList<Integer> copy_arr = new ArrayList<>();
        for (int num : num_ar) {
            copy_arr.add(num);
        }


        //Ejercicio 9
        System.out.println("Ejercicio 9");
        ArrayList<Integer> array_invert = new ArrayList<>();
        for (Integer i = num_ar.size() - 1; i > 0; --i) {
            array_invert.add(num_ar.get(i));
        }
        for (int arr : array_invert) {
            System.out.println(arr);
        }

        //Ejercicio 10
        ArrayList<Integer> doble_arr = new ArrayList<>();
        for (int num : num_ar) {
            doble_arr.add(num);
        }
        for (int num : copy_arr) {
            doble_arr.add(num);
        }

        //Ejercicio 11
        System.out.println("EJERCICIO 11");
        ArrayList<Integer> num_int2 = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            num_int2.add((int) (Math.random() * 100));
            System.out.println(num_int2.get(i));
        }
        ArrayList<Integer> aux = new ArrayList<>();
        for (int i = 0; i < num_int2.size(); i++) {
            if (num_int2.get(i) % 2 == 0) {
                aux.add(i);
            }
        }
        System.out.println(" ytvubin");
        for (int i = aux.size() - 1; i >= 0; i--) {
            int indexToRemove = aux.get(i);
            num_int2.remove(indexToRemove);
        }
        for (int num : num_int2) {
            System.out.println(num);
        }

        // Ejercicio 12
        System.out.println("Ejercicio 12");
        String option = "1";
        ArrayList<String> arrayStr = new ArrayList<>();
        while (option.equals("1")) {
            System.out.println("Ingresa el string que deseas agregar: ");
            arrayStr.add(sc.nextLine());
            System.out.println("1 = Agregar otro string, Cualquier otro número para salir = Salir ");
            option = sc.nextLine();
        }

        //Ejercicio 13
        System.out.println("Ejercicio 13");
        System.out.println(funciones.son_iguales(num_ar, copy_arr));

        //Ejercicio 14
        System.out.println("Ejercicio 14");
        int min = max;
        for (int n : num_ar) {
            if (n < min) {
                min = n;
            }
        }
        System.out.println("El numero menor es: " + min);

        //Ejercicio 15
        System.out.println("Ejercicio 15");
        int sum = 0;
        for (int n : num_ar) {
            sum += n;
        }
        System.out.println("La suma de todos los elementos del array es: " + sum);


        //Ejercicio 16
        System.out.println("Ejercicio 16");
        ArrayList<String> CadenasArray = new ArrayList<>();
        String SumCadena = "";
        CadenasArray.add("BOCA ");
        CadenasArray.add(" YO  ");
        CadenasArray.add(" AMO");
        for (String c : CadenasArray) {
            SumCadena += c;
        }
        System.out.println("La suma de las cadenas es: " + SumCadena);

        //Ejercicio 17
        System.out.println("Ejercicio 17");
        ArrayList<String> CadenasDuplicadas = new ArrayList<>();
        ArrayList<String> Elementos = new ArrayList<>();
        ArrayList<Integer> Indice = new ArrayList<>();
        int n = 0;
        CadenasDuplicadas.add("BOCA");
        CadenasDuplicadas.add("BOCA");
        CadenasDuplicadas.add("JUNIOR");
        CadenasDuplicadas.add("JUNIOR");

        for (int i = 0; i < CadenasDuplicadas.size(); i++) {
            String cadena = CadenasDuplicadas.get(i);
            System.out.println(CadenasDuplicadas.get(i));
            if (!Elementos.contains(cadena)) {
                Elementos.add(cadena);
            } else if (!Indice.contains(i)) {
                Indice.add(i);
            }
        }
        System.out.println("Índices de elementos duplicados:");
        for (int i = Indice.size() - 1; i >= 0; i--) {
            n = Indice.get(i);
            CadenasDuplicadas.remove(n);
        }
        for (String l : CadenasDuplicadas) {
            System.out.println(l);
        }


        //Ejercicio 18
        System.out.println("Ejercicio 18: ");
        ArrayList<Integer> IdxPares = new ArrayList<>();
        IdxPares.add(15);
        IdxPares.add(12);
        IdxPares.add(2);
        IdxPares.add(3);
        IdxPares.add(4);
        System.out.println(funciones.suma_ind_pares(IdxPares));


        //Ejercicio 19
        System.out.println("Ejercicio 19: ");
        System.out.println(IdxPares.contains(2));

        //Ejercicio 20
        System.out.println("Ejercicio 20: ");
        ArrayList<String> cadena20 = new ArrayList<>();
        cadena20.add("Y hoy?");
        cadena20.add("Bailoteo puro");
        cadena20.add("Esoo esooo");
        int longitud = 0;
        int indice = 0;
        for (int i = 0; i < cadena20.size(); i++) {
            if (cadena20.get(i).length() > longitud) {
                longitud = cadena20.get(i).length();
                indice = i;
            }
        }
        System.out.println("El elemento más largo del array es: " + cadena20.get(indice));

        //Ejercicio 21
        System.out.println("Ejercicio 21");
        ArrayList<Integer> enteros21 = new ArrayList<>();
        enteros21.add(10);
        enteros21.add(6);
        enteros21.add(7);
        enteros21.add(1);
        double sum1 = 0;
        for (int nu : enteros21) {
            sum1 += nu;
        }
        System.out.println("El promedio del array es de: " + (sum1 / enteros21.size()));

        //Ejercicio 22
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(13);
        numeros.add(54);
        numeros.add(34);
        numeros.add(87);
        numeros.add(23);

        Collections.sort(numeros);

        System.out.println("ArrayList ordenado de forma ascendente:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        //Ejercicio 23
        System.out.println("Ejercicio 23");
        ArrayList<Integer> enteros23 = new ArrayList<>();
        ArrayList<Integer> indiceBorrar = new ArrayList<>();
        int indx = 0;
        enteros23.add(10);
        enteros23.add(6);
        enteros23.add(7);
        enteros23.add(1);
        enteros23.add(5);
        enteros23.add(8);
        for (int i = 0; i < enteros23.size(); i++) {
            System.out.println(enteros23.get(i));
            if (enteros23.get(i) > 5 && enteros23.get(i) < 10) {
                indiceBorrar.add(i);
            }
        }
        for (int i = indiceBorrar.size() - 1; i >= 0; i--) {
            System.out.println("Indice a borrar: " + indiceBorrar.get(i));
            System.out.println("Numeros a borrar: " + enteros23.get(indiceBorrar.get(i)));
            indx = indiceBorrar.get(i);
            enteros23.remove(indx);
        }
        for (int nu : enteros23) {
            System.out.println(nu);
        }

        //Ejercicio 24
        System.out.println("Ejercicio 24");
        ArrayList<String> cadenas24 = new ArrayList<>();
        int aparece = 0;
        cadenas24.add("Hola");
        cadenas24.add("Hola");
        cadenas24.add("Todo");
        cadenas24.add("Bien");
        for (String c : cadenas24) {
            if (Objects.equals(c, "Hola")) {
                aparece += 1;
            }
        }
        System.out.println("El elemento Hola aparece: " + aparece + " veces");

        //Ejercicio 25
        ArrayList<String> cadenas = new ArrayList<>();

        cadenas.add("Diamante");
        cadenas.add("Piedra");
        cadenas.add("Jaula");
        cadenas.add("Acordeon");
        cadenas.add("Verano");

        Collections.sort(cadenas);

        System.out.println("ArrayList ordenado alfabeticamente:");
        for (String cadena : cadenas) {
            System.out.println(cadena);
        }
    }
}
