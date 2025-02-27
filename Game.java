import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.event.*;
public class Game extends JPanel implements Runnable, KeyListener, MouseListener,
MouseMotionListener{
private BufferedImage back;
private int key, x, y;
private ArrayList <Ppl> ppls;

public Game() {
new Thread(this).start();
this.addKeyListener(this);
this.addMouseListener(this);
this.addMouseMotionListener(this);
key =-1;
x=0;
y=0;
ppls = setPpl();
for(Ppl p: ppls){
    System.out.println(p);
}
}

public ArrayList <Ppl> setPpl(){
    ArrayList<Ppl> temp = new ArrayList<Ppl>();
    File file = new File("guess_who_3rd.txt");
   try{
    Scanner scan = new Scanner(file);
    System.out.println("file found");
    while (scan.hasNextLine()) {
        // System.out.println(scan.nextLine());
        temp.add(new Ppl(scan.nextLine(),scan.nextLine(),scan.nextLine(),scan.nextLine(),scan.nextLine(),scan.nextLine(),scan.nextLine(),scan.nextLine(),scan.nextLine()));
    }


   } catch (FileNotFoundException e) {
    e.printStackTrace();
   }
   System.out.println("set ppls "+ temp.size());

    return temp;
}

public void run()
{
try
{
while(true)
{
Thread.currentThread().sleep(5);
repaint();
}
}
catch(Exception e)
{
}
}
public void paint(Graphics g){
Graphics2D twoDgraph = (Graphics2D) g;
if( back ==null)
back=(BufferedImage)( (createImage(getWidth(), getHeight())));
Graphics g2d = back.createGraphics();
g2d.clearRect(0,0,getSize().width, getSize().height);
g2d.setFont( new Font("Broadway", Font.BOLD, 50));
g2d.drawString("Hello!" , x, y);
twoDgraph.drawImage(back, null, 0, 0);
}
//DO NOT DELETE
@Override
public void keyTyped(KeyEvent e) {
// TODO Auto-generated method stub
}
//DO NOT DELETE
@Override
public void keyPressed(KeyEvent e) {
// TODO Auto-generated method stub
key= e.getKeyCode();
System.out.println(key);
}
//DO NOT DELETE
@Override
public void keyReleased(KeyEvent e) {
}
@Override
public void mouseDragged(MouseEvent arg0) {
// TODO Auto-generated method stub
}
@Override
public void mouseMoved(MouseEvent arg0) {
// TODO Auto-generated method stub
x=arg0.getX();
y=arg0.getY();
}
@Override
public void mouseClicked(MouseEvent arg0) {
// TODO Auto-generated method stub
}
@Override
public void mouseEntered(MouseEvent arg0) {
// TODO Auto-generated method stub
System.out.println("entered");
}
@Override
public void mouseExited(MouseEvent arg0) {
// TODO Auto-generated method stub
System.out.println("exited");
}
@Override
public void mousePressed(MouseEvent arg0) {
// TODO Auto-generated method stub
System.out.println("you clicked at"+ arg0.getY());
x=arg0.getX();
y=arg0.getY();
}
@Override
public void mouseReleased(MouseEvent arg0) {
// TODO Auto-generated method stub
}
}
