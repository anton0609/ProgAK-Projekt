
public class AbsentMindedTurtle extends RaceTurtle {
	private int absent;
	private int nbr;

	/**
	 * 
	 * @param w
	 * @param nbr
	 * @param absent
	 *            :Chans att glömma att gå i procent (tal mellan 0 och 100)
	 */

	public AbsentMindedTurtle(RaceWindow w, int nbr, int absent) {
		super(w, nbr);
		this.absent = absent;
		this.nbr = nbr;
	}

	public void raceStep() {
		if (rand.nextInt(100) + 1 > absent) {
			super.raceStep();

		}
	}
	
	public String toString(){
		return("Nummer " + nbr + " - AbsentMindedTurtle (" + absent + "% Frånvarande)" );
	}
}
