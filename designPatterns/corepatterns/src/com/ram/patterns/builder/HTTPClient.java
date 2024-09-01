package com.ram.patterns.builder;

public class HTTPClient {
	private String method,URL,userName,password,headers,body;

	public HTTPClient(String method, String uRL, String userName, String password, String headers, String body) {
		super();
		this.method = method;
		URL = uRL;
		this.userName = userName;
		this.password = password;
		this.headers = headers;
		this.body = body;
	}

	public HTTPClient(HTTPClientBuilder httpClientBuilder) {
		this.method = httpClientBuilder.method;
		this.headers = httpClientBuilder.headers;
		this.URL= httpClientBuilder.URL;
		this.userName = httpClientBuilder.userName;
		this.password = httpClientBuilder.password;
		this.body = httpClientBuilder.body;
	}

	@Override
	public String toString() {
		return "HTTPClient [method=" + method + ", URL=" + URL + ", userName=" + userName + ", password=" + password
				+ ", headers=" + headers + ", body=" + body + "]";
	}
	
	
	
	
	public static class HTTPClientBuilder{
		private String method,URL,userName,password,headers,body;
		
		public HTTPClientBuilder method(String method)
		{
			this.method = method;
			return this;
		}
		
		public HTTPClientBuilder URL(String url)
		{
			this.URL = url;
			return this;
		}
		
		public HTTPClientBuilder secure(String username, String password)
		{
			this.userName= username;
			this.password = password;
			return this;
		}
		
		public HTTPClientBuilder headers(String header)
		{
			this.headers = header;
			return this;
		}
		
		public HTTPClientBuilder body(String body)
		{
			this.body = body;
			return this;
		}
		
		public HTTPClient build()
		{
			return new HTTPClient(this);
		}
		
	}
	
}
