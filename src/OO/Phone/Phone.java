package OO.Phone;

public class Phone {

    private Camera camera;
    private String color;

    public Phone(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void takePicture(){
        System.out.println("cheese");
    }
    public void makeCall(){
        System.out.println("ring ring ring");
    }
    public void printAllFiles(){

    }
    public void getFreeSpace(){

    }
}
