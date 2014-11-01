Java EE 7 - Workshop
========================

Dies ist das Begleitprojekt zum Workshop Java EE 7 am 03.11.2014 im Rahmen der W-JAX 2014.

Zum Mitmachen benötigen Sie die folgenden Dinge:

- Einen PC (;-). Das Betriebssystem ist generell zweitrangig. Ich habe allerdings nur Erfahrungen mit Windows und (ein wenig) mit Linux. Zu MacOS kann ich nichts sagen.

- Ein installiertes JSDK. Wir benötigen Java 7 oder 8 (Download für Windows und Linux: http://www.oracle.com/technetwork/java/javase/downloads/index.html, derzeitige Version 8u5)

- Einen Git-Client, z. B. Git Bash (Download: http://git-scm.com/downloads)

- Maven 3.x (Download: http://maven.apache.org/download.html)

- Eine IDE ihrer Wahl. Wichtig ist, dass Maven-Projekte importiert werden können und WildFly als Application Server eingebunden werden kann. Ich empfehle dazu das
  JBoss Developer Studio (http://www.jboss.org/products/devstudio/download/, derzeitige Version 8.0.0). Anders als der Name es vermuten lässt, ist es nicht nur für den JBoss 
  Application Server nutzbar. Lassen Sie sich durch den Text auf der Download-Seite nicht verwirren: Die Software ist kostenlos. Sie müssen sich lediglich registrieren.
  
  Das JBDS ist ein Eclipse (Kepler bzw.Luna) mit hinzuinstallierten JBoss Tools. Sie können somit auch ihr ggf. bereits installiertes Eclipse aufrüsten. Ich habe in der
  Vergangenheit aber sporadisch das Problem gehabt, dass vermutlich aufgrund inkompatibler Versionen diverser Plugins die Integration nicht vollständig funktional war.
  So konnten bspw. keine Maven-Projekte importiert werden oder die SCM-Anbindung funktionierte nicht mwehr etc. etc. Die sichere Wahl ist dahar aug jeden Fall das JBDS.
  
  JBDS (wie auch Eclipse) enthält diverse Validatoren, die die Korrektheit von Deskriptoren etc. testen sollen. Leider funktionieren diese Validatoren (zumindest für 
  Maven-Projekte) nicht korrekt. Wenn nach dem Import der Projekte Validierungsfehler (z. B. "JPA Problem") angezeigt werden, sollten Sie die Validatoren deaktiviern 
  (Window -> Preferences -> Validation: Disable All).

- WildFly 8 (Download http://www.wildfly.org/download/, derzeitige Version 8.1.0.Final). Wir setzen im Workshop diesen Server ein. Generell ist aber jeder 
  Java-EE-7-Server geeignet.
  

Der Branch master enthält eine Startversion der Enterprise-Anwendung, die im Workshop aufgebaut wird. Initial ist der Branch wjax14 identisch, wird aber im Workshop mit 
der konkret entwickelten Software stückweise gefüllt.

Bitte checken Sie zur Vorbereitung den Branch wjax14 aus, wenn Sie direkt mitmachen wollen.
  
Fragen können während der Veranstaltung natürlich jederzeit gestellt werden und nachher gerne an dirk.weil(at)gedoplan.de.

Dirk Weil   