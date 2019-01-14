package innerclasses;

/**
 * Author   : Victor Chong
 * Date     : 2019/1/14 17:48
 * Brief    : 使用匿名内部类重写Factories类
 */

interface Service {
    void method1();

    void method2();
}

interface ServiceFactory {
    Service getService();
}

class Implementation1 implements Service {

    //构造器为private
    private Implementation1() {
    }

    @Override
    public void method1() {
        System.out.println("Implementation1.method1");
    }

    @Override
    public void method2() {
        System.out.println("Implementation1.method2");
    }

    //这里使用匿名内部类来返回工厂的实例,不再创建工厂的实现类
    //由于你只需要单一的工厂对象，因此这里把它创建为一个static域
    public static ServiceFactory factory = new ServiceFactory() {
        @Override
        public Service getService() {
            return new Implementation1();
        }
    };
}

class Implementation2 implements Service {

    private Implementation2() {
    }

    @Override
    public void method1() {
        System.out.println("Implementation2.method1");
    }

    @Override
    public void method2() {
        System.out.println("Implementation2.method2");
    }

    public static ServiceFactory factory = new ServiceFactory() {
        @Override
        public Service getService() {
            return new Implementation2();
        }
    };
}

public class Factories {

    public static void serviceConsumer(ServiceFactory factory) {
        Service s = factory.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(Implementation1.factory);
        serviceConsumer(Implementation2.factory);
    }
}