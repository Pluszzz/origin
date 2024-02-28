public class shape {
    public static double pie = 3.14;
    String shapetype = "noshapetype";

    public shape(String shapetype) {
        this.shapetype = shapetype;
        System.out.println(shapetype + "类方法开始执行");
    }

    public String toString() {
        return "形状：" + this.shapetype;
    }
}
