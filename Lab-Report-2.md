# Lab Report 1 - Servers and Bugs
## Part 1: 
For part 1 our goal was to write a web server called `StringServer` that concatenates a new line and a new string when the request 
`add-message?s=<String>` is prompted. 

I reused the `Server.java` file from [Lab2](https://github.com/pmckenna2425/wavelet), and I rewrote the methods from `NumberServer.java` in a new file called `StringServer.java` to accomplish these tasks.
What I did was initialize an empty `ArrayList` as a field in the `Handler` class to keep track of the messages, and for each method call to `Handler` my code adds the new message to the `ArrayList`, and then returns each element of the `ArrayList` on a new line. 
The Code: 
![Code](StringServerCode.png)

The blank server looks just like this
![BlankServer](https://github.com/pmckenna2425/cse15l-lab-reports/blob/main/StringServer%20base.png)

And after performing `add-method?s=Hello`, we get this: 
![StringServerHello](https://github.com/pmckenna2425/cse15l-lab-reports/blob/main/StringServerHello.png)

another instance, using `add-method?s=How are you`:
![StringServerHowAreYou](https://github.com/pmckenna2425/cse15l-lab-reports/blob/main/StringServerHowAreYou.png)

Finally, `add-method?s=Go away spongebob`:
![StringServerGoAway](https://github.com/pmckenna2425/cse15l-lab-reports/blob/main/StringServerGoAway.png)

