package id.ac.polinema.recyclerview_tugas1_2.models;

public class RaketModels {
    public String merk;
    public String frame;
    public String color;
    public int image;

    public RaketModels(String merk, String frame, String color, int image) {
        this.merk = merk;
        this.frame = frame;
        this.color = color;
        this.image = image;
    }
    public String getMerk() {
        return merk;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public String getFrame() {
        return frame;
    }
    public void setFrame(String frame) {
        this.frame = frame;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
