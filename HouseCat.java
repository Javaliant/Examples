public class HouseCat extends Animal implements Cat, Purring, Meowing {
	private boolean hatesYou = true;

	HouseCat(String name, int length, int weight) {
		super(name, length, weight);
	}
	@Override
	public String getCatKind() {
		return "Domestic Cat";
	}

	@Override
	public String getFurDescription() {
		return "mixed brown and white";
	}
}