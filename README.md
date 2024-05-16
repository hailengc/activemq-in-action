### Background
This is a fork from https://github.com/bsnyder/activemq-in-action. 

Original repo is not able to compile, use this fork to sovle the issue so we can run examples while reading the book: https://www.manning.com/books/activemq-in-action


### Changes
I did some tweaks to make it compile or run. So code in this fork is not ready to merge back to original repo, though original repo seems not active for a long time anyway.

### Build
`mvn clean install` 

Note: this command is slow about 13 mins to finish, seems due to some packages (which are quite old) are missing POM and Maven is looking for it and download from different urls.

Woudld suggest build it once and run each single class through IntelliJ.




### Run
1. if `mvn clean install` is done, you are able to run against the jar, for example
  ```
 cd  ~/activemq-in-action/examples

 java -cp ./target/activemq-in-action-examples-jar-with-dependencies.jar org.apache.activemq.book.ch7.spring.SpringClient
  ```
2. In Intellij, You can click to run the main function of each Class, you can provide necessary arguments through `Run -> Edit Configurations` and pass in through `Program arguments`.