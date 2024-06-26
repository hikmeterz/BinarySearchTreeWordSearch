﻿# BinarySearchTreeWordSearch
# Project Description
This repository contains a Java program that reads words from a given text file and inserts them into a binary search tree (BST). The program then finds the k-th word in alphabetical order in the BST.

## Files
- `Node.java`: Defines the node structure used in the BST.
- `BinarySearchTree.java`: Implements the BST structure and its operations such as insertion and in-order traversal.
- `Main.java`: Main class to handle the input parsing, BST operations, and output of the k-th word in alphabetical order.
- `text.txt`: Sample text file containing words to be inserted into the BST.
- `president.txt`: Another sample text file for testing.

## Algorithm Explanation

### Node Class
The `Node` class defines the basic unit of the BST. Each node contains:
- A word (`String word`): The word stored in the node.
- References to the left and right children (`Node left`, `Node right`): Points to the left and right children of the node.

### BinarySearchTree Class
The `BinarySearchTree` class manages the nodes and provides methods to manipulate the tree:
- `insert(String word)`: Inserts a new word into the BST. Duplicate words are discarded.
- `findKthElement(int k)`: Finds the k-th word in alphabetical order in the BST using in-order traversal.

### Main Class
The `Main` class contains the main method to run the BST word search application:
- Parses the input arguments to extract the text file name and the value of k.
- Reads the words from the text file, ignoring punctuation and case sensitivity, and inserts them into the BST.
- Uses the `BinarySearchTree` class to find the k-th word in alphabetical order and prints the result.

### Example Workflow
1. The user inputs the text file and the value of k as command line arguments:
2. The program reads the words from `text.txt` and constructs the BST.
3. The program finds the 5th word in alphabetical order in the BST and prints the result.
