package interfaces;

/**
 * Author   : Victor Chong
 * Date     : 2018/11/7 10:15
 * Brief    : 工厂方法示例
 */

interface Service{
    void method1();
    void method2();
}

interface ServiceFactory{
    Service getService();
}

class Implementation1 implements Service{

    Implementation1(){}    //包访问

    @Override
    public void method1() {
        System.out.println("Implementation1 method1");
    }

    @Override
    public void method2() {
        System.out.println("Implementation1 method2");
    }
}

class Implementation1Factory implements ServiceFactory{

    @Override
    public Service getService() {
        return new Implementation1();
    }
}

class Implementation2 implements Service{

    Implementation2(){}     //包访问

    @Override
    public void method1() {
        System.out.println("Implementation2 method1");
    }

    @Override
    public void method2() {
        System.out.println("Implementation2 method2");
    }
}

class Implementation2Factory implements ServiceFactory{

    @Override
    public Service getService() {
        return new Implementation2();
    }
}

public class Factories {
    public static void serviceConsumer(ServiceFactory fact){
        Service s = fact.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(new Implementation1Factory());
        //实现完全是可互换的
        serviceConsumer(new Implementation2Factory());
    }
}
