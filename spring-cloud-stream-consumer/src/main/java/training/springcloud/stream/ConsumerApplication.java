package training.springcloud.stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

import training.springcloud.stream.binder.MessageBinding;

@SpringBootApplication
@EnableBinding(MessageBinding.class)
public class ConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}
}