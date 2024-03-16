package khatateSakshi;

public class Menu {
	private int menuId;
	private String menuName;
	private int Prize;
	private String Category;
	private int Quality;
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public int getPrize() {
		return Prize;
	}
	public void setPrize(int prize) {
		Prize = prize;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public int getQuality() {
		return Quality;
	}
	public void setQuality(int quality) {
		Quality = quality;
	}
	public Menu(int menuId, String menuName, int prize, String category, int quality) {
		super();
		this.menuId = menuId;
		this.menuName = menuName;
		Prize = prize;
		Category = category;
		Quality = quality;
	}
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Menu [menuId=" + menuId + ", menuName=" + menuName + ", Prize=" + Prize + ", Category=" + Category
				+ ", Quality=" + Quality + "]";
	}
}