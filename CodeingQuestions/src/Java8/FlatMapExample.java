package Java8;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {
	public static void main(String args[]) {
		
		List<Orders> orderList = Arrays.asList(
				new Orders(1, Arrays.asList(new Items("A", 1), new Items("B", 2))),
				new Orders(1, Arrays.asList(new Items("A", 1), new Items("C", 2))));
		
		orderList.stream().flatMap(t-> t.getItemList().stream()).map(Items::getItemName).distinct().forEach(System.out::println);
	}
}

class Orders{
	private Integer orderId;
	private List<Items> itemList;
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public List<Items> getItemList() {
		return itemList;
	}
	public void setItemList(List<Items> itemList) {
		this.itemList = itemList;
	}
	public Orders(Integer orderId, List<Items> itemList) {
		super();
		this.orderId = orderId;
		this.itemList = itemList;
	}
}

class Items{
	private String itemName;
	private Integer itemId;
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public Items(String itemName, Integer itemId) {
		super();
		this.itemName = itemName;
		this.itemId = itemId;
	}
	@Override
	public String toString() {
		return "Items [itemName=" + itemName + ", itemId=" + itemId + "]";
	}
	
}