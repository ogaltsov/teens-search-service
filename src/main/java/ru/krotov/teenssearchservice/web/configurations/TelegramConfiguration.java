package ru.krotov.teenssearchservice.web.configurations;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.meta.ApiContext;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import ru.krotov.teenssearchservice.web.clients.Bot;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

@Configuration
public class TelegramConfiguration {

	@Bean
	TelegramBotsApi telegramBotsApi() {
		return new TelegramBotsApi();
	}

	@Bean
	@ConfigurationProperties(prefix = "telegram.default-bot-options")
	DefaultBotOptionsConfigurationProperties defaultBotOptionsConfigurationProperties() {
		return new DefaultBotOptionsConfigurationProperties();
	}

	@Bean
	public DefaultBotOptions defaultBotOptions(DefaultBotOptionsConfigurationProperties defaultBotOptionsConfigurationProperties) {

		Authenticator.setDefault(new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(
						defaultBotOptionsConfigurationProperties.getProxyUser(),
						defaultBotOptionsConfigurationProperties.getProxyPassword().toCharArray());
			}
		});

		DefaultBotOptions defaultBotOptions = ApiContext.getInstance(DefaultBotOptions.class);
		defaultBotOptions.setProxyHost(defaultBotOptionsConfigurationProperties.getProxyHost());
		defaultBotOptions.setProxyPort(defaultBotOptionsConfigurationProperties.getProxyPort());
		defaultBotOptions.setProxyType(defaultBotOptionsConfigurationProperties.getProxyType());
		return defaultBotOptions;
	}

	@Bean
	public Bot bot(TelegramBotsApi telegramBotsApi, DefaultBotOptions defaultBotOptions) {
		try {
			Bot bot = new Bot(defaultBotOptions);
			telegramBotsApi.registerBot(bot);
			return bot;
		} catch (TelegramApiRequestException e) {
			throw new RuntimeException(e);
		}
	}
}