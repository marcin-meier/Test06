package Iteracja03.kolekcje.kolejki;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        //FIFO - first in first out
        Queue<String> queue = new LinkedList<>();

        //offer(x) -> dodaje do kolejki nowy element
        //add(x) -> to co wyzej
        //peek() -> pobiera element z kolejki, ale go nie usuwa
        //poll() -> pobiera element z kolejki i go usuwa, zwraca null, gdy kolejka jest pusta.
        //size,contains,remove,clear itp

        queue.offer("Jan");
        queue.add("Stefan");
        queue.offer("Marcin");
        queue.add("Pawel");
        queue.offer("Ola");
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue);

//        Queue<String> prio = new PriorityQueue<>();
        //Ciekawostka, ale narazie nie do zaimplementowania ( potrzebna obiektowość)

        //stworz metode, ktora sprawdzi czy pierwszy element w kolejce to 13

        Queue<Integer> queue123 = new LinkedList<>();

        queue123.offer(13);
        queue123.offer(15);
        queue123.offer(0);

        System.out.println(x(queue123));

        //stworz metode, ktora sprawdzi czy ostatni element w kolejce to 0

        System.out.println(qwe(queue123));

    }

    public static boolean x(Queue<Integer> xzq) {

        return xzq.peek() == 13;
    }

    public static boolean qwe (Queue<Integer> xzq){

        while (!xzq.isEmpty()){
            xzq.poll();
            if (xzq.size() == 1 && xzq.peek() == 5)
                return true;
        }

        return false;
    }


}
