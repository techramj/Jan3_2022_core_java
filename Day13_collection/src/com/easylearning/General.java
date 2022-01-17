package com.easylearning;

public class General {
    private Object data;
    
    public General(Object data) {
		this.data=data;
	}
    
    public Object getData() {
		return data;
	}
    
    public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "General [data=" + data + "]";
	}

    
}
