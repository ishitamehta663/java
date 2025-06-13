import java.util.Scanner;
public class bookbustiket {
    public static void main(String[] args) {
        String name;
        int n=5;
        int b=0;
        Scanner sc = new Scanner(System.in);
        while (n!=0) {
        System.out.print("\nHello,Plase enter your name:");
        name = sc.nextLine();
        sc.nextLine();
        System.out.println();
        System.out.println("Available seat are :"+n);
        System.out.println("Hello,\n"+name+" Welcome plase select the seat number");
        b = sc.nextInt();
        if(b<=n){
            System.out.println("Congratulation, Your seats are booked");
            n-=b;
            System.out.println("Available seats are :"+n);
        }
        else{
            System.out.println("Sorry, Seats are not available");
        }
    }
    sc.close();
    }
}