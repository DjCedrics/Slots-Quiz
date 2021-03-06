import java.sql.SQLException;
/**
 * 
 * 
 * AldeKetQ
 * @author Firat Sivrikaya
 * @date 28/04/2015
 * 
 * This is the database class which gets questions
 * from subject "Aldehydes Ketones".
 * 
 * Upper and lower bounds for this subject are
 * defined as constants.
 * 
 * The questions from Aldehydes Ketones are written
 * by Gokce Ozyurt.
 * 
 *
 */

public class AldeKetQ extends Question{
	// constants
	final int UPPER_BOUND = 80;
	final int LOWER_BOUND = 61;
	// constructors
	public AldeKetQ()
	{
		super();
		
		
	}
	// methods
	public Question askQuestion() throws SQLException
	{
		return nextQuestion();
	}

}
