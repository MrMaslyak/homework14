public class Main {
    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(fact1(5));


    }
    public static int fact(int num){
        int sum = 1 ;
        for (int i = 1; i <= num ; i++) {
           sum *= i;
        }
       return sum;

    }
    public static int fact1(int num){
return num==1?1:num*fact1(num-1);

    }
}