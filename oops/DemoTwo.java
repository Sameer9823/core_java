


class Computer{
    public void playMusic() {
        System.out.println("Playing music");
    }

    public String getSongs(int count) {
        if(count > 0) {
            return "Song1, Song2, Song3";
        }
        return "No songs available";
    }
}


public class DemoTwo {
    public static void main(String[] args) {

        Computer obj = new Computer();
        obj.playMusic();
        System.out.println("Songs available: " + obj.getSongs(1));
        
    }
}
