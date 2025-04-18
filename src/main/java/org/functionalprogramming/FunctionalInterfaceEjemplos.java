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

/*Cuando haces listaNumerica.stream(), el metodo stream() se ejecuta en el contexto de listaNumerica. En Java, dentro de un metodo de instancia, this siempre se refiere al objeto actual (en este caso, la lista [1, 2, 3]).*/


    public void mostrarData(){

        LinkedList<String> numberList2 = new LinkedList<>();

        numberList2.add("hola");
        numberList2.add("hola2");

        List<String> list = numberList2.stream()
                .map(n -> "Numeros" + n)
                .peek( n -> System.out.println(n))
                .collect(Collectors.toList());

    }

    /*

    default Stream<E> stream() {
        return StreamSupport.stream(spliterator(), false);
    }

      @Override
    default Spliterator<E> spliterator() {
        return Spliterators.spliterator(this, 0);
    }

    public static <T> Spliterator<T> spliterator(Collection<? extends T> c,
                                                 int characteristics) {
     return new IteratorSpliterator<>(Objects.requireNonNull(c),
                                         characteristics);
    }


     public IteratorSpliterator(Collection<? extends T> collection, int characteristics) {
            this.collection = collection;
            this.it = null;
            this.characteristics = (characteristics & Spliterator.CONCURRENT) == 0
                                   ? characteristics | Spliterator.SIZED | Spliterator.SUBSIZED
                                   : characteristics;
        }



    public static <T> Stream<T> stream(Spliterator<T> spliterator, boolean parallel) {
        Objects.requireNonNull(spliterator);
        return new ReferencePipeline.Head<>(spliterator,
                                            StreamOpFlag.fromCharacteristics(spliterator),
                                            parallel);
    }




///////
abstract class ReferencePipeline<P_IN, P_OUT>
        extends AbstractPipeline<P_IN, P_OUT, Stream<P_OUT>>
        implements Stream<P_OUT>  {


////////

static class Head<E_IN, E_OUT> extends ReferencePipeline<E_IN, E_OUT> {

      Head(Spliterator<?> source,
             int sourceFlags, boolean parallel) {
            super(source, sourceFlags, parallel);
        }

    * */
    

    public static void main(String[] args) {
        FunctionalInterfaceEjemplos objeto = new FunctionalInterfaceEjemplos();
        objeto.mostrarData();
    }

}
