package interfaces;

public class Main {
    public static void main(String[] args) {
        ReproductorDeVideo repVideo = new ReproductorDeVideo();
        repVideo.reproducir();
        repVideo.adelantar(15);
        repVideo.rebobinar(10);
        repVideo.pausar();

        ReproductorDeMp3 repAudio = new ReproductorDeMp3();
        repAudio.reproducir();
        repAudio.adelantar(15);
        repAudio.rebobinar(10);
        repAudio.pausar();

    }
}
