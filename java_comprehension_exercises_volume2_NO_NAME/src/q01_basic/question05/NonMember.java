package q01_basic.question05;

public class NonMember extends AbstMember {

	protected String name;

	/**
	 * @param name
	 */
	public NonMember(String name) {
		this.name = name;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public void buyItem() {
		System.out.println("---BUY ITEM--- ");
		System.out.println(name + " purchased the item at a fixed price  ");

	}

	public void showMember() {
		System.out.println("---SHOW MEMBERS--- ");
		System.out.println("***MEMBER DATA*** ");
		System.out.println(name + "is a non-member");
		System.out.println("*****************");

	}

}
