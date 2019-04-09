package io.kafkaesque;

import org.apache.pulsar.client.api.*;
import java.io.IOException;

public class simpleProducer {

    private static final String SERVICE_URL = "pulsar+ssl://useast1.gcp.kafkaesque.io:6651";

    public static void main(String[] args) throws IOException
    {

        // Create client object
        PulsarClient client = PulsarClient.builder()
                .serviceUrl(SERVICE_URL)
                .authentication(
                        AuthenticationFactory.token("<INSERT CLIENT TOKEN HERE>")
                )
                .build();

        // Create producer on a topic
        Producer<byte[]> producer = client.newProducer()
                .topic("persistent://chris-kafkaesque-io/local-useast1-gcp/tc1-messages")
                .create();

        // Send a message to the topic
        producer.send("Hello World".getBytes());

        //Close the producer
        producer.close();

        // Close the client
        client.close();

    }

}
