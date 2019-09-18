package it.lupatellihaus.myamazinglibrary.wrapper;

import java.util.LinkedList;

public class BookWrapper {
	
	private String kind;
	private LinkedList<ItemWrapper> items;
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public LinkedList<ItemWrapper> getItems() {
		return items;
	}
	public void setItems(LinkedList<ItemWrapper> items) {
		this.items = items;
	}
	
	

}
