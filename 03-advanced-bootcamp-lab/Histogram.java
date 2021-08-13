import java.util.Scanner;

public class Histogram
{   
    public static void main(String[] args){
    Scanner s = new Scanner(System.in); 
    System.out.println("Enter the Length of the Array: ");
    int n = s.nextInt();
    int[] a = new int[n];
    System.out.println("Enter the Elements of the Array: ");
    for(int i = 0; i < n; i++){ 
        a[i] = s.nextInt();
    }

    int[] hist = new int[10];
    for(int i = 0; i < 10; i++){
        hist[i] = 0;
    }

    for(int i = 0; i < n; i++){
        hist[a[i]]++;
    }

    for(int i = 0; i < 10; i++){
        System.out.println(i + " - " + hist[i]);
    }
    s.close();
}   
}
