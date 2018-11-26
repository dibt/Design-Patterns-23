package com.di.factory.factory.impl;

import com.di.factory.factory.IFactory;
import com.di.factory.factory.IKeyboard;

/**
 * @author povosdi
 * @date 2018/11/26
 */
public class MSFactory implements IFactory {
	@Override
	public IKeyboard produce(){
		return new MSKeyboard();
	}
}
