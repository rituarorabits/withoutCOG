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

	public boolean checkValidity(Ladder l)
	{
		if(l.startPosition<l.endPosition)
			return true;
		return false;
	}
	
	public void initLadders(Ladder l)
	{
		boolean isValid = checkValidity(l);
	}
	
}

