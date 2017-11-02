import java.io.Serializable;
/*
 * This class is used to make packet of sequence number and string type and
 * implements serializable interface to serialized this class 
 * It contain two variables of Integer and String
 * This class is used in others classes for making packet by making object of this class. 
 */
public class packet implements Serializable {
	int sequenceNo;
	String data;
	public packet() {
		sequenceNo=0;
		data=null;
	}
	/**
	 * @return the sequenceNo
	 */
	public int getSequenceNo() {
		return sequenceNo;
	}
	/**
	 * @param sequenceNo the sequenceNo to set
	 */
	public void setSequenceNo(int sequenceNo) {
		this.sequenceNo = sequenceNo;
	}
	/**
	 * @return the data
	 */
	public String getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(String data) {
		this.data = data;
	}
	packet (int seq, String message)
	{
		sequenceNo =seq;
		data = message;
	}

}
