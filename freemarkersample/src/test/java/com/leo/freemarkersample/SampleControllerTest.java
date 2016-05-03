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
public class SampleControllerTest {

	private static final String BASE_ENDPOINTURL = "http://localhost:9000/freemarkersample/spring/black/account/";
	//private static final String BASE_ENDPOINTURL = "http://rdev9atlas.icrossing.net/marlboroblack/black/account/";

	@Autowired
	private RestTemplate restTemplate;

	@Test
	public void testupdateContactInfo() {

		UpdateContactInfo_IN in = new UpdateContactInfo_IN();
		in.setCcn("507754442");
		in.setAddress1("12069 Greywing sq");
		in.setAddress2("Apt C3");
		in.setCity("Reston");
		in.setState("VA");
		in.setZipcode("20191");
		in.setPhoneNumber("4434628704");
		in.setSecurityToken("DummyToken");

		HttpEntity<UpdateContactInfo_IN> entity = new HttpEntity<UpdateContactInfo_IN>(
				in);

		UpdateContactInfo_OUT updateContactInfo_OUT = restTemplate
				.postForObject(BASE_ENDPOINTURL+"updateContactInfo", entity, UpdateContactInfo_OUT.class);

		System.out.println("Response Code: --> "+updateContactInfo_OUT.getResponseCode());
		System.out.println("Response Message: --> "+updateContactInfo_OUT.getResponseMessage());
		System.out.println("Security Token: --> "+updateContactInfo_OUT.getSecurityToken());
		System.out.println("Errors: --> "+updateContactInfo_OUT.getErrors());

		//Assert.assertEquals("Sucess",updateContactInfo_OUT.getResponseCode());
		Assert.assertEquals(in.getSecurityToken(),updateContactInfo_OUT.getSecurityToken());
		//Assert.assertEquals("call is executed",updateContactInfo_OUT.getResponseMessage());
		
	}
	
	@Test
	public void testupdateSecurityInfo() {

		UpdateSecurityInfo_IN in = new UpdateSecurityInfo_IN();
		in.setCcn("507754442");
		in.setNewPassword("password");
		in.setOldPassword("password");
		in.setSecurityQuestionAnswer("John");
		in.setSecurityQuestionID("10");
		in.setSecurityToken("DummyToken");

		HttpEntity<UpdateSecurityInfo_IN> entity = new HttpEntity<UpdateSecurityInfo_IN>(
				in);

		UpdateSecurityInfo_OUT updateSecurityInfo_OUT = restTemplate
				.postForObject(BASE_ENDPOINTURL+"updateSecurityInfo", entity, UpdateSecurityInfo_OUT.class);

		System.out.println("Response Code: --> "+updateSecurityInfo_OUT.getResponseCode());
		System.out.println("Response Message: --> "+updateSecurityInfo_OUT.getResponseMessage());
		System.out.println("Security Token: --> "+updateSecurityInfo_OUT.getSecurityToken());
		System.out.println("Errors: --> "+updateSecurityInfo_OUT.getErrors());
		
		

	}
	
	
	@Test
	public void testupdateEmail() {

		Subscription subscription = new Subscription();
		subscription.setSubscriptionID("MCBK");
		subscription.setSubscriptionStatus(1);
		
		UpdateEmail_IN in = new UpdateEmail_IN();
		in.setCcn("95776587");
		in.setEmailAddress("95776587_testemail@gmail.com");
		in.setSubscription(subscription);
		in.setSecurityToken("DummyToken");

		HttpEntity<UpdateEmail_IN> entity = new HttpEntity<UpdateEmail_IN>(in);

		UpdateEmail_OUT updateEmail_OUT = restTemplate
				.postForObject(BASE_ENDPOINTURL+"updateEmail", entity, UpdateEmail_OUT.class);

		System.out.println("Response Code: --> "+updateEmail_OUT.getResponseCode());
		System.out.println("Response Message: --> "+updateEmail_OUT.getResponseMessage());
		System.out.println("Security Token: --> "+updateEmail_OUT.getSecurityToken());
		System.out.println("Errors: --> "+updateEmail_OUT.getErrors());

	}
	
	//@Test
	public void testPing() {
		
		String response = restTemplate.getForObject(BASE_ENDPOINTURL, String.class);
		System.out.println("response is:--"+response);
		
	}
}
