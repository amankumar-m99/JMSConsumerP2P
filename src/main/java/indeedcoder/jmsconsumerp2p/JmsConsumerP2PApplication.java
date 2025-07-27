package indeedcoder.jmsconsumerp2p;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class JmsConsumerP2PApplication {

	public static void main(String[] args) {
		SpringApplication.run(JmsConsumerP2PApplication.class, args);
	}

}
