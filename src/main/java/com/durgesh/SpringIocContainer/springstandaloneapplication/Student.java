package com.durgesh.SpringIocContainer.springstandaloneapplication;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Student {

	private List<String> friends;
	private Map<String,Integer> map;
	
	private Properties props;
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public Map<String, Integer> getMap() {
		return map;
	}
	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}
	
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	@Override
	public String toString() {
		return "Student [friends=" + friends + ", map=" + map + ", props=" + props + "]";
	}
	
	
	
	
}
