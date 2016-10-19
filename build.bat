javac -d . -encoding UTF-8  src/TeoreticalInformatics/*.java
echo Main-Class: TeoreticalInformatics.Main > man.txt
jar cmf man.txt TI.jar TeoreticalInformatics src
