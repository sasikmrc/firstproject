package org.lang;

public class StateDetails {
	private void southIndia() {
		System.out.println("South India");

	}
private void northIndia() {
	System.out.println("North India");
	
}
public static void main(String[] args) {
	
		StateDetails a = new StateDetails ();
			a.southIndia();
			a.northIndia();
			LanguageInfo b = new LanguageInfo ();
			b.englishLanguage();
			b.tamilLanguage();
			b.hindiLanguage();
		}
}
