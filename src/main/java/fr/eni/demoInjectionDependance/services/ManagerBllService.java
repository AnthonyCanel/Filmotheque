package fr.eni.demoInjectionDependance.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManagerBllService<T> {
	private List<T> listT;
	private Map<Integer, T> mapT;

	public ManagerBllService() {
		this.listT = new ArrayList<>();
		this.mapT = new HashMap<Integer, T>();	
	}
	
	public List<T> getList(){
		return listT;
	}
	public Map<Integer, T> getMap(){
		return mapT;
	}
	
}
