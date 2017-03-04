# exp1_HelloGit
Example Java project created via STS as Java Project, that we used to;
- make a project version controlled via git storing .git in directory in the project itself
- create remote github project
- set remote repository of the project to github one created above

## To make project version controlled via git
- Make sure you are in Spring or Java perspective
- Right click on project, select Team --> Share Project
- Click on Navigator window tab on left side (if Navigator window is closed open it via  Window --> Show View --> Other, General --> Navigator, click OK)
- Notice hidden directory .git (where local git repo files exist) and hidden file .gitignore (that tells git what files/directories to ignore)got added
- Modify .gitignore contents to have at least  .git, .project, .classpath, .settings /bin, /target 

## To create repository in github
- Login to github at https://github.com
- Select the organization, if you had created one, at https://github.com from pull down on left center of screen under you github account name
- Click green "New repository" button near right top corner
- Enter "exp1_HelloGit" (or whatever you want) as remote Repository name, click green "Create repository" button toward buttom left
- Click green "Clone or download" button toward right midddle/top part of screen
- Click the icon that looks like little book with an arrow, on right of the url

## To set remote repository of the project to github
- In STS switch to Git perspective (on top right corner click on Yellow barrel displaying GIT)
- Expand the project on left "Git Repositories" window by clicking arrow next to it
- Remotes should be empty
- Right click on Remotes, select "Create Remote"
TODO ilker addToMe

# To 
