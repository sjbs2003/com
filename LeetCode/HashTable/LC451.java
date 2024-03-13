package com.LeetCode.HashTable;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class LC451 {
        public String frequencySort(String s) {
            HashMap<Character, Integer> map = new HashMap<>();
            PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

            // Mapping the char with the frequency
            for (char c : s.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            // Pushing the char with frequencies in the priority queue
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                pq.offer(entry);
            }

            StringBuilder sb = new StringBuilder();

            // Generating the answer string
            while (!pq.isEmpty()) {
                Map.Entry<Character, Integer> entry = pq.poll();
                char c = entry.getKey();
                int count = entry.getValue();
                for (int i = 0; i < count; i++) {
                    sb.append(c);
                }
            }

            return sb.toString();
        }
}
