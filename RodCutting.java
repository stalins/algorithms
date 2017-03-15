public class RodCutting {

    static int rodcutting(int price[], int mem[], int rodLength) {

        if (rodLength <= 0) 
            return 0;

        if (mem[rodLength-1] != -1) 
            return mem[rodLength-1];

        int maxValue = 0;

        for (int i = 0; i < rodLength; i++) {
            
            maxValue =  Math.max(maxValue, price[i] + rodcutting(price, mem, rodLength - i -1));
        }

        mem[rodLength-1] = maxValue;

        return maxValue;
    }

    public static void main(String args[]) {

        int price[] = {1,5,8, 9, 9, 11};
        int mem[] = {-1,-1,-1,-1,-1,-1};
        int maxProfit = rodcutting(price, mem, price.length);
        System.out.println(maxProfit);
    }
}