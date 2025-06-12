CREATE TABLE tables (
    tab_id BIGSERIAL PRIMARY KEY,
    tab_numero BIGINT UNIQUE NOT NULL,
    tab_qr_code TEXT
);

CREATE TABLE type_article (
    typ_id BIGSERIAL PRIMARY KEY,
    typ_nom TEXT NOT NULL
);

CREATE TABLE article (
    art_id BIGSERIAL PRIMARY KEY,
    art_typ_id BIGINT,
    art_nom TEXT NOT NULL,
    art_prix NUMERIC(6,2) NOT NULL,
    art_stock BIGINT NOT NULL,
    art_actif BOOLEAN DEFAULT TRUE,
    art_photo TEXT,
    art_description TEXT NOT NULL
);

CREATE TABLE happy_hour (
    hap_id BIGSERIAL PRIMARY KEY,
    hap_jour INT NOT NULL,
    hap_debut TIME NOT NULL,
    hap_fin TIME NOT NULL
);

CREATE TABLE happy_article_reduction (
    har_hap_id BIGINT,
    har_art_id BIGINT,
    har_prix NUMERIC(6,2) NOT NULL,
    PRIMARY KEY (har_hap_id, har_art_id)
);

CREATE TABLE commande (
    com_id BIGSERIAL PRIMARY KEY,
    com_numero TEXT UNIQUE NOT NULL,
    com_tab_id BIGINT,
    com_datetime TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    com_statut TEXT NOT NULL,
    com_total_ht NUMERIC(8,2),
    com_total_ttc NUMERIC(8,2),
    com_remise NUMERIC(8,2)
);

CREATE TABLE commande_article (
    coa_com_id BIGINT,
    coa_art_id BIGINT,
    coa_qte BIGINT NOT NULL,
    coa_statut VARCHAR(10),
    coa_prix_unitaire NUMERIC(6,2) NOT NULL,
    coa_source_prix VARCHAR(500),
    coa_heure TIME DEFAULT CURRENT_TIME,
    PRIMARY KEY (coa_com_id, coa_art_id)
);

CREATE TABLE paiement (
    pai_id BIGSERIAL PRIMARY KEY,
    pai_com_id BIGINT,
    pai_moyen VARCHAR(10) NOT NULL,
    pai_montant NUMERIC(8,2) NOT NULL,
    pai_datetime TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE employe (
    emp_id BIGSERIAL PRIMARY KEY,
    emp_prenom VARCHAR(500) NOT NULL,
    emp_nom VARCHAR(500) NOT NULL,
    emp_email VARCHAR(500) UNIQUE NOT NULL,
    emp_passe VARCHAR(500) NOT NULL,
    emp_role VARCHAR(500) NOT NULL
);

CREATE TABLE client (
    cli_id BIGSERIAL PRIMARY KEY,
    cli_emp_id BIGINT,
    cli_table BIGINT NOT NULL,
    cli_debut TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    cli_fin TIMESTAMP
);

CREATE TABLE stock (
    sto_id BIGSERIAL PRIMARY KEY,
    sto_art_id BIGINT UNIQUE,
    sto_qte INT NOT NULL
);

CREATE TABLE stock_log (
    stl_id BIGSERIAL PRIMARY KEY,
    stl_art_id BIGINT,
    stl_emp_id BIGINT,
    stl_datetime TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    stl_variation BIGINT NOT NULL,
    stl_motif VARCHAR(255)
);

ALTER TABLE article
    ADD FOREIGN KEY (art_typ_id) REFERENCES type_article(typ_id);

ALTER TABLE happy_article_reduction
    ADD FOREIGN KEY (har_hap_id) REFERENCES happy_hour(hap_id),
    ADD FOREIGN KEY (har_art_id) REFERENCES article(art_id);

ALTER TABLE commande
    ADD FOREIGN KEY (com_tab_id) REFERENCES tables(tab_id);

ALTER TABLE commande_article
    ADD FOREIGN KEY (coa_com_id) REFERENCES commande(com_id),
    ADD FOREIGN KEY (coa_art_id) REFERENCES article(art_id);

ALTER TABLE paiement
    ADD FOREIGN KEY (pai_com_id) REFERENCES commande(com_id);

ALTER TABLE client
    ADD FOREIGN KEY (cli_emp_id) REFERENCES employe(emp_id);

ALTER TABLE stock
    ADD FOREIGN KEY (sto_art_id) REFERENCES article(art_id);

ALTER TABLE stock_log
    ADD FOREIGN KEY (stl_art_id) REFERENCES article(art_id),
    ADD FOREIGN KEY (stl_emp_id) REFERENCES employe(emp_id);
