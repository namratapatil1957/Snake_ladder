package com.bridgebalz.Snakeladder;
import java.util.*;

public class UC2 {
	
	private static int dice;

	public static void main(String[] args) {
		
		int min_num = 1;
		int max_num = 7;
		int current_position = 0;
		int win_position = 100;
		
		while (current_position < win_position ) {
			
			System.out.println("");
			int dice = (int) ((Math.random() *(max_num - min_num)) + min_num);
			System.out.println(" The dice number is:" + dice);
			
			int opt = (int)(( Math.random()*10) %3);
			System.out.println(" Option is: " +opt);
			
			System.out.println(" Before moving current postion: " +current_position);
			
			switch (opt) {
				case 1:
					System.out.println(" Player move with " +dice+ " number");
					current_position = current_position + dice;
					break;
			
				case 2:
					System.out.println(" Player move back with " +dice+ " number");
					current_position = current_position - dice;
					if (current_position < 0) {
						current_position = 0;
					}
					break;
			
				case 0:
					System.out.println(" Player can't move");
					current_position = current_position + 0;
					break;
			}
			
			System.out.println(" After moving current postion: " +current_position);
			
		if (current_position > win_position) {
			current_position = current_position - dice;
		}
		}
	}
}