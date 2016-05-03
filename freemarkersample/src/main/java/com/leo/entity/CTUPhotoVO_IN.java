/**
 * In object for rest call on Gallery page. 
 */
package com.leo.entity;

/**
 * 
 * @author iCrossing
 *
 */
public class CTUPhotoVO_IN {

	private int index;
	private int count;
	private String sortBy;
	private int filter;
	
	/**
	 * @return the index
	 */
	public int getIndex() {
		return index;
	}
	/**
	 * @param index the index to set
	 */
	public void setIndex(int index) {
		this.index = index;
	}
	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}
	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}
	/**
	 * @return the sortBy
	 */
	public String getSortBy() {
		return sortBy;
	}
	/**
	 * @param sortBy the sortBy to set
	 */
	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}
	/**
	 * @return the filter
	 */
	public int getFilter() {
		return filter;
	}
	/**
	 * @param filter the filter to set
	 */
	public void setFilter(int filter) {
		this.filter = filter;
	}
	
	
}
