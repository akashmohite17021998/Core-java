package DurgaSirJava8;

@FunctionalInterface
public interface ParentWithInheritance2 {

	public abstract void m1();

}

@FunctionalInterface
interface  ChildWithInheritance2 extends ParentWithInheritance2{
	
	public abstract void m1();
	
}