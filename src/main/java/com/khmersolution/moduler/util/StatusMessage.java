package com.khmersolution.moduler.util;

public enum StatusMessage {
	ACCEPTED(202) ,
	BAD_REQUEST(400) ,
	CONFLICT(409) ,
	CREATED(201) ,
	FORBIDDEN(403),
	GONE(410),
	INTERNAL_SERVER_ERROR(500) ,
	MOVED_PERMANENTLY(301) ,
	NO_CONTENT(204 ), 
	NOT_ACCEPTABLE(406),
	NOT_FOUND(404) ,
	NOT_MODIFIED(304) ,
	OK(200),
	PRECONDITION_FAILED(412),
	SEE_OTHER(303),
	SERVICE_UNAVAILABLE(503) ,
	TEMPORARY_REDIRECT(307),
	UNAUTHORIZED(401) ,
	UNSUPPORTED_MEDIA_TYPE(415);
	
	 private final int statusCode;
	
	private StatusMessage(int statusCode){
		this.statusCode=statusCode;
	}
	
	
	 public int getStatusCode() {
		return statusCode;
	}


	public static StatusMessage fromText(int statusCode) {
	         for (StatusMessage code : values()) {
	            if (code.getStatusCode()==statusCode) {
	               return code;
	            }
	         }
	      return null;
	   }
}
