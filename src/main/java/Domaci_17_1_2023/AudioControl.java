package Domaci_17_1_2023;

public class AudioControl extends Control{

    private boolean pojacaj;

    public boolean isPojacaj() {
        return pojacaj;
    }

    public void setPojacaj(boolean pojacaj) {
        this.pojacaj = pojacaj;
    }

    public AudioControl(boolean pojacaj) {
        this.pojacaj = pojacaj;
    }

    @Override
    public double izvrsiAkciju() {
        return 0;
    }

    @Override
    public double izvrsiAkciju(VideoPlayer videoPlayer) {
      double jacina = videoPlayer.getJacina();
      if (isPojacaj()) {
          jacina = jacina + 1;
          if(jacina>100) {
              jacina = 100;
          }else {
              jacina = jacina - 1;
              if(jacina<0) {
                  jacina =0;
              }
          }
      }
      videoPlayer.setJacina(jacina);
      return jacina;
    }
}
