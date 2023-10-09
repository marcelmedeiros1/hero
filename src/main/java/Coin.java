import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;

public class Coin extends Element {
    public Coin(int x, int y){super(x,y);}
    public void draw(TextGraphics graphics){
        TextCharacter wallCharacter = new TextCharacter('C', TextColor.ANSI.YELLOW_BRIGHT, TextColor.Factory.fromString("#336699"));
        graphics.setCharacter(getPosition().getX(), getPosition().getY(), wallCharacter);
    }
}
