public class AACPlayer implements ConcertMediaPlayer{

    @Override
    public void playMIDI(String fileName) {
        // biarkan kosong
    }

    @Override
    public void playAAC(String fileName) {
        System.out.println("Playing AAC.    Nama file : "+fileName);
    }
}
