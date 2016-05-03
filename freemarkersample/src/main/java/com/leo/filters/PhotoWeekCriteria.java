package com.leo.filters;

import com.leo.entity.Metatag;
import com.leo.entity.Metatags;
import com.leo.entity.PhotoVO;
import com.leo.entity.StringUtil;



public class PhotoWeekCriteria implements PhotoFilter {

	private String weekNumnber;

	public PhotoWeekCriteria() {
		super();
	}
	
	public PhotoWeekCriteria(String weekNumber) {
		this.weekNumnber = weekNumber;
	}

	public boolean passes(Object o) {

		boolean passed = false;
		try {

			if (weekNumnber != null && weekNumnber.length() > 0 && o != null) {
				PhotoVO photo = (PhotoVO) o;

				Metatags metatags = null;
				metatags = photo.getMetatags();
				if (metatags != null) {
					Metatag[] aMetatag = null;
					aMetatag = metatags.getMetatag();
					if ((aMetatag != null) && (aMetatag.length > 0)) {
						for (int i = 0; i < aMetatag.length; i++) {
							if (aMetatag[i] != null) {
								String metatagName = null;
								metatagName = aMetatag[i].getName();
								if (!StringUtil.isEmpty(metatagName) && metatagName
										.equalsIgnoreCase("weekNumber")) {
										String tWeekNumber = null;
										tWeekNumber = aMetatag[i].getValue();
										if (!StringUtil.isEmpty(tWeekNumber)) {
											if(tWeekNumber.equals(weekNumnber)) {
												passed = true;
												break;
											}
										}
								}
							}
						}
					}
				}
			}
		} catch (Exception e) {
		}
		return passed;
	}

}
