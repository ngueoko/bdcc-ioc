# Inversion de controle IOC
<h1>Cette application utililise implemente plusieurs stratégie pour l'inversion de contrôle</h1>

<h2>Partie 1:  </h2>
<h3>IDao avec une méthode getData</h3>
<img src="image/1-IDao.png"/>
<h3>IDao Implementation</h3>
<img src="image/1-IDao-impl.png"/>
<h3>IMetier avec une méthode calcul</h3>
<img src="image/3-IMetier.png"/>
<h3>IMetier implémentation avec couplage faible</h3>
<img src="image/4-IMetier-Impl-Couplage-faible.png"/>
<h3>L'injection des dépendances</h3>
<h4> a. Par instanciation statique</h4>
<img src="image/5-a-instanciation-static.png"/>
<h4> b. Par instanciation dynamique</h4>
<img src="image/5-b-instanciation-dynamique.png"/>
<h4> c. En utilisant le Framework Spring</h4>
<p> Annotations</p>
<img src="image/5-c-instanciation-spring-annotations.png"/>
<p> xml</p>
<img src="image/5-c-instanciation-spring-xml.png"/>