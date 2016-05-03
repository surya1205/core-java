package com.leo.sorts;

import java.util.Comparator;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.leo.entity.PhotoVO;


public class GalleryPhotoLikesComparator implements Comparator<PhotoVO> {

	private static final Log logger = LogFactory
			.getLog(GalleryPhotoLikesComparator.class);

	public int compare(PhotoVO photoVO1, PhotoVO photoVO2) {

		int value = 0;
		int likes1 = 0;
		int likes2 = 0;

		if (photoVO1 != null && photoVO2 != null) {
			likes1 = photoVO1.getLikes();
			likes2 = photoVO2.getLikes();
			try {

				Integer lk1 = Integer.valueOf(likes1);
				Integer lk2 = Integer.valueOf(likes2);
				// comparator default is Ascending order. Here reverse
				// comparison is used to get the descending order of the likes.
				value = lk2.compareTo(lk1);
			} catch (NumberFormatException e) {
				logger.error("GalleryPhotoLikesComparator : compare : exception occured for"
						+ " likes1=" + likes1 + ",likes2=" + likes2);
			}

		} else {
			logger.debug("GalleryPhotoLikesComparator : compare  :one of the comparing objects"
					+ " null: photoVO1=" + photoVO1 + ",photoVO2=" + photoVO2);
		}

		return value;
	}

}
