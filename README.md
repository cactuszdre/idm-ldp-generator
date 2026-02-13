# Mini-Projet IDM - Génération de code Java

## Auteur
Steven T.

## Description

Ce projet implémente un générateur de code Java à partir d'un modèle de processus, dans le cadre du cours d'Ingénierie Dirigée par les Modèles (IDM).

L'objectif est de modéliser des séquences d'opérations sous forme de processus (activités avec des actions) et de générer automatiquement le code Java correspondant à l'aide d'Acceleo.

## Structure du projet

```
tp1/                          # Projet EMF principal
├── metamodels/
│   └── LDP.ecore             # Méta-modèle PDL étendu
├── models/
│   └── ProcessusCalcul.xmi   # Modèle d'exemple (processus de calcul)
└── src/LDP/                  # Code Java généré par EMF (classes du méta-modèle)

ldp.generator/                # Projet Acceleo (générateur)
├── src/ldp/generator/main/
│   └── generate.mtl          # Template Acceleo pour la génération de code
├── ProcessusCalcul.java      # Code Java généré à partir du modèle
├── Calcul.java               # Classe utilitaire (fournie par le sujet)
└── Logger.java               # Classe utilitaire (fournie par le sujet)
```

## Fonctionnalités implémentées

### Partie 1 : Séquence simple ✅

#### Méta-modèle PDL étendu (LDP.ecore)
Le méta-modèle du TP1 a été étendu avec les concepts suivants :
- **Action** (classe abstraite) : action associée à une activité
- **Variable** : représente une variable avec un nom et un type
- **InitVariable** (extends Action) : initialisation d'une variable de type primitif, avec une valeur initiale optionnelle
- **CreateObject** (extends Action) : instanciation d'un objet à partir d'une classe (constructeur sans paramètre)
- **CallMethod** (extends Action) : appel de méthode sur un objet, avec paramètres et résultat optionnel

Les activités possèdent une référence ordonnée `actions` vers une liste d'actions.

#### Modèle d'exemple (ProcessusCalcul.xmi)
Le modèle représente le processus de calcul suivant : `(n!)^puiss / x` avec n=6, puiss=3, x=100.

Il est composé de 5 activités exécutées en séquence :
1. **init** : initialise les variables (n=6, puiss=3, x=100) et crée les objets Calcul et Logger
2. **fact** : calcule factorial(n)
3. **sqrt** : calcule sqrt(resFact)
4. **pow** : calcule power(resSqrt, puiss)
5. **div** : calcule division(resPower, x) et affiche le résultat

#### Générateur Acceleo (generate.mtl)
Le générateur produit une classe Java contenant une méthode `main` qui exécute les actions du processus en séquence. Il gère :
- La génération de déclarations de variables avec valeurs initiales
- La génération d'instanciations d'objets (`new Classe()`)
- La génération d'appels de méthodes avec paramètres et résultat

### Partie 2 : Séquences parallèles ❌
Non implémentée.

## Ce qui fonctionne
- ✅ Le méta-modèle LDP.ecore est valide et complet pour la Partie 1
- ✅ Le modèle ProcessusCalcul.xmi est conforme au méta-modèle
- ✅ Le générateur Acceleo (.mtl) génère du code Java
- ✅ Le code Java généré compile (avec Calcul.java et Logger.java)
- ✅ Le code Java généré s'exécute et produit le résultat attendu

## Ce qui ne fonctionne pas
- ❌ La Partie 2 (séquences parallèles avec fourches et jonctions) n'a pas été implémentée

## Instructions pour tester

### Prérequis
- Eclipse Modeling Tools 2024-12
- Plugin Acceleo installé

### Étapes
1. Importer les projets `tp1` et `ldp.generator` dans Eclipse
2. Ouvrir `generate.mtl` dans `ldp.generator/src/ldp/generator/main/`
3. Run As → Acceleo Application
   - Model : `tp1/models/ProcessusCalcul.xmi`
   - Target : `ldp.generator/`
4. Le fichier `ProcessusCalcul.java` est généré
5. Compiler et exécuter :
   ```powershell
   cd ldp.generator
   javac Calcul.java Logger.java ProcessusCalcul.java
   java ProcessusCalcul
   ```

### Résultat attendu
```
La valeur est : 175
```

## Technologies utilisées
- **EMF** (Eclipse Modeling Framework) : méta-modélisation et modélisation
- **Acceleo** : génération de code (Model to Text)
- **Java** : langage cible de la génération
