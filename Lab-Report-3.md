# Lab Report 3: Researching Commands
For this lab report I'll research `grep` alternatives and options. 

## `grep` as a filter for `ls`: 
By performing the usual `ls` command to list the contents of a path and then adding `| grep <String>`, we return only the files whose names contain `<String>`. Here's two examples from `./technical`: 
![Image1](grepfilter.png) 
In this example, we can see that `technical/911report` has many files but only one containing `"preface"`. What the command
`ls technical/911report | grep "preface"` did is filter the `ls` command for only those files containing `"preface"`. 

![Image2](grepfilterGovernment.png)
In this example, we see that `technical/Government` has 6 files, but only two containing the letter `"m"`. Once again, adding 
`| grep "m"` to `ls technical/Government` filtered out every file that didn't contain the letter `"m"`. 

[Grep](https://docs.oracle.com/cd/E19504-01/802-5826/6i9iclf5k/index.html)


## `grep -c` to output count of matching lines only 
By adding `-c` to our usual `grep` command, `grep -c <String>we output the count of the lines containing the 
![Image3](grep-c.png)
In this example, we see that path `technical/government/Media/5_Legal_Groups.txt` has 60 lines and 510 words. By performing 
`grep -c "Legal" technical/government/Media/5_Legal_Groups.txt`, we get the exact number of lines in the `5_Legal_Groups.txt` containing the 
word `"Legal"`. 

Here is another example playing with a file I created, `grep-Legal.txt`, in which I also used `grep`, to store all the files of `find-results.txt` containing the word `"Legal"`. 
![Image4](grep-c-2.png) 
Firstly, we see that the file contains 21 lines. Then I play around `grep -c <String> grep-Legal.txt` to see how many lines, if any, contain a String. As we can see, no lines contain `"count"`, one line contains `"service"` (lower case, that is), and one line contains `"and"` (Note: this only occurs as a substring of "Maryland" not actually the word "and"). I then printed the contents of the file to confirm. 

[Grep](https://en.wikibooks.org/wiki/Grep)



