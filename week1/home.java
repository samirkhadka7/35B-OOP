package week1;

public class home {
    public static void printNum(int n) {
        if (n==0){
            return;
        }
        System.out.println(n);
        System.out.println(n-1);
    
        
    }
    public static void main(String[] args) {
        int n=5;
        printNum(n);
        
    }
}
