# 🔤 Text Autocomplete using Trie  

### Hello GEEK, thanks for visiting this repo

## 📌 Overview  
This project implements a **Text Autocomplete System** using the **Trie (Prefix Tree)** data structure.  
It efficiently suggests words based on a given prefix, making it useful for applications like:  
<ol>
  <li>Search Engine  </li>
  <li>Text Editor </li>
  <li>Messaging apps </li> 
  <li>Command-line Tools</li>  
  <li>Easy to extend for spell-check, dictionary apps, or AI-based autocomplete  </li>
</ol>


The project demonstrates how tries can store words and perform prefix-based lookups in **O(L)** time (where L = length of the prefix).  

## 🚀 Features  
<ol>
  <li>Insert words into the Trie  </li>
  <li>Autocomplete suggestions for a given prefix </li>
  <li>Efficient search with prefix-matching </li> 
  <li>Handles large vocabularies</li>  
  <li>Easy to extend for spell-check, dictionary apps, or AI-based autocomplete  </li>
</ol>


## ⚙️ How It Works  
1. **Insert words** into the Trie (dictionary).  
2. **Search prefix** → Navigate down the Trie following characters.  
3. **Collect suggestions** → Perform DFS/BFS from that node to gather possible completions.  

**Example:**  
```text
Words in dictionary: ["cat", "car", "cart", "care", "dog"]  
Input prefix: "ca"  
Output suggestions: ["cat", "car", "cart", "care"]  
