package org.scode.program.parking;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * start
 * @author sc
 * @since 2021-04-21
 */
@SpringBootApplication
public class ProgramApplication extends SpringBootServletInitializer {
	/** 打印日志 **/
	private static Logger logger = LoggerFactory.getLogger("application");
	
	public static void main(String[] args) {
		SpringApplication.run(ProgramApplication.class, args);
		logger.info("program strart sucess...");
	}

}
