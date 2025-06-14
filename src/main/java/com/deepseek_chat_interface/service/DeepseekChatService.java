package com.deepseek_chat_interface.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class DeepseekChatService {
    private final ChatClient chatClient;

    public DeepseekChatService(ChatClient.Builder chatClientBuilder) {
        this.chatClient = chatClientBuilder.build();
    }

    public String deepseekQuery(String query) {
        return chatClient.prompt(query)
                .call().content();
    }

    public Flux<String> deepseekQueryStream(String query) {
        return chatClient.prompt(query)
                .stream().content();
    }

}
