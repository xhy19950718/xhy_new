package com.xhy_new_cms.util;
public class CmsMd5Util {
	/**
	 * @Title: stringToMd5   
	 * @Description: TODO(描述这个方法的作�?)   
	 * @param: @param str
	 * @param: @return      
	 * @return: String      
	 * @throws
	 */
	public static String string2MD5(String str) {
		return CmsMd5Util.string2MD5(str+"_cmsAdmin");
	}
}
