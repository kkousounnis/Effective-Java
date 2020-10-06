//Builder pattern
public class NutritionFacts {
	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbonhydrate;
	
	public static class Builder{
		//required parameters
		private final int servingSize;
		private final int servings;
		
		//Optional parameters - initialized to default values
		private int calories = 0;
		private int fat = 0;
		private int sodium = 0;
		private int carbonhydrate = 0;
		
		public Builder (int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}
		
		public Builder calories(int val) {
			calories = val;
			return this;
		}
		
		public Builder fat(int val) {
			fat = val; 
			return this;
		}
		
		public Builder sodium(int val) {
			sodium = val;
			return this;
		}
		public Builder carbonhydrate(int val) {
			carbonhydrate = val;
			return this;
		}
		private NutritionFacts build() {
			return new NutritionFacts(this);
		}		
	}
	private NutritionFacts (Builder builder) {
		servingSize = builder.servingSize;
		servings = builder.servings;
		calories = builder.calories;
		fat = builder.fat;
		sodium = builder.sodium;
		carbonhydrate = builder.carbonhydrate;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8).calories(100).sodium(35).carbonhydrate(27).build();
		
	}
	

}
