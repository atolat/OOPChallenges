package com.arpan;

/**
 * Created by arpanpune on 12/31/2015.
 */
public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public Printer(int tonerLevel, boolean isDuplex, int pagesPrinted) {
        this.tonerLevel = tonerLevel;
        this.isDuplex = isDuplex;
        this.pagesPrinted = pagesPrinted;


    }

    public void fillUpToner(int inkAmt){
        if(this.tonerLevel+inkAmt<=100){
            this.tonerLevel=this.tonerLevel+inkAmt;
            System.out.println("New toner level is "+this.tonerLevel);
        }

        else if(this.tonerLevel==100){
            System.out.println("Full!!");
        }

        else{
            System.out.println("Too much ink, fill only "+(100-this.tonerLevel)+" units of ink");
        }



    }

    public void printPage(){
        if(this.tonerLevel>10) {
            System.out.println("Printing.......");
            if(this.isDuplex==true){
                this.isDuplex=false;
            }
            else{
                this.pagesPrinted = this.pagesPrinted + 1;
                this.isDuplex=true;
            }


            this.tonerLevel=this.tonerLevel-10;
            System.out.println("Total number of pages printed " + this.pagesPrinted);
            System.out.println("Toner level= "+this.tonerLevel);
        }else
        System.out.println("Low on ink. Please fill toner.");
    }


}
