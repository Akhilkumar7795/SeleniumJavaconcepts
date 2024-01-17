package com.SeleniumPageObjects;

import java.util.ArrayList;
import java.util.List;

public class Streams {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("akhil");
		al.add("gftydigogo");
		al.add("ahguytitoug");
		al.add("akhghgigi");
		al.add("ytdghfjk");
		//List<String> names=Arrays.asList("Akhil","ahjgtyf","hjfsuygis","egrger"); to convert into arrays: above lines of code we can pass in this way also
		int count=0;
		for(int i=0;i<al.size();i++)
		{
			String actual=al.get(i);
			if(actual.startsWith("a"))
			{
				count++;
			}
		}
		System.out.println(count);
	}
public void streamFilter()
{
	ArrayList<String> al = new ArrayList<String>();
	al.add("akhil");
	al.add("gftydigogo");
	al.add("ahguytitoug");
	al.add("akhghgigi");
	al.add("ytdghfjk");
	Long c=al.stream().filter(s->s.startsWith("a")).count();
	System.out.println(c);
}}
