# Angular_Spring_Template
This is a template for SpringBoot with Angular 11.

This repository serves the static generated files to github pages.

The following steps shall be taken to serve files for github pages:

1. Create a subtree branch gh-pages and push the static contents to it with the following command:
  <b>git subtree split --prefix src/main/resources/static -b gh-pages</b>
2. Switch to new branch:
  <b>git checkout gh-pages</b>
3. Pull previous data
  <b>git pull origin gh-pages</b>
4. Push new changes:
  <b>git push -f origin gh-pages:gh-pages</b>
5. Make changes in <i>index.html</i>'s <i><base href="Repository Name"></i>.
5. Change the Github pages repo in Repository Settings.
