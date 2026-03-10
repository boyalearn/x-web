mvn antlr4:antlr4
java -jar lib/antlr-4.7.1-complete.jar ./src/main/java/com/xweb/sql/parser/SqlBase.g4
java -jar lib/antlr-4.7.1-complete.jar ./src/main/java/com/xweb/sql/parser/SqlBase.g4 -o ./src/main/java/com/xweb/sql/parser