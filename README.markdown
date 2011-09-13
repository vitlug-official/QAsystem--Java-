#README file for the QA System (Java)
INSTRUCTIONS TO MAKE PROGRAM WORK 
To make the POS Tagger work Stanford NLP library is needed.
Refer: http://nlp.stanford.edu/software/tagger.shtml to download the tagger library

If using an IDE, following tutorial will help setting up the library so that the program can be run:
http://www.galalaly.me/index.php/2011/05/tagging-text-with-stanford-pos-tagger-in-java-applications/

README file for the QA System (Java)
Update1: POS Tagger
--------------------
Source file: tag.java
->Seperates the noun from the source string
->Source string is a variable 'String sample'
->The tagging is done according to Penn Treebank tag set (enclosed in ptts.txt)
->Currently have stored the Part of speech to select in 'String[] select' (only nouns)

