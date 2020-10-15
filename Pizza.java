package dietprogram;
import java.util.EnumSet;
import java.util.Set;
import java.util.Objects;

public abstract class Pizza {
	public enum Topping {HAM, MUSHROOM, ONION, PEPPER, SAUSAGE}
	final Set<Topping> toppings;
	
	abstract static class Builder<T extends Builder<T>>{
		EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
		public T addToping(Topping topping) {
			toppings.add(Objects.requireNonNull(topping));
			return self();
		}
		abstract Pizza build();
		protected abstract T self();
	}
	
	Pizza(Builder<?> builder){
		toppings = builder.toppings.clone();
	}
	
	
}


