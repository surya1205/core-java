/**
 * Description : GalleryPhotoCacheManager 
 */
package com.leo.cache;

import java.util.Hashtable;
import java.util.List;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.leo.entity.PhotoVO;

/**
 * 
 * @author iCrossing
 *
 */
public class GalleryPhotoCacheManager {

	private static final Log logger = LogFactory
			.getLog(GalleryPhotoCacheManager.class);

	private static final String GALLERY_PHOTOS_CACHE_NAME = "galleryPhotoCache";

	private static final String CACHED_PHOTOLIST = "photoList";
	
	private Hashtable caches;

	public GalleryPhotoCacheManager()
			throws AtlasBusinessException {
		init();
	}

	/**
	 * Init method to load cache.
	 * @throws AtlasBusinessException
	 */
	private void init() throws AtlasBusinessException {

		logger.debug("GalleryPhotoCacheManager.init method begins");

		try {

			caches = new Hashtable();

			initCache();

		} catch (AtlasBusinessException e) {
			throw e;
		}

	}

	/**
	 * Initializes caches and add cache into cache manager.
	 * @throws AtlasBusinessException
	 */
	private void initCache() throws AtlasBusinessException {

		CacheManager cacheManager = null;
		int maxElementsInMemory = 0;
		int timeToLiveSeconds = 0;
		int timeToIdleSeconds = 0;

		try {
			cacheManager = CacheManager.create();
			maxElementsInMemory = 500;
			timeToLiveSeconds = 86400;
			timeToIdleSeconds = 86400;

			logger.info("initCache: The parameters for GalleryPhotoCache cache Initialization"
					+ " read from properties file - ");
			logger.info("maxElementsInMemory - " + maxElementsInMemory
					+ " timeToLiveSeconds - " + timeToLiveSeconds
					+ " timeToIdleSeconds - " + timeToIdleSeconds);

			Cache galleryPhotoCache = new Cache(GALLERY_PHOTOS_CACHE_NAME,
					maxElementsInMemory, true, false, timeToLiveSeconds,
					timeToIdleSeconds);

			String[] existingcaches = cacheManager.getCacheNames();
			for (int i = 0; i < existingcaches.length; i++) {
				logger.info("initCache: Iteration " + i + "-"
						+ existingcaches[i]);
				if (existingcaches[i].equals(GALLERY_PHOTOS_CACHE_NAME)) {
					cacheManager.removeCache(GALLERY_PHOTOS_CACHE_NAME);
					break;
				}
			}

			cacheManager.addCache(galleryPhotoCache);
			caches.put(GALLERY_PHOTOS_CACHE_NAME,
					cacheManager.getCache(GALLERY_PHOTOS_CACHE_NAME));
		} catch (Exception e) {
			logger.error(
					"GalleryPhotoCacheManager.initCache: Exception occurred while initializing"
							+ " GalleryPhotoCache cache. maxElementsInMemory,"
							+ maxElementsInMemory + "timeToLiveSeconds,"
							+ timeToLiveSeconds + "timeToIdleSeconds"
							+ timeToIdleSeconds, e);
		}

	}
	
	/**
	 * sets the photoList in cache.
	 * @throws AtlasBusinessException
	 */
	public synchronized void setPhotoListInCache() throws AtlasBusinessException {
		
		if(!areGalleryPhotosInCache()) {
			List<PhotoVO> photoVOList = GallerySampleDataUtil.getSampleGalleryData();
			
			Element element = null;
			Cache cache = null;
			cache = Cache.class.cast(caches.get(GALLERY_PHOTOS_CACHE_NAME));
			element = new Element(CACHED_PHOTOLIST, photoVOList);
			cache.put(element);	
		}
		
	}
	
	/**
	 * Define if the galleryPhotoList, is in cache.
	 * 
	 * @return boolean
	 */
	public boolean areGalleryPhotosInCache() 
	{
		Cache cache = null;
		Element element = null;
		boolean areGalleryPhotosInCache = false;

		cache = (Cache) caches.get(GALLERY_PHOTOS_CACHE_NAME);
		element = cache.get(CACHED_PHOTOLIST);

		areGalleryPhotosInCache = ((null != element) && (null != element.getValue()));

		if (areGalleryPhotosInCache)
		{
			logger.debug("areGalleryPhotosInCache: Gallery Photos are in Cache.");
		} else
		{
			logger.debug("areGalleryPhotosInCache: Gallery Photos are not found in Cache.");
		}

		return areGalleryPhotosInCache;
	}

	/**
	 * Return the PhotoList in Cache.
	 * @return
	 * @throws AtlasBusinessException
	 */
	public List<PhotoVO> getPhotoListFromCache() throws AtlasBusinessException {
		
		if(!areGalleryPhotosInCache()) {
			setPhotoListInCache();
		}
		
		Cache cache = null;
		Element element = null;
		List<PhotoVO> photoList = null;

		cache = (Cache) caches.get(GALLERY_PHOTOS_CACHE_NAME);
		element = cache.get(CACHED_PHOTOLIST);

		if ((null != element) && (null != element.getValue()))
		{
			photoList = List.class.cast(element.getValue());
		}
		return photoList;
		
	}
	
}
