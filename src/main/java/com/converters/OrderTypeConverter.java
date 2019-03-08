package com.converters;

import org.apache.camel.Converter;
import org.apache.camel.Exchange;
import org.apache.camel.TypeConverter;
import org.apache.camel.component.file.GenericFile;
import org.apache.log4j.Logger;

import com.classes.*;

@Converter
public class OrderTypeConverter {
	final static Logger log = Logger.getLogger(OrderTypeConverter.class);
	@Converter
	public static <T>Order toOrder(GenericFile<T> data, Exchange ex) {
		TypeConverter converter = ex.getContext().getTypeConverter();
		String s = converter.convertTo(String.class, data);
		if (s == null) {
			throw new IllegalArgumentException("data is invalid");
		}
		String[] split = s.split("\\|");
		String proveedor = split[0];
		String id = split[1];
		String costumer = split[2];
		String country = split[3];
		String total = split[4];
		String accepted = split[5];
		String itemsquantity = split[6];
		String comments = split[7];
		Items items = new Items();
		
		int contador = 8;
		while (split.length > contador) {
			Item item = new Item();
			item.setItemName(split[contador]);
			contador++;
			item.setQuantity(split[contador]);
			contador++;
			item.setValue(split[contador]);
			contador++;
			items.getItem().add(item);
		}
		
		return new Order(proveedor, id, costumer, country, total, accepted, itemsquantity, comments, items);
	}

}
