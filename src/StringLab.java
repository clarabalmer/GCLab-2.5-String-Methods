public class StringLab {

	public static void main(String[] args) {
		
		System.out.println(StringMethods.capitalize("")); //expect ""
		System.out.println(StringMethods.capitalize("d")); //expect D
		System.out.println(StringMethods.capitalize("thiS SEntEnCE.")); //expect This sentence.		
		System.out.println(StringMethods.wheresWaldo("My friend Waldo is lost.")); //expect 10
		System.out.println(StringMethods.firstThingsFirst("aardvark", "Bombastic")); //expect aardvark Bombastic
		System.out.println(StringMethods.firstThingsFirst("Xenomorphic", "Holographic")); //expect Holographic Xenomorphic
		System.out.println(StringMethods.reverse("Here's a sentence forwards.")); //expect .sdrawrof ecnetnes a s'ereH
		StringMethods.soLong("longish", "short"); //expect longish
		StringMethods.soLong("smol", "much longer"); //expect much longer
		StringMethods.soLong("five", "four"); //expect five four
		System.out.println(StringMethods.afterMath("I love math so much:)")); //expect math so much:)
		System.out.println(StringMethods.afterMath("This sentence lacks a certain word...")); //expect dud
		StringMethods.letterize("Java"); //expect:
//		J
//		a
//		v
//		a
		System.out.println(StringMethods.camelCase("This SentEnce wOUld Make a terrible varIABle name."));
		//expect thisSentenceWouldMakeATerribleVariableName.
	}
}
