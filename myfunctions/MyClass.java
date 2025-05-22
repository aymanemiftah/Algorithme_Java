package myfunctions;

 class Generics <T> {
    private T data;

    public Generics(T data){
        this.data = data;
    }

    public T getData(){
        return this.data;
    }
}

public class MyClass{
    public <T> void myfunc(T data){
        System.out.println("hak chad 3liya khrak "+data);
    }
}
