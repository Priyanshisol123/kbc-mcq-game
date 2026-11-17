import java.util.*;
public class QuestionBank{
    ArrayList<Question> questions=new ArrayList<>();
    public void addQuestion(){
        Question q1 = new Question();
        q1.question = "Which of the following is a feature of Object-Oriented Programming (OOP)?";
        q1.optionA = "Platform independence";
        q1.optionB = "Inheritance";
        q1.optionC = "Low memory consumption";
        q1.optionD = "Fast execution speed";
        q1.correctOption = "B";
        questions.add(q1);

        Question q2 = new Question();
        q2.question = "What is the size of an 'int' data type in Java?";
        q2.optionA = "8 bits";
        q2.optionB = "16 bits";
        q2.optionC = "32 bits";
        q2.optionD = "64 bits";
        q2.correctOption = "C";
        questions.add(q2);

        Question q3 = new Question();
        q3.question = "Which SQL keyword is used to retrieve only unique values from a table column?";
        q3.optionA = "UNIQUE";
        q3.optionB = "DISTINCT";
        q3.optionC = "DIFFERENT";
        q3.optionD = "GROUP BY";
        q3.correctOption = "B";
        questions.add(q3);

        Question q4 = new Question();
        q4.question = "In an Operating System, what is a CPU scheduling queue that holds processes waiting for CPU time called?";
        q4.optionA = "Device Queue";
        q4.optionB = "Ready Queue";
        q4.optionC = "Waiting Queue";
        q4.optionD = "Job Queue";
        q4.correctOption = "B";
        questions.add(q4);

        Question q5 = new Question();
        q5.question = "Which layer of the OSI model is responsible for routing data packets across different networks?";
        q5.optionA = "Physical Layer";
        q5.optionB = "Data Link Layer";
        q5.optionC = "Network Layer";
        q5.optionD = "Transport Layer";
        q5.correctOption = "C";
        questions.add(q5);

        Question q6 = new Question();
        q6.question = "What is the decimal equivalent of the binary number 1011?";
        q6.optionA = "9";
        q6.optionB = "11";
        q6.optionC = "13";
        q6.optionD = "15";
        q6.correctOption = "B";
        questions.add(q6);

        Question q7 = new Question();
        q7.question = "Which data structure operates on a Last-In, First-Out (LIFO) basis?";
        q7.optionA = "Queue";
        q7.optionB = "Stack";
        q7.optionC = "Array";
        q7.optionD = "Linked List";
        q7.correctOption = "B";
        questions.add(q7);

        Question q8 = new Question();
        q8.question = "In Java, which keyword is used to inherit a class?";
        q8.optionA = "implements";
        q8.optionB = "extends";
        q8.optionC = "inherits";
        q8.optionD = "imports";
        q8.correctOption = "B";
        questions.add(q8);

        Question q9 = new Question();
        q9.question = "What is the primary purpose of a Database Management System (DBMS)?";
        q9.optionA = "To design user interfaces";
        q9.optionB = "To store, retrieve, and manage data efficiently";
        q9.optionC = "To compile program code";
        q9.optionD = "To connect computers to the internet";
        q9.correctOption = "B";
        questions.add(q9);

        Question q10 = new Question();
        q10.question = "What does the term 'HTTP' stand for in web technology?";
        q10.optionA = "Hyperlink Text Transfer Protocol";
        q10.optionB = "Hypertext Transfer Protocol";
        q10.optionC = "High Transfer Text Protocol";
        q10.optionD = "Hypertext Terminal Page Protocol";
        q10.correctOption = "B";
        questions.add(q10);

        Question q11 = new Question();
        q11.question = "What is the time complexity of searching for an element in a sorted array using Binary Search?";
        q11.optionA = "O(1)";
        q11.optionB = "O(n)";
        q11.optionC = "O(log n)";
        q11.optionD = "O(n log n)";
        q11.correctOption = "C";
        questions.add(q11);

        Question q12 = new Question();
        q12.question = "Which of the following is NOT a type of Operating System?";
        q12.optionA = "Windows";
        q12.optionB = "Linux";
        q12.optionC = "Oracle";
        q12.optionD = "macOS";
        q12.correctOption = "C";
        questions.add(q12);

        Question q13 = new Question();
        q13.question = "Which HTML tag is used to create a hyperlink on a web page?";
        q13.optionA = "<link>";
        q13.optionB = "<a>";
        q13.optionC = "<href>";
        q13.optionD = "<url>";
        q13.correctOption = "B";
        questions.add(q13);

        Question q14 = new Question();
        q14.question = "What is the value of the mathematical constant Pi rounded to two decimal places?";
        q14.optionA = "3.12";
        q14.optionB = "3.14";
        q14.optionC = "3.16";
        q14.optionD = "3.18";
        q14.correctOption = "B";
        questions.add(q14);

        Question q15 = new Question();
        q15.question = "Which of the following is a non-volatile memory?";
        q15.optionA = "RAM";
        q15.optionB = "ROM";
        q15.optionC = "L1 Cache";
        q15.optionD = "L2 Cache";
        q15.correctOption = "B";
        questions.add(q15);

        Question q16 = new Question();
        q16.question = "In Java, which of these is used to handle exceptions?";
        q16.optionA = "try-catch block";
        q16.optionB = "for-while loop";
        q16.optionC = "if-else statement";
        q16.optionD = "switch-case block";
        q16.correctOption = "A";
        questions.add(q16);

        Question q17 = new Question();
        q17.question = "Which SQL constraint uniquely identifies each record in a database table?";
        q17.optionA = "NOT NULL";
        q17.optionB = "FOREIGN KEY";
        q17.optionC = "PRIMARY KEY";
        q17.optionD = "UNIQUE";
        q17.correctOption = "C";
        questions.add(q17);

        Question q18 = new Question();
        q18.question = "What is the port number default for the HTTP protocol?";
        q18.optionA = "21";
        q18.optionB = "23";
        q18.optionC = "80";
        q18.optionD = "443";
        q18.correctOption = "C";
        questions.add(q18);

        Question q19 = new Question();
        q19.question = "What is the process of finding and fixing errors in a software program called?";
        q19.optionA = "Compiling";
        q19.optionB = "Debugging";
        q19.optionC = "Executing";
        q19.optionD = "Decoding";
        q19.correctOption = "B";
        questions.add(q19);

        Question q20 = new Question();
        q20.question = "Which of the following is a linear data structure?";
        q20.optionA = "Tree";
        q20.optionB = "Graph";
        q20.optionC = "Array";
        q20.optionD = "Binary Search Tree";
        q20.correctOption = "C";
        questions.add(q20);

        Question q21 = new Question();
        q21.question = "In Python, which of the following is used to define a function?";
        q21.optionA = "function";
        q21.optionB = "def";
        q21.optionC = "func";
        q21.optionD = "define";
        q21.correctOption = "B";
        questions.add(q21);

        Question q22 = new Question();
        q22.question = "What is a temporary storage area in the CPU used to speed up data access called?";
        q22.optionA = "Hard Disk";
        q22.optionB = "Cache Memory";
        q22.optionC = "Virtual Memory";
        q22.optionD = "SSD";
        q22.correctOption = "B";
        questions.add(q22);

        Question q23 = new Question();
        q23.question = "Which IP address class is designed for very large networks?";
        q23.optionA = "Class A";
        q23.optionB = "Class B";
        q23.optionC = "Class C";
        q23.optionD = "Class D";
        q23.correctOption = "A";
        questions.add(q23);

        Question q24 = new Question();
        q24.question = "In Java, what is the default value of an uninitialized boolean instance variable?";
        q24.optionA = "true";
        q24.optionB = "false";
        q24.optionC = "null";
        q24.optionD = "0";
        q24.correctOption = "B";
        questions.add(q24);

        Question q25 = new Question();
        q25.question = "What is the matrix containing only zero elements called?";
        q25.optionA = "Identity Matrix";
        q25.optionB = "Diagonal Matrix";
        q25.optionC = "Null Matrix";
        q25.optionD = "Scalar Matrix";
        q25.correctOption = "C";
        questions.add(q25);

        Question q26 = new Question();
        q26.question = "Which CSS property is used to change the text color of an element?";
        q26.optionA = "font-color";
        q26.optionB = "text-color";
        q26.optionC = "color";
        q26.optionD = "background-color";
        q26.correctOption = "C";
        questions.add(q26);

        Question q27 = new Question();
        q27.question = "What is the logical AND operator represented as in Java?";
        q27.optionA = "&";
        q27.optionB = "&&";
        q27.optionC = "|";
        q27.optionD = "||";
        q27.correctOption = "B";
        questions.add(q27);

        Question q28 = new Question();
        q28.question = "Which process state transition occurs when a running process is interrupted by the CPU scheduler?";
        q28.optionA = "Running to Waiting";
        q28.optionB = "Running to Ready";
        q28.optionC = "Ready to Running";
        q28.optionD = "Waiting to Ready";
        q28.correctOption = "B";
        questions.add(q28);

        Question q29 = new Question();
        q29.question = "What is the physical address of a network interface card (NIC) also known as?";
        q29.optionA = "IP Address";
        q29.optionB = "MAC Address";
        q29.optionC = "Port Address";
        q29.optionD = "Socket Address";
        q29.correctOption = "B";
        questions.add(q29);

        Question q30 = new Question();
        q30.question = "What is the average of the numbers 10, 20, 30, and 40?";
        q30.optionA = "20";
        q30.optionB = "25";
        q30.optionC = "30";
        q30.optionD = "35";
        q30.correctOption = "B";
        questions.add(q30);

        Question q31 = new Question();
        q31.question = "Which of the following is NOT an OOP concept?";
        q31.optionA = "Polymorphism";
        q31.optionB = "Encapsulation";
        q31.optionC = "Compilation";
        q31.optionD = "Abstraction";
        q31.correctOption = "C";
        questions.add(q31);

        Question q32 = new Question();
        q32.question = "In a Database, what is a row in a table also known as?";
        q32.optionA = "Attribute";
        q32.optionB = "Tuple";
        q32.optionC = "Field";
        q32.optionD = "Relation";
        q32.correctOption = "B";
        questions.add(q32);

        Question q33 = new Question();
        q33.question = "Which protocol is used to send email messages over the internet?";
        q33.optionA = "FTP";
        q33.optionB = "SMTP";
        q33.optionC = "POP3";
        q33.optionD = "DHCP";
        q33.correctOption = "B";
        questions.add(q33);

        Question q34 = new Question();
        q34.question = "In Java, which keyword is used to declare a constant variable whose value cannot be changed?";
        q34.optionA = "static";
        q34.optionB = "const";
        q34.optionC = "final";
        q34.optionD = "define";
        q34.correctOption = "C";
        questions.add(q34);

        Question q35 = new Question();
        q35.question = "What is the time complexity of inserting an element at the beginning of an array of size n?";
        q35.optionA = "O(1)";
        q35.optionB = "O(log n)";
        q35.optionC = "O(n)";
        q35.optionD = "O(n^2)";
        q35.correctOption = "C";
        questions.add(q35);

        Question q36 = new Question();
        q36.question = "Which of the following is an example of an input device?";
        q36.optionA = "Monitor";
        q36.optionB = "Printer";
        q36.optionC = "Keyboard";
        q36.optionD = "Speaker";
        q36.correctOption = "C";
        questions.add(q36);

        Question q37 = new Question();
        q37.question = "In SQL, which command is used to add new rows of data into a table?";
        q37.optionA = "ADD";
        q37.optionB = "INSERT INTO";
        q37.optionC = "UPDATE";
        q37.optionD = "CREATE";
        q37.correctOption = "B";
        questions.add(q37);

        Question q38 = new Question();
        q38.question = "What is the condition where two or more processes are unable to proceed because each is waiting for the other to release a resource?";
        q38.optionA = "Starvation";
        q38.optionB = "Deadlock";
        q38.optionC = "Mutex";
        q38.optionD = "Spooling";
        q38.correctOption = "B";
        questions.add(q38);

        Question q39 = new Question();
        q39.question = "Which network topology connects all devices to a single central cable?";
        q39.optionA = "Star Topology";
        q39.optionB = "Ring Topology";
        q39.optionC = "Bus Topology";
        q39.optionD = "Mesh Topology";
        q39.correctOption = "C";
        questions.add(q39);

        Question q40 = new Question();
        q40.question = "If x + 5 = 12, what is the value of x?";
        q40.optionA = "5";
        q40.optionB = "7";
        q40.optionC = "8";
        q40.optionD = "17";
        q40.correctOption = "B";
        questions.add(q40);

        Question q41 = new Question();
        q41.question = "Which of the following is a high-level programming language?";
        q41.optionA = "Machine Language";
        q41.optionB = "Assembly Language";
        q41.optionC = "Python";
        q41.optionD = "Binary Code";
        q41.correctOption = "C";
        questions.add(q41);

        Question q42 = new Question();
        q42.question = "In Java, what is the superclass of all classes?";
        q42.optionA = "String";
        q42.optionB = "Object";
        q42.optionC = "Main";
        q42.optionD = "System";
        q42.correctOption = "B";
        questions.add(q42);

        Question q43 = new Question();
        q43.question = "Which component of an Operating System directly interacts with the hardware?";
        q43.optionA = "User Interface";
        q43.optionB = "Application Software";
        q43.optionC = "Kernel";
        q43.optionD = "File Manager";
        q43.correctOption = "C";
        questions.add(q43);

        Question q44 = new Question();
        q44.question = "What does 'SQL' stand for?";
        q44.optionA = "Simple Query Language";
        q44.optionB = "Structured Query Language";
        q44.optionC = "System Query Language";
        q44.optionD = "Sequential Query Language";
        q44.correctOption = "B";
        questions.add(q44);

        Question q45 = new Question();
        q45.question = "Which device is used to connect multiple computers together within a Local Area Network (LAN)?";
        q45.optionA = "Modem";
        q45.optionB = "Switch";
        q45.optionC = "Gateway";
        q45.optionD = "Repeater";
        q45.correctOption = "B";
        questions.add(q45);

        Question q46 = new Question();
        q46.question = "What is the term for a function that calls itself?";
        q46.optionA = "Nested Function";
        q46.optionB = "Recursive Function";
        q46.optionC = "Overloaded Function";
        q46.optionD = "Static Function";
        q46.correctOption = "B";
        questions.add(q46);

        Question q47 = new Question();
        q47.question = "In web design, what does 'CSS' stand for?";
        q47.optionA = "Creative Style Sheets";
        q47.optionB = "Cascading Style Sheets";
        q47.optionC = "Computer Style Sheets";
        q47.optionD = "Colorful Style Sheets";
        q47.correctOption = "B";
        questions.add(q47);

        Question q48 = new Question();
        q48.question = "Which data structure is best suited for implementing a First-In, First-Out (FIFO) system?";
        q48.optionA = "Stack";
        q48.optionB = "Queue";
        q48.optionC = "Tree";
        q48.optionD = "Graph";
        q48.correctOption = "B";
        questions.add(q48);

        Question q49 = new Question();
        q49.question = "What is the value of 5 factorial (5!)?";
        q49.optionA = "24";
        q49.optionB = "60";
        q49.optionC = "120";
        q49.optionD = "150";
        q49.correctOption = "C";
        questions.add(q49);

        Question q50 = new Question();
        q50.question = "What is the main purpose of an IP address?";
        q50.optionA = "To run software applications";
        q50.optionB = "To identify a device on a network";
        q50.optionC = "To protect a computer from viruses";
        q50.optionD = "To speed up internet connection";
        q50.correctOption = "B";
        questions.add(q50);
    }
}