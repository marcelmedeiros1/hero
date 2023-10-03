import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;


public class Game {
private Screen screen;
private void draw(){
    try{screen.clear();
    screen.setCharacter(10, 10, TextCharacter.fromCharacter('X')
            [0]);
    screen.refresh();
} catch (IOException e) {e.printStackTrace();}
}

public void run(){
    draw();
}
public Game() {
    try {
        Terminal terminal = new DefaultTerminalFactory().createTerminal();
        Screen screen = new TerminalScreen(terminal);
        screen.setCursorPosition(null);
        screen.startScreen();
        screen.doResizeIfNecessary();
    } catch (IOException e) {e.printStackTrace();}
}
}
