
# Biblioteca Online Backend

## Descriere

Acest proiect este un sistem de gestionare a unei biblioteci, dezvoltat pentru a oferi funcționalități de bază pentru împrumuturi de cărți, recenzii, abonamente și administrare a utilizatorilor și cărților.

## Configurare

1. **MySQL Server**

    Asigurați-vă că aveți instalat și configurați un server MySQL pe mașina locală sau pe un server accesibil. Este necesar să aveți acces la baza de date pentru a rula aplicația.

2. **Configurarea Aplicației**

    În fișierul `application.properties`, localizat în directorul `src/main/resources`, trebuie să specificați detaliile de conectare la baza de date MySQL. Acolo trebuie să completați următoarele câmpuri:
    
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/biblioteca_project?createDatabaseIfNotExist=true&useSSL=false&allowPublicKeyRetrieval=true
    spring.datasource.username=utilizator_mysql
    spring.datasource.password=parola_mysql
    ```

    Asigurați-vă că ați înlocuit `nume_baza_date`, `utilizator_mysql` și `parola_mysql` cu detaliile corespunzătoare ale serverului MySQL.

## Utilizare

Pentru a utiliza această aplicație, urmați acești pași:

1. Rulați aplicația utilizând un IDE sau folosind comanda `mvn spring-boot:run`.
2. Accesați aplicația prin intermediul URL-ului: `http://localhost:8080`.
3. Interacționați cu diferitele funcționalități oferite de aplicație, cum ar fi împrumuturi, recenzii și gestionarea utilizatorilor.


## Autor

Această aplicație a fost dezvoltată de către echipa The Dream Team
