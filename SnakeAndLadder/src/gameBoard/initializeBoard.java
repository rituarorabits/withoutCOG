package gameBoard;

public class initializeBoard {

	boolean checkValidity(Snake s)
	{
		if(s.startPosition>s.endPosition)
		{return true;}
		else
		{return false;}
	}
	
	void initSnakes(Snake s)
	{
		Snake a= new Snake(12,23,2);
	}
	
}
