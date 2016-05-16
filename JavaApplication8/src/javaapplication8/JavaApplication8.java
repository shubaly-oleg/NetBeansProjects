
package javaapplication8;

//import java.util.List;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class JavaApplication8 {

  
    public static void main(String[] args) {

//        java.util.List components = java.util.Arrays.
//
//        for (Iterator iter = components.iterator(); iter.hasNext();) {
//            Object elem = (Object) iter.next();
//            System.out.println("Компонент: "
//                    + elem.toString());
//        }

        String[] arrayOfStrings = {"1", "2", "3", "4"};
        List<String> listOfStrings = new ArrayList<String>();
        
        // возвращает массив в виде списка
        // любое изменение в массиве приведет к изменению в списке ArrayList
        listOfStrings = Arrays.asList(arrayOfStrings);
        System.out.println("Полученный ArrayList с помощью метода Arrays.asList()");
   
        for (Iterator iter = listOfStrings.iterator(); iter.hasNext();) {
            Object elem = (Object) iter.next();
            System.out.println("Компонент: "
                    + elem.toString());
        }
        
        
/******        
        for (String str : listOfStrings)
            System.out.print(" " + str);
        // изменяем элемент в массиве и видим, что элемент также меняется и в списке.
        arrayOfStrings[0] = "5";
        System.out.println("\nИзменения в массиве повлияли и на ArrayList");
        for (String str : listOfStrings)
            System.out.print(" " + str);
        
        // код ниже выбросит java.lang.UnsupportedOperationException, потому что
        // Arrays.asList() возвращает список фиксированного размера. Этот размер зависит от размера исходного массива
        //listOfStrings.add("5");
 
        listOfStrings = new ArrayList<String>();
 
        Collections.addAll(listOfStrings, arrayOfStrings);
        // Изменяет и массив, и ArrayList для проверки на взаимозависимость элементов?
        listOfStrings.add("5");
        arrayOfStrings[0] = "1";
        System.out.println("\nArray в ArrayList с помощью метода Collections.addAll()");
        for (String str : listOfStrings)
            System.out.print(" " + str);
 
    }
 
}
*/

    }
    
}
