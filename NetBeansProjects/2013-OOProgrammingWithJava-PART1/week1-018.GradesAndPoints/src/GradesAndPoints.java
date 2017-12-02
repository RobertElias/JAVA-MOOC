
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type the points [0-60]: ");
        int a = Integer.parseInt(reader.nextLine());
        
        System.out.println("Grade: ");
        
        if(a>0 && a<30)
            System.out.println("failed");
        if(a>=30 && a<35)
            System.out.println("1");
        if(a>=35 && a<40)
            System.out.println("2");
        if(a>=40 && a<45)
            System.out.println("3");
        if(a>=45 && a<50)
            System.out.println("4");
        if(a>=50 && a<60)
            System.out.println("5");        

    }
}
