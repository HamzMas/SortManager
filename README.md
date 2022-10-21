# SortManager
Sort Manager is a program that allows the user to select a sorting algorithm, and input the size of 
the array they would like to sort (between 0 and 1000), which then runs the sorting algorithm and outputs the sorted array and time it took to sort. Currently, the program supports Bubble and Merge Sort algorithms.

## How It Works
Firstly navigate to com.sparta.hm.view.App and then run program from this class.
```java
Enter the number of the sorter you wish to use:
1. Bubble Sorter
2. Merge Sorter
```
The user can select the sorting algorithm to use by inputting the relevant number in the console.
<br><br>The program will then present the user with the following prompt:
```java
Please enter the size of the array you wish to sort (must be between 0 and 1000): 
```
If the user passes a valid size, the program will run the sorting algorithm and output the results.
<br>The program will output:
- The sorter being used
- The inputted array prior to sorting
- The resultant sorted array
- The time taken to sort the array (in nanoseconds)
```java
Sorting the array using the com.sparta.hm.model.sorters.SorterName
Inputted Array before sorting:
[625, 230, 174, 317, 8]
Sorted Array:
[8, 174, 230, 317, 625]
Time taken: 55556700 nanoseconds
```
## Installation
- Download the project as a zip file, extract to a folder or clone the repository.
- Open the project in IntelliJ and navigate to the App class `(src/main/java/com.sparta.hm.view.app)` and run the program from this class.
- You can then use the console to input your options and interact with the program. 

## Add your own sorting algorithms
Your own sorting algorithms can be added into the functionality of the program with the following steps:
1. Create a class containing your sorting algorithm within the `main/com.sparta.hm/model/sorters` package
2. Update your class to `implement Sorter` interface and implement methods.
3. Ensure your algorithm functionality is contained within the implemented `int[] sortArray()` method.
4. Update the DisplayManager class to include your new sorter, this can be done by adding the name of your sorting algorithm to the ArrayList on **Line 10**.
5. Lastly add your sorting algorithm as an option within the switch case of the SortFactory class. 