/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.sfedu.array_nasilie;

/**
 *
 * @author Alexandr
 */
import exceptions.IncorrectSizeException;
import exceptions.IncorrectElementException;
public class CustomArrayList<T extends Comparable<T>> implements CustomList<T> {
        
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
     * @param size size of array
     */
    public CustomArrayList(int size) {
        if (size < 0 || size > Integer.MAX_VALUE-1)
            throw new IncorrectSizeException("Wrong size");
        customArray = new Object[size];
    }

    /**
     * Add new element in list
     *
     * @param item an element used to be added to list
     */
    @Override
    public void add(T item) {
        if(item==null)
        {
           throw new IncorrectElementException("Element can not be null"); 
        }
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
    @Override
   public void add(int index, T item) {
       if(item==null)
        {
           throw new IncorrectElementException("Element can not be null"); 
        }
       if(index>elementQuantity||index<0)
       {
          throw new IncorrectSizeException("Wrong size");
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
    @Override
    public T get(int index) {
        if (index < 0 || index > elementQuantity)
            throw new IncorrectSizeException("Wrong size");
        return (T) customArray[index];
    }
    /**
     * Change value of element with given
     *
     * @param index index of an element which value should be changed
     * @param value new value
     */
    @Override
    public void set(int index,T value) {
        if(value==null)
        {
           throw new IncorrectElementException("element can not be null"); 
        }
        if(index>=0 && index<elementQuantity){
         customArray[index] = value; 
          
        }
        else{
         throw new IncorrectSizeException("Wrong size"); 
        }
   }
    
    /**
     * Remove element from list by id
     *
     * @param index id of element for remove
     */
    @Override
    public void remove(int index) {
        if(index>elementQuantity||index<0)
        {
           throw new IncorrectSizeException("Wrong size");
        }
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
    @Override
    public void clear() {
        customArray = new Object[cupasity];
        elementQuantity = 0;
    }
   
    /**
     * Get size of  array
     *
     * @return size of array
     */
    @Override
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
    @Override
    public int indexOf(T t){
        if(t==null)
        {
           throw new IncorrectElementException("Element can not be null"); 
        }
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
    @Override
    public void sort(){
        Sort s = new Sort();
        s.sort(this, 0, this.size() - 1);
    }
        
    /**
     * Print elements form list
     * 
     * 
     */
    @Override
    public void print(){
        for (int i = 0; i < this.size(); i++){
            System.out.print(this.get(i)+" | ");
        }
        System.out.println();
    }
    
}

