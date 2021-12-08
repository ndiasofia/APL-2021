import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        System.out.println("");
        System.out.println("                                        Night Of The Proms");
        System.out.println("Night of the Proms adalah serangkaian konser yang diadakan setiap tahun di Belgia, Belanda, Jerman dan Luksemburg. ");
        System.out.println("Secara teratur ada juga pertunjukan di Perancis, Spanyol, Austria, Swiss, Polandia, Denmark, Amerika Serikat dan Swedia.\n");
        
        boolean check = true;
        try (Scanner in = new Scanner (System.in)) {
            String nama, noid ;
            int fitur;
            System.out.print("Masukan Nama Pengakses: ");
            nama = in.nextLine();
            System.out.print("Masukan No.Panitia : ");
            noid = in.nextLine();
            System.out.println("\nHaii "+nama+" your id is "+noid+", 'Welcome to this site:)'\n");
            
            while(check){
                System.out.print("Pilihan : \n 1. Lihat daftar penyanyi yang tampil hari ini \n 2. Daftar audio yang dipakai untuk penyanyi yang akan tampil \n 3. Quit \n\n Masukan pilihan :");

                fitur = in.nextInt();
                if(fitur == 1){
                    //Melihat jadwal penampilan hari ini
                    Performer performer = new Performer();
                    performer.showPerformance(new D1$430());
                    performer.showPerformance(new D1$445());
                    performer.showPerformance(new D1$500());
                    performer.showPerformance(new D1$515());
                }
                else if(fitur == 2){
                    //Menguji atau memasukkan file yang ingin diputar pada saat perform
                    System.out.print("Ingin memasukkan audio? (y/n) : ");
                    in.nextLine();
                    String cekyes = in.nextLine();
                    if (cekyes.equals("y")) {
                        String format, lagu;
                        System.out.print("Masukan format audio: ");
                        format = in.nextLine();
                        System.out.print("Masukan nama file: ");
                        lagu = in.nextLine();
                        AudioPlayer on = new AudioPlayer();
                        System.out.println("");
                        on.play(format, lagu);
                    }
                    else {
                        System.out.print("");
                        }
                    //Audio yang telah dimainkan
                    System.out.println("\nDaftar audio yang telah dimainkan");
                    AudioPlayer on = new AudioPlayer();
                    on.play("mp3", "REX ORANGE COUNTY 'Pluto Projector'.mp3");
                    on.play("aac", "THE 1975 'I Couldn't More In Love'.aac");
                    on.play("midi", "OLIVIA RODRIGO 'Happier'.midi");
                    on.play("vcl", "DRUV 'Double Take'.vcl");
                    System.out.println("");
                }
                else{
                    check = false;
                }
            }
        }
    }
}
