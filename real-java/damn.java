import java.util.Scanner;
import java.util.spi.*;
public class damn {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter the overall marks ");

        int mark=myObj.nextInt();
        if (mark<30){
        System.out.println("shame on you nigga you fail");
        }
       else if(mark<=30 && mark<40){
        System.out.println(" you got D+");
       }
        else if(mark<50){
        System.out.println(" you got C");
        }
        else if(mark<60){
        System.out.println(" damn  bro you got C+");
        }
        else if(mark<70){
        System.out.println(" you got B");
        }
        else if(mark<80){
        System.out.println(" you got B+");
        }
        else if(mark<90){
        System.out.println(" you gotA");
        }
        else{
        System.out.println(" you got A+");
        }
    }
    
}
