import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.TextCharacter;

import java.util.List;
public class Wall extends Element {
public Wall(int x, int y){
    super(x,y);
}
public void draw(TextGraphics graphics){
    TextCharacter wallCharacter = new TextCharacter('#', TextColor.ANSI.BLACK, TextColor.Factory.fromString("#336699"));
    graphics.setCharacter(getPosition().getX(), getPosition().getY(), wallCharacter);
}

}

