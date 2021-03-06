package org.campus02.stack;

public class Stack<T> {
    /*
    private=> nur innerhalb der Klasse
    public=> von überall verwendbar
    nichts=>
     */

    private T []array;
    private int counter;

    public Stack(T[] array){
        this.array = array;
        counter =0;
    }
    public void push(T value){
        if(counter >= array.length){
            System.out.println("Stack is full");
            return;
        }
        array[counter] = value;
        counter++;
    }
    public T pop(){
        if (counter == 0){
            return null;
        }
        counter--;
        return array[counter];
    }
}
