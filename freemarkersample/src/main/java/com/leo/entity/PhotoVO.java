/**
 * 
 */
package com.leo.entity;


/**
 * @author iCrossing
 * 
 */
public class PhotoVO {

	private String mediaID;
	private String url;
	private String badge;
	private int likes;
	private boolean liked;
	private String author;
	private String location;
	private Metatags metatags;
	private String datePosted;
	
	/**
	 * @return the mediaID
	 */
	public String getMediaID() {
		return mediaID;
	}
	/**
	 * @param mediaID the mediaID to set
	 */
	public void setMediaID(String mediaID) {
		this.mediaID = mediaID;
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * @return the badge
	 */
	public String getBadge() {
		return badge;
	}
	/**
	 * @param badge the badge to set
	 */
	public void setBadge(String badge) {
		this.badge = badge;
	}
	/**
	 * @return the likes
	 */
	public int getLikes() {
		return likes;
	}
	/**
	 * @param likes the likes to set
	 */
	public void setLikes(int likes) {
		this.likes = likes;
	}
	/**
	 * @return the liked
	 */
	public boolean isLiked() {
		return liked;
	}
	/**
	 * @param liked the liked to set
	 */
	public void setLiked(boolean liked) {
		this.liked = liked;
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @return the metatags
	 */
	public Metatags getMetatags() {
		return metatags;
	}
	/**
	 * @param metatags the metatags to set
	 */
	public void setMetatags(Metatags metatags) {
		this.metatags = metatags;
	}
	/**
	 * @return the datePosted
	 */
	public String getDatePosted() {
		return datePosted;
	}
	/**
	 * @param datePosted the datePosted to set
	 */
	public void setDatePosted(String datePosted) {
		this.datePosted = datePosted;
	}

	
	
}
