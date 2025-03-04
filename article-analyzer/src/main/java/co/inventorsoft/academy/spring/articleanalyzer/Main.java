package co.inventorsoft.academy.spring.articleanalyzer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Main {
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Main.class, args);
		ArticleAnalyzer articleAnalyzer = applicationContext.getBean("articleAnalyzer", ArticleAnalyzer.class);
		articleAnalyzer.analyze();
		applicationContext.close();
	}
}
