package innerclasses;

/**
 * Author   : Victor Chong
 * Date     : 2019/1/16 16:41
 * Brief    : 使用匿名内部类改写第9章练习18
 */
interface Cycle {
    int wheels();
}

interface CycleFactory {
    Cycle getCycle();
}

class Unicycle implements Cycle {

    private Unicycle(){}

    @Override
    public int wheels() {
        return 1;
    }

    public static CycleFactory factory= new CycleFactory() {
        @Override
        public Cycle getCycle() {
            return new Unicycle();
        }
    };
}

class Bicycle implements Cycle {

    private Bicycle(){}

    @Override
    public int wheels() {
        return 2;
    }

    public static CycleFactory factory = new CycleFactory() {
        @Override
        public Cycle getCycle() {
            return new Bicycle();
        }
    };
}

class Tricycle implements Cycle {

    private Tricycle(){}

    @Override
    public int wheels() {
        return 3;
    }

    public static CycleFactory factory = new CycleFactory() {
        @Override
        public Cycle getCycle() {
            return new Tricycle();
        }
    };
}

public class E16_Cycles {

    private static void ride(CycleFactory factory) {
        Cycle cycle = factory.getCycle();
        System.out.println("Num of wheels:" + cycle.wheels());
    }

    public static void main(String[] args) {
        ride(Unicycle.factory);
        ride(Bicycle.factory);
        ride(Tricycle.factory);
    }
}

/**
 * This solution has several more classes than Exercise 5 in the Polymorphism
 chapter. To anticipate every possibility, programmers often use this interface +
 factory form to create classes, because it allows them to add new classes
 anywhere. However, complexity and necessary maintenance make this a wise
 choice only when you know you’ll be adding new classes.
 */
