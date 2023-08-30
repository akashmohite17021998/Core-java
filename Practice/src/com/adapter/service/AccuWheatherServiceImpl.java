package com.adapter.service;

import com.adapter.factory.AccuWheatherFactory;

public class AccuWheatherServiceImpl implements AccuWheatherService {

	@Override
	public String showTemp(String name) {
		String a = AccuWheatherFactory.fetchTemp(name);
		return a;
	}

}
