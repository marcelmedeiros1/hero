import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.TextCharacter;

import java.util.List;
public class Wall {
private int x;
private int y;
public Wall(int x, int y){
    this.x = x;
    this.y = y;
}
public void draw(TextGraphics graphics){
    TextCharacter wallCharacter = new TextCharacter('#', TextColor.ANSI.WHITE, TextColor.ANSI.BLACK);
    graphics.setCharacter(x, y, wallCharacter);


}

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

