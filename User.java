package com.cts.model;

public class User {
int uid;
String name;
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "User [uid=" + uid + ", name=" + name + "]";
}
public User(int uid, String name) {
	super();
	this.uid = uid;
	this.name = name;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
}
