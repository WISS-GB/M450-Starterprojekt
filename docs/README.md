# Dokumentation - M450 Starterprojekt

## Use-Cases

![use-case diagram](images/use-cases.png)

Da die Applikation klein gehalten ist, gibt es nur wenige use-cases:

|     Use-Case     | User-Story                                                                                         |
| :--------------: | -------------------------------------------------------------------------------------------------- |
|  **Add Items**   | Als Benutzer möchte ich neue Items erfassen können, dass ich diese anschauen und löschen kann.     |
| **Delete Items** | Als Benutzer möchte ich Items löschen können, damit diese nicht mehr in der Item-Liste auftauchen. |
|  **View Items**  | Als Benutzer möchte ich mir eine Liste mit den erfassten Items anzeigen können.                    |

## Screen Mockups

Basierend auf den Use-Cases wurde ein rudimentäres Screen-Mockup erstellt, welches in der Applikation weitestgehend gleich umgesetzt wurde.

![use-case diagram](images/layout.png)

## Komponenten

Anhand des Screen-Mockups wurden Komponenten identifiziert in welche die Applikation aufgeteilt werden kann.

![use-case diagram](images/components.png)

|  Komponente   | Beschreibung                                                                                                                              |
| :-----------: | ----------------------------------------------------------------------------------------------------------------------------------------- |
| **Add Item**  | Die Komponente beinhaltet die HTML-Elemente und die Logik zum erfassen von neuen Items.                                                   |
| **Item List** | Diese Komponente ist für das beschaffen der Items zuständig und rendert dann die Liste.                                                   |
|   **Item**    | Die Item-Komponente stellt die Logik zum löschen eines einzelnen Eintrags der Item-List und beschreibt auch die Darstellung des Eintrags. |

## Klassendiagramm

Basierend auf der Beschreibung der Applikation wurde folgendes Klassendiagramm definiert. Da die Applikation sehr klein gehalten ist, werden nicht viele eigene Implementationen benötigt.

![use-case diagram](images/class-diagram.png)

Da in der Applikation ein objektrelationaler Mapper eingesetzt wird, ist ein ERD für die darunterliegende Datenbank hinfällig. Die Datenbank und ihre Tabellen wird vom Spring-Framework generiert und verwaltet, womit dem Code-First Ansatz gefolgt wurde.
