package myfunctions;

interface  Car {
    // String Color;
    // int Model;
    // public Car(){
    //     System.out.println("First Constractur");
    // }
    // public Car(String newColor){
    //     Color=newColor;
    //     System.out.println("car color is "+Color);
    // }
    // public Car(String newColor, int newModel){
    //     Color=newColor;
    //     Model=newModel;
    //     System.out.println("the car color is "+Color+" and the Model is "+Model);
    // }

    public abstract void CarSound();

    public  void TopSpeed();
    
}
public class BMW implements Car{
    public void CarSound(){
        System.out.println("vooooo voooo");
    }
    public void TopSpeed(){
        System.out.println("300km");
    }
}
