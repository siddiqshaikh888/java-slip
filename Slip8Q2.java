import javax.swing.*;
import java.util.*;
class Slip8Q2 extends JFrame{
public Slip8Q2(){
setTitle("Menu Bar");
setSize(800,800);
JMenuBar MenuBar = new JMenuBar();
JMenu m1 = new JMenu("File");
JMenu m2 = new JMenu("Edit");
JMenu m3 = new JMenu("View");
JMenuItem sub1 = new JMenuItem("Option 1");
MenuBar.add(m1);
MenuBar.add(m2);
MenuBar.add(m3);
m1.add(sub1);
setJMenuBar(MenuBar);
setVisible(true);
}
public static void main(String[] args){
new Slip8Q2();
}
}