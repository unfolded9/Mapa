
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
		if(przejscia[0]!=null) door+="1 - do przodu: ";
		if(przejscia[1]!=null) door+="2 - do tyłu: ";
		if(przejscia[2]!=null) door+="3 - w lewo: ";
		if(przejscia[3]!=null) door+="4 - w prawo: ";
		return door;
	}
	public Miejsce chooseEntry(int i){
		return przejscia[i];
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
