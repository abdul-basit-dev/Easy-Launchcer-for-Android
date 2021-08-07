package com.my.androidlauncher;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AppSerializableData implements Serializable {
	private static final long serialVersionUID = 2292680772212306803L;
	
	List<Pac> apps = new ArrayList<Pac>();

	public Pac findPac(String UUIDIdentifyer){
		for (Pac p: apps){
			if (p.UUIDIdentifyer.equals(UUIDIdentifyer))
				return p;
		}

		return null;
	}
	
}
