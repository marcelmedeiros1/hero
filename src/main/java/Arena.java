import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;

public class Arena {
    private int width;
    private int height;
    private Hero hero;
    public Arena(int width, int height){
        this.width=width;
        this.height=height;
        this.hero = new Hero(new Position(10,10));
    }
    public void processKey(KeyStroke key){
        System.out.println(key);
        if(key.getKeyType() == KeyType.ArrowUp) moveHero(hero.moveUp());
        if(key.getKeyType() == KeyType.ArrowDown) moveHero(hero.moveDown());
        if(key.getKeyType() == KeyType.ArrowRight) moveHero(hero.moveRight());
        if(key.getKeyType() == KeyType.ArrowLeft) moveHero(hero.moveLeft());
    }
    public void draw(Screen screen){
    hero.draw(screen);
    }
    public void moveHero(Position position){
        if(canHeroMove(position)){
            hero.setPosition(position);
        }
    }
    public boolean canHeroMove(Position position){
        if((position.getX() <= width && position.getX()>=0) && (position.getY() <= height && position.getY()>=0)) return true;
        return false;
    }
}
