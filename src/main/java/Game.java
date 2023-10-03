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


public class Game {
private Screen screen;
private int x=10;
private int y=10;
private void draw() throws IOException{
    screen.clear();
    screen.setCharacter(x, y, TextCharacter.fromCharacter('X')[0]);
    screen.refresh();
}

public void run() throws IOException{
    while(true) {
        draw();
        KeyStroke key = screen.readInput();
        processKey(key);
        if(key.getKeyType() == KeyType.EOF) break;
    }
}
private void processKey(KeyStroke key){
    System.out.println(key);
    if(key.getKeyType() == KeyType.ArrowUp) y -= 1;
    if(key.getKeyType() == KeyType.ArrowDown) y += 1;
    if(key.getKeyType() == KeyType.ArrowRight) x += 1;
    if(key.getKeyType() == KeyType.ArrowLeft) x -= 1;
    if (key.getKeyType() == KeyType.Character && key.getCharacter() == 'q'){ try{
        screen.close();
    }
    catch (IOException e) {e.printStackTrace();}
    }

}
public Game() throws IOException{
    try {
        Terminal terminal = new DefaultTerminalFactory().createTerminal();
        screen = new TerminalScreen(terminal);
        screen.setCursorPosition(null);
        screen.startScreen();
        screen.doResizeIfNecessary();
        screen.readInput();
        TerminalSize terminalSize = new TerminalSize(40, 20);
        DefaultTerminalFactory terminalFactory = new DefaultTerminalFactory().setInitialTerminalSize(terminalSize);
    } catch (IOException e) {e.printStackTrace();}
}

}
