package model;

/**
 *
 * @author Usuario
 */
public class Whatsit {
    private int size;
    private String Name;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Whatsit(int size, String Name) {
        this.size = size;
        this.Name = Name;
    }
    
    
}
