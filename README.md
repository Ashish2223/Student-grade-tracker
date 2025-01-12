# Student-Grade-Tracker-OOP
Student grade tracker using object-oriented programming (OOP) in Java.
The StudentGradeTracker program is a Java application that allows users to manage a list of students and their grades. It includes several features, such as adding new students, searching for students by ID, calculating a student's GPA, generating a transcript for a student, and removing students from the list.

The program begins by presenting the user with a menu of options, which can be accessed by entering a number between 1 and 5. The options are:

Add Student: allows the user to add a new student to the list by entering the student's ID, name, and major.
Search Student: allows the user to search for a student by ID and view the student's information.
Calculate GPA: allows the user to calculate a student's GPA by entering the student's ID and the number of courses to be included in the calculation. The user must also enter the name of the course, the credit hours, the score, and the weight for each course.
Generate Transcript: allows the user to generate a transcript for a student by entering the student's ID. The transcript includes the student's name, ID, major, and a list of courses taken, with grades and credit hours for each course.
Remove Student: allows the user to remove a student from the list by entering the student's ID.
The program uses several classes to store and manipulate data, including Student, Course, and Grade. The Student class includes information about the student, such as their ID, name, and major. The Course class includes information about a course taken by the student, such as the name of the course, the credit hours, and a list of grades. The Grade class includes information about a grade received by the student in a particular course, such as the score and the weight of the grade.

The program uses a Scanner object to read input from the user and an ArrayList to store the list of students. It also includes several methods to perform the various tasks, such as addStudent, searchStudent, calculateGPA, generateTranscript, and removeStudent.
