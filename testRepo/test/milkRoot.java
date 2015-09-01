package test;

import java.util.ArrayList;
import java.util.List;

public class milkRoot {

	// 全ルートの配列を作成
	static List<String> rootList = new ArrayList<String>();
	
	public static void main(String[] args) {

		combinationRoot(2, 6);
		//permutation("abcd","");
	}

	private static void combinationRoot(int min, int max) {
		// minからmaxまでの配列を作成
		List<Integer> ilist = new ArrayList<Integer>();
		for (int i = min; i <= max; i++) {
			ilist.add(i);
		}
		
		// 全パターンの再起処理呼び出し
		combinationRootMain(ilist, "");
	}

	private static void combinationRootMain(List<Integer> ilist, String s) {
		
		if (ilist.size() == 1) {
			s = s + ilist.get(0);
			rootList.add(s);
			System.out.println(s);
		}
		for (int i = 0; i < ilist.size(); i++) {
			List<Integer> tmp = new ArrayList<Integer>(ilist);
			tmp.remove(i);
			combinationRootMain(tmp, s + ilist.get(i) + ",");
		}
	}

	public static void permutation(String q, String ans){
		// Base Case
		if(q.length() <= 1) {
			System.out.println(ans + q);
		}
		// General Case
		else {
			for (int i = 0; i < q.length(); i++) {
				permutation(q.substring(0, i) + q.substring(i + 1),
						ans + q.charAt(i));
			}
		}
	}

	public void outPrint() {
		System.out.println("test");
	}
}
