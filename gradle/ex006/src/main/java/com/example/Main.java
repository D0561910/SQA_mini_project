package com.example;

import org.apache.commons.codec.binary.Base64;

import java.util.Arrays;

/**
 * 範例主程式
 */
public class Main {
    /**
     * nextDate() 功能
     * @return 回傳月與日期
     */
    public static String nextDate(int m, int d) {
		if (d == 28) {
			if (m == 2) {
				m++;
				d = 1;
			} else {
				d++;
			}
		} else if (d == 30) {
			if (m == 4 || m == 6 || m == 9 || m == 11) {
				m++;
				d = 1;
			} else {
				d++;
			}
		} else if (d == 31) {
			if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10) {
				m++;
				d = 1;
			} else if (m == 12) {
				d = 1;
				m = 1;
			}
		} else {
			d++;
		}
		return "month: " + m + " day: " + d;
	}
}
