package interfaces;

/**
 * Author   : Victor Chong
 * Date     : 2018/11/7 11:27
 * Brief    :
 */
interface Cycle {
    int wheels();
}

interface CycleFactory {
    Cycle getCycle();
}

class Unicycle implements Cycle {

    @Override
    public int wheels() {
        return 1;
    }
}

class UnicycleFactory implements CycleFactory {

    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}

class Bicycle implements Cycle {

    @Override
    public int wheels() {
        return 2;
    }
}

class BicycleFactory implements CycleFactory {

    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
}

class Tricycle implements Cycle {

    @Override
    public int wheels() {
        return 3;
    }
}

class TricycleFactory implements CycleFactory {

    @Override
    public Cycle getCycle() {
        return new Tricycle();
    }
}

public class E18_Cycles {

    private static void ride(CycleFactory factory) {
        Cycle cycle = factory.getCycle();
        System.out.println("Num of wheels:" + cycle.wheels());
    }

    public static void main(String[] args) {
        ride(new UnicycleFactory());
        ride(new BicycleFactory());
        ride(new TricycleFactory());
    }
}

/**
 * This solution has several more classes than Exercise 5 in the Polymorphism
 chapter. To anticipate every possibility, programmers often use this interface +
 factory form to create classes, because it allows them to add new classes
 anywhere. However, complexity and necessary maintenance make this a wise
 choice only when you know you’ll be adding new classes.
 */



