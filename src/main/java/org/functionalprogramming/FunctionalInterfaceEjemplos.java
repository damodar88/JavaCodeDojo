package org.functionalprogramming;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    /*
    Resumen del Flujo Técnico
     lista.stream() → Llama a stream() de Collection.
     stream() → Llama a spliterator() y pasa el resultado a StreamSupport.stream.
     spliterator() → Crea un Spliterator con Spliterators.spliterator(this, 0).
     Spliterators.spliterator → Devuelve un IteratorSpliterator basado en la lista.
     StreamSupport.stream → Construye y retorna un Stream<Integer> secuencial.
    * */



    LinkedList<String> numberList2 = new LinkedList<>(List.of("1", "2", "3"));

    List<String> list = numberList2.stream()
            .map(n -> "Numeros" + n)
            .collect(Collectors.toList());

    List<String> numberList = List.of(1,2,3,4,5).stream()
            .map(n -> "Numeros: " +n)
            .collect(Collectors.toList());

    List<Integer> listaNumerica = List.of(1,2,3,4,5);
    Stream<Integer> flujo = listaNumerica.stream();



    public static void main(String[] args) {
        FunctionalInterfaceEjemplos fi = new FunctionalInterfaceEjemplos();
        fi.flujo.forEach(System.out::println);
    }

}
