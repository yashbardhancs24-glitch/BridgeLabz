import java.util.Scanner;

public class PowerWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(), p=sc.nextInt();
        int result=1, i=0;
        while(i<p) {
            result*=n;
            i++;
        }
        System.out.println(result);
    }
}
