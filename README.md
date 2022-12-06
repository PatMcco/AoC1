# AoC1
Advent of Code Day 1 2022

This code takes in the supplied text file from Advent of Code day 1.
The text file is random sized integers only, and each section is seperated by whitespace. There is no delimiter or commas.
The goal is to sum each section of integers, and determine which section is the highest number. 
Part 2 is to determine which sections are the top 3 highest numbers. 
This code is post part 2, so it finds the top 3, which also gives you the highest(index 0 of the top 3 list)

It writes the values into a hashmap, which then is iterated over to find the top 3 values.
It adjusts the top 3 list each time a new higher value is found.

It's not the most efficient way of doing it, but it was good hashmap and file IO practice.

-pm
