class Solution {
    public int maxFreqSum(String s) {
    s = s.toLowerCase(); // case-insensitive

    Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u'));
    Map<Character, Integer> vowelFreq = new HashMap<>();
    Map<Character, Integer> consonantFreq = new HashMap<>();

    for (char c : s.toCharArray()) {
        if (vowels.contains(c)) {
            vowelFreq.put(c, vowelFreq.getOrDefault(c, 0) + 1);
        } else {
            consonantFreq.put(c, consonantFreq.getOrDefault(c, 0) + 1);
        }
    }
    int maxVowel = 0, maxConso = 0;

    for (int freq : vowelFreq.values()) {
        maxVowel = Math.max(maxVowel, freq);
    }
    for (int freq : consonantFreq.values()) {
        maxConso = Math.max(maxConso, freq);
    }

    return maxVowel + maxConso;
    }
}