package proba;

public class factorial {

    public static void main(String[] args) {
        System.out.println(factorialCalculation(2));
        System.out.println(factorialCalculation(2));
    }

    public static int factorialCalculation(int n){
        if(n==1){
            return 1;
        }
        int result =  n*factorialCalculation(n-1);
        return result;
    }
}
