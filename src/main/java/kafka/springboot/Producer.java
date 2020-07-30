package kafka.springboot;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 生产者
 *
 * @author wangkai 2019/1/12
 */
@Component
public class Producer {

	@Resource
	KafkaTemplate<String, String> kafkaTemplate;

	public void sendMessage(String topic, String message) {
		kafkaTemplate.send(topic, message);
	}
}
