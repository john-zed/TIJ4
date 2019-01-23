package innerclasses;

/**
 * Author   : Victor Chong
 * Date     : 2019/1/21 15:05
 * Brief    : 接口内部的类,接口中的任何类都自动是public和static的，因此接口内部的类自动是嵌套类
 */
public interface ClassInInterface {

    void howdy();

    class Test implements ClassInInterface{
        @Override
        public void howdy() {
            System.out.println("Howdy!");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }
    }
}
