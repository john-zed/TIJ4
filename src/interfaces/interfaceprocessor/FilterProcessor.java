package interfaces.interfaceprocessor;


/*与第一种方式（StringProcessor）对比着看。但是，你经常碰到的情况是你无法修改你想要使用的类，比如类库中的类。
就像在电子滤波器的例子中，类库是被发现而非被创建的。
在这种情况下，可以使用适配器设计模式。
适配器中的代码将接受你所拥有的接口，并产生你所需要的接口。*/

import interfaces.filters.*;

/**
 * 该适配器接受你所拥有的接口Filter,然后生成具有你所需要的Processor接口的对象。
 */
class FilterAdapter implements Processor {

    Filter filter;

    public FilterAdapter(Filter filter) {
        this.filter = filter;
    }

    @Override
    public String name() {
        return filter.name();
    }

    @Override
    public Waveform process(Object input) {
        return filter.process((Waveform) input);
    }
}

public class FilterProcessor {

    public static void main(String[] args) {
        Waveform w = new Waveform();
        Apply.process(new FilterAdapter(new LowPass(1.0)), w);
        Apply.process(new FilterAdapter(new HighPass(2.0)), w);
        Apply.process(new FilterAdapter(new BandPass(3.0, 4.0)), w);
    }
}
