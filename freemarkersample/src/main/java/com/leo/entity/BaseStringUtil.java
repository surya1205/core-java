package com.leo.entity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.text.Normalizer;


/**
 */
public class BaseStringUtil
{
	private static final Log logger = LogFactory.getLog(BaseStringUtil.class);
	public static final boolean isEmpty(String s)
	{
		if (s == null)
		{
			return true;
		}

		if (s.trim().length() <= 0)
		{
			return true;
		}

		return false;
	}

	/**
	 * returns true if value exists
	 * @param s
	 * @return
	 */
	public static final boolean isNotEmpty(String s){
		return !isEmpty(s);
	}

	public static List delimitedStringToList(String delimStr, String delim)
	{
		ArrayList al = new ArrayList();
		String[] strArr = null;
		StringTokenizer tokenizer = null;
		try
		{
			if (delimStr == null || delimStr.length() <= 0)
			{
				return null;
			}

			delimStr = delimStr.trim();
			tokenizer = new StringTokenizer(delimStr, delim);
			if (tokenizer == null)
			{
				return null;
			}

			strArr = new String[tokenizer.countTokens()];
			while (tokenizer.hasMoreTokens())
			{
				String myValue = tokenizer.nextToken();
				al.add(myValue.trim());
			}
			return al;
		} catch (Exception e)
		{
			return null;
		}
	}

	public static List dedupList(String delimStr, String delim)
	{
		ArrayList al = new ArrayList();
		String[] strArr = null;
		StringTokenizer tokenizer = null;
		Map hash = new Hashtable();
		try
		{
			if (delimStr == null || delimStr.length() <= 0)
			{
				return null;
			}

			delimStr = delimStr.trim();
			tokenizer = new StringTokenizer(delimStr, delim);
			if (tokenizer == null)
			{
				return null;
			}

			strArr = new String[tokenizer.countTokens()];
			while (tokenizer.hasMoreTokens())
			{
				String myValue = tokenizer.nextToken();
				hash.put(myValue.trim(), myValue.trim());
			}

			Iterator iter = hash.keySet().iterator();
			while (iter.hasNext())
			{
				String strId = (String) iter.next();
				al.add(strId);
			}
			return al;
		} catch (Exception e)
		{
			return null;
		}
	}

	public static String getDelimitedString(String sourceString, String startDelimiter, String endDelimiter)
	{
		if (sourceString == null || startDelimiter == null || endDelimiter == null)
		{
			return null;
		}

		int startIndex = sourceString.indexOf(startDelimiter);
		int endIndex = sourceString.indexOf(endDelimiter, startIndex);

		if (startIndex != -1 && endIndex != -1)
		{
			return sourceString.substring(startIndex + startDelimiter.length(), endIndex);
		}

		return null;
	}

	/**
	 * Returns String constructed by given List of String using given delimitor
	 * 
	 * @param delim
	 * @param l
	 * @return
	 */
	public static String getDelimString(String delim, Collection l)
	{
		if (l == null)
			return null;

		StringBuffer s = new StringBuffer();
		Iterator i = l.iterator();
		while (i.hasNext())
		{
			s.append(((Object) i.next()).toString());

			if (i.hasNext())
				s.append(delim);
		}

		return s.toString();
	}

	public static String getEmptyFromNull(String str)
	{
		if (str == null)
		{
			return "";
		} else
		{
			return str;
		}

	}

	public static String getEmptyFromNullTrim(String str)
	{
		if (str == null)
		{
			return "";
		} else
		{
			return str.trim();
		}

	}

	public static String prepend(String str, char padChar, int length)
	{
		if(str!=null)
		{
			StringBuffer buffer = new StringBuffer(str.trim());
			if(str.length()<length)
			{
				for(int i=0;i<length-str.length();i++)
				{
					buffer.insert(0, padChar);
				}
			}

			return buffer.toString();
		}

		return null;
	}

	/**
	 * Simplifies input to its simplest form to make encoding tricks more difficult
	 * This is to avoid Cross Site Scripting
	 *
	 * @param input
	 * @return canonicalized string
	 */
	public static String canonicalize(String input) {
		String canonical = null;
		canonical = java.text.Normalizer.normalize( input, Normalizer.Form.NFD );
		return canonical;
	}

	/**
	 * converts interger array values to comma delimted string
	 * @param intTypes
	 * @return
	 */
	public static String convertToCommaDelimitedString(int[] intTypes)
	{
		String  delimitedString = "";
		if(intTypes != null){

			for(int i=0; i<intTypes.length; i++){
				delimitedString += String.valueOf(intTypes[i])+",";
			}
		}
		if(!isEmpty(delimitedString)){
			delimitedString = delimitedString.substring(0, delimitedString.length()-1);
		}
		return delimitedString;
	}

	/**
	 * Convert delimited string to string array
	 * 
	 * @param delimStr
	 * @param delim
	 * @return
	 */
	public static String[] delimitedStringToArray(String delimStr, String delim)
	{
		String[] strArr = null;
		StringTokenizer tokenizer = null;
		if ((!isEmpty(delimStr)) && (!isEmpty(delim)))
		{
			delimStr = delimStr.trim();
			tokenizer = new StringTokenizer(delimStr, delim);
			strArr = new String[tokenizer.countTokens()];
			int i =0;
			while (tokenizer.hasMoreTokens())
			{
				String myValue = tokenizer.nextToken();
				strArr[i] = myValue.trim();
				i++;
			}
		}
		return strArr;
	}

	/**
	 * @param st
	 * @param delimiter
	 * @return
	 */
	public static String getDelimitedString(String[] st, String delimiter){
		String delimitedString ="";
		if(st  != null){
			for(String s : st){
				if(s != null){
					delimitedString += s+delimiter;
				}
			}
		}
		if(isNotEmpty(delimitedString)){
			delimitedString = delimitedString.substring(0, delimitedString.length()-1);
		}
		return delimitedString;
	}

	/**
	 * @param stringList
	 * @param delimiter
	 * @return
	 */
	public static String getDelimitedString(List stringList, String delimiter){
		String delimitedString ="";
		if(stringList  != null){
			for(int i =0; i<stringList.size(); i++){
				String s = (String)stringList.get(i);
				if(s != null){
					delimitedString += s+delimiter;
				}
			}
		}
		if(isNotEmpty(delimitedString)){
			delimitedString = delimitedString.substring(0, delimitedString.length()-1);
		}
		return delimitedString;
	}

	/**
	 * checks if the string array  passed is in allowed string array
	 * @param passed
	 * @param allowed
	 * @return
	 */
	public static boolean isValidStringArray(String[] passed, String[] allowed){

		for(String p: passed){
			boolean isValid = false;
			if(isNotEmpty(p)){
				for(String a : allowed){
					if(isNotEmpty(a)){
						if(p.equalsIgnoreCase(a)){
							isValid = true;
							break;
						}
					}
				}
				if(!isValid){
					return false;
				}
			}
		}
		return true;

	}




	/*
	 * This method will convert the input List of Strings which are numbers in String format to a List of Integers   
	 *  
	 */

	public static List<Integer> convertListOfStringsToListOfInteger(List<String> listOfStrings)
	{
		List<Integer> listOfInteger = new ArrayList<Integer>(); 
		for (Iterator iterator = listOfStrings.iterator(); iterator.hasNext();) 
		{
			String strObj = (String) iterator.next();
			listOfInteger.add(new Integer(strObj));
		}
		return listOfInteger;
	}

	/**
	 * @param str
	 * @param aStrings
	 * @return
	 */
	public static  boolean doesStringExistInArray(String str,	String[] aStrings) {

		boolean stringExists = false;
		if(aStrings != null){
			for(String ec: aStrings ){
				if(ec != null){
					if((ec.trim()).equalsIgnoreCase(str.trim())){
						stringExists = true;
						break;
					}
				}
			}
		}
		return stringExists;
	}

	/**
	 * consturcts parameters for URL
	 * @param packageDataMap
	 * @param separator
	 * @return
	 */
	public static String generateURLParameters(HashMap<String, String> packageDataMap){
		String urlParameters = "";
		Iterator it = packageDataMap.entrySet().iterator(); 
		while (it.hasNext()) { 
			Map.Entry packageData = (Map.Entry)it.next(); 
			urlParameters += packageData.getKey()+"="+packageData.getValue()+"&";
		}
		if(isNotEmpty(urlParameters)){
			urlParameters = urlParameters.substring(0,urlParameters.length()-1);
		}
		return  urlParameters;

	}

	/**
	 * Checks whether the input String is an int/long
	 * 
	 * @param input
	 * @return
	 */
	public static boolean checkIntLong(String input)
	{
		boolean check = false;
		if(!isEmpty(input))
		{
			try {
				if(input.length() < 10)
				{
					int intInput = Integer.parseInt(input);
				} else
				{
					long longInput = Long.parseLong(input);
				}
				check = true;
			} catch (NumberFormatException nfe) 
			{
				logger.debug("StringUtil.checkIntLong: Not a number. \n Input String - " + input);
			} catch (Exception e)
			{
				logger.debug("StringUtil.checkIntLong: Exception occurred. \n Input String - " + input);
			}
		} 
		return check;
	}

	/**
	 * compares two strings and returns true if they are same. Null and empty strings considered equal.
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static boolean areTwoStringsEqual(String str1, String str2){
		boolean isEqual = false;
		if((isNotEmpty(str1)) && (isNotEmpty(str2))){
			if(str1.equalsIgnoreCase(str2)){
				isEqual = true;
			}
		}else if((isEmpty(str1)) && (isEmpty(str2))){
			isEqual = true;
		}

		return isEqual;

	}

	/**
	 * checks if input String exists in delimited String
	 * @param delimitedString
	 * @param delimiter
	 * @param input
	 * @return
	 */
	public static boolean isDelimitedStringContainsInput(String delimitedString, String delimiter, String input){
		String[] str = null;
		if(delimitedString != null){
			str = delimitedString.split(delimiter);
		}
		return doesStringExistInArray(input, str);

	}
	
	/**
	 * This function left pads the input number String with (finalLength - ipNumber.length)
	 * number of zeros. If the input Number String is null/empty, null is returned. If finalLength
	 * is less than or equal to ipNumber.length, trimmed ipNumber is returned.
	 * 
	 * @param ipNumber
	 * @param finalLength
	 * @return
	 */
	public static String leftPadZerosToNumber(String ipNumber, int finalLength)
	{
		String opNumber = null;
		if(!isEmpty(ipNumber))
		{
			logger.debug("BaseStringUtil.leftPadZerosToNumber: ipNumber - " + ipNumber);
			String interNumber = ipNumber.trim();
			logger.debug("BaseStringUtil.leftPadZerosToNumber: interNumber - " + interNumber);
			if(interNumber.length() < finalLength)
			{
				opNumber = String.format("%0" + finalLength + "d", Long.parseLong(interNumber)); 
			} else
			{
				opNumber = interNumber;
			}
		}
		logger.debug("BaseStringUtil.leftPadZerosToNumber: opNumber - " + opNumber);
		return opNumber;
	}

}
