public class AudioPlayer implements MediaPlayer {

    MediaPlayer mediaPlayer;
    
    @Override
    public void play(String audioType, String fileName) {
        //inbuilt support to play mp3 music files
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("playing MP3.    Nama file : "+fileName);
        }
        //mediaAdapter is providing support to play other file formats
        else if(audioType.equalsIgnoreCase("midi") || audioType.equalsIgnoreCase("aac")){
            MediaAdapter ma = new MediaAdapter(audioType);
            ma.play(audioType, fileName);
        }
        
        else{
            System.out.println("invalid media, format "+audioType+" is not support");
        }
    }
    
}
