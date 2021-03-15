package fr.campusacademy.oopcourse.tetrisproject.game;

import java.util.Random;

import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class SimpleSlickGame extends BasicGame


{
	
	int squarePosition = 0;
	
	
    public SimpleSlickGame(String gamename)
    {
        super(gamename);
    }

    @Override
    public void init(GameContainer gc) throws SlickException {}

    @Override
    public void update(GameContainer gc, int i) throws SlickException {
    	if (squarePosition < 430) {
    	            squarePosition ++;
    	        } else {
    	            squarePosition = 430;
    	        }
    	Input input = gc.getInput();
    	if (input.isKeyDown(Input.KEY_LEFT)) {
    		
    	}
    }

    public void shapeSelection(GameContainer gc, Graphics g) {
    	int min = 1;
        int max = 6;
        Random random = new Random();
        int numOfShape = random.nextInt(max - min) + min;
        if (numOfShape == 1) {
        	newShape1(gc, g);
        }
        else if (numOfShape == 2) {
        	newShape2(gc, g);
        }
        else if (numOfShape == 3) {
        	newShape3(gc, g);
        }
        else if (numOfShape == 4) {
        	newShape4(gc, g);
        }
        else if (numOfShape == 5) {
        	newShape5(gc, g);
        }
        else if (numOfShape == 6) {
        	newShape6(gc, g);
        }
        
        
    }
    
    


    public void newShape1(GameContainer gc, Graphics g) {
    	 // Baton
        g.setColor(new Color(0, 255, 255));
        g.fillRect(53, squarePosition, 50, 50);
        g.fillRect(106, squarePosition, 50, 50);
        g.fillRect(159, squarePosition, 50, 50);
        g.fillRect(212, squarePosition, 50, 50);
       
    }
    
    public void newShape2(GameContainer gc, Graphics g) {
        //L gauche
        g.setColor(new Color(0, 0, 128));
        g.fillRect(265, squarePosition, 50, 50);
        g.fillRect(265, squarePosition, 50, 50);
        g.fillRect(318, squarePosition, 50, 50);
        g.fillRect(371, squarePosition, 50, 50);
        
    }
    
	public void newShape3(GameContainer gc, Graphics g) {
		  //L droite
        g.setColor(new Color(255, 165, 0));
        g.fillRect(213, squarePosition, 50, 50);
        g.fillRect(266, squarePosition, 50, 50);
        g.fillRect(319, squarePosition, 50, 50);
        g.fillRect(319, squarePosition, 50, 50);
	    }
	
	public void newShape4(GameContainer gc, Graphics g) {
		//carré
        g.setColor(new Color(255, 255, 0));
        g.fillRect(50, squarePosition, 50, 50);
        g.fillRect(50, squarePosition, 50, 50);
        g.fillRect(103, squarePosition, 50, 50);
        g.fillRect(103, squarePosition, 50, 50);
	}
	
	public void newShape5(GameContainer gc, Graphics g) {
		// Z inversé
        g.setColor(new Color(52, 201, 36));
        g.fillRect(50, squarePosition, 50, 50);
        g.fillRect(103, squarePosition, 50, 50);
        g.fillRect(103, squarePosition, 50, 50);
        g.fillRect(156, squarePosition, 50, 50);
	    }
	
	public void newShape6(GameContainer gc, Graphics g) {
		//T inversé
        g.setColor(new Color(127, 0, 255));
        g.fillRect(300, squarePosition, 50, 50);
        g.fillRect(353, squarePosition, 50, 50);
        g.fillRect(406, squarePosition, 50, 50);
        g.fillRect(353, squarePosition, 50, 50);
	}
	
    @Override
    public void render(GameContainer gc, Graphics g) throws SlickException
    {
    	shapeSelection(gc, g);
        
//        g.setColor(new Color(255, 255, 255));
//        g.fillRect(0, 0, 500, 480);
//      
//        //bandeau droite
//        g.setColor(new Color(100, 100, 100));
//        g.fillRect(500, 0, 140, 480);
        g.drawString("Score :", 500, 100);
      
    }


}