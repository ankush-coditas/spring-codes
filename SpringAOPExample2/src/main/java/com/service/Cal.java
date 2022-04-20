package com.service;

import org.springframework.stereotype.Component;

@Component("cal")
public class Cal{
public int sum(int x,int y) {
	return x+y;
}
}
