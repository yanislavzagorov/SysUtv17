package uke41fifo;

import java.util.Scanner;

public class banankake {

    public static void main(String[] args){
        Person p1 = new Person("Nibbs", 19);
        Sykkel s1 = new Sykkel("stolen");
        p1.settSykkel(s1);
        System.out.print("1; ");
        p1.getSykkelNavn();
        p1.settSykkel(null);
        System.out.print("2; ");
    }

    public static void snuOrd(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ord som skal snus: ");
        String a = scanner.next();
        StringBuilder b = new StringBuilder();
        System.out.println("a: " + a);

        int teller = 0;
        for(int i=a.length()-1;i!=-1;i--){
            b.append(a.charAt(i));
            teller++;
        }
        System.out.println("b: " + b);
    }
}
