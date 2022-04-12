{% include navigation.html %}

[Repl Link](https://replit.com/@KyleMyint/CSA-Tri-3#Menu.java)

## Week 3 Assignment (Sorts)
- [Link to code](https://replit.com/@KyleMyint/CSA-Tri-3#Sort.java)
- Same as last week, isolated repl [here](https://replit.com/@KyleMyint/Sort-test#Sorts.java)
  - Bubble Sort
    - This sorting method will go through the data, comparing 2 adjacent entries and rearranging them if necessary
    - It will repeat this process until the full dataset is sorted
    - ![image](https://user-images.githubusercontent.com/55672662/161813547-694ecdb9-cbb5-4dc5-a05d-2a775e3dfe66.png)
  - Insertion Sort
    - This method iterates through the dataset, and for each iteration, finds one entry
    - It will then insert that entry into an output list where it belongs in the sorted order
    - ![image](https://user-images.githubusercontent.com/55672662/161813734-1ed172f1-6a48-40d2-8671-312052dc170a.png)
  - Merge Sort
    - This method splits up the data into multiple subsets
    - It will then sort each subset, which would be faster since fewer elements are being checked
    - It then puts together the sorted subsets to create the final sorted dataset
    - ![image](https://user-images.githubusercontent.com/55672662/161813948-7f893469-f2ad-4f66-bacd-b9e20daacc0b.png)
    - ![image](https://user-images.githubusercontent.com/55672662/161814019-c224a70a-6dc8-441f-bf4d-3a0e702ac49c.png)
  - Big O Complexity
    - Bubble sort: O(n^2)
    - Insertion sort: O(n^2)
    - Merge Sort: O(n log(n))
    - Merge sort is the most efficient sorting method of these for large datasets
  - Data
    - Bubble sort
    - ![image](https://user-images.githubusercontent.com/55672662/162855619-d4b0234f-635d-4233-8669-5b3cd355a71e.png)
    - Insertion sort
    - ![image](https://user-images.githubusercontent.com/55672662/162855700-899d66a2-3a8f-4540-8a52-98df50232731.png)
    - Merge sort
    - ![image](https://user-images.githubusercontent.com/55672662/162855741-4d25ad39-7a6c-45ce-a226-cfa6a19be916.png)







## Week 2 Assignment (Calculator)

- [Link to code](https://replit.com/@KyleMyint/CSA-Tri-3#Calculator.java) (Worked with Kevin Do)
- Note: Code isn't working on main repo, running [here](https://replit.com/@KyleMyint/DearDearestRar#.replit) though
  - Preliminary definitions
    - Operations created using a hashmap, associated with their precedence (lower precedence is executed first)
    - ![image](https://user-images.githubusercontent.com/55672662/160678977-57a838ef-d48d-46c3-89a4-23c08a5991e0.png)
    - Square root function added 
    - ![image](https://user-images.githubusercontent.com/55672662/160888338-344dcda0-2431-4906-a5ef-49bea25c5700.png)
  - Output
    - Original, RPN, and calculator
    - ![image](https://user-images.githubusercontent.com/55672662/160679216-6104727e-55a0-4a92-9c1b-732228edb73a.png)
  - Parsing through RPN
    - Create stack to store data, and add to it if number
    - ![image](https://user-images.githubusercontent.com/55672662/160885991-53105d82-e628-4b75-ace2-2947b0dcadad.png)
    - If it's an operator, calculate and then put it back on stack
    - ![image](https://user-images.githubusercontent.com/55672662/160886186-b05d4e29-91a2-409f-83c9-d0245cbe7cf2.png)
    - Final number left will be solution
    - ![image](https://user-images.githubusercontent.com/55672662/160886275-c50f3751-460b-488b-b85c-ef5955c300d6.png)
  - Test cases and user input
    - ![image](https://user-images.githubusercontent.com/55672662/160886446-e55cb05b-fa45-4e63-9e12-17ee8282ec63.png)






## Week 0 Assignment

- [Link to code](https://replit.com/@KyleMynt/CSA-3#Menu.java)
  - Menu created, using a hashmap
    - Works like a dictionary, and allows for different classes to be run from menu
    - ![image](https://user-images.githubusercontent.com/55672662/159310796-c508cf18-d3be-4034-8f01-45b7441b8851.png)
  - Number swapper 
    - Compares numbers to find which is greater
    - ![image](https://user-images.githubusercontent.com/55672662/159311142-fb3c00ec-0a0d-47e3-b2a6-546add27f98e.png)
    - Returns printed statements for before and after running swap method
    - ![image](https://user-images.githubusercontent.com/55672662/159311267-ac7742e4-3df9-49b2-8184-6f339c2065c5.png)

