package Array;

public class Lexicographical {
    public static void main(String[] args) {
        for (int i=1; i<=9;i++){
            create(i,114);
        }
    }
    public static void create(int n, int given_n){
        if(n>given_n)return;
        System.out.println(n+" ");
        n*=10;
        if(n>given_n)return;
        for(int i=0;i<=9; i++){
            create(n+i, given_n);
        }
    }
    
}
