
public class Miejsce {
	protected String name;
	protected String desc;
	protected Miejsce[] przejscia = new Miejsce[4];
	
	public Miejsce(String name) {
		this.name=name;
	}
	
	public void addEntry(Miejsce w, Miejsce s, Miejsce a, Miejsce d) {
		przejscia[0]=w;
		przejscia[1]=s;
		przejscia[2]=a;
		przejscia[3]=d;
	}
	public String returnEntry() {
		String door = "";
		if(przejscia[0]!=null) door+="do przodu: ";
		if(przejscia[1]!=null) door+="do tyłu: ";
		if(przejscia[2]!=null) door+="w lewo: ";
		if(przejscia[3]!=null) door+="w prawo: ";
		return door;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}
