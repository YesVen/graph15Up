package like.a.pro.jboss_jersey_version_2.learn.exception;

import javax.ws.rs.core.Response.Status;

public class DataNotfoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String type;
	
	String statusCode;
	
	String message;
	
	String documentationLink;
	
	
	public DataNotfoundException() {
		super();
		this.type = Status.NOT_FOUND.toString();
		this.statusCode = "404";
		this.message = "Resource not found. Please check URI.";
		this.documentationLink = "http://www.dnyaneshinjava.com";
	}
	
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDocumentationLink() {
		return documentationLink;
	}

	public void setDocumentationLink(String documentationLink) {
		this.documentationLink = documentationLink;
	}
	
	
}
