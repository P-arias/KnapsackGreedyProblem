# KnapsackGreedyProblem
A thief is robbing a store which contains n items. For i = 1, 2, ..., n, item i has weight wi > 0
and value vi > 0. The thief can carry a maximum weight of W pounds in a knapsack. The
items can be broken into smaller pieces, so the thief may decide to carry only a fraction
xi of object i, where 0 ≤ xi ≤ 1. Item i contributes xiwi to the total weight in the knapsack,
and xivi to the value of the load.
The algorithm determines how much of each item the thief should place into
his knapsack so that the total value is maximum. Of course the total weight of items
he chooses shouldn’t exceed the capacity of the knapsack W.
For example, suppose the capacity of the knapsack is 5 pounds and the store has four items A,
B, C, D. The weight and value for each item are listed as follows:
item A B C D
weight (pounds) 2 3 2 4
value (dollars) 6 9 10 8
The thief can choose A and B, or A, C and 1/3 B which will have total values 15 dollars versus
19 dollars.
