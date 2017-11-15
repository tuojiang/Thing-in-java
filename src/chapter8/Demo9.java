package chapter8;

/**
 * Mouse dark
   Mouse dadong
   Gerbil dark
   Gerbil dadong
   Hamster dark
   Hamster dadong
 */
public class Demo9 {
    public static void togrher(Rondent[] rondents){
        for (Rondent i:rondents) {
            i.dark();
            i.dadong();
        }
    }
    public static void main(String[] args) {
        Rondent[] rondents={new Mouse(),new Gerbil(),new Hamster()};
        togrher(rondents);
    }
}
class Rondent{
    public void dark(){
        System.out.println("Rondent dark");
    }
    public void dadong(){
        System.out.println("Rondent dadong");
    }
}
class Mouse extends Rondent{

    @Override
    public void dark() {
        System.out.println("Mouse dark");

    }

    @Override
    public void dadong() {
        System.out.println("Mouse dadong");
    }
}
class Gerbil extends Rondent{
    @Override
    public void dark() {
        System.out.println("Gerbil dark");
    }

    @Override
    public void dadong() {
        System.out.println("Gerbil dadong");

    }
}
class Hamster extends Rondent{
    @Override
    public void dark() {
        System.out.println("Hamster dark");
    }

    @Override
    public void dadong() {
        System.out.println("Hamster dadong");
    }
}
