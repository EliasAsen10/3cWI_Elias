package OO.Phone;

import java.util.List;

public class SDCard {

    private List <Phonefile>phonefile;
    private int capacity;

    public SDCard(int capacity) {

        this.capacity = capacity;
    }

    public List<Phonefile> getPhonefile() {
        return phonefile;
    }

    public void setPhonefile(List<Phonefile> phonefile) {
        this.phonefile = phonefile;
    }

    public void addPhonefile(Phonefile phonefile){
        this.phonefile.add(phonefile);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void scanFile(){
        System.out.println("Phonefile");
    }
    public void getAllFiles(){
        System.out.println("List Phonefiles");
    }

    public List<Phonefile> getFiles(){
        return phonefile;
    }
    public void saveFile(Phonefile phonefile){
        this.phonefile.add(phonefile);
    }

    public int getFreeSpace(){
        int size = 0;
        for (Phonefile phonefile : phonefile) {
            size+= phonefile.getSize();
        }
        return capacity- size;
    }
}
