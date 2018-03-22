public class Person {
    public String name;
    public String from;

    public Person(String name,String from) {
        this.name = name;
        this.from = from;
    }

    public String getSelfIntroduction() {
        return "私の名前は" + name + "です。" + from + "出身です。";
    }
}