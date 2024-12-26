package com.mahesh.test;

import com.mahesh.dao.ConnectionFactory;

public class test {
public static void main(String[] args)
{
	System.out.println("Hello");
	System.out.println(ConnectionFactory.getConnection());
	
}
}
