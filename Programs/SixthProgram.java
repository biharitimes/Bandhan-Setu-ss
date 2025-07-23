import java.util.Scanner;

public class SixthProgram{
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        System.out.println("Enter Number :");
        int numb=scanner.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(numb+"x"+i+"="+(numb*i));
        }
        scanner.close();
    }
}
