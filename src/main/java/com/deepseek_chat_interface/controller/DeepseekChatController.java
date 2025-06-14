package com.deepseek_chat_interface.controller;

import com.deepseek_chat_interface.service.DeepseekChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/ai-chat")
public class DeepseekChatController {
    @Autowired
    private DeepseekChatService chatService;

    @GetMapping("/prompt")
    public String askLocalLLM(@RequestParam(value = "query") String query){
        return chatService.deepseekQuery(query);
    }

    @GetMapping("/prompt/stream")
    public Flux<String> askLocalLLMStream(@RequestParam(value = "query") String query){
        return chatService.deepseekQueryStream(query);
    }


}
