package innerclasses;

/**
 * Author   : Victor Chong
 * Date     : 2018/11/7 15:24
 * Brief    : 如何在其他对象中创建内部类;要想直接创建内部类对象，必须先创建外部类对象。
 */
public class DotNew {
    public class Inner{}

    public static void main(String[] args) {
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
    }
}


