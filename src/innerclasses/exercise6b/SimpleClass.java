package innerclasses.exercise6b;

import innerclasses.exercise6.SimpleInterface;

/**
 * Author   : Victor Chong
 * Date     : 2018/11/8 15:33
 * Brief    :
 */
public class SimpleClass{

   protected class Inner implements SimpleInterface{

       //须强制构造器为public 否则构造器为protected 只能在Inner及子类及同包类中使用
       //要么就在外部类中定义一个public方法用户返回内部类对象

       public Inner(){}

       @Override
       public void f() {

       }
   }
}
