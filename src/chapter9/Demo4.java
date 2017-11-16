package chapter9;

/**
 * @author boboan
 * @version V1.0
 * @description
 * @date 2017-11-16-下午2:48
 **/
public class Demo4 {
    public static void change(A a){
        ((B)a).prin();
    }
    public static void main(String[] args) {
        A b =new B();
        change(b);
    }
}
abstract class A{}
class B extends A{
    public  void prin(){
        System.out.println("B");

    }

}