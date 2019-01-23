package innerclasses;

/**
 * Author   : Victor Chong
 * Date     : 2019/1/21 15:14
 * Brief    : 将测试代码放入嵌套类中
 */
public class TestBed {
    public void f(){
        System.out.println("f()");
    }

    public static class Tester{
        public static void main(String[] args) {
            TestBed t = new TestBed();
            t.f();
        }
    }
}