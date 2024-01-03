What is JVM, JRE & JDK:
JVM stands for Java Virtual Machine
This is the reason why Java is considered as a Platform Independent Language
Compiles the source code to byte code and then execute byte code on JVM
To execute java code on Macbook, need to install JVM for Mac OS installed on the system. 
Without JVM, cannot execute the java application.

JRE stands for Java Run time Environment
This includes JVM in itself plus Java libraries and classes which are needed to execute a program.
If any of the application developed requires Java to be installed, then its recommended to add the JRE as part of installation file so that the clients are not needed to install Java by themselves

JDK stands for Java Development Kit
This includes all the libraries, tools that are required to develop the java application
Java Compiler, Java debugger, documentation generation, etc.,

=====================================================================================================================================================

How Java works:
Step 1: Type a source code save as Test.java
Step 2: Compile Test.java file, if no errors then Test.class is generated
[Compiler compiles the source code to byte code and generates a class file]
Step 3: Run the Program starting the JVM with class file. JVM translates the bytecode to something the underlying platform understands and runs the program.

===================================================================================================================================================

JDK installation:
Install the jdk from internet. 
Open JDK and Oracle JDK would be available for download
Open JDK is a free where as Oracle JDK is commercial.
Look to install the JDK version which is LTS (Long term support). Java 8 & Java 11 are LTS
While installing make sure to download the OS specific
Once downloaded, check the bin directory. And can see javac, java doc, java.exe tools
From command prompt, can navigate to bin directory and check the java version by typing the command "java --version"
If navigated outside the bin directory then typing the above command, doesn't recognize java.

Inorder to recognize java from anywhere in the system, need to set up the environment variables.

Hence to install Java- make sure JDK is downloaded and JAVA_HOME is setup in the environment variables.

===================================================================================================================================================

HelloWorld:
Everything in java will be in a class
class contains methods
methods contains statements

Step 1: Create HelloWorld.java file from command line
Go to Command line. Go the the directory in which you want file to be created
Type "notepad HelloWorld.java"
Then file is created and opened

Now type in the code and save

Step 2: Type in the command "javac HelloWorld.java"
In this step, silently the class file is created. In the directory, now two files would be seen. one is HelloWorld.java and second is HelloWorld.class

Step 3: Type in the command "java HelloWorld"
In the command, no need to mention explicitly the class file extension. As the JVM looks for the class files only.
And once the class file is found, then inside the class, it looks for the main method.

=====================================================================================================================================================
Naming Convention:

Java is case sensitive
Class names Standard is first letter of each word is Uppercase. No spacing between the words
Method names Standard is first letter of first word is lowercase. first letter of other words is uppercase. No spacing between the words
Constants Standard is all letters are Uppercase and Underscores

=====================================================================================================================================================

IDE:
Stands for Integrated Development Environment
Software application that provides comprehensive facilities to programmers for Software development
Contains source code editor, debugger, compiler, build automation tools

===================================================================================================================================================

Comments:
Single line //
Multiple line 
/*

/*
Java doc
/**
*
/

To generate Java doc, need to do from Tools of IDE. That generates the html file. Opening the file in browser will display the documentation
======================================================================================================================================================