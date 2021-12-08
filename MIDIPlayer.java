public class MIDIPlayer implements ConcertMediaPlayer {

    @Override
    public void playMIDI(String fileName) {
        System.out.println("Playing MIDI.   Nama file : "+fileName);
    }

    @Override
    public void playAAC(String fileName) {
        // biarkan kosong
    }
}
