public class CoinCase {
    public int fiveHund;
    public int hund;
    public int fifty;
    public int ten;
    public int five;
    public int one;

    public void AddCoins(int type,int count){
        if(type == 500){
            fiveHund += count;
        }else if(type == 100){
            hund += count;
        }else if(type == 50){
            fifty += count;
        }else if(type == 10){
            ten += count;
        }else if(type == 5){
            five += count;
        }else if(type == 1){
            one += count;
        }
    }

    public int GetCount(int type){
        if(type == 500){
            return fiveHund;
        }else if(type == 100){
            return hund;
        }else if(type == 50){
            return fifty;
        }else if(type == 10){
            return ten;
        }else if(type == 5){
            return five;
        }else if(type == 1){
            return one;
        }else{
            return 0;
        }
    }

    public int GetAmount(){
        return 500 * fiveHund + 100 * hund + 50 * fifty + 10 * ten + 5 * five + 1 * one;
    }
}
