#!/bin/bash
	# Skript pro sestavení semestrální práce z Teoretické Informatiky
javac -d . -encoding UTF-8  src/TeoreticalInformatics/*.java
echo Main-Class: TeoreticalInformatics.Main > man.txt
jar cmf man.txt TI.jar TeoreticalInformatics src
