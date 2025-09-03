package com.example.autocomplete;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class TrieController {

    private Tries trie;

    public TrieController() {
        trie = new Tries();
        String[] words = {"apple", "application", "apt", "bat", "ball", "cat", "dog", "door", "dove", "hello", "hi"};
        for (String w : words) trie.insert(w);
    }

    @GetMapping("/autocomplete")
    public List<String> autocomplete(@RequestParam String prefix) {
        List<String> results = new ArrayList<>();
        trie.autocomplete(prefix.toLowerCase(), results);
        return results;
    }
}