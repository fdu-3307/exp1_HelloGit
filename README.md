# exp1_HelloGit
Example Java project created via STS as Java Project, to show how to;
- make a project version controlled via git storing .git in directory in the project itself
- create remote github project
- set remote repository of the project to github one created above

## Summary of version control via git
- Git is a distributed version control system. Meaning, you can version control your project via a local git repository, locally on your laptop, without any need of a central version control server or repository. Then you can create a remote git repository (like in github or bitbucket, etc). Then you can set remote repository of your project to be that remote one and keep your local git repo in sync (push/pull) with remote one. Hence you use your local repository to version control your project locally. And use remote repository as a master repository to work with other developers and to make over all project level builds, deployments and releases.
- You can do git via STS(eclipse) or via git commands issued at bash shell. Suggesting using STS.
- To be able to share your git versioned project with others, you can push/pull to/from remote git repository (for example in github or bitbucket)
- 1st make your project version controlled by git.
- 2nd create a github repository and set it as remote in your git project.

## To make project version controlled via git
- You can create (git init) local git repo either in the project’s directory itself, or in default common git repo directory. Suggesting to create local git repo in each project’s top directory itself. 
- Make sure you are in Spring or Java perspective of STS
- 1st change to Navigator view. Click on Navigator window tab on left side
- If Navigator window is closed open it via  Window --> Show View --> Other, General --> Navigator, click OK
- Right click on project, select Team --> Share Project
- Click “Use or create repository in parent folder of project” check box on top of “Configure Git Repository” pop up
- Click on your project (in this example exp_Git) in the list in middle
- Click “Create Repository” button on lower left
- Click “Finish” button at bottom right corner
- Notice "yellow milk bottle", appear on right corner of project and its directories and files
- Notice "?" mark appear on some directories and files, meaning git is not tracking them yet 
- Notice hidden directory .git (where local git repo files exist) and hidden file .gitignore (that tells git what files/directories to ignore) got added
- Modify .gitignore contents to have at least  .git/, .project, .classpath, .settings/, /bin, /target/
- Notice “?” of .settings, bin directories and .classpath, .project files is gone, meaning git no longer trying to track them, just ignoring  them

## To "add to index" (put things to "staging area") of git
- Open “Git Staging” window. Window --> Show View --> Other --> click Git --> Git Staging, click OK.
- Notice files with “?” in “Unstaged Changes”, meaning they are "untracked"
- Select them in "Unstaged Changes" section, right click, select “Add to Index”
- Notice they get green “+” icon on lower right corner and move to “Staged Changes” section, meaning they had been added to "staging area" of git
- Notice you you get black "*" icon, meaning there are "staged" 

## To "commit" (commit to local git repo) or "commit and push" (commit to local git repo and push to remote git repo)
- Open “Git Staging” window. Window --> Show View --> Other --> click Git --> Git Staging, click OK.
- Notice files with “+” in “Staged Changes”, meaning they are "added"
- Enter a message like, "initial commit" in “Commit Message” section 
- To just commit to local git repo, click "Commit" at lower right corner of "Git Staging" window
- If remote git repository have been created and local git repo have been configured to use it, and want to commit to local git repository and push to remote git repository at the same time (1st commit, then push), click "Commit and Push" button at lower right corner of "Git Staging" window

## To create repository in github
- Login to github at https://github.com
- If you had created an organization, select the organization at https://github.com from pull down on left center of screen under your github account name
- Click green "New repository" button near right top corner
- Enter "exp1_HelloGit" (or whatever you want) as remote Repository name, click green "Create repository" button toward bottom left

## To get URL of github repository
Go to the repository in github
- Click green "Clone or download" button toward right middle/top part of screen
- Click the icon that looks like little book with an arrow, on right of the url

## To set remote repository of the project to github repository
- In STS switch to Git perspective (on top right corner click on Yellow barrel displaying GIT)
- Expand the project on left "Git Repositories" window by clicking arrow next to it
- Remotes should be empty
- Right click on Remotes, select "Create Remote"
- Enter 
<br>TODO ilker addToMe

# To 
