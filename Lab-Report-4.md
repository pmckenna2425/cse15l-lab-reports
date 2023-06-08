# Lab Report 4

## Tasks: 
For the lab report this week, reproduce the task from above on your own. For each numbered step starting right after the timer 
(so steps 4-9), take a screenshot, and write down exactly which keys you pressed to get to that step. For special characters 
like `<enter>` or `<tab>`, write them in angle brackets with code formatting. Then, summarize the commands you ran and what the 
effect of those keypresses were.

These are the tasks you will be timing yourself on. As setup, Make a fork of the [lab 7 repo](https://github.com/ucsd-cse15l-s23/lab7) on your Github account, so it starts 
as an exact copy of our repository. Before timing yourself again, make sure to delete and re-fork the repository so you’re starting 
from a clean state. The TAs were able to get under 5 minutes after a couple of tries.

So a run through this process will look like this. Don’t do it just yet, though. There’s a little bit of setup involved!

1. **Setup** Delete any existing forks of the repository you have on your account
2. **Setup** Fork the repository
3. **The real deal** Start the timer!
4. Log into ieng6
5. Clone your fork of the repository from your Github account
6. Run the tests, demonstrating that they fail
7. Edit the code file `ListExamples.java` to fix the failing test (as a reminder, the error in the code is just that `index1` is 
used instead of `index2` in the final loop in `merge`)
8. Run the tests, demonstrating that they now succeed
9. Commit and push the resulting change to your Github account

## Report: 

1. So the first thing I did was delete my `lab7` repository on GitHub. Next I performed `rm -rf lab7` from `ieng6` in order to delete the 
existing `lab7` directory and contents. 
3. To get a fresh start I re-forked the [lab 7 repo](https://github.com/ucsd-cse15l-s23/lab7).
4. Now the task starts. 
5. First step is to `ssh` into my `ieng6` account. Note that I no longer need to type in my password as earlier in this lab we generated
`ssh keys` for our `ieng6` accounts. 
![lab7 ssh](lab7-ssh.png)

5. Next step is to clone the fork of the `lab7` repository on my account. I accomplished this with the command 
`git clone https://github.com/pmckenna2425/lab7)`, `<enter>`.  
![cloning lab7 repository](lab7-clone.png)

6. To compile the files, I pressed `Crtl-r` to access my bash history, and then I typed in `javac` and hit `<enter>` to locate the 
appropriate compiler command, `javac -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar *.java`, from ealier. Then hit `<enter>` to 
compile. Now to run the tests, I once againpressed `Crtl-r` to access my bash history, and this time typed in `java -cp` to locate and run 
the appropriate `java -cp .;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore ListExamplesTests`command 
from earlier and hit `<enter>`. As we can see, the tests failed. 
![lab7 failed tests](lab7-test-fail.png)

7. Now we need to change `index1` to `index2` at the end of the `merge` method. First step is to type `vim ListExamples.java` then hit `<enter>` to open the file in `vim`. Next, type `43j` then hit `<enter>` to jump to line 43, where the error is. Then I pressed `e`, which jumps to the end of the word, which so happened to place me on the exact character that needs to be changed. Then type `r` and `2`, replacing the `1` with a `2`. Finally, tpye `:wq`, `<enter>` to save and exit. 
![lab7-vim-fix](lab7-vim-fix.png)

8. Now I pressed the `<up>` key 4 times and hit `enter` to get back to and run the `javac -cp .:lib/hamcrest-core-1.3.jar:lib/junit
4.13.2.jar *.java`command. Then `<up>` 4 times again and `enter` to access and run the `java -cp .:lib/hamcrest-core-1.3.jar:lib/junit-
4.13.2.jar org.junit.runner.JUnitCore ListExamplesTests`
command, running the tests in `ListExamplesTests.java`. As we can see, all tests ran and passed. 
![lab7-tests-success](lab7-tests-success.png)

9. So now that the `merge` method is `ListExamples.java` has been fixed, all that's left is to add, commit, and push to my forked 
repository. This is accomplished with the commands 
```
git add "ListExamples.java" 
git commit -m "Corrected merge method" 
git push
```
Obviously I performed `<enter>` after each command. 
![lab7-commit-push](lab7-commit-push.png)
As we can see, I was having some trouble with password authentication for my first two push attempts. To get around this, I created a temporary personal access token on GitHub just for this task. To do this I went to my GitHub account > Settings > Developer Settings > Personal access tokens > Generate new token. All I wanted to use this token for was to `push` to my repository, so I only selected the `repo` scope for this token, and generated it. Then it was as simple as copying the token, running `git push` again, and this time pasting the token instead of my account password. As we see in the above image, my token worked and I successfully pushed my changes to my forked `lab7` repository. 








