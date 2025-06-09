public class DSA {
    public static void main(String[] args){
      OneToOne(10);

    }
    public static void OneToOne(int n){
        if(n==1){
            System.out.print(n + ",");
        }else{
            System.out.print(n + ",");
            OneToOne(n-1);
        }
    }
}
