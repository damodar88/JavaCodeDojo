package org.functionalprogramming;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalInterfaceEjemplos {

    //stream
    //map(Function<T, R>) usa Function.  = Transformación
    //forEach(Consumer<T>) usa Consumer. = Acciones
    //filter(Predicate<T>) usa Predicate. = Filtrado
    //reduce(BinaryOperator<T>) usa una variación de Function. = Reducción
    //sorted() Comparator<T> = Ordenación
    //flatMap() Function<T, Stream<R>> =  Aplanado de estructuras
    //collect() Collector<T, A, R> = Conversión

    /*
     Stream()
     Funciones:
      - Funciones Puras: No modifica la coleccion devuelve un nuevo Stream sin efectos secundarios
      - Inmutabilidad : No cambia los datos de entrada transforma en otro flujo, son de uso unico una vez consumidos no se pueden reutilizar
      - Evaluación perezosa: no ejecuta nada hasta llegar a la operacion terminal
      - Composición de funciones: Encadena multiples funciones
      - Uso de funciones de orden superior: recibe una funcion como argumento
     */


    LinkedList<String> numberList2 = new LinkedList<>(List.of("1", "2", "3"));

    List<String> list = numberList2.stream()
            .map(n -> "Numeros" + n)
            .collect(Collectors.toList());


        List<String> numberList = List.of(1,2,3,4,5).stream()
                .map(n -> "Numeros: " +n)
                .collect(Collectors.toList());



    public static void main(String[] args) {
        FunctionalInterfaceEjemplos fi = new FunctionalInterfaceEjemplos();
        fi.numberList.forEach(System.out::println);
    }

}
