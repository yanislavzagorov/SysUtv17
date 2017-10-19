package uke41fifo;

import uke41fifo.Sykkel;

public class Person {
    public String navn;
    public  int alder;
    public Sykkel sykkel;

    public Person(String n, int a){
        alder=a;
        navn=n;
    };

    public void settSykkel(Sykkel s){
        sykkel=s;
    }

    public void fjernSykkel(){
        sykkel=null;
    }

    public void getSykkelNavn(){
        System.out.println(sykkel.navn);
    }

}
