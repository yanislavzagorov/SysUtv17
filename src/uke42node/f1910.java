package uke42node;


public class f1910 {

    /*
    // La oss si at vi ønsker å sette inn bokstavene Z - A - C - X - F i en FIFO kø
    // Verdiene blir satt inn FXCAZ men vi ønsker å ha bokstavene sorterte
    // Vi setter inn z, så A, så sier vi at C skal være på 2 (mellom A og Z).
    // Dette tar lang tid for man må flytte alle bokstavene foran ved hver slik innsetting.
    // Derfor bruker vi LenketListe!
     */

    public static void main(String[] args){
        uke42node.LinkedList<String> head = new uke42node.LinkedList<>();
        head.value = "B";

        head.next = new uke42node.LinkedList<>();
        head.next.value = "R";
        head.next.prev = head;

        head.next.next = new uke42node.LinkedList<>();
        head.next.next.value = "A";
        head.next.next.prev = head.next;

        uke42node.LinkedList<String> current = head;
        while (current != null){
            System.out.println(current.value);
            current = current.next;
        }

        current = head.next.next; //tall
        while (current != null){
            System.out.println(current.value);
            current = current.prev;
        }

    }




}
