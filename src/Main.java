import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n");
        n= scanner.nextInt();
        for (int i=1;i<=n;i++){
            if (n%i==0){
                System.out.println("nhung so uoc cua n la:"+i);
            }
        }
    }
}