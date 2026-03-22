
// Visual Idea (for n = 5):
// Row 1 → *
// Row 2 → * *
// Row 3 → * * *
// Row 4 → * * * *
// Row 5 → * * * * *

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows");
        int r = sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                   System.out.print("*");
            }
            System.out.println();
        }
    }
}
