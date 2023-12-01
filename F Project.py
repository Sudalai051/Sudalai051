# importing the difflib module and Differ, SequenceMatcher class
import difflib  
from difflib import Differ
from difflib import SequenceMatcher
  
# implementation of DNA Sequence  
with open('file1.txt') as file_1:
	str_1 = str(file_1.readlines())

with open('file2.txt') as file_2:
	str_2 = str(file_2.readlines())
  
# using the splitlines() function  
lines_str1 = str_1.splitlines()  
lines_str2 = str_2.splitlines()  
  
# using the Differ() and compare() function  
dif = difflib.Differ()  
my_diff = dif.compare(lines_str1, lines_str2)  

# using the SequenceMatcher() function  
my_seq = SequenceMatcher(a = str_1, b = str_2) 
  
# printing the results  
print("First Sequence:", str_1)  
print("Second Sequence:", str_2)
print("Sequence Matched:", my_seq.ratio())
print("Difference between the Sequence")  
print('\n'.join(my_diff))  
