package com.kh.chap01_ex.model.vo;

public class NoteBook extends Product{
	
	private int usbPort;

	public NoteBook() {
		super();
	}

	public NoteBook(String brand, String name, int price,int usbPort) {
		super(brand, name, price);
		this.usbPort = usbPort;
	}

	public int getUsbPort() {
		return usbPort;
	}

	public void setUsbPort(int usbPort) {
		this.usbPort = usbPort;
	}

	@Override
	public String toString() {
		return "NoteBook ["+super.toString()+",usbPort=" + usbPort + "]";
	}
	
	public String booting() {
		return "노트북 부팅 띵";
	}
	
}
