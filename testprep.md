{% include navigation.html %}

## Important Links

[Practice test questions](https://apcentral.collegeboard.org/courses/ap-computer-science-a/exam/past-exam-questions)

[Notes on CB Videos](https://docs.google.com/document/d/1EKNbZsHvQ8kusJU4IEqVrw9UcIpYzHaJNNrBwNbfsPo/edit?usp=sharing)

## Study Plan Overview

In order to best prepare for the upcoming AP exam, I’ll first use the practice tests in class and what I already know to find out which subjects I struggle the most with and need to study.  I’ll then watch the college board videos and take notes on them, with extra attention to the previously mentioned subjects.

Once I’ve finished taking notes on the videos, I’ll do extra practice tests and questions on top of the ones we do in class, found [here](https://apcentral.collegeboard.org/courses/ap-computer-science-a/exam/past-exam-questions).  This will reinforce the learning and allow me to find any other topics I need to look back over.

Finally, I'll retake old FRQs on units I feel more comfortable with to ensure I still know the material and try to incorporate things from other units.

## Week 1 (4/18 - 4/22)

Day | Goal |
--- | --- |
Monday | Put together study plan, watch AP daily video
Tuesday | Take MC test in class, begin taking notes on most confusing units, watch AP daily
Wednesday | Review MC test (test corrections on questions I'm confused about), watch AP daily
Thursday | Take FRQ test in class, finish taking notes on anything I'm struggling with, watch AP daily
Friday | Review FRQ test (notes on learnings and what I could do better), watch AP daily
Weekend | Review all notes and use practice FRQs over the weekend to study

## Week 2 (4/25 - 4/29)

Day | Goal |
--- | --- |
Monday | Put together study plan, watch AP daily video
Tuesday | Take MC test in class, work on finishing notes on units, watch AP daily video
Wednesday | Review MC test including test corrections, work on finishing notes on units watch AP daily video
Thursday | Take FRQ test in class, finish taking notes, watch AP daily video
Friday | Review FRQ test including notes on learnings and changes to make, put FRQs on repl, watch AP daily video
Weekend | Review/complete notes and study with practice MC's and FRQ's

## Notes

### Unit 1

### Unit 2

### Unit 3

### Unit 4

### Unit 5
[Notes](https://docs.google.com/document/d/1EKNbZsHvQ8kusJU4IEqVrw9UcIpYzHaJNNrBwNbfsPo/edit#bookmark=kix.yfu1i6mbbfa)

### Unit 6
[Notes](https://docs.google.com/document/d/1EKNbZsHvQ8kusJU4IEqVrw9UcIpYzHaJNNrBwNbfsPo/edit#bookmark=kix.in7wk0f3tjdm)

### Unit 7
[Notes](https://docs.google.com/document/d/1EKNbZsHvQ8kusJU4IEqVrw9UcIpYzHaJNNrBwNbfsPo/edit#bookmark=kix.43crj9n7u9tf)

### Unit 8

### Unit 9
[Notes](https://docs.google.com/document/d/1EKNbZsHvQ8kusJU4IEqVrw9UcIpYzHaJNNrBwNbfsPo/edit#bookmark=kix.qqmf9ccnn9kg)

### Unit 10
[Notes](https://docs.google.com/document/d/1EKNbZsHvQ8kusJU4IEqVrw9UcIpYzHaJNNrBwNbfsPo/edit#bookmark=kix.2suyp1nruvq7)

## Test Review

### MCQ 2015
- Overall Score
  - ![image](https://user-images.githubusercontent.com/55672662/164757138-34bbdc4e-88de-412d-ac10-9f3e0ae33fd3.png)
  - I finished all the questions except for 27 which I skipped and didn't have time to go back to, so out of the questions I completed, I scored 35/38
- Missed Questions: 31, 35, 37
  - Question 31
    - ![image](https://user-images.githubusercontent.com/55672662/164757518-1520d131-074a-4d33-952e-224c9b32fc79.png)
    - I answered B, though the answer was E
    - Looking at the code, I thought it would just be a checkerboard pattern with X's at 0,1 and 1,0 and then down the board
    - However, the pattern stops at the 0,4 and 4,0 diagonal since the code doesn't reach the bottom right corner of the board due to the col++ and row--
  - Question 35
    - ![image](https://user-images.githubusercontent.com/55672662/164757918-5fe9803d-5a5e-47de-864e-2e2d9899f2aa.png)
    - I answered D, though the answer was C
    - Because the code is calculating midpoints and then looking for the target from there, the first index of target found is 6, not 5
    - I thought it would just find the first instance of the target number, so I didn't look at the order in which code was executed
  - Question 37
    - ![image](https://user-images.githubusercontent.com/55672662/164758255-c8c58b65-69be-46da-98b4-0b0aae8de5c7.png)
    - ![image](https://user-images.githubusercontent.com/55672662/164758301-000bc1e2-b729-462d-8943-66167d1cc77f.png)
    - I answered D (I and II), though the answer was E (II and III)
    - Option I doesn't work, since it would add things to the result in the wrong order
    - Option III works and would return the proper string upon executing code

### FRQ 2015

- [Repl with FRQs](https://replit.com/@KyleMyint/CSA-Tri-3#FRQ%202015/FRQ1.java)
- Question 1
  - ![image](https://user-images.githubusercontent.com/55672662/164756540-bac36b5a-cc70-44f5-8e1a-03fe86ab5baf.png)
  - This FRQ forcused on traversing arrays and 2d arrays while completing tasks such as checking values and finding totals
  - Part A
    - This question involved traversing an array and adding each value, returning their sum
    - To solve this, I used an enhanced for loop for each value in the array and added the value to the total for each entry
  - Part B
    - This question used a 2d array and needed to find the sum of each row, returning an array with the sums
    - I once again used an enhanced for loop and ran the method from part A, arraySum, on each row
    - I then added each rows sum to a new array
    - Because you can't ad things to arrays, my solution didn't work. I should instead make a new array with a set length of the number of rows in the 2d array, and then change the value at each index
  - Part C
    - This question looked at a 2d array and checked if it was diverse; there weren't any rows with the same sum as another row
    - I created a 2d array 'totals' by running the previous method rowSums
    - I then checked each value with the others using a temporary array
    - Similar to part B, my solution didn't work because you can't add or delete entries from arrays. A similar solution would have worked
- Question 2
  - ![image](https://user-images.githubusercontent.com/55672662/164756611-d652af56-24a9-4b33-8321-d12813ce9fcc.png)
  - Part A
    - This question worked similarly to wordle, with a user guessing a word and getting a hint based on if the letter was in the right place, wrong place, or wasn't in the word
    - I used an enhanced for loop to check each letter in their guess, and then a series of if else statements to create the hint to return
    - Logic could be improved/optimized, but solution works
- Question 3
  - ![image](https://user-images.githubusercontent.com/55672662/164756676-24fd86a8-0698-4256-8e87-20138753dfac.png)
  - Part A
    - This question looked at a 2d array with mostly blank entries (a sparse array) and wanted to find a value given a row and column
    - By using the getter methods provided in the problem, I mathched the given coordinates with the ones in the array and returned the vlaue
  - Part B
    - This question asked to remove a column from an array, deleting its contents, and then shifting the rest of the columns to fill in the array
    - I used an enhanced for loop to go through each column of the sparse array, and then removed the one matching the given column
    - I also checked if the column was to the right of the given column, and if so, I moved it to the left 1 column

