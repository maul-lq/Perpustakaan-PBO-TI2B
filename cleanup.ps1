# Clean up all *.class in this projects
# Usage: .\cleanup.ps1
Get-ChildItem -Path . -Recurse -Filter *.class | Remove-Item -Force