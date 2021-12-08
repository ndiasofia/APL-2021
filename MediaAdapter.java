public class MediaAdapter implements MediaPlayer{

    ConcertMediaPlayer concertMusicPlayer;

    /*
        Disini kita akan membuat file audio yang bisa di putar untuk konser
        adalah file audio dengan format midi, dan aac selain mp3 yang merupakan format file defaultnya
    */
    
    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("MIDI")){
            concertMusicPlayer = new MIDIPlayer();
        }else if(audioType.equalsIgnoreCase("AAC")){
            concertMusicPlayer = new AACPlayer();
        }
    }
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("MIDI")){
            concertMusicPlayer.playMIDI(fileName);
        }else if(audioType.equalsIgnoreCase("AAC")){
            concertMusicPlayer.playAAC(fileName);
        }
    }
    
}
