package com.leo.filters;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.leo.entity.PhotoVO;


public class CTUGalleryPhotoFilter {

	private PhotoFilter weekCriteriaFilter;

	
	public CTUGalleryPhotoFilter() {
		super();
	}
	
	/**
	 * @return the weekCriteriaFilter
	 */
	public PhotoFilter getWeekCriteriaFilter() {
		return weekCriteriaFilter;
	}

	/**
	 * @param weekCriteriaFilter the weekCriteriaFilter to set
	 */
	public void setWeekCriteriaFilter(PhotoFilter weekCriteriaFilter) {
		this.weekCriteriaFilter = weekCriteriaFilter;
	}
	
	
	public List<PhotoVO> filter(List<PhotoVO> photoList)
	{
		List<PhotoVO> searchResult = new ArrayList<PhotoVO>();
		if((photoList != null) && (photoList.size() > 0))
		{
			for (Iterator<PhotoVO> iterator = photoList.iterator(); iterator.hasNext();) 
			{
				PhotoVO photo = iterator.next();

				if(weekCriteriaFilter != null && weekCriteriaFilter.passes(photo))
				{
					searchResult.add(photo);	
				}
			}
		}
		return searchResult; 
	}
	
}
