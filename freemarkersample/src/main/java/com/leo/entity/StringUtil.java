package com.leo.entity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 */
public class StringUtil extends BaseStringUtil
{
	private static final Log logger = LogFactory.getLog(StringUtil.class);

	/**
	 * @param ccn
	 * @return
	 * @throws AtlasBusinessException
	 */
	public static boolean isCCNValid(String ccn) 
	{
		boolean isCCNValid = false;
		try {
			if(!isEmpty(ccn))
			{
				long longCCN = Long.parseLong(ccn);
				isCCNValid = true;
			}
		} catch (NumberFormatException nfe) {
		}

		return isCCNValid;
	}
	
	public static String findDelimiter(String inputString)
	{
		
		if(null == inputString)
			return null;
		
		String separator = null;
		int strLen = inputString.length();
		for(int i = 0; i< strLen; i++)
	            {
	               String myLetter = inputString.substring(i,i+1);
	               if(myLetter.matches("\\W"))
	               {
	            	    separator = myLetter;
	            	    break;
	               }
	             }

		logger.debug("StringUtil::findDelimiter :: Delimiter ==" + separator);
		return separator;
	}

}
