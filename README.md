TP 4 : Héritage avec Hibernate - Stratégies de Mapping
<img width="1845" height="897" alt="Capture d&#39;écran 2026-02-23 213601" src="https://github.com/user-attachments/assets/7323fdd0-db23-401f-93bb-7ae26e45c97b" />
<img width="1218" height="924" alt="Capture d&#39;écran 2026-02-23 213640" src="https://github.com/user-attachments/assets/d793ef05-9dd1-4af6-9eba-00c23ff73fa0" />
<img width="1872" height="920" alt="Capture d&#39;écran 2026-02-23 213706" src="https://github.com/user-attachments/assets/8a3bcb8f-05e6-4394-8f1f-dc804ecf634f" />
<img width="1871" height="932" alt="Capture d&#39;écran 2026-02-23 213729" src="https://github.com/user-attachments/assets/cfc8327b-6953-412c-b295-a9c31c738cb0" />
<img width="1767" height="924" alt="Capture d&#39;écran 2026-02-23 213755" src="https://github.com/user-attachments/assets/929be772-eed1-483f-855d-8a3eed8bf6f3" />
<img width="1216" height="923" alt="Capture d&#39;écran 2026-02-23 213805" src="https://github.com/user-attachments/assets/dc208cdf-774b-4771-a0f8-23d8ef0cadb5" />
<img width="1866" height="902" alt="Capture d&#39;écran 2026-02-23 213826" src="https://github.com/user-attachments/assets/77e33073-30ca-4ff2-a9e7-906ed4bcf2b9" />
<img width="911" height="753" alt="Capture d&#39;écran 2026-02-23 213851" src="https://github.com/user-attachments/assets/32106527-81ee-4490-816e-2f41a76ffed0" />
<img width="964" height="619" alt="Capture d&#39;écran 2026-02-23 213903" src="https://github.com/user-attachments/assets/dff73e20-112e-4f14-9cf3-8d89761cb989" />
<img width="883" height="525" alt="Capture d&#39;écran 2026-02-23 213908" src="https://github.com/user-attachments/assets/38691246-b4ce-4eb2-bfcc-6165ae3b3a41" />
# Analyse des relations :

Type de relation : Héritage

# Annotations utilisées :

@Entity: Indique que la classe sera mappée en table dans la base

@Inheritance: Définir la stratégie d’héritage (SINGLE_TABLE, JOINED, TABLE_PER_CLASS)

@DiscriminatorColumn / @DiscriminatorValue: Utilisé pour SINGLE_TABLE pour différencier les sous-classes

@Id, @GeneratedValue: Clé primaire auto-générée
