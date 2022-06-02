package DurgaSirJava8;

@FunctionalInterface
public interface ParentWithInheritance4 {

	public abstract void m1();
	
}

interface ChildWithInheritance4 extends ParentWithInheritance4{
	public abstract void m2();
}
