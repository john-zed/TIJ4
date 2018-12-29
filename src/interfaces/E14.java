package interfaces;

interface BaseInterface1{
    void f1();
    void f2();
}

interface BaseInterface2{
    void f3();
    void f4();
}

interface BaseInterface3{
    void f5();
    void f6();
}

interface NewInterface extends BaseInterface1, BaseInterface2, BaseInterface3{
    void f7();
}

abstract class BaseClass{
   abstract void f();
}

class NewClass extends BaseClass implements NewInterface{

    @Override
    public void f1() {

    }

    @Override
    public void f2() {

    }

    @Override
    public void f3() {

    }

    @Override
    public void f4() {

    }

    @Override
    public void f5() {

    }

    @Override
    public void f6() {

    }

    @Override
    public void f7() {

    }

    @Override
    void f() {

    }
}

public class E14 {

    static void u(BaseInterface1 a){
        a.f1();
        a.f2();
    }

    static void v(BaseInterface2 b){
        b.f3();
        b.f4();
    }

    static void w(BaseInterface3 c){
        c.f5();
        c.f6();
    }

    static void h(NewInterface d){
        d.f7();
    }

    public static void main(String[] args) {
        NewClass obj = new NewClass();
        u(obj);
        v(obj);
        w(obj);
        h(obj);
    }
}
