import java.util.function.Predicate;

public class IntegerPredicates {
           
	public static Predicate<Integer> IntegerPredicate = 
			      new Predicate<Integer> () {
		public boolean test(Integer i1) {
			return i1>0;
		}
	};
}
