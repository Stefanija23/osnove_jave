package Domaci_17_1_2023;

public class TimeControl extends Control{
    private boolean premotaj;
    public TimeControl(boolean premotaj) {
        this.premotaj= premotaj;
    }

    public boolean isPremotaj() {
        return premotaj;
    }

    public void setPremotaj(boolean premotaj) {
        this.premotaj = premotaj;
    }


    @Override
    public double izvrsiAkciju() {
        return 0;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        double trenutnoVreme = videoPlayer.getTrenutnoVreme();
        if (isPremotaj()) {
            trenutnoVreme = trenutnoVreme + 15;
            if (trenutnoVreme > videoPlayer.getDuzinaVidea()) {
                trenutnoVreme = videoPlayer.getDuzinaVidea();
            }
            else {
               trenutnoVreme = trenutnoVreme - 15;
               if(trenutnoVreme < 0) {
                   trenutnoVreme=0;
               }
            }
        }
        videoPlayer.setTrenutnoVreme(trenutnoVreme);
    }
}
