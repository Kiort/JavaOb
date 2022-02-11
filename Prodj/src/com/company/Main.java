package com.company;



public class Main {

    public static void main(String[] args) {
        Vektr vek1=new Vektr();
        Vektr vekhelp=new Vektr();
        Vektr vek2=new Vektr(5.2 , 3.2 , 2.1);

        vek1.newCord();
        System.out.println("Длина " + vek2.longh());
        System.out.println("Скаляр " + vek2.falconer(vek1));
        System.out.println("cosinos " + vek2.kos(vek1));



        vekhelp=vek1.summ(vek2);
        System.out.println("Сумма");
        vekhelp.printer();

        vekhelp=vek1.sub(vek2);
        System.out.println("Разность");
        vekhelp.printer();

        vekhelp=vek1.vektrporoiz(vek2);
        System.out.println("Произведение");
        vekhelp.printer();

        System.out.println("Массив");


        Vektr[] mass = new Vektr[20];
        mass=Vektr.genmass(20);
        for(int i=0;i<20;i++){
            mass[i].printer();
        }

    }
}
