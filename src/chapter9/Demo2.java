package chapter9;

/**
 * @author boboan
 * @version V1.0
 * @description 0,10 因为Java虚拟机在分配存储空间后清零对象的，在发生任何其他初始化之前为i生成默认值。代码在运行派生类初始化之前调用基类构造函数，所以
将i的零值看作初始输出。
 * @date 2017-11-16-下午2:38
 **/
public class Demo2 {
    public static void main(String[] args) {
        son s=new son();
        s.print();
    }
}
abstract class test{
    test(){
        print();
    }
    abstract void print();
}
class son extends test{
    int i=10;
    @Override
    void print() {
        System.out.println(i);
    }
}
