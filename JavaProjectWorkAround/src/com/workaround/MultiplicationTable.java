package com.workaround;

public class MultiplicationTable {
	void printTable() {
		printTable(6);
		}
	
	void printTable(int table) {
		printTable(table, 2, 16);
		}
		
	void printTable(int table, int from, int to) {
		for(int i=from;i<=to;i++){
			System.out.printf("%d X %d = %d",table,i,table*i).println();
		}
	}
	

	public static void main(String[] args) {	
	 MultiplicationTable table= new MultiplicationTable();
	 table.printTable();
	 //table.printTable(6);
	 //table.printTable(6, 2, 18);
	}

}
