/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.sfedu.array_nasilie;


/**
 *
 * @author Alexandr
 */
public class Sort {
    /*public int algoritmStradanie(int arr[], int start, int end) {
    int pivot = arr[end];
    int wall = (start-1);

    for (int j = start; j < end; j++) {
        if (arr[j] <= pivot) {
            wall++;

            int swapTemp = arr[wall];//если число меньше опорного, то меняем 
            arr[wall] = arr[j];
            arr[j] = swapTemp;
        }
    }

    int swapTemp = arr[wall+1];
    arr[wall+1] = arr[end];
    arr[end] = swapTemp;

    return wall+1;
    //quicksort(arr, wall);
    
    //quicksort(arr, n);
}*/
    
public <T extends Comparable<T>> void sort(CustomArrayList<T> array, int wall, int high) {      

        if (wall < 0 || high < 0 || wall > array.size() ||  high > array.size()||array.size() == 0){
            return;}

        if (wall >= high){
            return;}
        
        T pivot =  array.get(wall + (high - wall) / 2);

       
        int i = wall, j = high;
        while (i <= j) {
            while (array.get(i).compareTo(pivot) < 0) {
                i++;
            }

            while (array.get(j).compareTo(pivot) > 0) {
                j--;
            }
            
            if (i <= j) {
                swap(array,i,j);
                i++;
                j--;
            }
        }
        
        if (wall < j){
            sort(array, wall, j);}

        if (high > i){
            sort(array, i, high);}
    }
    private<T> void swap(CustomArrayList array,int first,int second){
         T temp = (T) array.get(first);
                array.set(first, array.get(second));
                array.set(second, (Comparable) temp);
    }
}
