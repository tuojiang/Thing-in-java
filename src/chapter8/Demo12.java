package chapter8;

/**
 * @author boboan
 * @version V1.0
 * @description 在存在继承类中，顺序为：初始化父类静态变量->父类static初始化块
 * ->子类static成员变量->子类static初始化块->初始化父类成员变量，执行父类普通初始化块
 * ->父类构造方法->初始化子类成员变量，执行子类普通初始化块->子类构造方法
 * @date 2017-11-15-上午9:55
 **/
public class Demo12 {
    public static void main(String[] args) {
        Hamster12 hamster12 = new Hamster12();
        hamster12.dark();
    }
}
class Rondent12{
    {
        System.out.println("static 1"+",a="+a);
    }
    public static int a = 5;
    String aa="i'm aa";
    public Rondent12(){
        System.out.println("Rondent12");
        dark();
        dadong();
    }
    public void dark(){
        System.out.println("Rondent dark" + a );
    }
    public void dadong(){
        System.out.println("Rondent dadong"+aa);
    }
}
class Mouse12 extends Rondent12{
    {
        System.out.println("static 2"+",b="+b);
    }
    public static int b = 6;
    String bb="i'm bb";
    public Mouse12(){
        System.out.println("Mouse12");
        dark();
        dadong();
        System.out.println(bb);
    }
    @Override
    public void dark() {
        System.out.println("Mouse dark" + b);

    }

    @Override
    public void dadong() {
        System.out.println("Mouse dadong"+bb);
    }
}
class Gerbil12 extends Mouse12{
    {
        System.out.println("static 3"+",c="+c);
    }
    public static int c = 7;
    String cc="i'm cc";
    public Gerbil12(){
        System.out.println("Gerbil12");
        dark();
        dadong();
    }
    @Override
    public void dark() {
        System.out.println("Gerbil dark" + c);
    }

    @Override
    public void dadong() {
        System.out.println("Gerbil dadong"+cc);

    }
}
class Hamster12 extends Gerbil12{
    {
        System.out.println("static 4"+",d="+d);
    }
    public static int d = 8;
    String dd="i'm dd";

    public Hamster12(){
        System.out.println("Hamster12");
    }
    @Override
    public void dark() {
        System.out.println("Hamster dark" + d);
    }

    @Override
    public void dadong() {
        System.out.println("Hamster dadong"+dd);
    }
}