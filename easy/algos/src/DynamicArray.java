package algos.src;

import java.util.Iterator;

@SuppressWarnings("unchecked")
public class DynamicArray<T> implements Iterable<T>{
    private T[] array;
    private int length = 0;
    private int capacity = 0;

    public DynamicArray(){this(16);}

    public DynamicArray(int capacity){
        if(capacity < 0) throw new IllegalArgumentException("Invalid capacity: Must be greater than 0.");
        this.capacity = capacity;
        array = (T[]) new Object[capacity];
    }

    public int size(){return length;}

    public T get(int index){
        if (index >= length || index < 0) throw new IndexOutOfBoundsException();
        return array[index];
    }

    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
        length = 0;
    }

    public void add(T element){
        //Resize array if needed
        if(length + 1 >= capacity){
            if(capacity == 0) {capacity = 1;}
            else capacity *= 2;
            //Create new array w/ double the capacity
            T[] temp_array = (T[]) new Object[capacity*2];
            //Copy the original values into the new array
            for(int i = 0; i < array.length; i++){
                temp_array[i] = array[i];
            }
            //Replace old array with new array
            array = temp_array;
        }
        //insert value to array
        array[length++] = element;
    }
    // Removes an element at the specified index in this array.
    public T removeAt(int index) {
        if (index >= length || index < 0) throw new IndexOutOfBoundsException();
        T data = array[index];
        T[] new_arr = (T[]) new Object[length - 1];
        for (int i = 0, j = 0; i < length; i++, j++)
            if (i == index) j--; // Skip over index by fixing j temporarily
            else new_arr[j] = array[i];
        array = new_arr;
        capacity = --length;
        return data;
    }

    public boolean remove(Object obj) {
        int index = indexOf(obj);
        if (index == -1) return false;
        removeAt(index);
        return true;
    }

    public int indexOf(Object obj) {
        for (int i = 0; i < length; i++) {
            if (obj == null) {
                if (array[i] == null) return i;
            } else {
                if (obj.equals(array[i])) return i;
            }
        }
        return -1;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }
    public void print(){
        for(T object : array) if(object != null) System.out.println(object);
    }
    @Override
    public Iterator<T> iterator() {
        return null;
    }
    public static void main(String args[]){
        DynamicArray<Integer> dynmcIntArray = new DynamicArray<>(1);
        dynmcIntArray.add(112);
        dynmcIntArray.add(1231);
        dynmcIntArray.add(23);
        dynmcIntArray.add(12);
        dynmcIntArray.print();
    }
}