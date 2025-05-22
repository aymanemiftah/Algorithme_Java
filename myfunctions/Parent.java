package myfunctions;

public sealed class Parent permits Child {
    final String name ;

    public Parent(){
        name = "Bate5a";
    }

    public void print(){
        System.out.println(name);
    }
}
