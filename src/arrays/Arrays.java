
package arrays;

/**
 *Tambien son conocidos como arreglos o vectores, son una estructura que almacena un conjunto de datos
 * que pueden ser primitivos o creados, pueden ser numeros, cadenas, caracteres etc.
 * Los datos almacenados deben de ser del mismo tipo.
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaracion de array, falta asignar el tamaño
        int intArray[];
        int[] intArray2;//se puede declarar de esta manera que seria lo mismo.
        
        //Otros tipos de arrays
        byte byteArray[];
        short shortArray[];
        boolean booleanArray[];
        long longArray[];
        float floatArray[];
        double doubleArray[];
        char charArray[]; // primitivo char
        String StringArray[]; //Objeto
        
        //Asignamos tamaño(# de casillas), este tamaño una vez lo asignamos no se  puede modificar.
        intArray = new int[5];
        int[] otroArray=  new int [5];
        
         //Asignamos datos al array
        intArray[0]=3;
        intArray[1]=8;
        intArray[2]=2;
        intArray[3]=1;
        intArray[4]=6;
        
        //Mostramos solo un elemento
        System.out.println("El elemento del indice 2 es: "+intArray[2]);
        
        //mostramos todo el recorrido del array con un bucle
        for(int i =0; i<intArray.length; i++)
            System.out.println("Elemento en el indice: " + i + ":" + intArray[i]);
    }
    
}
