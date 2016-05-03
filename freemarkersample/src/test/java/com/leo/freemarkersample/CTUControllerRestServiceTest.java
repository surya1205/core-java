package com.leo.freemarkersample;

import java.io.IOException;

import junit.framework.Assert;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Before;
import org.junit.Test;

import com.leo.entity.CTUPhotoVO_IN;
import com.leo.entity.Response_OUT;
import com.pmusa.orderHistory.vo.DummyVO;

public class CTUControllerRestServiceTest {

	//private static final String BASE_ENDPOINTURL = "http://rdev12atlas.icrossing.net/marlboroblack/ctu";
	//private static final String BASE_ENDPOINTURL = "http://localhost:8080/freemarkersample/spring/ctu";
	private static final String BASE_ENDPOINTURL = "http://localhost:8080/freemarkersample/spring";

	ObjectMapper mapper = null;

	HttpClient httpClient = null;

	@Before
	public void setUp() throws IOException {

		mapper = new ObjectMapper();

		httpClient = new HttpClient();
	}

	//@Test
	public void testMethod() {
		System.out.println("Test");
	}
	
	
	@Test
	public void testDateConversion() {
		
		PostMethod postMethod = null;

		try {

			
			postMethod = new PostMethod(BASE_ENDPOINTURL + "/dateconversion");

			postMethod
					.setRequestHeader(new Header("Accept", "application/json"));

			int responseStatus = httpClient.executeMethod(postMethod);

			Assert.assertEquals(200, responseStatus);

			String responseJson = postMethod.getResponseBodyAsString();

			System.out.println("Json Response: --> " + responseJson);

		} catch (Exception ex) {
			ex.printStackTrace();

		} finally {
			postMethod.releaseConnection();
		}	
	}
	
	/**
	 * Like rest JSON call for Black book Controller-Success scenario.
	 */
	//@Test
	public void testLike() {

		LikeVO in = new LikeVO();
		
		PostMethod postMethod = null;

		String securityToken = "DummyToken";

		in.setCcn("9488738");
		in.setId("M123");
		in.setSecurityToken(securityToken);

		try {

			String jsonRequest = mapper.writeValueAsString(in);

			System.out.println("Json Request: --> " + jsonRequest);

			postMethod = new PostMethod(BASE_ENDPOINTURL + "/photo/like");

			postMethod
					.setRequestHeader(new Header("Accept", "application/json"));

			postMethod.setRequestEntity(new StringRequestEntity(jsonRequest,
					"application/json", "UTF-8"));

			int responseStatus = httpClient.executeMethod(postMethod);

			Assert.assertEquals(200, responseStatus);

			String responseJson = postMethod.getResponseBodyAsString();

			System.out.println("Json Response: --> " + responseJson);

			Response_OUT response_OUT = mapper.readValue(responseJson,
					Response_OUT.class);

			System.out.println("Response Code: --> "
					+ response_OUT.getResponseCode());
			System.out.println("Response Message: --> "
					+ response_OUT.getResponseMessage());

			Assert.assertNotNull(response_OUT);
			Assert.assertEquals("000", response_OUT.getResponseCode());
			Assert.assertEquals("Success", response_OUT.getResponseMessage());

		} catch (Exception ex) {
			ex.printStackTrace();

		} finally {
			postMethod.releaseConnection();
		}
	}
	
	/**
	 * Like rest JSON call for Black book Controller-failure scenario.
	 */
	//@Test
	public void testLike_Error() {

		LikeVO in = new LikeVO();
		
		PostMethod postMethod = null;

		String securityToken = "DummyToken";

		in.setCcn("9488738");
		in.setId("");
		in.setSecurityToken(securityToken);

		try {

			String jsonRequest = mapper.writeValueAsString(in);

			System.out.println("Json Request: --> " + jsonRequest);

			postMethod = new PostMethod(BASE_ENDPOINTURL + "/photo/like");

			postMethod
					.setRequestHeader(new Header("Accept", "application/json"));

			postMethod.setRequestEntity(new StringRequestEntity(jsonRequest,
					"application/json", "UTF-8"));

			int responseStatus = httpClient.executeMethod(postMethod);

			Assert.assertEquals(200, responseStatus);

			String responseJson = postMethod.getResponseBodyAsString();

			System.out.println("Json Response: --> " + responseJson);

			Response_OUT response_OUT = mapper.readValue(responseJson,
					Response_OUT.class);

			System.out.println("Response Code: --> "
					+ response_OUT.getResponseCode());
			System.out.println("Response Message: --> "
					+ response_OUT.getResponseMessage());

			Assert.assertNotNull(response_OUT);
			Assert.assertEquals("003", response_OUT.getResponseCode());
			Assert.assertEquals("Web Service Error", response_OUT.getResponseMessage());

		} catch (Exception ex) {
			ex.printStackTrace();

		} finally {
			postMethod.releaseConnection();
		}
	}

	//@Test
	public void testGalleryPhotoList() {

		CTUPhotoVO_IN photoVO_IN = new CTUPhotoVO_IN();
		
		PostMethod postMethod = null;

		photoVO_IN.setIndex(1);
		photoVO_IN.setCount(2);
		photoVO_IN.setFilter(0);
		photoVO_IN.setSortBy("popular");

		try {

			String jsonRequest = mapper.writeValueAsString(photoVO_IN);

			System.out.println("Json Request: --> " + jsonRequest);

			postMethod = new PostMethod(BASE_ENDPOINTURL + "/gallery/list");

			postMethod
					.setRequestHeader(new Header("Accept", "application/json"));

			postMethod.setRequestEntity(new StringRequestEntity(jsonRequest,
					"application/json", "UTF-8"));

			int responseStatus = httpClient.executeMethod(postMethod);

			Assert.assertEquals(200, responseStatus);

			System.out.println("Output is:"+postMethod.getResponseBodyAsString());
			

		} catch (Exception ex) {
			ex.printStackTrace();

		} finally {
			postMethod.releaseConnection();
		}
	}
	
	
	/*@Test
	public void testGalleryPhotoList_Error() {

		CTUPhotoVO_IN photoVO_IN = new CTUPhotoVO_IN();
		
		PostMethod postMethod = null;


		photoVO_IN.setIndex(1);
		photoVO_IN.setFilter(1);
		photoVO_IN.setSortBy("test");
		photoVO_IN.setCount(10);

		try {

			String jsonRequest = mapper.writeValueAsString(photoVO_IN);

			System.out.println("Json Request: --> " + jsonRequest);

			postMethod = new PostMethod(BASE_ENDPOINTURL + "/gallery/list");

			postMethod
					.setRequestHeader(new Header("Accept", "application/json"));

			postMethod.setRequestEntity(new StringRequestEntity(jsonRequest,
					"application/json", "UTF-8"));

			int responseStatus = httpClient.executeMethod(postMethod);

			Assert.assertEquals(200, responseStatus);

			System.out.println("Output is:"+postMethod.getResponseBodyAsString());
			

		} catch (Exception ex) {
			ex.printStackTrace();

		} finally {
			postMethod.releaseConnection();
		}
	}*/
	
}
