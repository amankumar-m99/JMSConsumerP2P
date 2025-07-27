package indeedcoder.jmsconsumerp2p.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerService {

	@JmsListener(destination = "${my.own.key.for.destination}")
	public void readMessage(String message) {
		System.out.println("Msg received:" + message);
	}
}
