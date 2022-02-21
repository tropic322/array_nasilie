/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.sfedu.array_nasilie;

/**
 *
 * @author Alexandr
 */
public interface CustomList<T extends Comparable<T>> {
   public void add(T item);
   public void add(int index, T item);
   public T get(int index);
   public void set(int index,T value);
   public void remove(int index);
   public void clear();
   public int size();
   private void resize(int newLength){};
   public int indexOf(T t);
   public void sort();
   public void print();
    
}
