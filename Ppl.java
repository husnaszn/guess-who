import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Ppl {

    private String name, imageName, happy, friendless, hairColor, uniform, glasses, location, hairLength;
    public Ppl(){
        name = "name";
        imageName = "name.png";
        happy= "yes";
        friendless="yes";
        hairColor="brown";
        uniform="yes";
        glasses="no";
        location="no";
        hairLength="short";
    }

    public Ppl(String n, String iN, String hap, String f, String hC, String uni, String g, String lo, String hL){
        name =n;
        imageName = iN;
        happy= hap;
        friendless=f;
        hairColor=hC;
        uniform=uni;
        glasses=g;
        location=lo;
        hairLength=hL;
        // 9 things
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getHappy() {
        return happy;
    }

    public void setHappy(String happy) {
        this.happy = happy;
    }

    public String getFriendless() {
        return friendless;
    }

    public void setFriendless(String friendless) {
        this.friendless = friendless;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getUniform() {
        return uniform;
    }

    public void setUniform(String uniform) {
        this.uniform = uniform;
    }

    public String getGlasses() {
        return glasses;
    }

    public void setGlasses(String glasses) {
        this.glasses = glasses;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getHairLength() {
        return hairLength;
    }


    public void setHairLength(String hairLength) {
        this.hairLength = hairLength;
    }

    public String toString(){
            return name + " info:\n" + imageName+ "\n"  + happy+ "\n"  + friendless+ "\n"  + hairColor+ "\n"  + uniform+ "\n"  + glasses+ "\n"  + location+ "\n"  + hairLength+ "\n" ;
        
    }

    public void drawPic(Graphics g2d){
        g2d.drawImage(new ImageIcon(imageName).getImage(), 0, 0, 100,100, null);
    }
}
