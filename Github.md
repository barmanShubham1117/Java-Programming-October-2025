# GitHub Basics for Beginners

## What is GitHub?
- Web-based platform for version control using Git
- Hosts code repositories online
- Collaboration platform for developers
- Free for public repositories

## Key Concepts

### Repository (Repo)
- Project folder containing all files and version history
- Can be public or private

### Commit
- Snapshot of changes made to files
- Each commit has a unique ID and message

### Branch
- Separate line of development
- `main` branch is the default primary branch

### Pull Request (PR)
- Request to merge changes from one branch to another
- Allows code review before merging

## Basic Git Commands
```bash
git init                    # Initialize new repository
git clone <url>            # Copy repository from GitHub
git add <file>             # Stage files for commit
git commit -m "message"    # Save changes with message
git push                   # Upload changes to GitHub
git pull                   # Download latest changes
git status                 # Check current status
```

## GitHub Workflow
1. **Create Repository** on GitHub
2. **Clone** to local machine
3. **Make Changes** to files
4. **Add & Commit** changes
5. **Push** to GitHub
6. **Create Pull Request** (if working with branches)

## Getting Started
1. Create GitHub account at github.com
2. Install Git on your computer
3. Configure Git:
   ```bash
   git config --global user.name "Your Name"
   git config --global user.email "your.email@example.com"
   ```

## Best Practices
- Write clear commit messages
- Commit frequently with small changes
- Use branches for new features
- Review code before merging
- Keep README.md updated

## Common Files
- `README.md`: Project description and instructions
- `.gitignore`: Files to exclude from version control
- `LICENSE`: Legal terms for using the code