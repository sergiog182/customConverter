package com.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import com.classes.*;

public class AcceptorProcess implements Processor{

	@Override
	public void process(Exchange ex) throws Exception {
		Order order = ex.getIn().getBody(Order.class);
		if (Integer.parseInt(order.getTotal()) > 10000 ) {
			order.setAccepted("true");
		} else {
			order.setAccepted("false");
		}
	}
	
}
