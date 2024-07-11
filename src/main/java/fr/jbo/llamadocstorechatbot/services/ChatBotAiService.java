package fr.jbo.llamadocstorechatbot.services;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class ChatBotAiService {
    private ChatClient chatClient;

    public ChatBotAiService(ChatClient.Builder chatClientBuilder) {
        this.chatClient = chatClientBuilder.build();
    }

    public String ragChat(String question){
        return chatClient.prompt()
                .user(question)
                .call()
                .content();
    }

}
