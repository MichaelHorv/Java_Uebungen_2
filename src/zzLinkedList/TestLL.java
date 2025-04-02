package zzLinkedList;

import java.util.LinkedList;

public class TestLL {
    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(100);
        integers.add(200);
        integers.add(300);
        integers.add(400);

        int length = 0;
        for (Integer i : integers) {
            length++;
            System.out.print(length + " " + i +"\n");
        }

        integers.remove(Integer.valueOf(200));

        length = 0;
        for (Integer i : integers) {
            length++;
            System.out.print(length + " " + i +"\n");
        }


        //queue (Warteschlange - first in first out)
        System.out.println("QUEUE-FIFO");
        LinkedList<Integer> integers2 = new LinkedList<>();
        integers2.offer(1000);
        integers2.offer(2000);
        integers2.offer(3000);

        System.out.println(integers2);
        integers2.poll();
        System.out.println(integers2);
        integers2.poll();
        System.out.println(integers2);

        //stack - last in first out (TELLERSTAPEL)
        System.out.println("STACK-LIFO");
        LinkedList<Integer> integers3 = new LinkedList<>();
        integers3.push(123);
        integers3.push(456);
        integers3.push(789);
        System.out.println(integers3);
        integers3.pop();
        System.out.println(integers3);
        integers3.pop();
        System.out.println(integers3);


        LinkedList<Double> doubleZahlen = new LinkedList<>();
        doubleZahlen.add(1.1);
        doubleZahlen.add(2.2);
        doubleZahlen.add(3.3);
        doubleZahlen.add(4.4);

        length = 0;
        for (Double d : doubleZahlen) {
            length++;
            System.out.print(length + " " + d +"\n");
        }

        doubleZahlen.remove(1);
        length = 0;
        for (Double d : doubleZahlen) {
            length++;
            System.out.print(length + " " + d +"\n");
        }

    }
}
