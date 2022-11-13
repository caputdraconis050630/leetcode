class Solution {
    public int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE; // 이전까지 가장 싸게 샀을 때의 가격입니다.
        int len = prices.length; // 가격 배열의 길이입니다.
        int profit = 0; // 지금까지 발생한 가장 큰 이익을 저장하는 변수입니다.
        for (int i=0; i<len; i++) {
            if (lsf > prices[i]) {
                // 현재까지 나온 가장 적은 금액을 저장하는 프로세스
                lsf = prices[i];
            }
            profit = Math.max(profit, prices[i] - lsf);
        }
        return profit;
    }
}