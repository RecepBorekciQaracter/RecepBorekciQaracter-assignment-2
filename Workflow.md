## Project Setup

1. &nbsp;Created an IntelliJ Maven Project with the name RecepBorekciQaracter-assignment-2
2. Created an empty repository on GitHub with the name RecepBorekciQaracter-assignment-2. No .gitignore, no Readme.md, and no license is selected.
3. In git bash, I went into the project location and renamed the name of the main branch to main from master using this command: `git branch -M main`
4. Deleted the sample code from the Main.java file and saved my changes.
5. Added the below lines into the project's .gitignore file:

```
\### Maven ###

pom.xml.tag

pom.xml.releaseBackup

pom.xml.versionsBackup

pom.xml.next

release.properties
```

## Initial Commit

1. Executed `git add .` to stage all of the project files.
2. Executed `git commit -m "Initial commit - Removed sample code from Main.java"` to commit my changes to my local main branch
3. Executed `git push -u origin main` to synchronize my main branch to the local branch.

## Reverse and Search Array

1. Created a new branch with the name "feature/array" using `git branch -c feature/array`
2. Switch to this branch using `git switch feature/array`
3. Created a new Java class in the project named ReverseAndSearchArray.java and created an empty main method inside of it.
4. Executed `git add .` to stage my changes.
5. Executed `git commit -m "Created the ReverseAndSearchArray class and add an empty main method inside."` and committed this new class.
6. Executed `git push -u origin feature/array` to push my changes to the remote repository
7. In ReverseAndSearchArray.java file I wrote a code to read integer, asked user to type the number count they want to add. And fill an array with those numbers.
8. Add and commit these changes with the commands `git add .` and `git commit -m "Created new methods for getting the array length and array items from the user. And printed the elements in the array."`
9. Completed the rest of the functionality: Reversed the array, printed the reversed array, asked user for a number to search and returned if the searched number is in the array or not. If so, the indices are printed.
10. Added and committed my changes using `git add .` and `git commit -m "Implemented the remaining features, reverse the array, print the array, and search with index output."`
11. Executed `git push -u origin feature/array` to push my changes to the remote repository.
12. Switched to main branch
13. And did a no fast forward merge using git merge --no-ff feature/array
14. And I did git push main to complete the changes

## StringBuilder manipulation

1. Created a new branch with the name "feature/array" using `git branch -c feature/string\_builder\_manipulation`
2. Switched to this branch using `git switch feature/string\_builder\_manipulation`
3. Created a new Java class in the project named StringBuilderManipulation.java and created an empty main method inside of it.
4. Created the repeater method in this class.
5. Called the repeater method in the main function.
6. Copy-pasted the readInt() and fillArray() methods I had from my other class. And wrote a readString() method similar to readInt()
7. Coded the project. Received the inputArray length from the user, created an input array with the given length. Obtained the words and filled the array with the given words. Created a string builder and asked user for the repeat count. Printed each of the words inside the array by repeat count times.
8. Added and committed my changes using `git add .` and `git commit -m "Implement the String Builder Manipulation class."`
9. Executed `git push -u origin feature/string\_builder\_manipulation` to push my changes to the remote repository.
10. Switched to main branch
11. And did a no fast forward merge using `git merge --no-ff feature/string\_builder\_manipulation`
12. And I did git push main to complete the changes

## Uploading the Workflow.md

1. Created a new branch with the name "docs/add_workflow_markdown" using `git branch -c docs/add\_workflow\_markdown`
2. Switched to this branch using `git switch docs/add\_workflow\_markdown`
3. Add this file into the root directory.
4. Add this file to git with "git add ."
5. Commit this file using "git commit -m "Added the workflow file"
6. Executed `git push -u origin docs/add\_workflow\_markdown` to push this file to the remote repository.
7. Switched to main branch
8. And did a no fast forward merge using `git merge --no-ff docs/add\_workflow\_markdown`
9. And I did git push main to complete the changes
