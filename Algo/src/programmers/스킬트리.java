package programmers;

import java.util.*;

class 스킬트리 {
	/*
    1번째 배열에서 단어하나 가져오기
    2번째 단어 하나 글자수만큼 for문 돌리기
    3번째 포함되어있는지 비교하기 안포함해있으면 지우기 
    4번째 포함된 새로운 문자열이 순서대로 들어가있는지 확인하기 
    */
	public static void main(String[] args) {
		String skill = "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
        int answer = 0;
        String[] skill_tree_list = skill.split("");
        boolean[] chk = new boolean[skill_tree_list.length];
        
        String stand = skill_tree_list[0];
        //1
        for(int i = 0; i < skill_trees.length; i++) {
        	//2
        	boolean b = false;
        	String[] skill_list = skill_trees[i].split("");
        	String word ="";
        	for (int j = 0; j < skill_list.length; j++) {
        		//3
				for (int k = 0; k < skill_tree_list.length; k++) {
					if(skill_list[j].equals(skill_tree_list[k])) word += skill_tree_list[k];
				}
				
				for (int k = 0; k < word.length(); k++) {
					String[] a = word.split("");
					if(!a[k].equals(skill_tree_list[k])) {
						b =true;
						break;
					}
				}
			}
        	if(!b) answer++;
        }
        System.out.println(answer);
        //return answer;
    }
}