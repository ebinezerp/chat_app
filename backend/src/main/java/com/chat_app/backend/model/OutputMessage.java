package com.chat_app.backend.model;

import java.util.Date;

public class OutputMessage extends Message{
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private Date time;
    
    public OutputMessage(Message original, Date time) {
        super(original.getId(), original.getMessage());
        this.time = time;
    }
    
    
    public O
    
    public Date getTime() {
        return time;
    }
    
    public void setTime(Date time) {
        this.time = time;
    }

}
