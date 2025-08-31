package com.javaweb.utils;

public class NumberUtils {
	public static boolean checkNumber(String s) {
		try {
			Integer n = Integer.parseInt(s);
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		return true;
	}
}
