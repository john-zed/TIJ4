package innerclasses;

/**
 * Author   : Victor Chong
 * Date     : 2018/11/7 13:38
 * Brief    : 除了外部类的非静态方法（普通方法），外部类要想创建内部类的对象，必须指明其类型：OuterClass.InnerClass
 */
public class Parcel2 {
    class Contents{
        private int i = 11;
        public int value(){
            return i;
        }
    }

    class Destination{
        private String label;
        Destination(String whereTo){
            label = whereTo;
        }
        String readLabel(){
            return label;
        }
    }

    public Destination to(String s){
        return new Destination(s);
    }

    public Contents contents(){
        return new Contents();
    }

    public void ship(String dest){
        //Contents c = new Contents();    //不建议直接实例化
        Contents c = contents();
        //Destination d = new Destination();  //不建议直接实例化
        Destination d = to(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Parcel2 p = new Parcel2();
        p.ship("Tasmania");
        Parcel2 q = new Parcel2();
        //定义内部类实例的引用
        Contents c = q.contents();
        Destination d = q.to("Borneo");
    }
}
