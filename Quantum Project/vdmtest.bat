@echo off
rem Tests the date book specification for one test case (argument)
rem -- Output the argument to stdout (for redirect) and "con" (for user feedback)
echo VDM Test: '%1'>con
echo VDM Test: '%1'

rem short names for specificarion files in Word RTF Format
set T1=Tabuleiro.rtf
set T2=TesteTabuleiro.rtf

rem -- Calls the interpreter for this test case
"C:\Program Files (x86)\The VDM++ Toolbox Academic v8.0\bin\vppde" -i -D -I -P -Q -R vdm.tc -O %1.res %1 %T1% %T2%

rem -- Check for difference between result of execution and expected result.
if EXIST %1.exp fc /w %1.res %1.exp

:end