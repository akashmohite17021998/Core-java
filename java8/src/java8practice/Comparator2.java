package java8practice;

@FunctionalInterface
public interface Comparator2 extends Comparato {
	int comparein();

	/**
	 * Indicates whether some other object is &quot;equal to&quot; this comparator.
	 * This method must obey the general contract of {@link Object#equals(Object)}.
	 * Additionally, this method can return {@code true} <i>only</i> if the
	 * specified object is also a comparator and it imposes the same ordering as
	 * this comparator. Thus, {@code comp1.equals(comp2)} implies that
	 * {@code sgn(comp1.compare(o1,
	 * o2))==sgn(comp2.compare(o1, o2))} for every object reference {@code o1} and
	 * {@code o2}.
	 * <p>
	 *
	 * Note that it is <i>always</i> safe <i>not</i> to override
	 * {@code Object.equals(Object)}. However, overriding this method may, in some
	 * cases, improve performance by allowing programs to determine that two
	 * distinct comparators impose the same order.
	 *
	 * @param obj the reference object with which to compare.
	 * @return {@code true} only if the specified object is also a comparator and it
	 *         imposes the same ordering as this comparator.
	 * @see Object#equals(Object)
	 * @see Object#hashCode()
	 */
	boolean equals(Object obj);
	@Override
	int hashCode();
	@Override
	String toString();
	Object
}
