function reverseWords(sentence) {
    // Split the sentence into words
    const words = sentence.split(' ');

    // Initialize an array to store reversed words
    const reversedWords = [];

    // Reverse each word and add it to the reversedWords array
    for (const word of words) {
        const reversedWord = reverseWord(word);
        reversedWords.push(reversedWord);
    }

    // Join the reversed words to form the final reversed sentence
    const reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}

function reverseWord(word) {
    // Split the word into characters, reverse them, and join them back
    return word.split('').reverse().join('');
}

// Example usage
const inputSentence = "This is a sunny day";
const reversedSentence = reverseWords(inputSentence);
console.log(reversedSentence); 

// Output: "sihT si a ynnus yad"
