package proba;

public class SumForDifferentQuantityNumbers {

    public static void main(String[] args) {
        sum(1,2);
        sum(1,2,3);
        sum(1,2,3,4);
    }

    public static void sum(int ...nums){
        int result = 0;
        for(int i: nums){
            result+=i;
        }
        System.out.println(result);
    }
}
