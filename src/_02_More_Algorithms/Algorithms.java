package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		int cracked = 0;
		boolean found = false;
		while(found == false) {
			if(eggs.get(cracked).equals("cracked")) {
				found = true;
			} else {
				cracked++;
			}
		}
	return cracked;
	}

	public static Object countPearls(List<Boolean> oysters) {
		// TODO Auto-generated method stub
		int pearls = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if(oysters.get(i) == true)
				pearls++;
		}
		return pearls;
	}

	public static double findTallest(List<Double> peeps) {
		// TODO Auto-generated method stub
		double th = 0.1;
		for (int i = 0; i < peeps.size(); i++) {
			if(peeps.get(i) > th) {
				th = peeps.get(i);
			}
		}
		return th;
	}

	public static Object findLongestWord(List<String> words) {
		// TODO Auto-generated method stub
		String ls = "";
		int wl = 0; 
		for (int i = 0; i < words.size(); i++) {
			if(words.get(i).length() > wl) {
				wl = words.get(i).length();
				ls = words.get(i);
			}
		}
		return ls;
	}

	public static Object sortDNA(List<String> unsortedSequences) {
		// TODO Auto-generated method stub
		for (int i = 0; i < unsortedSequences.size(); i++) {
			for (int j = 0; j < unsortedSequences.size() - 1; j++) {
				if(unsortedSequences.get(j).length() > unsortedSequences.get(j+1).length()) {
					String tempString = unsortedSequences.get(j);
					unsortedSequences.set(j, unsortedSequences.get(j+1));
					unsortedSequences.set(j+1, tempString);
				}
			}
		}
		return unsortedSequences;
	}

	public static List<String> sortScores(List<Double> results) {
		// TODO Auto-generated method stub
		return null;
	}

	public static List<String> sortWords(List<String> words) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Object containsSOS(List<String> message1) {
		// TODO Auto-generated method stub
		return null;
	}
}
