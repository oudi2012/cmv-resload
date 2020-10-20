package com.mycmv.resload;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author a
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.mycmv"})
@MapperScan("com.mycmv.resload.mapper")
public class CmvResLoadApplication {

	private static final Logger log = LoggerFactory.getLogger(CmvResLoadApplication.class);

	public static void main(String[] args) throws UnknownHostException {
		SpringApplication app = new SpringApplication(CmvResLoadApplication.class);
		Environment env = app.run(args).getEnvironment();
		String protocol = "http";
		if (env.getProperty("server.ssl.key-store") != null) {
			protocol = "https";
		}
		log.info("\n----------------------------------------------------------\n\t" +
						"Application '{}' is running! Access URLs:\n\t" +
						"Local: \t\t{}://localhost:{}\n\t" +
						"External: \t{}://{}:{}\n\t" +
						"Profile(s): \t{}\n----------------------------------------------------------",
				env.getProperty("spring.application.name"),
				protocol,
				env.getProperty("server.port"),
				protocol,
				InetAddress.getLocalHost().getHostAddress(),
				env.getProperty("server.port"),
				env.getActiveProfiles());
	}

}
