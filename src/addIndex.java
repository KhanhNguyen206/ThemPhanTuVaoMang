import java.util.Scanner;

public class addIndex {
    public static void main(String[] args) {
        int[] arr=new int[10];
        arr[0]=0;
        arr[1]=1;
        arr[2]=2;
        arr[3]=3;
        arr[4]=4;
        arr[5]=5;
        arr[6]=6;

        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int ind=scanner.nextInt();

        for (int i=9; i>ind; i--){
            arr[i]=arr[i-1];
        };
        arr[ind]= x;

        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
