package com.neoflex.deliveryservice.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.neoflex.deliveryservice.model.DeliveryOrder;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.example.dto.delivery.message.DeliveryMessageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaProducerConfig {

    @Value(value = "${spring.kafka.producer.bootstrap-servers}")
    private String bootstrapAddress;

    @Autowired
    private ObjectMapper objectMapper;

    @Bean
    public ProducerFactory<String, DeliveryMessageDto> deliveryProducerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        StringSerializer keySerializer = new StringSerializer();
        JsonSerializer<DeliveryMessageDto> valueSerializer = new JsonSerializer<>(objectMapper);
        return new DefaultKafkaProducerFactory<>(configProps, keySerializer, valueSerializer);
    }

    @Bean
    public KafkaTemplate<String, DeliveryMessageDto> deliveryKafkaTemplate() {
        return new KafkaTemplate<>(deliveryProducerFactory());
    }
}
