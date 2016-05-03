package com.pmusa.core.constants;

/**
 * @author skandagatla
 *
 */
public abstract class BaseCodes {
	
	/**
	 *  CODE_000 - Success
	 */
	public static  final String CODE_000 = "000";

	/**
	 *  CODE_003 - web service (machine-to-machine error, front-end-component-to-backend error) (systemic error)
	 */
	public static final String CODE_WEBSERVICE_ERROR = "003";

	/**
	 *  CODE_047 - Partner Interface failure - one of the partner transaction interfaces 
	 * temporary failure (recoverable error)
	 */
	public static final String CODE_BUSINESS_ERROR = "047";

	/**
	 * CODE_DATABASE_ERROR
	 */
	public static final String CODE_DATABASE_ERROR = "049";
	
	/**
	 * CODE_053 - User Input Error (recoverable - direct user input error)
	 */
	public static final String CODE_053 = "053";
	
	/**
	 *  CODE_054 - Observer Interface error - component missmatch (systemic error)
	 */
	public static final String CODE_054 = "054";
	
	/**
	 *  CODE_055 - Channel Interface error - request is not alloed in this channel (systemic error)
	 */
	public static final String CODE_055 = "055";
	


}
