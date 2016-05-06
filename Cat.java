interface Cat {
	String getCatKind();
	String getFurDescription();

	default void walk() {
		System.out.println(getCatKind() + " walks");
	}

	default void sleep() {
		System.out.println(getCatKind() + " sleeps");
	}
}