package com.kh.chap04_assist.part02_object.model.vo;

import java.io.Serializable;

public class Dog implements Serializable{
	
	
	private String name;
	private String kind;
	private double weight;
	public Dog() {
		super();
	}
	public Dog(String name, String kind, double weight) {
		super();
		this.name = name;
		this.kind = kind;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", kind=" + kind + ", weight=" + weight + "]";
	}
	
	
}
