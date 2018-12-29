package interfaces.filters;

//低通波滤器
public class LowPass extends Filter {
    //截止点
    double cutoff;

    public LowPass(double cutoff) {
        this.cutoff = cutoff;
    }

    public Waveform process(Waveform input) {
        return input;   // 伪处理
    }
}
