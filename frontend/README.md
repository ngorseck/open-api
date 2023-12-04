Creer un dossier sur votre projet nomme ***app-frontend***

***Creation du projet dans le repertoire app-frontend via cette commande***
```bash
ng new app-frontend --directory=./
```

***Creation du composant clients en se positionnant dans app-frontend, cette fois ci***
```bash
ng g c clients
```

***Installation de bootstrap app-frontend aussi***
```bash
npm i bootstrap bootstrap-icons
```

***Apres installation de bootstrap, allez y dans le angular.json puis ajouter les lignes dans styles et scripts***
"styles": [
    "src/styles.css",
    "node_modules/bootstrap/dist/css/bootstrap.min.css"
],
"scripts": [
    "node_modules/bootstrap/dist/js/bootstrap.bundle.js"
],


***Puis dans styles.css qui est dans le repertoire src:***
@import "bootstrap-icons/font/bootstrap-icons.min.css";