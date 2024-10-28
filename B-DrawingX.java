import java.util.Scanner;
public class DrawingX {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        int center = n/2;
        for(int i=0;i<n;i++){
            StringBuilder row = new StringBuilder();
            for(int j=0;j<n;j++){
                if(i==center&&j==center){
                    row.append("x");
                }else if(i==j){
                    row.append("\\");
                }else if(i+j==n-1){
                    row.append("/");
                }else{
                    row.append("*");
                }
            }
            System.out.println(row);
        }
    }
}
