package com.leetcode.stack;

import java.util.Stack;

public class ValidateBracket {

	public static void main(String[] args) {

		String brackets = "{([])}";
		boolean validateBrackets = validateBrackets(brackets);
		System.out.println(validateBrackets);
	}
	
	public static boolean validateBrackets(String brackets) {
		Stack<Character> stack = new Stack<>();
		for(int i=0 ; i<brackets.length();i++) {
			if(brackets.charAt(i)=='}') {
				if(stack.peek()=='{') {
					stack.pop();
				}
				else {
					return false;
				}
			}
			else if(brackets.charAt(i)==')') {
				if(stack.peek()=='(') {
					stack.pop();
				}else {
					return false;
				}
			}
			else if(brackets.charAt(i)==']') {
				if(stack.peek()=='[') {
					stack.pop();
				}else {
					return false;
				}
			}else {
				stack.push(brackets.charAt(i));
			}
		}
		if(stack.size()==0) {
			return true;
		}
		return false;
	}
}
