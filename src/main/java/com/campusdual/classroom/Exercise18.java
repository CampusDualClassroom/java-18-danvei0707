package com.campusdual.classroom;

import com.campusdual.util.Utils;

import java.util.Arrays;

public class Exercise18 {

	public static void main(String[] args) {
		showInlineArray(createAndInitializeArray(Utils.integer("Introduce la longitud del array: ")));
	}

	public static int[] createAndInitializeArray(int n){
		int [] intArray = new int[n];
		for (int i = 0; i < n; i++) {
			intArray[i] = i+1;
		}
		return intArray;
	}

	public static void showInlineArray(int[] array){
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i != 0) System.out.print(" ");
		}
	}
}
