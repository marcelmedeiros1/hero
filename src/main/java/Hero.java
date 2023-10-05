import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import javax.swing.*;
import java.io.IOException;


public class Hero {
    private Position position;
    public Hero(Position position){
        this.position.setX(position.getX());
        this.position.setY(position.getY());
    }
public void draw(Screen screen) throws IOException{
     screen.setCharacter(position.getX(), position.getY(), TextCharacter.fromCharacter('H')[0]);
}
    public int getY() {
        return position.getY();
    }
    public void setY(int y) {position.setY(y);}
    public int getX() {return position.getX();}
    public void setX(int x) {
        position.setX(x);
    }
}
