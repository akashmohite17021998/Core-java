package DurgaSirJava8;

@FunctionalInterface
public interface ParentWithInheritance3 {

	public abstract void m1();
	
}

@FunctionalInterface
interface ChildWithInheritance3 extends ParentWithInheritance3{
	public abstract void m2();
}