# <span style="color: #E67E22">Terminal 3 – Level 2</span>

## <span style="color: #1F4E79">Descrição do Piso</span>

O **Level 2 do Terminal 3** corresponde à zona de **Arrivals**.

Este piso possui dimensões aproximadas de **200 m × 200 m**.

Este piso possui:

- **Underfloor cable raceway** para encaminhamento de cabos por baixo do chão.
- **Floor cable passageways** que ligam as salas ao raceway principal.
- **4 vertical cable passageways** para ligação entre os diferentes níveis do terminal.
- **Dropped ceiling a 4 metros**, utilizado para a instalação de wireless access points e cablagem de backbone.

A infraestrutura encontra-se ligada à **external technical ditch**, permitindo a ligação à rede externa do campus do aeroporto.

---

## <span style="color: #1F4E79">Network Outlets</span>

### Regras de Instalação

- Densidade padrão: **2 network outlets por cada 10 m²** de área.
- Nas paredes exteriores **esquerda e superior** existe **1 outlet a cada 5 metros**.

### Salas com Network Outlets

2, 3, 4, 7, 10, 11, 12, 14, 15, 16, 17, 18, 19

### Salas sem Network Outlets

1, 5, 6, 8, 9, 13, 20

### Salas possíveis para Infraestrutura

1, 13, 20

---

## <span style="color: #1F4E79">Mediçōes das Salas</span>

| Room   | Width (m) | Length (m) | Area (m²) | Number of Outlets |
|--------|-----------|------------|-----------|-------------------|
| 3.2.1  | 13.11     | 7.38       | 96.75     | Not Required      |
| 3.2.2  | 22.95     | 12.30      | 282.18    | 56                |
| 3.2.3  | 13.11     | 40.98      | 537.49    | 107               |
| 3.2.4  | 22.95     | 12.30      | 282.18    | 56                |
| 3.2.5  | 20.50     | 14.75      | 302.34    | Not Required      |
| 3.2.6  | 23.77     | 14.75      | 350.71    | Not Required      |
| 3.2.7  | 12.30     | 27.05      | 332.57    | 66                |
| 3.2.8  | 20.50     | 14.75      | 302.34    | Not Required      |
| 3.2.9  | 23.77     | 14.75      | 350.71    | Not Required      |
| 3.2.10 | 13.11     | 42.62      | 559.00    | 111               |
| 3.2.11 | 20.49     | 13.93      | 285.54    | 57                |
| 3.2.12 | 18.03     | 13.93      | 251.27    | 50                |
| 3.2.13 | 9.84      | 9.84       | 96.75     | Not Required      |
| 3.2.14 | 12.30     | 31.97      | 393.04    | 78                |
| 3.2.15 | 12.30     | 37.70      | 463.59    | 92                |
| 3.2.16 | 12.30     | 26.23      | 322.50    | 64                |
| 3.2.17 | 12.30     | 22.13      | 272.10    | 54                |
| 3.2.18 | 12.30     | 31.97      | 393.04    | 78                |
| 3.2.19 | 12.30     | 21.31      | 262.03    | 52                |
| 3.2.20 | 12.30     | 9.84       | 120.94    | Not Required      |

---

## <span style="color: #1F4E79">Cross-Connect Infrastructure</span>

### Horizontal Cross-Connects (HC)

Foram instalados **5 HCs** no piso para garantir que a cablagem não excede os limites técnicos:

- **HC1** – Room 1
- **HC2** – Room 3
- **HC3** – Room 10
- **HC4** – Room 13
- **HC5** – Room 20

### Intermediate Cross-Connect (IC)

O **IC encontra-se na Room 20**. Esta sala foi selecionada pela sua proximidade a duas **vertical cable passageways**, facilitando a interligação vertical e a ligação ao backbone central do edifício.

---

## <span style="color: #1F4E79">Wireless Network</span>

### Wireless Coverage

A cobertura wireless é garantida por **28 wireless access points** instalados no espaço do **dropped ceiling**, assegurando sinal em toda a área de Arrivals e evitando zonas mortas através de sobreposição estratégica.

![T3 - Level 2 Wi-Fi Coverage](../images/T3%20-%20Level%202%20Wi-Fi%20Coverage.png)

---

## <span style="color: #1F4E79">Cabling Infrastructure</span>

### Structured Cabling Layout

Os cabos de cada sala são encaminhados para o **Horizontal Cross-Connect** mais próximo, quer através do **underfloor cable raceway** ou pelo **teto**, dependendo da localização da sala e do HC.

Os pontos de acesso sem fios são instalados acima do **teto falso** e ligados ao HC através de cabos **Cat 7** no teto.

![T3 - Level 2.png](../images/T3%20-%20Level%202.png)

---

## <span style="color: #1F4E79">Cable Length Calculations</span>

### IC (in room 20) → HCs (Fibre Backbone)
| To HC                       | Length of Fibre (m) |
|:----------------------------|:--------------------|
| HC1 - Room 1 (underground)  |                     |
| HC2 - Room 3 (ceiling)      |                     |
| HC3 - Room 10 (ceiling)     |                     |
| HC4 - Room 13 (underground) |                     |
| HC5 - Room 20 (underground) |                     |
| **Total**                   |                     |

---
## <span style="color: #1F4E79">Horizontal Cross-Connect Details</span>

### HC1 (in room 1) ###
|          To Room or Ap           | Length of CAT7 (m) |                     
|:--------------------------------:|:------------------:|
| Room 02 - floor cable passageway |                    |
| Room 04 - floor cable passageway |                    |     
|         Access Point 01          |                    |
|         Access Point 02          |                    |
|         Access Point 03          |                    |
|         Access Point 04          |                    |
|         Access Point 05          |                    |
|            **Total**             |                    |


### HC2 (in room 3) ###
|           To Room or Ap            | Length of CAT7 (m) |                     
|:----------------------------------:|:------------------:|
| Room 03 - ceiling cable passageway |                    |
|          Access Point 06           |                    |
|          Access Point 07           |                    |
|          Access Point 08           |                    |
|          Access Point 09           |                    |
|          Access Point 10           |                    |
|          Access Point 11           |                    |
|          Access Point 12           |                    |
|          Access Point 13           |                    |
|             **Total**              |                    |


### HC3 (in room 10) ###
|           To Room or Ap            | Length of CAT7 (m) |                     
|:----------------------------------:|:------------------:|
| Room 07 - ceiling cable passageway |                    |
| Room 10 - ceiling cable passageway |                    |
| Room 11 - ceiling cable passageway |                    |   
| Room 12 - ceiling cable passageway |                    | 
|          Access Point 13           |                    |
|          Access Point 14           |                    |
|          Access Point 15           |                    |
|          Access Point 16           |                    |
|          Access Point 17           |                    |
|             **Total**              |                    |


### HC4 (in room 13) ###
|          To Room or Ap           | Length of CAT7 (m) |                     
|:--------------------------------:|:------------------:|
| Room 14 - floor cable passageway |                    |
| Room 15 - floor cable passageway |                    |   
| Room 16 - floor cable passageway |                    | 
|         Access Point 18          |                    |
|         Access Point 19          |                    |
|         Access Point 20          |                    |
|         Access Point 21          |                    |
|         Access Point 22          |                    |
|            **Total**             |                    |


### HC5 (in room 20) ###
|          To Room or Ap           | Length of CAT7 (m) |                     
|:--------------------------------:|:------------------:|
| Room 17 - floor cable passageway |                    |
| Room 18 - floor cable passageway |                    |
| Room 19 - floor cable passageway |                    |
|         Access Point 23          |                    |
|         Access Point 24          |                    |
|         Access Point 25          |                    |
|         Access Point 26          |                    |
|         Access Point 27          |                    |
|            **Total**             |                    |

---

## <span style="color: #1F4E79">Detailed Outlet Cabling Calculations</span>

### Outlet cables for Room 2 (56 outlets): ###
1,26 + 2,52 + 3,78 + 5,04 + 6,29 + 7,55 + 8,81 + 10,07 + 11,33 + 12,59 + 13,85 + 15,11 + 16,37 + 17,63 + 18,88 + 20,14 + 21,40 + 22,66 + 23,92 + 25,18 + 26,44 + 27,70 + 28,96 + 30,21 + 31,47 + 32,73 + 33,99 + 35,25 + 36,51 + 37,77 + 39,03 + 40,29 + 41,54 + 42,80 + 44,06 + 45,32 + 46,58 + 47,84 + 49,10 + 50,36 + 51,62 + 52,88 + 54,13 + 55,39 + 56,65 + 57,91 + 59,17 + 60,43 + 61,69 + 62,95 + 64,21 + 65,46 + 66,72 + 67,98 + 69,24 + 70,50 = 2009,25 m


### Outlet cables for Room 3 (107 outlets): ###
1,01 + 2,02 + 3,03 + 4,04 + 5,06 + 6,07 + 7,08 + 8,09 + 9,10 + 10,11 + 11,12 + 12,13 + 13,14 + 14,15 + 15,17 + 16,18 + 17,19 + 18,20 + 19,21 + 20,22 + 21,23 + 22,24 + 23,25 + 24,26 + 25,28 + 26,29 + 27,30 + 28,31 + 29,32 + 30,33 + 31,34 + 32,35 + 33,36 + 34,37 + 35,39 + 36,40 + 37,41 + 38,42 + 39,43 + 40,44 + 41,45 + 42,46 + 43,47 + 44,49 + 45,50 + 46,51 + 47,52 + 48,53 + 49,54 + 50,55 + 51,56 + 52,57 + 53,58 + 1,01 + 2,02 + 3,03 + 4,04 + 5,06 + 6,07 + 7,08 + 8,09 + 9,10 + 10,11 + 11,12 + 12,13 + 13,14 + 14,15 + 15,17 + 16,18 + 17,19 + 18,20 + 19,21 + 20,22 + 21,23 + 22,24 + 23,25 + 24,26 + 25,28 + 26,29 + 27,30 + 28,31 + 29,32 + 30,33 + 31,34 + 32,35 + 33,36 + 34,37 + 35,39 + 36,40 + 37,41 + 38,42 + 39,43 + 40,44 + 41,45 + 42,46 + 43,47 + 44,49 + 45,50 + 46,51 + 47,52 + 48,53 + 49,54 + 50,55 + 51,56 + 52,57 + 53,58 + 54,60 = 2948,16 m


### Outlet cables for Room 4 (56 outlets): ###
1,26 + 2,52 + 3,78 + 5,04 + 6,29 + 7,55 + 8,81 + 10,07 + 11,33 + 12,59 + 13,85 + 15,11 + 16,37 + 17,63 + 18,88 + 20,14 + 21,40 + 22,66 + 23,92 + 25,18 + 26,44 + 27,70 + 28,96 + 30,21 + 31,47 + 32,73 + 33,99 + 35,25 + 36,51 + 37,77 + 39,03 + 40,29 + 41,54 + 42,80 + 44,06 + 45,32 + 46,58 + 47,84 + 49,10 + 50,36 + 51,62 + 52,88 + 54,13 + 55,39 + 56,65 + 57,91 + 59,17 + 60,43 + 61,69 + 62,95 + 64,21 + 65,46 + 66,72 + 67,98 + 69,24 + 70,50 = 2009,25 m


### Outlet cables for Room 7 (66 outlets): ###
1,22 + 2,45 + 3,67 + 4,89 + 6,11 + 7,34 + 8,56 + 9,78 + 11,00 + 12,23 + 13,45 + 14,67 + 15,90 + 17,12 + 18,34 + 19,56 + 20,79 + 22,01 + 23,23 + 24,45 + 25,68 + 26,90 + 28,12 + 29,35 + 30,57 + 31,79 + 33,01 + 34,24 + 35,46 + 36,68 + 37,90 + 39,13 + 40,35 + 1,22 + 2,45 + 3,67 + 4,89 + 6,11 + 7,34 + 8,56 + 9,78 + 11,00 + 12,23 + 13,45 + 14,67 + 15,90 + 17,12 + 18,34 + 19,56 + 20,79 + 22,01 + 23,23 + 24,45 + 25,68 + 26,90 + 28,12 + 29,35 + 30,57 + 31,79 + 33,01 + 34,24 + 35,46 + 36,68 + 37,90 + 39,13 + 40,35 = 1371,90 m


### Outlet cables for Room 10 (111 outlets): ###
0,89 + 1,77 + 2,66 + 3,54 + 4,43 + 5,32 + 6,20 + 7,09 + 7,97 + 8,86 + 9,75 + 10,63 + 11,52 + 12,40 + 13,29 + 14,18 + 15,06 + 15,95 + 16,83 + 17,72 + 18,61 + 19,49 + 20,38 + 21,26 + 22,15 + 23,04 + 23,92 + 24,81 + 25,70 + 26,58 + 27,47 + 28,35 + 29,24 + 30,13 + 31,01 + 31,90 + 32,78 + 33,67 + 34,56 + 35,44 + 36,33 + 37,21 + 38,10 + 38,99 + 39,87 + 40,76 + 41,64 + 42,53 + 43,42 + 44,30 + 45,19 + 46,07 + 46,96 + 47,85 + 48,73 + 0,89 + 1,77 + 2,66 + 3,54 + 4,43 + 5,32 + 6,20 + 7,09 + 7,97 + 8,86 + 9,75 + 10,63 + 11,52 + 12,40 + 13,29 + 14,18 + 15,06 + 15,95 + 16,83 + 17,72 + 18,61 + 19,49 + 20,38 + 21,26 + 22,15 + 23,04 + 23,92 + 24,81 + 25,70 + 26,58 + 27,47 + 28,35 + 29,24 + 30,13 + 31,01 + 31,90 + 32,78 + 33,67 + 34,56 + 35,44 + 36,33 + 37,21 + 38,10 + 38,99 + 39,87 + 40,76 + 41,64 + 42,53 + 43,42 + 44,30 + 45,19 + 46,07 + 46,96 + 47,85 + 48,73 + 49,62 = 2778,61 m


### Outlet cables for Room 11 (57 outlets): ###
1,21 + 2,42 + 3,62 + 4,83 + 6,04 + 7,25 + 8,45 + 9,66 + 10,87 + 12,08 + 13,28 + 14,49 + 15,70 + 16,91 + 18,12 + 19,32 + 20,53 + 21,74 + 22,95 + 24,15 + 25,36 + 26,57 + 27,78 + 28,99 + 30,19 + 31,40 + 32,61 + 33,82 + 1,21 + 2,42 + 3,62 + 4,83 + 6,04 + 7,25 + 8,45 + 9,66 + 10,87 + 12,08 + 13,28 + 14,49 + 15,70 + 16,91 + 18,12 + 19,32 + 20,53 + 21,74 + 22,95 + 24,15 + 25,36 + 26,57 + 27,78 + 28,99 + 30,19 + 31,40 + 32,61 + 33,82 + 35,02 = 1015,69 m


### Outlet cables for Room 12 (50 outlets): ###
1,28 + 2,56 + 3,84 + 5,11 + 6,39 + 7,67 + 8,95 + 10,23 + 11,51 + 12,78 + 14,06 + 15,34 + 16,62 + 17,90 + 19,18 + 20,45 + 21,73 + 23,01 + 24,29 + 25,57 + 26,85 + 28,12 + 29,40 + 30,68 + 31,96 + 1,28 + 2,56 + 3,84 + 5,11 + 6,39 + 7,67 + 8,95 + 10,23 + 11,51 + 12,78 + 14,06 + 15,34 + 16,62 + 17,90 + 19,18 + 20,45 + 21,73 + 23,01 + 24,29 + 25,57 + 26,85 + 28,12 + 29,40 + 30,68 + 31,96 = 830,96 m


### Outlet cables for Room 14 (78 outlets): ###
1,14 + 2,27 + 3,41 + 4,54 + 5,68 + 6,81 + 7,95 + 9,08 + 10,22 + 11,35 + 12,49 + 13,62 + 14,76 + 15,89 + 17,03 + 18,16 + 19,30 + 20,43 + 21,57 + 22,70 + 23,84 + 24,97 + 26,11 + 27,24 + 28,38 + 29,51 + 30,65 + 31,78 + 32,92 + 34,05 + 35,19 + 36,32 + 37,46 + 38,59 + 39,73 + 40,86 + 42,00 + 43,13 + 44,27 + 45,41 + 46,54 + 47,68 + 48,81 + 49,95 + 51,08 + 52,22 + 53,35 + 54,49 + 55,62 + 56,76 + 57,89 + 59,03 + 60,16 + 61,30 + 62,43 + 63,57 + 64,70 + 65,84 + 66,97 + 68,11 + 69,24 + 70,38 + 71,51 + 72,65 + 73,78 + 74,92 + 76,05 + 77,19 + 78,32 + 79,46 + 80,59 + 81,73 + 82,86 + 84,00 + 85,13 + 86,27 + 87,40 + 88,54 = 3497,33 m


### Outlet cables for Room 15 (92 outlets): ###
1,09 + 2,17 + 3,26 + 4,35 + 5,43 + 6,52 + 7,61 + 8,70 + 9,78 + 10,87 + 11,96 + 13,04 + 14,13 + 15,22 + 16,30 + 17,39 + 18,48 + 19,57 + 20,65 + 21,74 + 22,83 + 23,91 + 25,00 + 26,09 + 27,17 + 28,26 + 29,35 + 30,43 + 31,52 + 32,61 + 33,70 + 34,78 + 35,87 + 36,96 + 38,04 + 39,13 + 40,22 + 41,30 + 42,39 + 43,48 + 44,57 + 45,65 + 46,74 + 47,83 + 48,91 + 50,00 + 51,09 + 52,17 + 53,26 + 54,35 + 55,43 + 56,52 + 57,61 + 58,70 + 59,78 + 60,87 + 61,96 + 63,04 + 64,13 + 65,22 + 66,30 + 67,39 + 68,48 + 69,57 + 70,65 + 71,74 + 72,83 + 73,91 + 75,00 + 76,09 + 77,17 + 78,26 + 79,35 + 80,43 + 81,52 + 82,61 + 83,70 + 84,78 + 85,87 + 86,96 + 88,04 + 89,13 + 90,22 + 91,30 + 92,39 + 93,48 + 94,57 + 95,65 + 96,74 + 97,83 + 98,91 + 100,00 = 4650,00 m


### Outlet cables for Room 16 (64 outlets): ###
1,20 + 2,41 + 3,61 + 4,82 + 6,02 + 7,22 + 8,43 + 9,63 + 10,84 + 12,04 + 13,24 + 14,45 + 15,65 + 16,86 + 18,06 + 19,27 + 20,47 + 21,67 + 22,88 + 24,08 + 25,29 + 26,49 + 27,69 + 28,90 + 30,10 + 31,31 + 32,51 + 33,71 + 34,92 + 36,12 + 37,33 + 38,53 + 39,73 + 40,94 + 42,14 + 43,35 + 44,55 + 45,75 + 46,96 + 48,16 + 49,37 + 50,57 + 51,77 + 52,98 + 54,18 + 55,39 + 56,59 + 57,80 + 59,00 + 60,20 + 61,41 + 62,61 + 63,82 + 65,02 + 66,22 + 67,43 + 68,63 + 69,84 + 71,04 + 72,24 + 73,45 + 74,65 + 75,86 + 77,06 = 2504,45 m


### Outlet cables for Room 17 (54 outlets): ###
1,28 + 2,55 + 3,83 + 5,10 + 6,38 + 7,65 + 8,93 + 10,20 + 11,48 + 12,75 + 14,03 + 15,30 + 16,58 + 17,85 + 19,13 + 20,40 + 21,68 + 22,95 + 24,23 + 25,50 + 26,78 + 28,05 + 29,33 + 30,60 + 31,88 + 33,15 + 34,43 + 35,71 + 36,98 + 38,26 + 39,53 + 40,81 + 42,08 + 43,36 + 44,63 + 45,91 + 47,18 + 48,46 + 49,73 + 51,01 + 52,28 + 53,56 + 54,83 + 56,11 + 57,38 + 58,66 + 59,93 + 61,21 + 62,48 + 63,76 + 65,03 + 66,31 + 67,58 + 68,86 = 1893,65 m


### Outlet cables for Room 18 (78 outlets): ###
1,14 + 2,27 + 3,41 + 4,54 + 5,68 + 6,81 + 7,95 + 9,08 + 10,22 + 11,35 + 12,49 + 13,62 + 14,76 + 15,89 + 17,03 + 18,16 + 19,30 + 20,43 + 21,57 + 22,70 + 23,84 + 24,97 + 26,11 + 27,24 + 28,38 + 29,51 + 30,65 + 31,78 + 32,92 + 34,05 + 35,19 + 36,32 + 37,46 + 38,59 + 39,73 + 40,86 + 42,00 + 43,13 + 44,27 + 45,41 + 46,54 + 47,68 + 48,81 + 49,95 + 51,08 + 52,22 + 53,35 + 54,49 + 55,62 + 56,76 + 57,89 + 59,03 + 60,16 + 61,30 + 62,43 + 63,57 + 64,70 + 65,84 + 66,97 + 68,11 + 69,24 + 70,38 + 71,51 + 72,65 + 73,78 + 74,92 + 76,05 + 77,19 + 78,32 + 79,46 + 80,59 + 81,73 + 82,86 + 84,00 + 85,13 + 86,27 + 87,40 + 88,54 = 3497,33 m


### Outlet cables for Room 19 (52 outlets): ###
1,29 + 2,59 + 3,88 + 5,17 + 6,46 + 7,76 + 9,05 + 10,34 + 11,63 + 12,93 + 14,22 + 15,51 + 16,81 + 18,10 + 19,39 + 20,68 + 21,98 + 23,27 + 24,56 + 25,85 + 27,15 + 28,44 + 29,73 + 31,02 + 32,32 + 33,61 + 34,90 + 36,20 + 37,49 + 38,78 + 40,07 + 41,37 + 42,66 + 43,95 + 45,24 + 46,54 + 47,83 + 49,12 + 50,42 + 51,71 + 53,00 + 54,29 + 55,59 + 56,88 + 58,17 + 59,46 + 60,76 + 62,05 + 63,34 + 64,63 + 65,93 + 67,22 = 1781,33 m

---
## <span style="color: #1F4E79">Hardware Inventory</span>

| Network Outlets | CAT7 Cables Length | Monomode Fibre Cables Length | Patch Panels Cobre | Patch Panels Fibre | Access Point | IC | HC | CP  |
|:---------------:|:------------------:|:----------------------------:|:------------------:|:------------------:|:------------:|:--:|:--:|:---:|
|       921       |                    |                              |         5          |         6          |      27      | 1  | 5  | 37  |
