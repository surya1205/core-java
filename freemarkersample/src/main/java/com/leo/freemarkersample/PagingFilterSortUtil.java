package com.leo.freemarkersample;

import java.util.Collections;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.leo.entity.PhotoVO;
import com.leo.entity.StringUtil;
import com.leo.filters.CTUGalleryPhotoFilter;
import com.leo.filters.PhotoFilter;
import com.leo.filters.PhotoWeekCriteria;
import com.leo.sorts.GalleryPhotoDatePostComparator;
import com.leo.sorts.GalleryPhotoLikesComparator;

public class PagingFilterSortUtil {

	private static final Log logger = LogFactory.getLog(PagingFilterSortUtil.class);

	public static List<PhotoVO> filterPhotos(List<PhotoVO> photoList,
			String filterTag, String filterTagValue) {
		logger.debug("FilterSortUtil.filterPhotos method begins");

		List<PhotoVO> filteredPhotoList = null;

		if ((photoList != null) && (photoList.size() > 0)
				&& (!StringUtil.isEmpty(filterTag))
				&& (!StringUtil.isEmpty(filterTagValue))) {

			CTUGalleryPhotoFilter ctuGalleryPhotoFilter = new CTUGalleryPhotoFilter();
			PhotoFilter weekNumberCriteria = new PhotoWeekCriteria(
					filterTagValue);
			ctuGalleryPhotoFilter.setWeekCriteriaFilter(weekNumberCriteria);
			filteredPhotoList = ctuGalleryPhotoFilter.filter(photoList);

		}

		return filteredPhotoList;
	}

	public static List<PhotoVO> sortPhotos(List<PhotoVO> photoList,
			String sortBy, String sortOrder) {

		if (photoList != null && photoList.size() > 0) {
			if (StringUtil.isNotEmpty(sortBy)) {

				if (sortBy.equalsIgnoreCase("popular")) {
					Collections.sort(photoList,
							new GalleryPhotoLikesComparator());
				} else if (sortBy.equalsIgnoreCase("recent")) {
					Collections.sort(photoList,
							new GalleryPhotoDatePostComparator());
				}

			}
			if (StringUtil.isNotEmpty(sortOrder)) {
				if (sortOrder
						.equalsIgnoreCase("asc")) {
					Collections.reverse(photoList);
				}
			}
		}

		return photoList;
	}
	
	public static List<PhotoVO> getPaginatedList(List<PhotoVO> photoList,int index,int count) {
		
		if(photoList!=null && photoList.size()>0) {
		
			int photoListSize = photoList.size();
			
			int fromIndex = index-1;
			
			int toIndex = fromIndex + count;
			
			toIndex = photoListSize>toIndex?toIndex:photoListSize;
			
			return photoList.subList(fromIndex, toIndex);
		} else {
			return photoList;
		}
		
	}
}
