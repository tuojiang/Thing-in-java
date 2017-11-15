package chapter8;

/**
 *  i am first
    i am second shoot
 *  第二个类向上转型的时候,没有覆盖的方法继续调用父类的实现，覆盖的则调用新的实现。
 */
public class Demo10 {
    public static void main(String[] args) {
      First first = new Second();
      first.first();
        System.out.println(first.name);
    }
}
class First{
    public String name="first";
    public void first(){
        System.out.println("i am first");
        shoot();
    }
    public void shoot(){
        System.out.println("i am first shoot");
    }
}
class Second extends First{
    public String name="seconde";
    @Override
    public void shoot() {
        System.out.println("i am second shoot");
    }

    @Override
    public void first() {
        System.out.println("i am second shoot");

    }
}