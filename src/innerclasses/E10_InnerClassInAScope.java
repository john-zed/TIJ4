package innerclasses;

/**
 * Author   : Victor Chong
 * Date     : 2019/1/10 15:25
 * Brief    : 在某个方法的作用域内定义一个内部类
 */
public class E10_InnerClassInAScope {

    public void contents(boolean b){
        if(b){
            class PContents implements Contents{

                private int i = 11;

                @Override
                public int value() {
                    return i;
                }
            }
            System.out.println(new PContents().value());;
        }
    }

    public static void main(String[] args) {
        new E10_InnerClassInAScope().contents(true);
    }
}