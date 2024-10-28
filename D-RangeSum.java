import java.util.Scanner;
public class RangeSum {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        for(int i=1;i<=n;i++){
            long L = myObj.nextLong();
            long R = myObj.nextLong();
            long sum=(R*(R+1)/2)-(L*(L-1)/2);
            System.out.println(sum);
        }
    }
}

//(time limit exceed)
import java.util.Scanner;
public class RangeSum {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        long n = myObj.nextLong();
        for(long i=1;i<=n;i++){
            long L = myObj.nextLong();
            long R = myObj.nextLong();
            long sum=0;
            for(long j=L;j<=R;j++){
                sum+=j;
            }
            System.out.println(sum);
        }
    }
}
