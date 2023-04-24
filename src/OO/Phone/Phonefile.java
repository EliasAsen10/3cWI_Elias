package OO.Phone;

public class Phonefile {
    private int size;
    private String name;
    private String extension;

    public Phonefile(int size, String name, String extension) {
        this.size = size;
        this.name = name;
        this.extension = extension;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getInfo(){
        return this.name + ":" + this.extension + ":" + this.size;
    }

}
