package H4;

import java.awt.*;
import java.applet.*;

public class opdracht_1 extends Applet {

    public void init(){
    }

    public void paint(Graphics g) {
        g.drawPolygon(new int[]{100, 200, 300}, new int[] {200, 20, 200}, 3);
    }
}
