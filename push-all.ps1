cd C:\Users\amnai\OneDrive\Desktop\northtechms

Write-Host "Staging all changes..."
git add .

Write-Host "Committing..."
git commit -m "Update microservices"

Write-Host "Pushing to GitHub..."
git push origin main

Write-Host "All microservices pushed successfully!"
