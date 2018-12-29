package innerclasses.exercise6b;

import innerclasses.exercise6.SimpleInterface;

/**
 * Author   : Victor Chong
 * Date     : 2018/11/8 15:33
 * Brief    :
 */
public class SimpleClass{

   protected class Inner implements SimpleInterface{

       //须强制构造器为public 否则构造器为protected 只能在Inner的子类中使用

       public Inner(){}

       @Override
       public void f() {

       }
   }
}
