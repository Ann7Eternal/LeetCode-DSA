// Last updated: 2/14/2026, 1:40:49 PM
class Solution {
    public int buyChoco(int[] prices, int money) {

        int minPrice1 = Integer.MAX_VALUE;
        int minPrice2 = Integer.MAX_VALUE;

        for (int price : prices) {
            if (price < minPrice1) {
                minPrice2 = minPrice1;
                minPrice1 = price;
            } else if (price < minPrice2) {
                minPrice2 = price;
            }
        }

        int leftoverMoney = money - (minPrice1 + minPrice2);
        return leftoverMoney >= 0 ? leftoverMoney : money;

    

    }
}