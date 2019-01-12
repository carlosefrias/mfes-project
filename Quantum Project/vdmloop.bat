@echo off
rem Runs a collection of VDM++ testExamples
rem Assumes specification in Word RTF files

set T1 = Tabuleiro.rtf
set T2 = TesteTabuleiro.rtf

"C:\Program Files (x86)\The VDM++ Toolbox Academic v8.0\bin\vppde" -p -R vdm.tc %T1% %T2%
for /R %%f in (*.arg) do call vdmtest "%%f"
