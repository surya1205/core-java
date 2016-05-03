/**
 * Validates Rest call.
 */
package com.leo.entity;

import java.util.ArrayList;


/**
 * 
 * @author iCrossing
 *
 */
public class ValidatorUtils {

	
	/**
	 * Validates LikeVO properties.
	 * @param likeVO
	 * @return
	 * @throws Exception 
	 */
	public static Error[] validateCTUPhotoVO_IN(CTUPhotoVO_IN in) throws Exception {
		ArrayList<Error> errorList = new ArrayList<Error>();
		
		if(in.getIndex()<0) {
			Error error = new Error("Index", "003", "Index should be greather then zero");
			errorList.add(error);
		}
		
		if(!(in.getSortBy().equalsIgnoreCase("popular") || in.getSortBy().equalsIgnoreCase("recent"))) {
			Error error = new Error("sortBy", "003", "Sort By should be recent or popular ");
			errorList.add(error);
		}
		
		//TODO Filter validation is pending.
		
		return errorList.toArray(new Error[errorList.size()]);
		
	}
	
}
