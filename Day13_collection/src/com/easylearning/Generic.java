package com.easylearning;

public class Generic<T> {

	private Object data;

	public Generic(T data) {
		this.data=data;
	}

	public T getData() {
		return (T)data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "General [data=" + data + "]";
	}

}
