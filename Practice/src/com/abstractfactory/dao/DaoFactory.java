package com.abstractfactory.dao;

import com.abstractfactory.client.Dao;

public interface DaoFactory {

	public Dao createDao(String type);
}
