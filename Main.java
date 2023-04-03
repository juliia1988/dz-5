public class Main {

    public static void main (String[] arg) {

        People people1 = new People();
        People people2 = new People();

        people1.age = 10;
        System.out.println(people1.age);
        System.out.println(String.format("Returned value is %d", people2.age));
    }
}
