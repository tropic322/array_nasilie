/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.sfedu.array_nasilie;

/**
 *
 * @author Alexandr
 */
import ru.sfedu.array_nasilie.Sort;
public class CustomArrayList<T extends Comparable<T>> {
        
    /**
     * Constants
    */
    private final int div = 4;
    private final int cupasity = 16;   
    private Object[] customArray = new Object[cupasity];
    private int elementQuantity = 0;
    
    /**
     * Empty constructor
    */
    public CustomArrayList() {}

    /**
     * Constructor
     */
    public CustomArrayList(int size) {
        if (size < 0 || size > Integer.MAX_VALUE-1)
            return;
        customArray = new Object[size];
    }

    /**
     * Add new element in list
     *
     * @param item an element used to be added to list
     */
    public void add(T item) {
        if(elementQuantity == customArray.length-1){
            resize(customArray.length*2);
        }
        customArray[elementQuantity++] = item;
     
   }
    /**
     * Add new element in current place in list
     *
     * @param index on which place new element should be added
     * @param item  an element used to be added to list
     */
   public void add(int index, T item) {
       if(index>elementQuantity||index<0)
       {
          /// 
       }
       else{
        if(elementQuantity == customArray.length-1){
         resize(customArray.length*2);
        }
        Object[] customArray1 = new Object[customArray.length+1];
        for(int i=0;i<index;i++)
        {
             customArray1[i]=customArray[i];
        }
        customArray1[index]=item;
        for(int i=index+1;i<elementQuantity;i++)
        {
            customArray1[i]=customArray[i-1];
        }
        System.arraycopy(customArray, 0, customArray1, 0, elementQuantity);
        elementQuantity++;
     //customArray[elementQuantity++] = item;
       }
   }
    /**
     * Get element from list by id
     *
     * @param index  id of searchable element
     * @return an element from list of T type
     */
    public T get(int index) {
        return (T) customArray[index];
    }
    /**
     * Change value of element with given
     *
     * @param index index of an element which value should be changed
     * @param value new value
     */
    public void set(int index,T value) {
      if(index>=0 && index<elementQuantity){
         customArray[index] = value; 
          
      }
   }
    
    /**
     * Remove element from list by id
     *
     * @param index id of element for remove
     */
    public void remove(int index) {
      for (int i = index; i<elementQuantity; i++) 
        customArray[i] = customArray[i+1];
      customArray[elementQuantity] = null;
      elementQuantity--;
      if (customArray.length > cupasity && elementQuantity < customArray.length / div) 
         resize(customArray.length/2); 
                                 
   }
    
    /**
     * Remove all elements from list
     */
    public void clear() {
        for (int i = 0; i<elementQuantity; i++) {
            remove(i);
        }
    }
   
    /**
     * Get size of  array
     *
     * @return size of array
     */
    public int size() {
      return elementQuantity;
    }

    /**
     * Resizes the list
     */
    private void resize(int newLength) {
      Object[] newArray = new Object[newLength];
      System.arraycopy(customArray, 0, newArray, 0, elementQuantity);
      customArray = newArray;
    } 
    /**
     * Searches for an index of current element
     *
     * @param t element which index should be find
     * @return index of an element
     */
    public int indexOf(Object t){
        for(int i=0;i<size();i++)
        {
            if(t.equals(get(i))){
            return i; 
        }
    }
        return -1;
     
    }
    /**
     * Sort this list
     */
    public void sort(){
        Sort s = new Sort();
        s.sort(this, 0, this.size() - 1);
    }
}

