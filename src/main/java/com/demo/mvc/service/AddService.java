package com.demo.mvc.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class AddService {

	public int add(int i,int j) {
		
		return i+j;
	}
}
