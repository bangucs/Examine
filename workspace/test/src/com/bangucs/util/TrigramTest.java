package com.bangucs.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class TrigramTest {

	@Test
	public void testPurseTrigram() {
		Trigram tri = new Trigram();
		String a = "�㤨�С������ȥꥯ����ʬ�Ϥ��뤳�Ȥǡ��Х������ߤ䤹���ս��ʤ����Ǥ������Ȥ��Ǥ��ޤ���";
		String b = "�㤨�С������ȥꥯ����褯���뤳�Ȥǡ��Х������ߤ����ʾ������ꤹ�뤳�Ȥ��Ǥ��ޤ���";
		double result = tri.purseTrigram(a,b);
		System.out.println(a + " \r\n �� \r\n"+ b + "\r\n ��" + result + " ���餤���Ƥ�ߤ�����");
		assertTrue(result != 0);
				
		a = "��ư��Υ������";
		b = "Ķ�����׺ɥޥ���";
		result = tri.purseTrigram(a,b);
		System.out.println(a + " \r\n �� \r\n"+ b + "\r\n ��" + result + " ���餤���Ƥ�ߤ�����");
		assertTrue(result == 0);
		
		a = "Υ��ƤƤ⡡���α��ǡ�ͧã����";
		b = "Υ��Ƥ⡡���α��Ρ�ͧã�ǡ���������";
		result = tri.purseTrigram(a,b);
		System.out.println(a + " \r\n �� \r\n"+ b + "\r\n ��" + result + " ���餤���Ƥ�ߤ�����");
		assertTrue(result != 0);

		a = "���󻲲ä��Ƥ��ʤ��͡����Ƥλ��üԡ��ƥ��Ƚ鿴�Ԥ����Ǥ�狼��䤹���褦���������Ƥ����ޤ���";
		b = "���󻲲ä��Ƥ��ʤ��͡����Ƥλ��üԡ��ƥ��Ƚ鿴�Ԥ����Ǥ�狼��䤹���褦���������Ƥ����ޤ���";
		result = tri.purseTrigram(a,b);
		System.out.println(a + " \r\n �� \r\n"+ b + "\r\n ��" + result + " ���餤���Ƥ�ߤ�����");
		assertTrue(result ==1);

		a = "";
		b = "";
		assertTrue(tri.purseTrigram(a,b) ==1);
		
		a = "";
		b = "";
		assertTrue(tri.purseTrigram(a,b) ==1);

		a = "a";
		b = "aa";
		assertTrue(tri.purseTrigram(a,b) == 0);
//
//		a = "";
//		b = "";
//		System.out.println(a + "���ȡ�" + b + "���ϡ�" + tri.purseTrigram(a,b) + "�����餤���Ƥ�");
//		assertTrue(tri.purseTrigram(a,b) != 0);
//
//		a = "";
//		b = "";
//		System.out.println(a + "���ȡ�" + b + "���ϡ�" + tri.purseTrigram(a,b) + "�����餤���Ƥ�");
//		assertTrue(tri.purseTrigram(a,b) != 0);
//
//		a = "";
//		b = "";
//		System.out.println(a + "���ȡ�" + b + "���ϡ�" + tri.purseTrigram(a,b) + "�����餤���Ƥ�");
//		assertTrue(tri.purseTrigram(a,b) != 0);

		
	}

}
