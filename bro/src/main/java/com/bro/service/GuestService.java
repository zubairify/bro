package com.bro.service;

import java.util.List;

import com.bro.bean.Property;
import com.bro.bean.PropertyCriteria;

public interface GuestService {
	List<Property> searchProperty(PropertyCriteria pc);
}
