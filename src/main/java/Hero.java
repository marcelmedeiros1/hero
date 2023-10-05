import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.screen.Screen;



public class Hero {
    private Position position = new Position(20,10);
    public Hero(Position position){
        this.position.setX(position.getX());
        this.position.setY(position.getY());
    }
public void draw(Screen screen){
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
    public Position moveUp(){ return new Position(position.getX(), position.getY()-1); }
    public Position moveDown(){ return new Position(position.getX(), position.getY()+1); }
    public Position moveLeft(){ return new Position(position.getX()-1, position.getY()); }
    public Position moveRight(){ return new Position(position.getX()+1, position.getY()); }

    public void setPosition(Position position) {
        this.position = position;
    }
}