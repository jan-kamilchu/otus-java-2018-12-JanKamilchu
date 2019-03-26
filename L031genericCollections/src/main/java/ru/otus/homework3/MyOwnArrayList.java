package ru.otus.homework3;

import java.util.*;

public class MyOwnArrayList <T> implements List<T> {
    private static final int DEFAULT_ARRAY_SIZE =   10;
    private Object[] arr = new Object[DEFAULT_ARRAY_SIZE];
    private Object[] resizeArr;
    private int currInd = 0;//указатель на текущий элемент массива

    public MyOwnArrayList(){

    }

    public MyOwnArrayList(int sz){
        arr = new Object[sz];

    }
    @Override
    public boolean add(T item) {
        if(currInd == arr.length-1)//если массив полон
            resize(arr.length*2); //увеличить его
        arr[currInd++] = item;
        return false;
    }

    private void resize(int size){
        resizeArr = new Object[size];//создаем новый массив увеличенной ёмкости
        for(int i = 0; i< currInd; i++){//копируем в него старый массив
            resizeArr[i] = arr[i];
        }
        arr = resizeArr;//используем новый массив
    }

    @Override
    public T get(int index) {
        return (T) arr[index];
    }

    @Override
    public int size() {
        return currInd;
    }

    @Override
    public boolean isEmpty() {
        for(int i=0;i<arr.length;i++){
            if(arr[i] != null) return false;//если есть хоть один непустой элемент
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {

        for(int i = 0; i<c.size();i++){
            //arr[i]=(arr.getClass()) c.;
        }
        return false;
    }

    @Override
    public ListIterator<T> listIterator() {
        return new MyItrator();
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T set(int index, T element) {
        arr[index] = element;
        return null;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
///////////////////////////////////////////////////////////////////////////////////
    private class MyItrator implements Iterator<T>, ListIterator<T> {
        Integer iterCursor;

        @Override
        public boolean hasNext() { return (currInd>iterCursor); }

        @Override
        public T next() {
            if(iterCursor == null) {
                iterCursor = 0;
                return (T)arr[iterCursor];
                }
            return (T) arr[++iterCursor];
        }

        @Override
        public boolean hasPrevious() { return (currInd>=iterCursor && currInd>0); }

        @Override
        public T previous() {
            if(iterCursor == null || iterCursor == 0) {
                return null;
            }
            return (T) arr[--iterCursor];
        }

        @Override
        public int nextIndex() {
            if(iterCursor == null) {
                return iterCursor=0;
            }
            return ++iterCursor;
        }

        @Override
        public int previousIndex() {
            if(iterCursor == null|| iterCursor==0) return 0;
            return --iterCursor; }

        @Override
        public void remove() { }

        @Override
        public void set(T e) {arr[iterCursor] = e; }

        @Override
        public void add(T e) { }
    }
}
