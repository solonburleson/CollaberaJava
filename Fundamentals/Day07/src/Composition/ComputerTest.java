package Composition;

public class ComputerTest {

	public static void main(String[] args) {
		Computer computer = new Computer(new Processor("Intel i3"), new Memory("Kingston","1TB"));
		computer.setSoundCard(new SoundCard("Generic Sound Card"));
		System.out.println(computer);
	}

}
