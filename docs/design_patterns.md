# Design Patterns

Design Patterns eignen sich bestens für häufig wiederkehrende Situationen
während der Entwicklung. Jedes Entwicklungsmuster bietet jeweils für eine
ganz bestimmte Art von Problem einen Lösungsansatz. Daher können wir
jedem Design Pattern folgende Merkmale zuordnen:

1. Name
2. Problem
3. Lösung
4. Konsequenz

Im Folgenden betrachten wir zwei verschiedene Design Patterns: Zum einen das
**Template** und zum anderen den **Builder**:

## Template

Betrachten wir die Klasse [edu.inflk.patterns.template.Agent.java](../src/main/java/edu/inflk/patterns/template/Agent.java).
Diese Klasse stellt eine Vorlage für die zu implementierenden Typen von Agenten dar.
Ein Template kennzeichnet sich aus durch:

- abstrakte Klasse
- Template-Methode (final, enthält Reihenfolge der Schritte)
- abstrakte Methoden (steps)
- Standardimplementierung, nicht abstrakt (steps)
- optionale Methoden (hooks)

**Abstrakte Klassen** können nicht instantiiert werden. Es muss die Instanz einer
Unterklasse erzeugt werden. **abstrakte Methoden** müssen von Unterklassen zwingend
deklariert werden. **leere Methoden** enthalten keinen Code im Methodenkörper. Sie
können von Unterklassen überschrieben werden, wenn die entsprechende Funktionalität
gewünscht ist.

Darüber hinaus können Templates aber auch herkömmliche Methoden enthalten.

### Problem

### Lösung

### Konsequenz