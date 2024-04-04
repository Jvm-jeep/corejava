package database;
public class menu
{
@Override
	public String toString() {
		return "menu [menuid=" + menuid + ", menuName=" + menuName + ", menuType=" + menuType + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}
public menu() {
		super();
		// TODO Auto-generated constructor stub
	}
public menu(int menuid, String menuName, String menuType, int price, int quantity) {
		super();
		this.menuid = menuid;
		this.menuName = menuName;
		this.menuType = menuType;
		this.price = price;
		this.quantity = quantity;
	}
public int getMenuid() {
		return menuid;
	}
	public void setMenuid(int menuid) {
		this.menuid = menuid;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getMenuType() {
		return menuType;
	}
	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
private int menuid;
private String menuName;
private String menuType;
private int price;
private int quantity;
}