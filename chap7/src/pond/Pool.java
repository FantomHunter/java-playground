package pond;

import pond.shore.Bird;
import pond.shore.BirdWatcher;
import pond.goose.Gosling;
import pond.goose.Goose;

/**
    @author codehunter
    command:
    javac -d classes pond/duck/*.java pond/goose/*.java pond/inland/*.java pond/shore/*.java pond/swan/*.java pond/Main.java
    jar cfe pond.jar pond.Pool pond/duck/*.class pond/goose/*.class pond/inland/*.class pond/shore/*.class pond/swan/*.class pond/*.class
*/
public class Pool{
    public static void main(String... args){
        Bird bird = new Bird();
        Gosling gosling = new Gosling();
        BirdWatcher birdWatcher = new BirdWatcher();
        Goose goose = new Goose();
        goose.eat();
        

        // bird.floatInWater(); //cannot acccess to protected method
        gosling.swim();
        birdWatcher.watchBird();
    }
}