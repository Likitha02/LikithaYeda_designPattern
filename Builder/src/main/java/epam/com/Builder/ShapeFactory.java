package epam.com.Builder;
public class ShapeFactory extends AbstractFactory 
{
	public Rectangle getShape(String shapeType){    
	      if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle();         
	      }
	      return null;
	   }
	}

