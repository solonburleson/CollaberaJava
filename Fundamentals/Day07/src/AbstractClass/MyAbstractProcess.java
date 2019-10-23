package AbstractClass;

public abstract class MyAbstractProcess {
	public void process() {
		stepBefore();
		action();
		stepAfter();
	}
	
	public void stepBefore() {
		//implementation directly in abstract superclass
	}
	
	public abstract void action(); //implemented by subclass
	
	public void stepAfter() {
		//implementation directly in abstract superclass
	}
}
