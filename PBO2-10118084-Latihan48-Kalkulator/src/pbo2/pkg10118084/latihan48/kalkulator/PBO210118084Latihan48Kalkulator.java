/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan48.kalkulator;

/**
 *
*Nama  : Divi Adiffia Freza Alana
*Kelas : PBO2
*Nim   : 10118084
*Deskripsi Program : Program ini berisi program untuk menampilkan kalkulator

 */
public class PBO210118084Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Kalkulator kalkulator = new Kalkulator();
        System.out.println("VALUE 1 = "+kalkulator.getValue1());
        System.out.println("VALUE 2 = "+kalkulator.getValue2());
        kalkulator.setNameProject();
        kalkulator.setNoteProject("");
        System.out.println("Result Add is = "+kalkulator.add(kalkulator.getValue1(), kalkulator.getValue2()));
        System.out.println("Result Minus is = "+kalkulator.minus(kalkulator.getValue1(), kalkulator.getValue2()));
        System.out.println("Result Multiple is = "+kalkulator.multiplication(kalkulator.getValue1(), kalkulator.getValue2()));
        System.out.println("Result Division is ="+kalkulator.division(kalkulator.getValue1(), kalkulator.getValue2()));
    }
    
}
