package fr.jbo.llamadocstorechatbot.controller;


import fr.jbo.llamadocstorechatbot.services.ChatBotAiService;
import lombok.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Value
@RestController
@RequestMapping("/chatbot")
public class ChatbotAiController {
    ChatBotAiService chatBotAiService;

    @GetMapping(value = "/ask",produces = MediaType.TEXT_PLAIN_VALUE)
    public String ask(String question) {
        return chatBotAiService.ragChat(question);
    }
}
