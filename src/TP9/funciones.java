package TP9;
import java.util.ArrayList;

public class funciones {
    public static String suma_ind_pares(ArrayList a){
        int sum = 0;
        for(Integer i = 0; i< a.size(); i++){
            if(i%2==0 && i!= 0){
                sum += (int) a.get(i);
            }
        }
        return "La suma de los elementos con indices pares es: "+sum;
    }
    public static String son_iguales (ArrayList firstArray, ArrayList otherArray) {
        int equal = 0;
        if (firstArray.size() == otherArray.size()) {
            for (int i = 0; i < firstArray.size() - 1; i++) {
                if (firstArray.get(i) == otherArray.get(i)) {
                    equal += 1;
                }
            }
            if (equal == firstArray.size() - 1) {
                return "Los dos arrays son iguales";
            } else {
                return "Los dos arrays no son iguales";
            }
        } else {
            return "Los arrays ingresados no tienen el mismo tamaño";
        }
    }
}
