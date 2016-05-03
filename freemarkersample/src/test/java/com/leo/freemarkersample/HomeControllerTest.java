package com.leo.freemarkersample;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import com.leo.entity.Subscription;
import com.leo.entity.UpdateContactInfo_IN;
import com.leo.entity.UpdateContactInfo_OUT;
import com.leo.entity.UpdateEmail_IN;
import com.leo.entity.UpdateEmail_OUT;
import com.leo.entity.UpdateSecurityInfo_IN;
import com.leo.entity.UpdateSecurityInfo_OUT;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:profileservice.xml" })
public class HomeControllerTest {

	//private static final String BASE_ENDPOINTURL = "http://localhost:8080/freemarkersample/spring/black/";
	//private static final String BASE_ENDPOINTURL = "http://rdev9atlas.icrossing.net/marlboroblack/account/";
	private static final String BASE_ENDPOINTURL = "http://localhost:9000/freemarkersample/spring/account/";

	@Autowired
	private RestTemplate restTemplate;

	@Test
	public void testupdateContactInfo() {

		UpdateContactInfo_IN in = new UpdateContactInfo_IN();
		
		String securityToken = "DummyToken";
		
		in.setCcn("32975925");
		in.setAddress1("5211 Brook Rd");
		in.setAddress2("Apt# 8");
		in.setCity("Reston");
		in.setState("VA");
		in.setZipcode("23339");
		in.setPhoneNumber(null);
		in.setSecurityToken(securityToken);

		HttpEntity<UpdateContactInfo_IN> entity = new HttpEntity<UpdateContactInfo_IN>(
				in);

		UpdateContactInfo_OUT updateContactInfo_OUT = restTemplate
				.postForObject(BASE_ENDPOINTURL+"updateContactInfo", entity, UpdateContactInfo_OUT.class);

		System.out.println("Response Code: --> "+updateContactInfo_OUT.getResponseCode());
		System.out.println("Response Message: --> "+updateContactInfo_OUT.getResponseMessage());
		System.out.println("Security Token: --> "+updateContactInfo_OUT.getSecurityToken());
		System.out.println("Errors: --> "+updateContactInfo_OUT.getErrors());

		Assert.assertNotNull(updateContactInfo_OUT);
		Assert.assertEquals("000", updateContactInfo_OUT.getResponseCode());
		Assert.assertEquals("Success", updateContactInfo_OUT.getResponseMessage());
		Assert.assertEquals(null, updateContactInfo_OUT.getErrors());
		Assert.assertEquals(securityToken, updateContactInfo_OUT.getSecurityToken());
		
	}
	
	/*@Test
	public void testupdateSecurityInfoPassword() {

		String securityToken = "DummyToken";
		
		UpdateSecurityInfo_IN in = new UpdateSecurityInfo_IN();
		in.setCcn("480816611");
		in.setNewPassword("password");
		in.setOldPassword("password");
		in.setSecurityToken(securityToken);

		HttpEntity<UpdateSecurityInfo_IN> entity = new HttpEntity<UpdateSecurityInfo_IN>(
				in);

		UpdateSecurityInfo_OUT updateSecurityInfo_OUT = restTemplate
				.postForObject(BASE_ENDPOINTURL+"updateSecurityInfo", entity, UpdateSecurityInfo_OUT.class);

		System.out.println("Response Code: --> "+updateSecurityInfo_OUT.getResponseCode());
		System.out.println("Response Message: --> "+updateSecurityInfo_OUT.getResponseMessage());
		System.out.println("Security Token: --> "+updateSecurityInfo_OUT.getSecurityToken());
		System.out.println("Errors: --> "+updateSecurityInfo_OUT.getErrors());
		
		Assert.assertNotNull(updateSecurityInfo_OUT);
		Assert.assertEquals("000", updateSecurityInfo_OUT.getResponseCode());
		Assert.assertEquals("Success", updateSecurityInfo_OUT.getResponseMessage());
		Assert.assertEquals(null, updateSecurityInfo_OUT.getErrors());
		Assert.assertEquals(securityToken, updateSecurityInfo_OUT.getSecurityToken());
		

	}
	
	@Test
	public void testupdateSecurityInfoQuestionAnswer() {

		String securityToken = "DummyToken";
		
		UpdateSecurityInfo_IN in = new UpdateSecurityInfo_IN();
		in.setCcn("480816611");
		in.setSecurityQuestionAnswer("John");
		in.setSecurityQuestionID("0");
		in.setSecurityToken(securityToken);

		HttpEntity<UpdateSecurityInfo_IN> entity = new HttpEntity<UpdateSecurityInfo_IN>(
				in);

		UpdateSecurityInfo_OUT updateSecurityInfo_OUT = restTemplate
				.postForObject(BASE_ENDPOINTURL+"updateSecurityInfo", entity, UpdateSecurityInfo_OUT.class);

		System.out.println("Response Code: --> "+updateSecurityInfo_OUT.getResponseCode());
		System.out.println("Response Message: --> "+updateSecurityInfo_OUT.getResponseMessage());
		System.out.println("Security Token: --> "+updateSecurityInfo_OUT.getSecurityToken());
		System.out.println("Errors: --> "+updateSecurityInfo_OUT.getErrors());
		
		Assert.assertNotNull(updateSecurityInfo_OUT);
		Assert.assertEquals("000", updateSecurityInfo_OUT.getResponseCode());
		Assert.assertEquals("Success", updateSecurityInfo_OUT.getResponseMessage());
		Assert.assertEquals(null, updateSecurityInfo_OUT.getErrors());
		Assert.assertEquals(securityToken, updateSecurityInfo_OUT.getSecurityToken());

	}
	
	@Test
	public void testupdateEmail() {

		String securityToken = "DummyToken";
		
		Subscription subscription = new Subscription();
		subscription.setSubscriptionID("MCBK");
		subscription.setSubscriptionStatus(1);
		
		UpdateEmail_IN in = new UpdateEmail_IN();
		in.setCcn("480816611");
		in.setEmailAddress("test456@gmail.com");
		in.setSubscription(subscription);
		in.setSecurityToken(securityToken);

		HttpEntity<UpdateEmail_IN> entity = new HttpEntity<UpdateEmail_IN>(in);

		UpdateEmail_OUT updateEmail_OUT = restTemplate
				.postForObject(BASE_ENDPOINTURL+"updateEmail", entity, UpdateEmail_OUT.class);

		System.out.println("Response Code: --> "+updateEmail_OUT.getResponseCode());
		System.out.println("Response Message: --> "+updateEmail_OUT.getResponseMessage());
		System.out.println("Security Token: --> "+updateEmail_OUT.getSecurityToken());
		System.out.println("Errors: --> "+updateEmail_OUT.getErrors());
		System.out.println("ShowDOI: --> "+updateEmail_OUT.getShowDOI());

		Assert.assertNotNull(updateEmail_OUT);
		Assert.assertEquals("000", updateEmail_OUT.getResponseCode());
		Assert.assertEquals("Success", updateEmail_OUT.getResponseMessage());
		Assert.assertEquals(null, updateEmail_OUT.getErrors());
		Assert.assertEquals(securityToken, updateEmail_OUT.getSecurityToken());
		
	}*/
	
	
}
