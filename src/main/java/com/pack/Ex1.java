package com.pack;

public class Ex1 {

	public static void main(String[] args) {
		String word = "RAMYE";
		char[] wordArr = word.toCharArray();
		char[] vowels = { 'A', 'E', 'I', 'O', 'U', 'A' };
		char[] opt = new char[word.length()];
		int count = 0;
		for (int i = 0; i <= word.length() - 1; i++) {

			for (int j = 0; j <= vowels.length - 1; j++) {
				if (wordArr[i] == vowels[j]) {
					count = 1;
					wordArr[i] = vowels[j + 1];
					System.out.println();
					break;
				}
			}
			if(count==0) {
				char c= (char) (wordArr[i] - 1);
				wordArr[i] = c;
				opt[i] = wordArr[i];
			}
			if (count == 1) {
				opt[i] = wordArr[i];
				count = 0;
			}
		}
		System.out.println(String.valueOf(opt));
	}

}
