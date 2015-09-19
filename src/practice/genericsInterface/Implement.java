package practice.genericsInterface;



public class Implement {

	public static void main(String[] args) {
		MusicalInstrument Instr = new MusicalInstrument();
		
		Singer singer = new Singer();
     Chorus<MusicalInstrument,Singer> chorus = new Chorus<MusicalInstrument,Singer>();
	
	chorus.makeChorus(Instr,singer);
		
	}

}
