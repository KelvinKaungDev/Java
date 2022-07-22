package AssigmentSix;

public abstract class Animals {

	private String kind;
	private String appearance;
	
	public Animals(String kind, String appearance)
	{
		this.kind = kind;
		this.appearance = appearance;
	}
	
	public String getKind()
	{
		return this.kind;
	}
	
	public void setKind(String kind)
	{
		this.kind = kind;
	}

	public String getAppearance() {
		return appearance;
	}

	abstract public void eat();
	
	abstract public void move();
	
	public String toString()
	{
		return String.format("%S %S", this.kind, this.appearance);
	}

}
