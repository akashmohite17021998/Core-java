package DurgaSirJava8;

@FunctionalInterface
public interface ParentWithInheritance1 {

	public abstract void m1();
}

@FunctionalInterface
interface ChildWithInheritance1 extends ParentWithInheritance1{
	
}