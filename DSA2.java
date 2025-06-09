public class DSA2 {
    public static void main(String[] args){
        System.out.println(FibonacciNumbers(6));
    }
    public static int FibonacciNumbers(int n){
        if(n==0|| n==1){
            return n;
        }else{
           return FibonacciNumbers(n-1) + FibonacciNumbers(n-2);
        }
    }
}
