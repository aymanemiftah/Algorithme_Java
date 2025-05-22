package myfunctions;

public class MyArray<T> {
    public T[] myarray;

    public MyArray(T[] array){
        this.myarray = array;
    }
    boolean compare(MyArray<T> otherarray){
        return this.myarray.length > otherarray.myarray.length;
    }
    
}
