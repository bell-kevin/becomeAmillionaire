# becomeAmillionaire
The bank has an account for those who want to become a millionaire – you deposit a sum of money once, select a guaranteed interest rate for growth, then you can’t touch the money until it grows to a million dollars. You know the starting value, the ending value ($1 million), and the rate of growth, but you don’t know how long it will take to reach that value. The money grows in cycles using compound interest. The account balance will grow using compound interest – the amount of growth is added to the balance, and that new balance will be used to calculate the next amount of growth. That is, if the account balance is $25, and the interest rate is 10%, then the account will add 10% of $25 ($2.50) to the balance (25 + 2.50 = $27.50). In the next iteration through the loop, that new balance of $27.50 will grow by 10%. A cycle can be a year, a month, a day – that detail isn’t important here, just that the account grows by compound interest in each cycle.  Create a project that asks the user how much money they will deposit and what interest rate they choose. In the program, use a loop to calculate the growth in the account balance, and keep track of the number of iterations. When the balance is at least $1,000,000, end the loop and print out how many cycles it took to reach that sum. Include a message about how many cycles it takes to reach the sum of $100,000 as well. This message should only print once, not every time the account balance is greater than $100,000. (Hint: use a Boolean variable to determine if you are still searching for that balance or have already found it and printed the message.)


== We're Using GitHub Under Protest ==

This project is currently hosted on GitHub.  This is not ideal; GitHub is a
proprietary, trade-secret system that is not Free and Open Souce Software
(FOSS).  We are deeply concerned about using a proprietary system like GitHub
to develop our FOSS project.  We have an
[open {bug ticket, mailing list thread, etc.} ](INSERT_LINK) where the
project contributors are actively discussing how we can move away from GitHub
in the long term.  We urge you to read about the
[Give up GitHub](https://GiveUpGitHub.org) campaign from
[the Software Freedom Conservancy](https://sfconservancy.org) to understand
some of the reasons why GitHub is not a good place to host FOSS projects.

If you are a contributor who personally has already quit using GitHub, please
[check this resource](INSERT_LINK) for how to send us contributions without
using GitHub directly.

Any use of this project's code by GitHub Copilot, past or present, is done
without our permission.  We do not consent to GitHub's use of this project's
code in Copilot.

![Logo of the GiveUpGitHub campaign](https://sfconservancy.org/img/GiveUpGitHub.png)
