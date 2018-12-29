package interfaces.filters;

/**
 * 波形,它们看起来也适用于Apply.process()方法
 */
public class Waveform {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return "Wavefrom " + id;
    }
}
