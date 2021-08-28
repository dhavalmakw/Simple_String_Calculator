# Simple String Calculator using TDD
# Before you start:
- Try **not to read ahead**.
- Do **one task at a time**. The trick is to learn to work incrementally.
- Make sure you only test for correct inputs. There is no need to test for invalid inputs for this kata.
## Why is TDD important?
TDD helps keep productivity high by narrowing focus of the developers.
### Language :- Java
### Tool :- Eclipse  
### Dependencies :- jutil 3
# Steps:
 1. Create **int Add(string numbers)**. This method is defined as a public and return addition of two number. 
 2. This method can take string as a perimeter.
 3. Check for empty string. Example : " " 
 4. Allow the Add method to handle an unknown amount of numbers like : "1", "1,2" 
 5. Allow the Add method to handle an unknown amount of numbers like :
        I) the following input is valid : “1,2,3,4”
 6. Allow the Add method to handle new lines between numbers like :
        I) the following input is ok: “1\n2,3”
       II) the following input is ok: “1\n2;3,4”
      III) the following input is NOT ok: “1,\n” 
 7.  Beginning of the string will contain a separate line that looks like this: 
        I) “//;\n1;2” should return 1+2 = 3 where the default delimiter is ‘;’ .
       II) The first line is optional. all existing scenarios should still be supported
 8. Method also works for negative number and it will throw an exception “negatives not allowed” - and the negative that was passed.
 9. add method does not contain number which bigger than 1000 should be ignored, so adding 2 + 1001 = 2
# commit
Here, every test has it's own commit which show that what kind of operation will be performed.
