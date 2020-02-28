package com.datastructure;


import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

class CustomArrayList<T> {
    private static int arrayCapacity = 10;
    private static int size = 0;
    private T array[];

    public CustomArrayList() {
        this.arrayCapacity = 10;
        array = (T[]) new Object[arrayCapacity];
    }

    public CustomArrayList(int initialCapacity) {
        this.arrayCapacity = initialCapacity;
        array = (T[]) new Object[arrayCapacity];
    }

    public int getSize() {
        return size;
    }

    public void add(T item) {
        checkArraySize();
        array[size++] = item;
    }

    public void add(T item, int index) {
        checkArraySize();
        final T[] newArray = (T[]) new Object[arrayCapacity];
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        IntStream.range(0, size).forEach(arrayIndex -> {
            if (arrayIndex == index) {
                newArray[atomicInteger.getAndIncrement()] = item;
            }
            newArray[atomicInteger.getAndIncrement()] = array[arrayIndex];
        });
        array = newArray;
        size = atomicInteger.get();
    }

    private void checkArraySize() {
        if (array.length <= size + 1) {
            final int newCapacity = arrayCapacity * 2;
            final T[] newArray = (T[]) new Object[newCapacity];
            for (int count = 0; count < array.length; count++) {
                newArray[count] = array[count];
            }
            array = newArray;
            arrayCapacity = newCapacity;
        }
    }

    public int getArrayCapacity() {
        return arrayCapacity;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CustomArrayList { array [ ");
        for (int index = 0; index < size; index++) {
            sb.append(index + " -> ").append(array[index]).append(", ");
        }
        sb.append("]}");
        return sb.toString();
    }
}


public class CustomArrayListDataStructure {
    public static void main(String[] args) {
        final CustomArrayList<Integer> list = new CustomArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(20);
//        list.add(30);
        list.add(90, 1);

        System.out.println(list);
        System.out.println("ArrayList Size: " + list.getSize());
        System.out.println("ArrayList Capacity: " + list.getArrayCapacity());
    }
}
