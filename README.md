
# LeetCode Challenge D36
## Achievements
[![image.png](https://i.postimg.cc/CL26Dk2d/image.png)](https://postimg.cc/fJxKQtDh)

This solution outperformed 100% of Java users on LeetCode according to runtime metrics.


## Overview

Welcome to my LeetCode solution repository! This project addresses the coding challenge presented by[500. Keyboard Row](https://leetcode.com/problems/keyboard-row/). Below, you'll find details about the problem, my approach to solving it, and the implemented solution.

## Problem Statement
Given an array of strings `words`, return _the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below_.

![](https://assets.leetcode.com/uploads/2018/10/12/keyboard.png)

**Example**

> **Input:** words = ["Hello","Alaska","Dad","Peace"]
> 
>**Output:** ["Alaska","Dad"]

**Language Used**
> Java

**Difficulty**
> Easy

## Solution Overview
It employs a straightforward approach by first converting all input words to lowercase for case-insensitive comparison. It then iterates through each word, checking whether its letters are contained in any of the three keyboard rows. This is achieved by using a helper method, `containsLetters`, which iterates through each letter in the word and checks if it exists in the specified keyboard row. If the word contains letters from at least one of the rows, it is added to the result list. Finally, the original words with uppercase letters are retrieved from the result list and returned as an array.
