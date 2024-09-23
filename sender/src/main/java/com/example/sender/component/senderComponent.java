package com.example.sender.component;


import com.example.sender.service.senderService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class senderComponent implements CommandLineRunner {

    @Autowired
    public RabbitTemplate rabbitTemplate;

    @Autowired
    public senderService sender;

    @Override
    public void run(String... args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz \"exit\" aby zakonczyc lub swoja wiadomosc w odpowiednim miejscu:\n");

        while(true){

            System.out.println("Message: ");
            String msg = scanner.nextLine();

            if (msg.equals("exit")){
                System.out.println("Koniec");
                System.exit(0);
            }

            sender.sendMessage(msg);

        }

    }
}
