package com.company;

import java.util.Scanner;

public class Vektr {
    double x,y,z;

        public  Vektr(){
            x=0;
            y=0;
            z=0;
        }
        public  Vektr(double x,double y,double z){
            this.x=x;
            this.y=y;
            this.z=z;
        }

        public void rand(){
            this.x=Math.random()*10;
            this.y=Math.random()*10;
            this.z=Math.random()*10;
        }

        public void newCord(){
            System.out.println("Введите координату X");
            Scanner str = new Scanner(System.in);
            this.x = str.nextInt();
            System.out.println("Введите координату Y");
            this.y = str.nextInt();
            System.out.println("Введите координату Z");
            this.z = str.nextInt();

        }

        public void printer(){
            System.out.println("\n" + x + "  " + y + "  " + z + "");
        }

        public double longh(){
            return Math.sqrt(x*x+y*y+z*z);
        }

        public double falconer(Vektr vek){
            return this.x*vek.x+this.y*vek.y+this.z*vek.z;
        }

        public Vektr vektrporoiz(Vektr vek){
            Vektr outvektr = new Vektr();
            outvektr.x =this.y*vek.z-this.z*vek.y;
            outvektr.y =this.z*vek.x-this.x*vek.z;
            outvektr.z =this.x*vek.y-this.y*vek.x;
            return  outvektr;
        }

        public double kos(Vektr vek){
            return this.falconer(vek) /(this.longh()*vek.longh());
        }

        public Vektr summ(Vektr vek){
            Vektr outvektr = new Vektr();
            outvektr.x =this.x+vek.x;
            outvektr.y =this.y+vek.y;
            outvektr.z =this.z+vek.z;
            return outvektr;
        }

         public Vektr sub(Vektr vek){
            Vektr outvektr = new Vektr();
            outvektr.x =this.x-vek.x;
            outvektr.y =this.y-vek.y;
            outvektr.z =this.z-vek.z;
            return outvektr;
        }

        public static Vektr[] genmass(int n){
            Vektr[] mass = new Vektr[n];
            for(int i=0;i<n;i++)
                mass[i]=new Vektr();
            for(int i=0;i<n;i++){
                mass[i].rand();
            }
            return mass;
        }

}
