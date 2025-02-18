package DailyCoding.LeetCode;

public class _2698_Find_the_Punishment_Number_of_an_Integer {
    public static void main(String[] args) {
        System.out.println(punishmentNumber(10));

    }
    static public int punishmentNumber(int n) {
        int sum = 0, mul = 0;
        for(int i =1;i<=n;i++){
            mul = i*i;
            if(i == String.valueOf(mul).chars().map(Character::getNumericValue).sum()){
                sum += mul;
                System.out.println(mul);
            }
        }
        return sum;

    }
}
