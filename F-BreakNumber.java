import java.util.Scanner;
public class BreakNumber {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        long n = myObj.nextLong();
        long maxDivisions = 0;
        for(int i=1;i<=n;i++){
            long nums = myObj.nextLong();
            long count=0;
                while(nums%2==0){
                    nums/=2;
                    count++;
            }
            maxDivisions=Math.max(count,maxDivisions);
        }
        System.out.println(maxDivisions);
    }
}
