package io.kafkaesque;

import org.apache.pulsar.client.api.*;
import java.io.IOException;

public class simpleProducer {

    private static final String SERVICE_URL = "";
    private static final String TOKE_STRING = "";
    private static final String TOPIC = "";

    public static void main(String[] args) throws IOException
    {

        // Create client object
        PulsarClient client = PulsarClient.builder()
                .serviceUrl(SERVICE_URL)
                .authentication(
                    AuthenticationFactory.token(TOKE_STRING)
                )
                .build();

        // Create producer on a topic
        Producer<byte[]> producer = client.newProducer()
                .topic(TOPIC)
                .create();

        // Send a message to the topic
        producer.send("Hello World".getBytes());

        //Close the producer
        producer.close();

        // Close the client
        client.close();

    }

}