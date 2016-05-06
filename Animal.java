import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Animal {
	protected LocalDate dateOfBirth;
	protected int length;
	protected int weight;
	protected String name;

	Animal(String name, int length, int weight) {
		this.length = length;
		this.weight = weight;
		this.name = name;
		dateOfBirth = LocalDate.now(); // would set date of birth to when object is instantiated
	}

	public long computeAge() {
		return ChronoUnit.YEARS.between(dateOfBirth, LocalDate.now());
	}
}