package com.ayoub.telephone;

import com.ayoub.telephone.entities.Telephone;
import com.ayoub.telephone.repos.telephoneRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@EnableFeignClients
@SpringBootApplication
public class TelephoneMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TelephoneMicroserviceApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(telephoneRepository telrepos) {
        return args -> {

            telrepos.save(
                    Telephone.builder()
                            .nomTelephone("Samsung Galaxy A15")
                            .codeTelephone("SAM-A15")
                            .Prix(800)
                            .idEtat("2")
                            .build()
            );

            telrepos.save(
                    Telephone.builder()
                            .nomTelephone("iPhone 15")
                            .codeTelephone("IPH-15")
                            .Prix(3000)
                            .idEtat("1")
                            .build()
            );
        };
    }
    @Bean
    public WebClient webClient(){
        return WebClient.builder().build();
    }

}
