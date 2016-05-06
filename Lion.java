public class Lion extends Animal implements Cat, Roaring {
	private double maneSize;

	Lion(String name, int length, int weight, double maneSize) {
		super(name, length, weight);
		this.maneSize = maneSize;
	}

	@Override
	public String getCatKind() {
		return getClass().getSimpleName();
	}

	@Override
	public String getFurDescription() {
		return "gold-brown";
	}
}