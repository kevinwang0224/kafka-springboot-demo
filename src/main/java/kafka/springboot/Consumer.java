package kafka.springboot;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * 消费者
 *
 * @author wangkai 2019/1/12
 */
@Component
public class Consumer {

	@KafkaListener(topics = { "test-topic" })
	public void receiveMessage(String message) {
		System.out.println(message);
	}

}
