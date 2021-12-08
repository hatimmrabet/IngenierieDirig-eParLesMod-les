# Présentation du projet :

Le projet consiste à présenter un portail pédagogique de deux manières :

- En format linéaire, sous forme d’un seul fichier markdown qui contiendra toutes les informations des niveaux, parcours et des unités d’enseignement.
- Et sous la forme d’un site web, constitué de plusieurs pages et chaque page présente soit un niveau, soit une formation, soit une unité d’enseignement. Ces pages seront liées entre eux pour pouvoir naviguer sans problèmes entre les différentes pages.

## Modélisation du portail pédagogique :

Pour présenter ce portail d’une manière complète, on a proposé le métamodèle suivant :

![filMM](images/filMM.jpg "filMM")

A partir de ce métamodèle, on peut remarquer qu’il contient la représentation du portail d’une faculté. Une faculté est composée de plusieurs niveaux et intervenants. Chaque niveau est composé d’une présentation, des responsables, des enseignants, des enseignants et de deux semestres.

Chaque semestre à plusieurs ues obligatoires et d’autres optionnelles. Et chaque UE est composé une présentation, des responsables, des enseignants et des documents.

A partir de ce métamodèle, on a créé un model fil qui repend à ce qui est demandé et à partir duquel on va générer un fichier markdown et un site web.

## Génération du fichier markdown :

Pour représenter notre model fil en fichier markdown, on a commencé par transformer notre model fil en model de type simplemarkdown, et qui va contenir toutes les données qu’on avait sur le model fil.

Après cette étape, on passe à la génération d’un fichier markdown à partir du model simplemarkdown qu’on vient d’avoir, et comme ça on obtient notre fichier markdown.

## Génération du site web :

Pour la génération du site web, on va suivre les mêmes étapes qu’on a fait pour le fichier markdown, mais on va d’abord commencer par modéliser un site web en construisant un htmlbs métamodèle.

![htmlbsMM](images/htmlbsMM.jpg "htmlbsMM")

Dans notre htmlbs métamodèle, on trouve une classe site qui sera la page d’accueil de notre portail, ce site est composé de plusieurs pages, qui sont des pages de présentation d’un niveau, une formation ou une UE. La page Site fait référence aux premiers pages qu’on va utiliser, les pages des niveaux.

Chaque page est composé par plusieurs blocks, et on est partie avec l’idée que chaque block sera constitué d’un titre d’abord suivi d’une liste d’éléments, qui peuvent être des textes, des liens extérieures ou des boutons qui référence à une page qui existe déjà.

Après avoir notre métamodèle prête, on a écrit un code qui transforme un model fil en un model htmlbs qu’on va utiliser pour générer les pages du site web.

## Les points forts de notre projet :

A partir d’un model xtext ou un model fil, on peut les transformer et avoir un model simplemarkdown avec lequel on peut générer un fichier markdown ou affichera tous les données nécessaires en plus des documents et les liens vers des sites extérieures.

Et on peut aussi les transformer en model htmlbs à partir duquel on génère un site web qui utilise Bootstrap.

Dans notre site web, on a ajouté la possibilité de voir toutes les UEs d’un niveau, ainsi que les formations qui enseignent une UE particulière.

## Les points faibles de notre projet :

Notre projet ne permet pas de modifier, par exemple, la description et la présentation de notre première page du site, cela du au fait, qu’elle est écrite en dure lors de la génération du fichier, et parce qu’on n’a pas laissé une place dédiée à cela dans notre fil métamodèle. A part cela, je pense qu’on a tout fait.

## Les améliorations possibles

Les améliorations qui sont possibles c’est au niveau des documents, et c’est d’ajouter plus de type de documents comme des images, vidéos… et de gérer comment les afficher soit sur le fichier markdown ou sur le site web. 

A part cela, il y a aussi pas mal d’attribut qu’on peut ajouter dans certaines classes pour améliorer notre site, et surtout pour les intervenants. Et par la suite, on peut créer une page pour eux afin d’avoir un profile pour chaque professeur.

**Ce projet est réalisé par :**
- M'RABET EL KHOMSSI Hatim
- Malick Sow
  
**Et encadré par:**
- Dumoulin Cedric
  

# Glossaire:

**Faculté:** contient un nom (Faculté de sciences, Faculté d’économies...).

**Niveau:** c'est un niveau d'étude avec la mention du niveau ( M1 info, L2 bio...)

**Formation:** c'est la formation de chaque niveau, (Machine Learning, Genie Logiciel...)

Une **Faculté** est conposée de plusieurs Niveaux et d'Intervenants. Chaque **Niveau, Formation, UE** a une presentation. un Niveau a plusieurs responsabes, et composé de plusieurs Formations et UE.

Une **formation** est composée de deux semestre S1 et S2, et Un semestre a des UEs obligatoires et d'autres optionnelles. En plus, elle est composée des documents.

Un **UE** a des responsabes et des enseignants qui sont tous des Intervenants de la Faculté. et pour chaque Niveau est composé de plusieurs UEs.

Chaque **Formation** et **UE** sont composés des documents qui peuvent etre soit video, fichier ou audio.