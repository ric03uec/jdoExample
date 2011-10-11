package com.dev.jdoexample.data;

import java.io.Serializable;
import java.util.Date;

import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PersistenceModifier;
import javax.jdo.annotations.Persistent;

@PersistenceCapable(detachable="true", identityType=IdentityType.DATASTORE)
public class Data implements Serializable {
	
	private static final long serialVersionUID = 1L;

//	@Persistent(primaryKey="true", valueStrategy=IdGeneratorStrategy.IDENTITY)
//	private int dataKey;
	
	@Persistent(persistenceModifier=PersistenceModifier.PERSISTENT)
	private int intData;
	
	@Persistent(persistenceModifier=PersistenceModifier.PERSISTENT)
	private String stringData;
	
	@Persistent(persistenceModifier=PersistenceModifier.PERSISTENT)
	private Date date;
	
	public Data(int intValue, String stringValue, Date dateValue){
		this.intData = intValue;
		this.stringData = stringValue;
		this.date 	= dateValue;
	}
	
//	public int getKey(){
//		return this.dataKey;
//	}
	
	public void setInt(int intData){
		this.intData = intData;
	}
	
	public int getInt(){
		return this.intData;
	}
	
	public void setString(String string){
		this.stringData = string;
	}
	
	public String getString(){
		return this.stringData;
	}
	
	public void setDate(Date date){
		this.date = date;
	}
	
	public Date getdate(){
		return this.date;
	}
}
