public class Empolyee extends Role {
    public String id;
    public String indate;

    public Empolyee(String name, char sex, int age, String id, String indate) {
        super(name, sex, age);
        this.id = id;
        this.indate = indate;
    }
}
