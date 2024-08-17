package com.hackerrank.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PasswordDuplicates {

	public static void main(String[] args) {
		List<String> passwords = new ArrayList<>();
		passwords.add("pass123");
		passwords.add("admin");
		passwords.add("pass123");
		passwords.add("user1");
		passwords.add("admin");
		passwords.add("admin");
		passwords.add("user1");
		passwords.add("pass123");

		int k = 1;
		List<String> report = passwordReport(passwords, k);
		for (String result : report) {
			System.out.println(result);
		}
	}

	public static List<String> passwordReport(List<String> passwords, int k) {
		Map<String, Integer> passwordCounts = new HashMap<>();
		List<String> report = new ArrayList<>();
		for (String password : passwords) {
			passwordCounts.put(password, passwordCounts.getOrDefault(password, 0) + 1);
			if (passwordCounts.get(password) <= k) {
				report.add("ACCEPT");
			} else {
				report.add("REJECT");
			}
		}
		return report;
	}
}
