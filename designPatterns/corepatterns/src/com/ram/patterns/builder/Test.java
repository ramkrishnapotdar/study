package com.ram.patterns.builder;

import com.ram.patterns.builder.HTTPClient.HTTPClientBuilder;

public class Test {

	public static void main(String[] args) {
		HTTPClient httpClient = new HTTPClient("get", "http://localhost", null, null, null, null);
		
		System.out.println(httpClient);
		
		HTTPClientBuilder httpClientBuilder = new HTTPClient.HTTPClientBuilder();
		
		HTTPClient httpClient2 = httpClientBuilder.method("post").URL("http://localhost").body("fdfdfd").build();
		
		System.out.println(httpClient2);
	}

}
