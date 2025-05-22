package myfunctions;

import java.io.File;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class App{
    public static void main(String[] args){
    //    Person pr1 = new Person();
    //    pr1.name="Aymane";
    //    pr1.LastName="MIFTAH";
    //    pr1.status("Singal");
    //    System.out.println(pr1.fullname());
    //    pr1.playing("valorant");
       
    // Car myCar = new Car(); 
    // Car myCar1 = new Car("Red"); 
    // Car myCar2 = new Car("Red",2024);
        // Person pr1 = new Person("Aymane", 20);
        // Person myperson = new Person(){
        //     @Override
        //     public void print(){
        //         System.out.println("sALAMA A aymane");
        //         super.print();
        //     }
            
        // };
        // myperson.print();
        // Person.Personn personn = person.new Personn();
        // personn.print();

        // Developper Aymane = new Developper();
        // Aymane.
        // Parent myPerent = new Parent();
         // myPerent.name = "Ziko";
        // myPerent.print();
        // Child myChild = new Child();
        // myChild.print();

        // BMW myBmw = new BMW();
        // myBmw.CarSound();
        // myBmw.TopSpeed();


        // Names myNames = Names.Aymane;
        // System.out.println(myNames);

        // try {
        //     int[] numbers = {1,2,3};
        //     System.out.println(numbers[5]);
        // } catch (Exception e) {
        //    System.out.println("atatamaskharo 3alaya");
        // }
        
        // Inter myfunc = (int x ,int y)->{System.out.println(x*y);};
        // myfunc.calculation(2,2);

        // MyInterface myinter = ()-> {System.out.println(5);};
        // myinter.printNumber();

        // MyInterface1 myinter1 = (name)->{System.out.println(name);};
        // myinter1.printname("Spring boot");

        // MyInterface2 myinter2 = (int x , int y)->{System.out.println(x+y);};
        // myinter2.printsum(7, 7);

        // MyInterface3 myinter3 = (int x , int y)->
        //    x+y ;
        //     int result = myinter3.printsum(8, 8);
        //     System.out.println(result);
        // Generics<Integer> myData= new Generics<>(5);
        // System.out.println(myData.getData());
        // Generics<String> myData1=new Generics<>("salam");
        // System.out.println(myData1.getData());
        // MyClass myclass= new MyClass();
        // myclass.<String>myfunc("kharya");
        // MyArray<String> myarray1 = new MyArray<>(new String[]{"Ziko","Aymane"});
        // MyArray<String> myarray2 = new MyArray<>(new String[]{"Ziko"});
        // System.out.println(myarray2.compare(myarray1));
        // ArrayList<String> names = new ArrayList<String>();

        // names.add("Aymane");
        // names.add("Bate5a");
        // names.set(0, "Miftah");
        // names.get(0);
        // names.remove(1);
        // System.out.println(names.size()
        // );
        // try {
        //     File myFile = new File("Bate5a.txt");
        //     if(myFile.createNewFile()){
        //         System.out.println("bate5a created"+myFile.getName());
        //     }else{
        //         System.out.println("File already exists");
        //     }
        // } catch (Exception e) {
        //    System.out.println("error :"+e);
        // }
        // try {
        //     FileWriter myWriter= new FileWriter("Bate5a.txt");
        //     myWriter.write("Salam ya zalama");
        //     myWriter.close();
        //     System.out.println("Done");
        // } catch (Exception e) {
        //     System.out.println("error :"+e);
        // }
        // try{
        //     File myFile = new File("Bate5a.txt");
        //     Scanner myReader = new Scanner(myFile);
        //     while (myReader.hasNextLine()) {
        //         String Data = myReader.nextLine();
        //         System.out.println(Data);
        //     }
        //     myReader.close();
        // }catch(Exception e) {

        // }
        LocalDate Dateobj =  LocalDate.now();
        LocalTime timeobj =  LocalTime.now();
        LocalDateTime datetimeobj =  LocalDateTime.now();
        System.out.println(Dateobj);
        System.out.println(timeobj);
        System.out.println(datetimeobj);
        DateTimeFormatter Myformat = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");
        String Date = datetimeobj.format(Myformat);
        System.out.println(Date);

    }
   
}

