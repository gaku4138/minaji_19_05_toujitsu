public class ForPractice06 {
    public static void main(String[] args) {

//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        for (int i = 1; i <= 30; i++){
            if (i % 3 == 0){
                System.out.println(i + "！");
            }else if(i == 13){
                System.out.println(i + "！");
            }else if(i == 23){
                System.out.println(i + "！");
            }
            System.out.println(i);
        }
    }
}
