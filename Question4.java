package Assignment1;

public class Question4 {
    public static void main(String[] args) {
        int n=20;
		int i;
        int j;
		for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if (i-j>=n/2 || i+j>=n-1+n/2)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();

        }
    }
    
}
