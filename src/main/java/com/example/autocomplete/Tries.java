package com.example.autocomplete;

import java.util.*;

public class Tries {
    private TrieNode root = new TrieNode();

    public void insert(String word) {
        TrieNode curr = root;
        for (int i = 0; i < word.length(); i++) {
            int c = word.charAt(i) - 'a';
            if (curr.Node[c] == null) {
                curr.Node[c] = new TrieNode();
            }
            curr = curr.Node[c];
        }
        curr.endofnode = true;
    }

    public void autocomplete(String key, List<String> results) {
        TrieNode curr = root;
        for (int i = 0; i < key.length(); i++) {
            int c = key.charAt(i) - 'a';
            if (curr.Node[c] == null) {
                return; 
            }
            curr = curr.Node[c];
        }
        dfs(curr, key, results);
    }

    private void dfs(TrieNode node, String word, List<String> results) {
        if (node.endofnode) results.add(word);
        for (int i = 0; i < 26; i++) {
            if (node.Node[i] != null) {
                dfs(node.Node[i], word + (char) (i + 'a'), results);
            }
        }
    }
}