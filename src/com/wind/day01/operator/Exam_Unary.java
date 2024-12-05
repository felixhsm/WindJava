package com.wind.day01.operator;

public class Exam_Unary {
	public static void main(String[] args) {
		/*
		 * 단항연산자
		 * a++, ++a -> a = a + 1;
		 */
		int num = 1;
		System.out.println(++num); // num은 2가 됨
		System.out.println(++num); // +1 연산을 나중에 함. num은 여전히2가 됨
		System.out.println(num);// 여기서 num은 3이 됨
		// ++num, num++, num -> 2, 2, 3
		// num++, ++num, num -> 1, 3, 3
		// num++, num++, num -> 1, 2, 3
		// ++num, ++num, num -> 2, 3, 3
		
		/*
		 * 문제1
		 * a가 10, b는 20, c는 30입니다.
		 * a++;
		 * b = (--a) + b;
		 * c = (a++) + (--b);
		 * 연사을 끝마친 후 
		 * a, b, c의 값은 얼마일까요? 11, 31, 30
		 */
		int aNum = 10;
		int bNum = 20;
		int cNum = 30;
		aNum++;
		bNum = (--aNum) + bNum;
		cNum = (aNum++) + (--bNum);
		System.out.printf("a의 값 : %d, b의 값 : %d, c의 값 : %d\n", aNum, bNum, cNum);

		
		/*
		 * 문제2
		 * x는 100, y는 33, z는 0입니다
		 * x--;
		 * z = x-- + --y;
		 * x = 99 + x++ + x;
		 * y = y-- + y + ++y;
		 * 의 연산을 끝마친 후 
		 * x, y, z의 값은 얼마일까요? 298, 98, 100
		 * 
		 */
		int xNum = 100;
		int yNum = 33;
		int zNum = 0;
		xNum--;
		zNum  = xNum-- + --yNum;
		xNum = 99 + xNum++  + xNum;
		yNum = yNum-- + yNum + ++yNum;
		System.out.println("x의 값은 : " + xNum + " y의 값은 : " + yNum + " z의 값은 : " +zNum);;
		/*
		 * 문제3
		 * a는 5, b는 10입니다.
		 * c = (++a) + b;
		 * d = c / a;
		 * e = c % a;
		 * f = e++;
		 * g = (--b) + (d--);
		 * h = 2;
		 *  i = a++ + b / (--c / f) * (g-- - d) % (++e + h);
		 *  a: 5, b: 10, c: 16, d: 2, e: 5, f: 4, g: 11, h: 2, i: 12의 값은 무엇일까요?
		 */
		
		int a = 5;
		int b = 10;
		int c = (++a) + b;
		System.out.println(c);
		int d = c / a;
		System.out.println(d);
		int e = c % a;
		System.out.println(e);
		int f = e++;
		System.out.println(f);
		int g = (--b) + (d--);
		System.out.println(g);
		int h = 2;
		System.out.println(h);
		int i = a++ + b / (--c / f) * (g-- - d) % (++e + h);
		System.out.println(i);
		
	}
}
