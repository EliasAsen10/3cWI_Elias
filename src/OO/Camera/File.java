package OO.Camera;

public class File {

    private String name;
    private int date;
    private int sizeInMb;



    public File(String name,  int sizeInMb) {
        this.name = name;
        this.date = 17;
        this.sizeInMb = sizeInMb;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getSizeInMb() {
        return sizeInMb;
    }

    public void setSizeInMb(int sizeInMb) {
        this.sizeInMb = sizeInMb;
    }






}
