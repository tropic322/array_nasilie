/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ru.sfedu.array_nasilie;

import java.util.ArrayList;

/**
 *
 * @author Alexandr
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CustomArrayList a = new CustomArrayList();
        /*a.add(3);        
        a.add(1, 9);
        a.remove(0);
        a.get(0);
        a.set(0, 5);
        a.clear();
        a.add(4);
        a.add(7);
        a.add(1);
        a.add(2);
        a.add(8);
        a.add(9);
        a.add(6);
        a.add(5);
        a.add(3);
        a.add(5);
        a.add(5);*/
        a.add("a.");
        a.add("x.");
        a.add("c.");
        a.add("f.");
        a.add("aaac.");
        System.out.println(a.indexOf(8));
        
        //int[] aa= new int[] {6,5,1,3,8,4,7,9,2};
        //m.boihelp( aa);
        for(int i=0;i<9;i++)
        {
        //System.out.print(aa[i]);
        }
        a.sort();
        System.out.println();
        //m.quickSort(a,0,a.size());
        for(int i=0;i<a.size();i++)
        {
        System.out.print(a.get(i));
        }
    }
    
}
