package com.classes;

import java.util.ArrayList;
import java.util.List;

public class Items {

    protected List<Item> item;

    public List<Item> getItem() {
        if (item == null) {
            item = new ArrayList<Item>();
        }
        return this.item;
    }
    
    @Override
    public String toString() {
    	return this.item.toString().replace("[", "").replace("]", "").replace(", ", "|");
    }

}
