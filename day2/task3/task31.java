package day2.task3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class task31{
	public static void main(String[] args) {
		Set<String> accounts = new HashSet<>();
		accounts.add("Savings Account");
		accounts.add("Current Account");
		accounts.add("Salary Account");
		accounts.add("Savings Account");

		accounts.remove("Current Account");
		accounts.add("Fixed Deposit Account");

		System.out.println("\nAccounts Set : " + accounts);
		System.out.println("Contains Savings Account: " + accounts.contains("Savings Account"));

		Map<String, Integer> accountBalances = new HashMap<>();
		accountBalances.put("Savings Account", 25000);
		accountBalances.put("Current Account", 50000);
		accountBalances.put("Salary Account", 15000);
		accountBalances.put("Savings Account", 30000);

		System.out.println("\nAccount Balances Map : " + accountBalances);
		System.out.println("Balance of Savings Account: " + accountBalances.get("Savings Account"));
		System.out.println("Contains Fixed Deposit Account: " + accountBalances.containsKey("Fixed Deposit Account"));
		System.out.println("Contains value 50000: " + accountBalances.containsValue(50000));
	}
}
