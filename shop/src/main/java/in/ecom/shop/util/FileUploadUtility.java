/**
 * 
 */
package in.ecom.shop.util;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author kumasuch
 *
 */
public class FileUploadUtility {

	private static final Logger logger = LoggerFactory.getLogger(FileUploadUtility.class);

	private static final String ABS_PATH = "C:\\MY Folder\\My Projects\\online-shopping\\shop\\src\\main\\webapp\\assets\\images/";
	private static String REAL_PATH = "";

	public static void uploadFile(HttpServletRequest request, MultipartFile file, String code) {

		// get Real Path of the file
		REAL_PATH = request.getSession().getServletContext().getRealPath("/assets/images/");

		logger.info("Absolute PAth :" + ABS_PATH);
		logger.info("Real Path" + REAL_PATH);

		if (!new File(ABS_PATH).exists()) {
			// create the directory tree
			new File(ABS_PATH).mkdirs();

		}

		if (!new File(REAL_PATH).exists()) {
			// create the directory tree
			new File(REAL_PATH).mkdirs();

		}

		try {
			file.transferTo(new File(ABS_PATH + code + ".jpg"));
			file.transferTo(new File(REAL_PATH + code + ".jpg"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
