import java.io.Serializable;

public class Packet implements Serializable {
	
	String date;
	String temp;
	String hum;
	String mois;
	
	Packet (String date,String temp,String hum,String mois){
		this.date=date;
		this.temp=temp;
		this.hum=hum;
		this.mois=mois;
	}

}
