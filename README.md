# prograd-task
Q1.
The three gestures used in base Rock Paper Scissors are rock, paper,
and scissors. The way these are scored is as such: Rock beats Scissors,
Scissors beats Paper, Paper beats Rock. It gets a lot more complicated
when you introduce new gestures, but let's keep it simple for now.
We're definitely going to need a way to decide who has won and who has lost, or
whether the round has ended in a draw. Using the rules provided, give us an
engine for deciding this based on the player's moves.

How to run Task1.java : Simply run the java code in intelliJ idea.

Q2.
You need to write the software to calculate the minimum number of
coins required to return an amount of change to a user of Acme
Vending machines. For example, the vending machine has coins 1,2,5
and 10 what is the minimum number of coins required to make up the
change of 43 cents?
The coin denominations will be supplied as a parameter. This is so the
algorithm is not specific to one country. You may not hardcode these
into the algorithm, they must be passed as a parameter.
The country’s denominations to use for the Question are:
● British Pound ○ 1,2,5,10,20,50

● US Dollar ○ 1,5,10,25
● Norwegian Krone ○ 1,5,10,20
The Question assumes an infinite number of coins of each
denomination. You are to return an array with each coin to be given as
change.
Increment- Remove the assumption that there are infinite coins of
each denomination. Modify the code to accept a fixed number of each
denomination. It will affect the change calculation in that you now
need to consider the availability of coins when calculating change.
