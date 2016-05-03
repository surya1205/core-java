package com.leo.cache;

import java.util.ArrayList;
import java.util.List;

import com.leo.entity.Metatag;
import com.leo.entity.Metatags;
import com.leo.entity.PhotoVO;


public class GallerySampleDataUtil {

	public static List<PhotoVO> getSampleGalleryData() {
		List<PhotoVO> photoVOs = new ArrayList<PhotoVO>();

		PhotoVO photoVO1 = new PhotoVO();
		photoVO1.setMediaID("1");
		photoVO1.setUrl("http://media.marlboro.com/ugimages/510/831/275/ugi-500x500.png");
		photoVO1.setBadge("Badge1");
		photoVO1.setLikes(1);
		photoVO1.setLiked(true);
		photoVO1.setAuthor("Mark");
		photoVO1.setLocation("Los Angeles");
		Metatag[] metatagArray1 = new Metatag[2];
		metatagArray1[0] = new Metatag("11", "GalleryMetaName", "GalleryMetaValue");
		metatagArray1[1] = new Metatag("12", "weekNumber","1");
		Metatags metatags = new Metatags();
		metatags.setMetatag(metatagArray1);
		photoVO1.setMetatags(metatags);
		photoVO1.setDatePosted("08/10/2012");
		photoVOs.add(photoVO1);

		PhotoVO photoVO2 = new PhotoVO();
		photoVO2.setMediaID("2");
		photoVO2.setUrl("http://media.marlboro.com/ugimages/510/831/275/ugi-500x500.png");
		photoVO2.setBadge("Badge2");
		photoVO2.setLikes(2);
		photoVO2.setLiked(true);
		photoVO2.setAuthor("Rahul");
		photoVO2.setLocation("Ahmedabad");
		Metatag[] metatagArray2 = new Metatag[2];
		metatagArray2[0] = new Metatag("22", "GalleryMetaName", "GalleryMetaValue");
		metatagArray2[1] = new Metatag("23", "weekNumber","2");
		metatags = new Metatags();
		metatags.setMetatag(metatagArray2);
		photoVO2.setMetatags(metatags);
		photoVO2.setDatePosted("07/31/2012");
		photoVOs.add(photoVO2);

		PhotoVO photoVO3 = new PhotoVO();
		photoVO3.setMediaID("3");
		photoVO3.setUrl("http://media.marlboro.com/ugimages/510/831/275/ugi-500x500.png");
		photoVO3.setBadge("Badge3");
		photoVO3.setLikes(3);
		photoVO3.setLiked(true);
		photoVO3.setAuthor("Mitul");
		photoVO3.setLocation("Bhavnagar");
		Metatag[] metatagArray3 = new Metatag[2];
		metatagArray3[0] = new Metatag("33", "GalleryMetaName", "GalleryMetaValue");
		metatagArray3[1] = new Metatag("34", "weekNumber","1");
		metatags = new Metatags();
		metatags.setMetatag(metatagArray3);
		photoVO3.setMetatags(metatags);
		photoVO3.setDatePosted("08/08/2012");
		photoVOs.add(photoVO3);

		PhotoVO photoVO4 = new PhotoVO();
		photoVO4.setMediaID("4");
		photoVO4.setUrl("http://media.marlboro.com/ugimages/510/831/275/ugi-500x500.png");
		photoVO4.setBadge("Badge4");
		photoVO4.setLikes(4);
		photoVO4.setLiked(true);
		photoVO4.setAuthor("Meet");
		photoVO4.setLocation("Rajkot");
		Metatag[] metatagArray4 = new Metatag[2];
		metatagArray4[0] = new Metatag("44", "GalleryMetaName", "GalleryMetaValue");
		metatagArray4[1] = new Metatag("45", "weekNumber","3");
		metatags = new Metatags();
		metatags.setMetatag(metatagArray4);
		photoVO4.setMetatags(metatags);
		photoVO4.setDatePosted("08/01/2012");
		photoVOs.add(photoVO4);

		PhotoVO photoVO5 = new PhotoVO();
		photoVO5.setMediaID("5");
		photoVO5.setUrl("http://media.marlboro.com/ugimages/510/831/275/ugi-500x500.png");
		photoVO5.setBadge("Badge5");
		photoVO5.setLikes(5);
		photoVO5.setLiked(true);
		photoVO5.setAuthor("Ballu");
		photoVO5.setLocation("Reston");
		Metatag[] metatagArray5 = new Metatag[2];
		metatagArray5[0] = new Metatag("51", "GalleryMetaName", "GalleryMetaValue");
		metatagArray5[1] = new Metatag("52", "weekNumber","3");
		metatags = new Metatags();
		metatags.setMetatag(metatagArray5);
		photoVO5.setMetatags(metatags);
		photoVO5.setDatePosted("08/04/2012");
		photoVOs.add(photoVO5);
		
		
		PhotoVO photoVO6 = new PhotoVO();
		photoVO6.setMediaID("6");
		photoVO6.setUrl("http://media.marlboro.com/ugimages/510/831/275/ugi-500x500.png");
		photoVO6.setBadge("Badge1");
		photoVO6.setLikes(10);
		photoVO6.setLiked(true);
		photoVO6.setAuthor("John");
		photoVO6.setLocation("Chicago");
		Metatag[] metatagArray6 = new Metatag[2];
		metatagArray6[0] = new Metatag("61", "GalleryMetaName", "GalleryMetaValue");
		metatagArray6[1] = new Metatag("62", "weekNumber","2");
		metatags = new Metatags();
		metatags.setMetatag(metatagArray6);
		photoVO6.setMetatags(metatags);
		photoVO6.setDatePosted("08/11/2012");
		photoVOs.add(photoVO6);

		PhotoVO photoVO7 = new PhotoVO();
		photoVO7.setMediaID("7");
		photoVO7.setUrl("http://media.marlboro.com/ugimages/510/831/275/ugi-500x500.png");
		photoVO7.setBadge("Badge2");
		photoVO7.setLikes(7);
		photoVO7.setLiked(true);
		photoVO7.setAuthor("Oleg");
		photoVO7.setLocation("Chicago");
		Metatag[] metatagArray7 = new Metatag[2];
		metatagArray7[0] = new Metatag("71", "GalleryMetaName", "GalleryMetaValue");
		metatagArray7[1] = new Metatag("72", "weekNumber","3");
		metatags = new Metatags();
		metatags.setMetatag(metatagArray7);
		photoVO7.setMetatags(metatags);
		photoVO7.setDatePosted("07/30/2012");
		photoVOs.add(photoVO7);

		PhotoVO photoVO8 = new PhotoVO();
		photoVO8.setMediaID("8");
		photoVO8.setUrl("http://media.marlboro.com/ugimages/510/831/275/ugi-500x500.png");
		photoVO8.setBadge("Badge3");
		photoVO8.setLikes(200);
		photoVO8.setLiked(true);
		photoVO8.setAuthor("Keshav");
		photoVO8.setLocation("Reston");
		Metatag[] metatagArray8 = new Metatag[2];
		metatagArray8[0] = new Metatag("81", "GalleryMetaName", "GalleryMetaValue");
		metatagArray8[1] = new Metatag("82", "weekNumber","9");
		metatags = new Metatags();
		metatags.setMetatag(metatagArray8);
		photoVO8.setMetatags(metatags);
		photoVO8.setDatePosted("08/06/2012");
		photoVOs.add(photoVO8);

		PhotoVO photoVO9 = new PhotoVO();
		photoVO9.setMediaID("9");
		photoVO9.setUrl("http://media.marlboro.com/ugimages/510/831/275/ugi-500x500.png");
		photoVO9.setBadge("Badge4");
		photoVO9.setLikes(9);
		photoVO9.setLiked(true);
		photoVO9.setAuthor("Sean");
		photoVO9.setLocation("Chicago");
		Metatag[] metatagArray9 = new Metatag[2];
		metatagArray9[0] = new Metatag("91", "GalleryMetaName", "GalleryMetaValue");
		metatagArray9[1] = new Metatag("92", "weekNumber","6");
		metatags = new Metatags();
		metatags.setMetatag(metatagArray9);
		photoVO9.setMetatags(metatags);
		photoVO9.setDatePosted("08/02/2012");
		photoVOs.add(photoVO9);

		PhotoVO photoVO10 = new PhotoVO();
		photoVO10.setMediaID("10");
		photoVO10.setUrl("http://media.marlboro.com/ugimages/510/831/275/ugi-500x500.png");
		photoVO10.setBadge("Badge5");
		photoVO10.setLikes(0);
		photoVO10.setLiked(true);
		photoVO10.setAuthor("Test");
		photoVO10.setLocation("Reston");
		Metatag[] metatagArray10 = new Metatag[2];
		metatagArray10[0] = new Metatag("100", "GalleryMetaName", "GalleryMetaValue");
		metatagArray10[1] = new Metatag("101", "weekNumber","1");
		metatags = new Metatags();
		metatags.setMetatag(metatagArray10);
		photoVO10.setMetatags(metatags);
		photoVO10.setDatePosted("08/01/2012");
		photoVOs.add(photoVO10);

		return photoVOs;
	
		
	}
	
}
