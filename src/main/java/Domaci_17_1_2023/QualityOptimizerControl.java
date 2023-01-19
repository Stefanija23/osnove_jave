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
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        double kvalitetVidea =  brzinaInterneta * 10.1;
        if (this.brzinaInterneta * 10.1 <= 144){
            kvalitetVidea = 144;
        }else if (this.brzinaInterneta*10.1 <=240 ){
           kvalitetVidea =240;
        }else if (this.brzinaInterneta*10.1 <=340 ){
            kvalitetVidea =340;
        }else if (this.brzinaInterneta*10.1 <=480 ){
            kvalitetVidea=480;
        }else if (this.brzinaInterneta*10.1 <=720 ){
            kvalitetVidea=720;
        }else {
            kvalitetVidea=1080;}
        videoPlayer.setKvalitet((int) kvalitetVidea);

    }
}
