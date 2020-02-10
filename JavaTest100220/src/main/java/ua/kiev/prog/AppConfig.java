package ua.kiev.prog;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class AppConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("/static/**")
                .addResourceLocations("/WEB-INF/static/");
    }

    @Bean
    public CommandLineRunner demo(final ContactService contactService) {
        return new CommandLineRunner() {
            @Override
            public void run(String... strings) throws Exception {
               // Group group = new Group("Test");
              //  Contact contact;

             //   contactService.addGroup(group);
            }
        };
    }
}
