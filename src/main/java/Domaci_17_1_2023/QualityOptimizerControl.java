package Domaci_17_1_2023;

public class QualityOptimizerControl extends Control{

    private double brzinaInterneta;

    public double getBrzinaInterneta() {
        return brzinaInterneta;
    }

    public void setBrzinaInterneta(double brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }

    public QualityOptimizerControl(double brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }

    @Override
    public double izvrsiAkciju() {
        return 0;
    }

    @Override
    public double izvrsiAkciju(VideoPlayer videoPlayer) {
        return brzinaInterneta * 10.1;

    }
}
