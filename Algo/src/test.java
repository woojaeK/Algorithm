import java.util.*;

class test {
	public static void main(String[] args) {
		String[] info = { "java backend junior pizza 150", "python frontend senior chicken 210",
				"python frontend senior chicken 150", "cpp backend senior pizza 260", "java backend junior chicken 80",
				"python backend senior chicken 50" };
		String[] query = { "java and backend and junior and pizza 100",
				"python and frontend and senior and chicken 200", "cpp and - and senior and pizza 250",
				"- and backend and senior and - 150", "- and - and - and chicken 100", "- and - and - and - 150" };

		int[] answer = new int[query.length];
		int[][] info2 = new int[info.length][5];
		int[][] query2 = new int[query.length][5];

		/*
		 * for(int i =0; i< info.length; i++ ){ String[] word = info[i].split(" ");
		 * if(word[0].equals("cpp")) info2[i][0] = 0; if(word[0].equals("java"))
		 * info2[i][0] = 1; if(word[0].equals("python")) info2[i][0] = 2;
		 * if(word[1].equals("backend")) info2[i][1]= 0; if(word[1].equals("frontend"))
		 * info2[i][1]= 1; if(word[2].equals("junior")) info2[i][2] = 0;
		 * if(word[2].equals("senior")) info2[i][2] = 1; if(word[3].equals("chicken"))
		 * info2[i][3] = 0; if(word[3].equals("pizza")) info2[i][3] = 1; info2[i][4] =
		 * Integer.parseInt(word[4]); } for(int i =0; i< query.length; i++ ){ query[i] =
		 * query[i].replace(" and",""); String[] word = query[i].split(" ");
		 * if(word[0].equals("cpp")) query2[i][0] = 0; if(word[0].equals("java"))
		 * query2[i][0] = 1; if(word[0].equals("python")) query2[i][0] = 2;
		 * if(word[0].equals("-")) query2[i][0] = 4; if(word[1].equals("backend"))
		 * query2[i][1]= 0; if(word[1].equals("frontend")) query2[i][1]= 1;
		 * if(word[1].equals("-")) query2[i][1]= 4; if(word[2].equals("junior"))
		 * query2[i][2] = 0; if(word[2].equals("senior")) query2[i][2] = 1;
		 * if(word[2].equals("-")) query2[i][2] = 4; if(word[3].equals("chicken"))
		 * query2[i][3] = 0; if(word[3].equals("pizza")) query2[i][3] = 1;
		 * if(word[3].equals("-")) query2[i][3] = 4; query2[i][4] =
		 * Integer.parseInt(word[4]); }
		 */
		/*
		 * for (int i = 0; i < answer.length; i++) { query[i] = query[i].replace(" and",
		 * ""); String[] word = query[i].split(" "); for (int j = 0; j < info.length;
		 * j++) { String[] word2 = info[j].split(" "); if (Integer.parseInt(word[4]) <=
		 * Integer.parseInt(word2[4])) { if (word[0].equals("-") ||
		 * word[0].equals(word2[0])) { if (word[1].equals("-") ||
		 * word[1].equals(word2[1])) { if (word[2].equals("-") ||
		 * word[2].equals(word2[2])) { if (word[3].equals("-") ||
		 * word[3].equals(word2[3])) { answer[i]++; } else continue; } else continue; }
		 * else continue; } else continue; } else continue; } }
		 */
		
		//word[list.get(k)].equals(word2[list.get(k)])
		
		for (int i = 0; i < answer.length; i++) {
			query[i] = query[i].replace(" and", "");
			String[] word = query[i].split(" ");
			ArrayList<Integer> list = new ArrayList<Integer>();
			
			for (int j = 0; j < word.length-1; j++) {
				if(!word[j].equals("-")) list.add(j);
			}
			
			ArrayList<Integer> list2 = new ArrayList<Integer>();
			
			for (int j = 0; j < info.length; j++) {
				String[] word2 = info[j].split(" ");
				if (Integer.parseInt(word[4]) <= Integer.parseInt(word2[4])) list2.add(j);
			}
			
			
			
			for (int j = 0; j < list2.size(); j++) {
				int chk = 0;
				String[] word3 = info[list2.get(j)].split(" ");
				for (int k = 0; k < list.size(); k++) {
					if(word[list.get(k)].equals(word3[list.get(k)])) chk++;
					else break;
				}
				if(chk == list.size()) answer[i]++;
			}
			System.out.print(list+"  "+list2);
			System.out.println();
			
		}
		
		System.out.println(Arrays.toString(answer));
		// return answer;
	}
}