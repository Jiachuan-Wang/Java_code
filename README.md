Java_code

W2
Write a program to process students score data.

The input of your program has lines of text, in one of the two formats:

Student's name and student id, as <student id>, <name>, and
Score for one student of one course, as <student id>, <course name>, <marks>.
Example of the two formats are:

3190101234, Zhang San
3190101111, Linear Algebra, 89.5
Comma is used as the seperator of each field, and will never be in any of the fields. Notice that there are more than one word for name of the person and name of the course. To make your code easier, the score can be treated as double.

The number of the students and the number of the courses are not known at the beginning. The number of lines are not known at the beginning either. The lines of different format appear in no order. One student may not get enrolled in every course.

The last line has only one word:

END

to indicate the end of the input.

Your program should read every line in and print out a table of summary in .csv format.

The first line of the output is the table head, consists fields like this:

student id, name, <course name 1>, <course name 2>, ..., average
where the course names are all the courses read, in alphabet order. There should be one space after each comma.

Then each line of the output is data for one student, in the ascended order of their student id, with score of each course, like:

3190101234, Zhang San, 85.0, , 89.5, , , 87.3
For the course that hasn't been enrolled, leave a blank before the comma, and should not get included in the average. The average is rounded to one decimal place. There should be one space after each comma.

All the number output, including the averages should be rounded to one decimal place.

Input Format
As described in the text above.

Output Format
As described in the text above.

Sample Input
3180111435, Operating System, 34.5
3180111430, Linear Algebra, 80
3180111435, Jessie Zhao
3180111430, Zhiwen Yang
3180111430, Computer Architecture, 46.5
3180111434, Linear Algebra, 61.5
3180111434, Anna Teng
END
Sample Output
student id, name, Computer Architecture, Linear Algebra, Operating System, average
3180111430, Zhiwen Yang, 46.5, 80.0, , 63.3
3180111434, Anna Teng, , 61.5, , 61.5
3180111435, Jessie Zhao, , , 34.5, 34.5

W4
Below is a UML diagram for an inheritance relationship between two classes�� Vehicle and SecondHandVehicle.

1.png

By referring to the diagram, explain the meaning of the term inheritance.
What do you think might be the function of each of the constructors?
What do you think might be the reason for the fact that in the Vehicle class there is a set-method for the value attribute, but not for the other three?
Implement the Vehicle and the SecondHandVehicle classes:
the calculateAge method of Vehicle accepts an integer repre- senting the current year, and returns the age of the vehicle as calculated by subtracting the year of manufacture from the current year;
the hasMultipleOwners method of SecondHandVehicle should return true if the numberOfOwners attribute has a value greater than 1, or false otherwise.
Write a tester class that tests all the methods of the SecondHandVehicle class.
Answer the question in the submit box and zip all the source code for submitting.