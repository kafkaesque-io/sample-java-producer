package io.kafkaesque;

import org.apache.pulsar.client.api.*;
import java.io.IOException;

public class simpleProducer {

    private static final String SERVICE_URL = "pulsar://ASIAEAST2.GCP.KAFKAESQUE.IO:6650";

    public static void main(String[] args) throws IOException
    {

        // Create client object
        PulsarClient client = PulsarClient.builder()
                .serviceUrl(SERVICE_URL)
                .build();

        // Create producer on a topic
        Producer<byte[]> producer = client.newProducer()
                .topic("persistent://mytenant2/local-asiaeast2-gcp/tc2-messages")
                .create();

        // Send a message to the topic
        producer.send("Hello World".getBytes());

        //Close the producer
        producer.close();

        // Close the client
        client.close();

    }

}
