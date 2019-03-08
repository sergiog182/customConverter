package com.beans;

import org.apache.log4j.Logger;
import com.classes.*;

public class ValidationBean{
	final static Logger log = Logger.getLogger(ValidationBean.class);
	
	public void validate(Order order) throws Exception {
		int total = 0;
		int itemsquantity = 0;
		
		for (Item item : order.getItems().getItem()) {
			total = total + Integer.parseInt(item.getValue());
			itemsquantity = itemsquantity + Integer.parseInt(item.getQuantity());
		}
		
		order.setItemquantity(Integer.toString(itemsquantity));
		
		if (total != Integer.parseInt(order.getTotal())) {
			order.setComments("Valor ajustado: " + order.getTotal());
			order.setTotal(Integer.toString(total));
		}
	}
	
}
