package org.apache.activemq.book.ch7.spring;

import org.apache.activemq.book.ch6.Publisher;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BrokerFactoryBeanNew {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.err.println("Please define a configuration file!");
            return;
        }
        String config = args[0];
        System.out.println("Starting broker with the following configuration: " + config);
        System.setProperty("activemq.base", System.getProperty("user.dir"));

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(config);

        Publisher publisher = new Publisher();
        for (int i = 0; i < 100; i++) {
            publisher.sendMessage(new String[]{"JAVA", "IONA"});
        }

    }

}
