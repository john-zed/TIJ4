package interfaces.filters;

/**
 * 波形过滤器，用于处理波形
 */
public class Filter {
    public String name() {
        return getClass().getSimpleName();
    }

    public Waveform process(Waveform input) {
        return input;
    }
}

/*
这里对比Processor,它们具有相同的接口元素，都有name()和process()方法。
然而Filter并没有继承Processor，因为Filter的创建者并不知道Filter要用做Processor。
因此不能将Filter用于Apply.process()方法，它接受的是一个Processor参数。
这里主要因为Apply.process()方法和Processor类的耦合过紧。
且注意Filter的process的输入和输出是Waveform类型。
解决办法：将Processor变成接口。*/
