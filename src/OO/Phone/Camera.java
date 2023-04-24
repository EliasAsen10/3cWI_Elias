package OO.Phone;

public class Camera {

    private int fileNumber=0;


    public Phonefile takePicture(){
        Phonefile phonefile = new Phonefile(100,"pic","jpg" + fileNumber);
        fileNumber++;
        return phonefile;
    }
}
