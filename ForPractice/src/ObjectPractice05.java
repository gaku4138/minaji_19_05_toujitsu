public class ObjectPractice05 {
    public static void main(String[] args) {
        Person morita = new Person("森田","奈良");
        System.out.println(morita.getSelfIntroduction());
        System.out.println(new Person("木村","埼玉").getSelfIntroduction());
        System.out.println(new Person("高山","東京").getSelfIntroduction());
        System.out.println(new Person("茂木","沖縄").getSelfIntroduction());

    }

}
