# fileReader with jfile chooser
JFileChooser is a quick and easy way to prompt the user to choose a file or a file saving location.
In this form of methodology a user is free to choose any txt file.

Further file reader is used which Creates a new FileReader, given the name of the file to read from.
As the file reader is obliged to be used along side a throws clause. In short we need to use the Exception FileNotFoundException.

A classic BufferedReader with JDK 1.7 try-with-resources to auto close the resources is used.

after we split by spaces between words, which is then added to an array, to further display one word per line.
