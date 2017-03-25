package gameBoard;

public class initializeBoard {

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
