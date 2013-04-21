CREATE TABLE Employe(
        Id_Employe           int(11) Auto_increment  NOT NULL ,
        Nom                  Char(25),
        Prenom               Char(25),
        Date_de_Naissance    Date,
        Adresse              Varchar(25),
        Email                Char(25),
        Pseudo               Char(25),
        Mot_de_passe         Char(25),
        Telephone            Char(25),
        Sexe                 Char(25),
        Statut_Activation    Bool,
        Date_Creation_Compte Date,
        Taille_maximum		 Float,
        Id_Service_Service   Int,
        PRIMARY KEY (Id_Employe)
)ENGINE=InnoDB;

CREATE TABLE Evenement(
        Id_Evenement           int(11) Auto_increment  NOT NULL ,
        Intitule_Evenement     Varchar(25),
        Descriptiion_Evenement Text,
        Date_Evenement         Date,
        Date_Publication       Date,
        PRIMARY KEY (Id_Evenement)
)ENGINE=InnoDB;

CREATE TABLE Service(
        Id_Service          int(11) Auto_increment  NOT NULL ,
        Intitule_Service    Char(25),
        Chef_de_Service     Varchar(25),
        Description_Service Text,
        PRIMARY KEY (Id_Service)
)ENGINE=InnoDB;

CREATE TABLE Message(
        Id_Message           int(11) Auto_increment  NOT NULL ,
        Adresse_Expediteur   Varchar(25),
        Adresse_Destinataire Varchar(25),
        Objet_Message        Char(25),
        Contenu_Message      Text,
        Date_Envoie          Date,
        Date_Reception       Date,
        Priorite_Message     Int,
        Id_Employe_Employe   Int,
        PRIMARY KEY (Id_Message)
)ENGINE=InnoDB;

CREATE TABLE Fichier(
        Id_Fichier         int(11) Auto_increment  NOT NULL ,
        Intitule_Fichier   Char(25),
        Type_Fichier       Char(25),
        Date_Creation      Date,
        Texte_Fichier      Text,
        Taille_Fichier     Int,
        Id_Employe_Employe Int,
        PRIMARY KEY (Id_Fichier)
)ENGINE=InnoDB;

CREATE TABLE Publication(
        Id_Publication         int(11) Auto_increment  NOT NULL ,
        Objet_Publication      Char(25),
        Titre_Publication      Char(25),
        Texte_Publication      Varchar(25),
        Date_Publication       Date,
        Validation_Publication Bool,
        Id_Employe_Employe     Int,
        PRIMARY KEY (Id_Publication)
)ENGINE=InnoDB;

CREATE TABLE Commentaire(
        Id_Commentaire             int(11) Auto_increment  NOT NULL ,
        Date_Commentaire           Date,
        Texte_Commentaire          Text,
        Etat_Commentaire           Bool,
        Validation_Commentaire 	   Bool,
        Id_Evenement_Evenement     Int,
        Id_Publication_Publication Int,
        PRIMARY KEY (Id_Commentaire)
)ENGINE=InnoDB;

CREATE TABLE Groupe(
        Id_Groupe             int(11) Auto_increment  NOT NULL ,
        Intitule_Groupe       Char(25),
        Description_Groupe    Text,
        Date_Creation_Groupe  Date,
        Administrateur_Groupe Char(25),
        PRIMARY KEY (Id_Groupe)
)ENGINE=InnoDB;

CREATE TABLE Receptionner(
        Id_Employe_Employe Int NOT NULL ,
        Id_Message_Message Int NOT NULL ,
        PRIMARY KEY (Id_Employe_Employe,Id_Message_Message)
)ENGINE=InnoDB;

CREATE TABLE Adherer(
        Id_Employe_Employe Int NOT NULL ,
        Id_Groupe_Groupe   Int NOT NULL ,
        PRIMARY KEY (Id_Employe_Employe,Id_Groupe_Groupe)
)ENGINE=InnoDB;

CREATE TABLE Creer(
        Id_Employe_Employe     Int NOT NULL ,
        Id_Evenement_Evenement Int NOT NULL ,
        PRIMARY KEY (Id_Employe_Employe,Id_Evenement_Evenement)
)ENGINE=InnoDB;

ALTER TABLE Employe ADD CONSTRAINT FK_Employe_Id_Service_Service FOREIGN KEY (Id_Service_Service) REFERENCES Service(Id_Service);
ALTER TABLE Message ADD CONSTRAINT FK_Message_Id_Employe_Employe FOREIGN KEY (Id_Employe_Employe) REFERENCES Employe(Id_Employe);
ALTER TABLE Fichier ADD CONSTRAINT FK_Fichier_Id_Employe_Employe FOREIGN KEY (Id_Employe_Employe) REFERENCES Employe(Id_Employe);
ALTER TABLE Publication ADD CONSTRAINT FK_Publication_Id_Employe_Employe FOREIGN KEY (Id_Employe_Employe) REFERENCES Employe(Id_Employe);
ALTER TABLE Commentaire ADD CONSTRAINT FK_Commentaire_Id_Evenement_Evenement FOREIGN KEY (Id_Evenement_Evenement) REFERENCES Evenement(Id_Evenement);
ALTER TABLE Commentaire ADD CONSTRAINT FK_Commentaire_Id_Publication_Publication FOREIGN KEY (Id_Publication_Publication) REFERENCES Publication(Id_Publication);
ALTER TABLE Receptionner ADD CONSTRAINT FK_Receptionner_Id_Employe_Employe FOREIGN KEY (Id_Employe_Employe) REFERENCES Employe(Id_Employe);
ALTER TABLE Receptionner ADD CONSTRAINT FK_Receptionner_Id_Message_Message FOREIGN KEY (Id_Message_Message) REFERENCES Message(Id_Message);
ALTER TABLE Adherer ADD CONSTRAINT FK_Adherer_Id_Employe_Employe FOREIGN KEY (Id_Employe_Employe) REFERENCES Employe(Id_Employe);
ALTER TABLE Adherer ADD CONSTRAINT FK_Adherer_Id_Groupe_Groupe FOREIGN KEY (Id_Groupe_Groupe) REFERENCES Groupe(Id_Groupe);
ALTER TABLE Creer ADD CONSTRAINT FK_Creer_Id_Employe_Employe FOREIGN KEY (Id_Employe_Employe) REFERENCES Employe(Id_Employe);
ALTER TABLE Creer ADD CONSTRAINT FK_Creer_Id_Evenement_Evenement FOREIGN KEY (Id_Evenement_Evenement) REFERENCES Evenement(Id_Evenement);