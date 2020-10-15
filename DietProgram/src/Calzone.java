package dietprogram;

public class Calzone extends Pizza{
	private final boolean sauseInside;
	
	private Calzone(Builder builder) {
		super(builder);
		sauseInside = builder.sauseInside;
	}
	
	public static class Builder extends Pizza.Builder<Builder>{
		private boolean sauseInside = false;
		
		public Builder sauseInside() {
			
			sauseInside = true;
			return this;
			
		}
		@Override public Calzone build() {return new Calzone(this);}
		
		@Override protected Builder self() {return this;}
	}
	
}
