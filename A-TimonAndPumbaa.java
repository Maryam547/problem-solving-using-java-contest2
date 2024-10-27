import java.util.Scanner;
public class TimonAndPumbaa {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        long A = myObj.nextLong();
        long B = myObj.nextLong();
        long res = A-B;
        if(res>=0){
            System.out.println(res);
        }else{
            System.out.println(0);
        }
    }
}
