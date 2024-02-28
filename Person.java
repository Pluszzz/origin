//import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private boolean gender;
    private int id;

    public Person() {
        System.out.println("This is constructor");
        System.out.println(name + ", " + age + ", " + gender + ", " + id);
    }

    public String toString() {
        return "Person [name=" + this.name + ",age=" + this.age + ",gender=" + this.gender + ",id=" + id + "]";
    }

    public Person(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // public static void main(String args[]) {
    // Scanner sc = new Scanner(System.in);
    // int n;
    // n = sc.nextInt();
    // Person[] p = new Person[n];
    // for (int i = 0; i < n; i++) {
    // String name = sc.next();
    // int age = sc.nextInt();
    // boolean gender = sc.nextBoolean();
    // p[i] = new Person(name, age, gender);
    // }
    // for (int i = 0; i < n; i++) {
    // System.out.println(p[n - i - 1].toString());
    // }
    // Person p3 = new Person();
    // System.out.println(p3.toString());

    // }

}
