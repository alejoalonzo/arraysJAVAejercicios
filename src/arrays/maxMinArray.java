
package arrays;

import java.util.Scanner;
public class maxMinArray {
    public static void main(String[] args){
    int[] myList = {5,4,8,3,2,9};
    Scanner obtenerNumero = new Scanner(System.in);
    
    int i, max, min;
    
    min=max= myList[0];//Empezamos diciendo que el valor de  myList es el primer dato del array en este caso el "5"
    
    for (i=0; i < myList.length; i++){
        if(min > myList[i]){
            min = myList[i];
        }
        if(max < myList[i]){
            max = myList[i];
        }
    }
    System.out.println("El maximo es: "+ max + " y el minimo es: "+ min);
 }
}
    
