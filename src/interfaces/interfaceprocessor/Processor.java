package interfaces.interfaceprocessor;

//接口代替类
public interface Processor {
    String name();
    Object process(Object input);
}
