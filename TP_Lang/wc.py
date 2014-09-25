#!/usr/bin/python

import os
import urllib

f = open('germinal.txt', 'r')
i = 0
#Comptage du nombre de mots.
for line in f:
	i = i + line.count(" ", 0, len(line)) + 1
	i = i - line.count("- ", 0, len(line))
	
print i


google = os.popen('zenity --entry --text="Tu veux chercher quoi ?" --title="google.py"').read()
google = urllib.quote(google)
os.system('firefox http://www.google.com/search?q=%s' % (google))  
