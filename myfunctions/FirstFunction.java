package myfunctions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class FirstFunction {
    int mySalary =15000;
    String staff1;
    String staff2;
    
    
    public static void main(String[] args) {
        // int a;
        // a=30;
        // int mrAymane = 7 ;
        // double mrSoufian = 2;
        // double result = mrAymane+ mrSoufian;
        // int result = (int) (mrAymane / mrSoufian);
        //     int x = 5;
            
        //     int y = x;
        //     x++;
        //    System.out.println(y);
        // Scanner input= new Scanner(System.in);
        // double number = input.nextDouble();
        // System.out.printf("Hi My name is %.2f",number);
        // input.close();
        //     String name = "Aymane";
        //     int age = 20;
        //     double salary = 5000.1;

        //    System.out.printf("My name is %s\nMy age is %d\nMy salary is %.2f",name,age,salary);
       
        // int myVar=9;
        // String result;
        // if(myVar <= 8){
        //     result = "ces correct";
        // }else{
        //     result = "ces pas correct";
        // }
        // System.out.println(result);
        // int myVar=1;
        // String result = myVar <= 8 ? "ces correct" : "ces pas correct";
        // System.out.println(result);
        // Scanner input = new Scanner(System.in);
        // char character = input.next().charAt(0);

        // switch (character) {
        //     case 'A':
        //         System.out.println("rah ki sawi A  M3ALAM");
        //         break;
        //     case 'B':
        //     System.out.println("rah ki sawi B  M3ALAM");
        //     break;
        //     case 'C':
        //     System.out.println("rah ki sawi C  M3ALAM");
        //     break;
        //     case 'D':
        //     System.out.println("rah ki sawi D  M3ALAM");
        //     break;
        //     default:
        //         System.out.println("rah ki sawi LKHWA  M3ALAM");
        //         break;
        // }
        //  Scanner input = new Scanner(System.in);
        //  int number = input.nextInt();
        // while(number < 100){
        //     System.out.printf("My number %d\n",number);
        //     number++;
        // }
        // do{
        //     System.out.printf("My number %d\n",number);
        //     number++;
        // }while(number <= 100);
        // for(int i=1 ; i<=number ; i++){
        //     System.out.printf("My number %d\n",i);
        // }
        // input.close();
        // for (int i = 1; i <=3; i++) {
        //     System.out.println("Jadwal Darb "+i);
        //     for (int j = 0; j <= 10; j++) {
        //         System.out.println(i+"x"+j+"="+i*j);
        //     }
        // }
        //  String st = "Bate5a is aymane";
        // System.out.println("index of t"+ st.indexOf("t"));
        // System.out.println("index of a"+ st.lastIndexOf("a"));
        // System.out.println("index of a"+ st.indexOf("a"));
        // System.out.println(st.substring(3,8));
        // String [] word = st.split(" ");
        // System.out.println(word.length);
        //    char [] mychar = st.toCharArray();
        //    for (char ch : mychar) {
        //     System.out.println(ch);
        //    }
        // String st = "Bate5a";
        // System.out.println(st.toLowerCase ());
        // StringBuilder st = new StringBuilder("Bate5a");
        // System.out.println(st.reverse());
        String [] names = {"Bate5a","zoro","fatakat"};
        int[] myarrays2 = {55,44,33};
        int[] myarray = new int[3];
        myarray[0]= 55;
        myarray[1]= 44;
        myarray[2]= 33;
        
        System.out.println(Arrays.equals(myarray,myarrays2 ));
    }
}
 