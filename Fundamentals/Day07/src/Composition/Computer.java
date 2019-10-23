package Composition;

public class Computer {
	private Memory memory;
	private Processor processor;
	private SoundCard soundcard;
	
	public Computer(Processor processor, Memory memory) {
		this.processor = processor;
		this.memory = memory;
	}

	public SoundCard getSoundCard() {
		return soundcard;
	}

	public void setSoundCard(SoundCard soundcard) {
		this.soundcard = soundcard;
	}

	public Memory getMemory() {
		return memory;
	}

	public void setMemory(Memory memory) {
		this.memory = memory;
	}

	public Processor getProcessor() {
		return processor;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}
	
	@Override
	public String toString() {
		return "Computer{processor=" + processor + ",memory=" + memory + ",soundcard=" + soundcard +"}";
	}
}
