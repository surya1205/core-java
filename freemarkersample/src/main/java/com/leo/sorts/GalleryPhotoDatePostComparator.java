package com.leo.sorts;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.leo.entity.PhotoVO;
import com.leo.entity.StringUtil;



public class GalleryPhotoDatePostComparator implements Comparator<PhotoVO> {

	private static final Log logger = LogFactory
			.getLog(GalleryPhotoDatePostComparator.class);

	public int compare(PhotoVO photoVO1, PhotoVO photoVO2) {

		int value = 0;
		String strDate1 = null;
		String strDate2 = null;
		Date date1 = null;
		Date date2 = null;

		if (photoVO1 != null && photoVO2 != null) {
			strDate1 = photoVO1.getDatePosted();
			strDate2 = photoVO2.getDatePosted();

			try {
				if (StringUtil.isNotEmpty(strDate1)
						&& StringUtil.isNotEmpty(strDate2)) {
					date1 = new SimpleDateFormat("MM/dd/yyyy").parse(strDate1);

					date2 = new SimpleDateFormat("MM/dd/yyyy").parse(strDate2);
					// comparator default is Ascending order. Here reverse
					// comparison is used to get the descending order of the
					// tripdates.
					value = date2.compareTo(date1);
				}
			} catch (ParseException e) {
				logger.error("GalleryPhotoDatePostComparator : compare : exception occured for"
						+ " strDate1=" + strDate1 + ",strDate2=" + strDate2);
			}
		} else {
			logger.debug("GalleryPhotoDatePostComparator : compare  :one of the comparing objects"
					+ " null: photoVO1=" + photoVO1 + ",photoVO2=" + photoVO2);
		}
		return value;
	}

}
