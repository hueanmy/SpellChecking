/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Rule;

public class Rule8_9 extends Rule {

	String consonants = "qrtpsdđghklxcvbnm";

	String[] consonantCouple = {"tr", "th", "ph", "gh", "kh", "ch", "nh", "ng"};

	private int count(String x) {
		int count = 0;
		for (int i = 0; i < x.length(); i++) {
			if (consonants.contains(x.charAt(i) + "")) {
				count++;
			}
		}
		return count;
	}

	@Override
	public boolean isValid(String x) {
		if (count(x) < 2) {
			return true;
		} else {
			for (int i = 0; i < x.length() - 1; i++) {
				if (consonants.contains(x.charAt(i) + "")) {
					String a = x.charAt(i) + "";
					if (consonants.contains(x.charAt(i + 1) + "")) {
						String b = x.charAt(i + 1) + "";
						String s = a + b;
						for (int j = 0; j < consonantCouple.length; j++) {
							if (s.equalsIgnoreCase(consonantCouple[j])) {
								return true;
							}
						}
					}
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String showError() {
		return ("Rule8_9:\t Nếu một từ có 2 phụ âm cạnh nhau thì các phụ âm đó phải là: tr, th, ph, gh, kh, ch, nh, ng");
	}

}
