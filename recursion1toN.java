public class recursion1toN{
    static void fun(int n){
        if (n==0)
        return;
        fun (n-1);
        System.out.println(n + " ");
        

    }
    public static void main (String []args ){
        int n = 4;
        fun(n);
    }
}