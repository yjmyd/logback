package com.my.logback;

import java.util.ArrayList;
import java.util.List;

import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;

public class Guava {
	/**
	 * ��������
	 * @param str ����
	 * @param split ���Rex
	 * @return
	 */
	public static String join(String[] str,String split){
		Joiner joiner = Joiner.on(split).skipNulls();
		return joiner.join(str);
	}
	
	/**
	 * ��������
	 * @param list ����
	 * @param split ���Rex
	 * @return
	 */
	public static String join(List<String> list,String split){
		Joiner joiner = Joiner.on(split).skipNulls();
		return joiner.join(list);
	}
	/**
	 * ����ַ�������List
	 * @param str �ַ���
	 * @param split ���Rex
	 * @return
	 */
	public static List<String> splitter(String str,String split){
		return Lists.newArrayList(Splitter.on(split).trimResults().omitEmptyStrings().split(str));
	}
	

	/**
	 * ����Ƿ�Ϊ��
	 * @param str
	 * @param es
	 * @return
	 */
//	public static String checkNotNull(String str,String es){
//		try {
//			str = Preconditions.checkNotNull(str,es);
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		return str;
//	}
	public static void main(String[] args) throws Exception{
		String ss = null;
		ss = Preconditions.checkNotNull(ss,"ssΪnull");
		String[] s = {"java",null,".net","c#"};
		System.out.println(join(s,"-"));
		List<String> slist = new ArrayList<String>();
		slist.add("a");
		slist.add("b");
		slist.add("c");
		slist.add(null);
		slist.add("e");
		System.out.println(join(slist,"=="));
		List<String> sl = splitter("a-b-c-d-e", "-");
		System.out.println(sl.size());
	}
	
}
