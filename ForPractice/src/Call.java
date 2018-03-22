public class Call {
    public static void main(String[] args) {
        CoinCase coincase = new CoinCase();
        coincase.AddCoins(100,5);
        coincase.AddCoins(500,3);
        coincase.AddCoins(10,10);
        coincase.AddCoins(50,8);
        coincase.AddCoins(5,6);
        coincase.AddCoins(1,20);
        System.out.println(coincase.GetCount(500));
        System.out.println(coincase.GetCount(100));
        System.out.println(coincase.GetCount(50));
        System.out.println(coincase.GetCount(10));
        System.out.println(coincase.GetCount(5));
        System.out.println(coincase.GetCount(1));
        System.out.println(coincase.GetAmount());
    }

}
