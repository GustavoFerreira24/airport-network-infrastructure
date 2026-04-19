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
| 3.1.1  | 13.11     | 6.55       | 86.00     | Not Required      |
| 3.1.2  | 18.03     | 13.11      | 236.50    | 47                |
| 3.1.3  | 23.77     | 15.57      | 370.19    | Not Required      |
| 3.1.4  | 18.03     | 13.11      | 236.50    | 47                |
| 3.1.5  | 13.11     | 18.85      | 247.25    | 49                |
| 3.1.6  | 23.77     | 15.57      | 370.19    | Not Required      |
| 3.1.7  | 18.03     | 13.11      | 236.50    | 47                |
| 3.1.8  | 13.11     | 13.11      | 172.00    | 34                |
| 3.1.9  | 15.57     | 13.11      | 204.25    | 40                |
| 3.1.10 | 23.77     | 13.11      | 311.74    | 62                |
| 3.1.11 | 9.84      | 9.84       | 96.75     | Not Required      |
| 3.1.12 | 28.69     | 13,11      | 376.24    | 75                |
| 3.1.13 | 13.11     | 31.97      | 419.24    | 83                |
| 3.1.14 | 13.11     | 21.31      | 279.50    | 55                |
| 3.1.15 | 13.11     | 9.84       | 129.00    | Not Required      |

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
A cobertura wireless é garantida por **29 wireless access points** instalados no espaço do **dropped ceiling**, assegurando sinal em toda a área de Arrivals e evitando zonas mortas através de sobreposição estratégica.

![T3 - Level 2 Wi-Fi Coverage](../images/T3%20-%20Level%202%20Wi-Fi%20Coverage.png)

---

## <span style="color: #1F4E79">Cabling Infrastructure</span>

### Structured Cabling Layout
Os cabos de cada sala são encaminhados para o **Horizontal Cross-Connect** mais próximo, quer através do **underfloor cable raceway** ou pelo **teto**, dependendo da localização da sala e do HC.

Os pontos de acesso sem fios são instalados acima do **teto falso** e ligados ao HC através de cabos **Cat 7** no teto.

![T3 - Level 2.png](../images/T3%20-%20Level%202.png)

---
## <span style="color: #1F4E79">Cable Length Calculations</span>

| To HC                       | Length of Fibre (m) |
|:----------------------------|:--------------------|
| HC1 - Room 1 (underground)  | 181,7               |
| HC2 - Room 2 (ceiling)      | 172,9               |
| HC3 - Room 9 (ceiling)      | 116,0               |
| HC4 - Room 11 (underground) | 195,9               |
| HC5 - Room 15  (ceiling)    | 4,6                 |
| **Total**                   | 671,1               |


---
## <span style="color: #1F4E79">Horizontal Cross-Connect Details</span>

### HC1 (in room 1) ###
|   To Room or Ap   | Length of CAT7 (m) |
|:-----------------:|:------------------:|
|  Access Point 1   |        62,1        |
|  Access Point 2   |        6,8         |
|  Access Point 3   |        40,7        |
|     **Total**     |     **109,6**      |

---

### HC2 (in room 2) ###
|               To Room or Ap                | Length of CAT7 (m) |
|:------------------------------------------:|:------------------:|
| Room 2, 4, 7, 8 - ceiling cable passageway |        47,8        |
|     Room 5 - ceiling cable passageway      |        37,6        |
|               Access Point 4               |        30,8        |
|               Access Point 5               |        41,3        |
|               Access Point 6               |        39,2        |
|               Access Point 7               |        32,7        |
|               Access Point 8               |        4,5         |
|               Access Point 9               |        45,7        |
|              Access Point 10               |        88,2        |
|              Access Point 11               |        89,7        |
|              Access Point 12               |        52,8        |
|              Access Point 13               |        25,9        |
|                 **Total**                  |     **536,2**      |

---

### HC3 (in room 9) ###
|               To Room or Ap               | Length of CAT7 (m) |
|:-----------------------------------------:|:------------------:|
| Room 9, 10, 12 - ceiling cable passageway |        32,6        |
|              Access Point 14              |        13,9        |
|              Access Point 15              |        44,5        |
|              Access Point 16              |        43,4        |
|              Access Point 17              |        49,6        |
|              Access Point 18              |        22,1        |
|              Access Point 19              |        69,1        |
|              Access Point 20              |        87,3        |
|              Access Point 21              |        38,7        |
|              Access Point 22              |        77,1        |
|              Access Point 13              |        38,9        |
|                 **Total**                 |     **517,2**      |

---

### HC4 (in room 13) ###
|  To Room or Ap  | Length of CAT7 (m) |
|:---------------:|:------------------:|
| Access Point 23 |        52,9        |
| Access Point 24 |        41,5        |
| Access Point 25 |        15,3        |
|    **Total**    |     **109,7**      |

---

### HC5 (in room 15) ###
|            To Room or Ap             | Length of CAT7 (m) |
|:------------------------------------:|:------------------:|
| Room 13, 14 - floor cable passageway |        33,1        |
|           Access Point 26            |        45,7        |
|           Access Point 27            |        9,9         |
|           Access Point 28            |        71,9        |
|           Access Point 29            |        43,9        |
|              **Total**               |     **204,5**      |

---

## <span style="color: #1F4E79">Detailed Outlet Cabling Calculations</span>

### Room 2 (47 outlets)
1,33 + 2,65 + 3,98 + 5,30 + 6,63 + 7,95 + 9,28 + 10,60 + 11,93 + 13,25 + 14,58 + 15,90 + 17,23 + 18,55 + 19,88 + 21,20 + 22,53 + 23,85 + 25,18 + 26,50 + 27,83 + 29,15 + 30,48 + 31,80 + 33,13 + 34,45 + 35,78 + 37,10 + 38,43 + 39,75 + 41,08 + 42,40 + 43,73 + 45,05 + 46,38 + 47,70 + 49,03 + 50,35 + 51,68 + 53,00 + 54,33 + 55,65 + 56,98 + 58,30 + 59,63 + 60,95 + 62,28 = 1494,72 m

### Room 4 (47 outlets)
1,33 + 2,65 + 3,98 + 5,30 + 6,63 + 7,95 + 9,28 + 10,60 + 11,93 + 13,25 + 14,58 + 15,90 + 17,23 + 18,55 + 19,88 + 21,20 + 22,53 + 23,85 + 25,18 + 26,50 + 27,83 + 29,15 + 30,48 + 31,80 + 33,13 + 34,45 + 35,78 + 37,10 + 38,43 + 39,75 + 41,08 + 42,40 + 43,73 + 45,05 + 46,38 + 47,70 + 49,03 + 50,35 + 51,68 + 53,00 + 54,33 + 55,65 + 56,98 + 58,30 + 59,63 + 60,95 + 62,28 = 1494,72 m


### Room 5 (49 outlets)
1,30 + 2,61 + 3,91 + 5,22 + 6,52 + 7,83 + 9,13 + 10,44 + 11,74 + 13,04 + 14,35 + 15,65 + 16,96 + 18,26 + 19,57 + 20,87 + 22,18 + 23,48 + 24,79 + 26,09 + 27,39 + 28,70 + 30,00 + 31,31 + 32,61 + 33,92 + 35,22 + 36,53 + 37,83 + 39,13 + 40,44 + 41,74 + 43,05 + 44,35 + 45,66 + 46,96 + 48,27 + 49,57 + 50,88 + 52,18 + 53,48 + 54,79 + 56,09 + 57,40 + 58,70 + 60,01 + 61,31 + 62,62 + 63,92 = 1598,00 m


### Room 7 (47 outlets)
1,33 + 2,65 + 3,98 + 5,30 + 6,63 + 7,95 + 9,28 + 10,60 + 11,93 + 13,25 + 14,58 + 15,90 + 17,23 + 18,55 + 19,88 + 21,20 + 22,53 + 23,85 + 25,18 + 26,50 + 27,83 + 29,15 + 30,48 + 31,80 + 33,13 + 34,45 + 35,78 + 37,10 + 38,43 + 39,75 + 41,08 + 42,40 + 43,73 + 45,05 + 46,38 + 47,70 + 49,03 + 50,35 + 51,68 + 53,00 + 54,33 + 55,65 + 56,98 + 58,30 + 59,63 + 60,95 + 62,28 = 1494,72 m


### Room 8 (34 outlets)
1,54 + 3,08 + 4,63 + 6,17 + 7,71 + 9,25 + 10,80 + 12,34 + 13,88 + 15,42 + 16,97 + 18,51 + 20,05 + 21,59 + 23,14 + 24,68 + 26,22 + 27,76 + 29,30 + 30,85 + 32,39 + 33,93 + 35,47 + 37,02 + 38,56 + 40,10 + 41,64 + 43,19 + 44,73 + 46,27 + 47,81 + 49,36 + 50,90 + 52,44 = 917,70 m


### Room 9 (48 outlets)
1,69 + 3,37 + 5,06 + 6,75 + 8,44 + 10,12 + 11,81 + 13,50 + 15,18 + 16,87 + 18,56 + 20,24 + 21,93 + 23,62 + 25,31 + 26,99 + 28,68 + 1,69 + 3,37 + 5,06 + 6,75 + 8,44 + 10,12 + 11,81 + 13,50 + 15,18 + 16,87 + 18,56 + 20,24 + 21,93 + 23,62 + 25,31 + 26,99 + 28,68 = 516,24 m


### Room 10 (62 outlets)
1,19 + 2,38 + 3,57 + 4,76 + 5,95 + 7,14 + 8,33 + 9,52 + 10,71 + 11,90 + 13,09 + 14,28 + 15,47 + 16,66 + 17,85 + 19,03 + 20,22 + 21,41 + 22,60 + 23,79 + 24,98 + 26,17 + 27,36 + 28,55 + 29,74 + 30,93 + 32,12 + 33,31 + 34,50 + 35,69 + 36,88 + 38,07 + 39,26 + 40,45 + 41,64 + 42,83 + 44,02 + 45,21 + 46,40 + 47,59 + 48,78 + 49,97 + 51,16 + 52,35 + 53,54 + 54,73 + 55,91 + 57,10 + 58,29 + 59,48 + 60,67 + 61,86 + 63,05 + 64,24 + 65,43 + 66,62 + 67,81 + 69,00 + 70,19 + 71,38 + 72,57 + 73,76 = 2323,44 m


### Room 12 (75 outlets)
1,11 + 2,23 + 3,34 + 4,46 + 5,57 + 6,69 + 7,80 + 8,92 + 10,03 + 11,15 + 12,26 + 13,38 + 14,49 + 15,61 + 16,72 + 17,83 + 18,95 + 20,06 + 21,18 + 22,29 + 23,41 + 24,52 + 25,64 + 26,75 + 27,87 + 28,98 + 30,10 + 31,21 + 32,33 + 33,44 + 34,55 + 35,67 + 36,78 + 37,90 + 39,01 + 40,13 + 41,24 + 42,36 + 43,47 + 44,59 + 45,70 + 46,82 + 47,93 + 49,05 + 50,16 + 51,27 + 52,39 + 53,50 + 54,62 + 55,73 + 56,85 + 57,96 + 59,08 + 60,19 + 61,31 + 62,42 + 63,54 + 64,65 + 65,77 + 66,88 + 67,99 + 69,11 + 70,22 + 71,34 + 72,45 + 73,57 + 74,68 + 75,80 + 76,91 + 78,03 + 79,14 + 80,26 + 81,37 + 82,49 + 83,60 = 3176,80 m


### Room 13 (83 outlets)
1,09 + 2,17 + 3,26 + 4,35 + 5,43 + 6,52 + 7,60 + 8,69 + 9,78 + 10,86 + 11,95 + 13,04 + 14,12 + 15,21 + 16,29 + 17,38 + 18,47 + 19,55 + 20,64 + 21,73 + 22,81 + 23,90 + 24,98 + 26,07 + 27,16 + 28,24 + 29,33 + 30,42 + 31,50 + 32,59 + 33,67 + 34,76 + 35,85 + 36,93 + 38,02 + 39,11 + 40,19 + 41,28 + 42,36 + 43,45 + 44,54 + 45,62 + 46,71 + 47,80 + 48,88 + 49,97 + 51,05 + 52,14 + 53,23 + 54,31 + 55,40 + 56,49 + 57,57 + 58,66 + 59,74 + 60,83 + 61,92 + 63,00 + 64,09 + 65,18 + 66,26 + 67,35 + 68,43 + 69,52 + 70,61 + 71,69 + 72,78 + 73,87 + 74,95 + 76,04 + 77,12 + 78,21 + 79,30 + 80,38 + 81,47 + 82,56 + 83,64 + 84,73 + 85,81 + 86,90 + 87,99 + 89,07 + 90,16 = 3786,72 m


### Room 14 (55 outlets)
1,25 + 2,50 + 3,75 + 5,01 + 6,26 + 7,51 + 8,76 + 10,01 + 11,26 + 12,52 + 13,77 + 15,02 + 16,27 + 17,52 + 18,77 + 20,03 + 21,28 + 22,53 + 23,78 + 25,03 + 26,28 + 27,54 + 28,79 + 30,04 + 31,29 + 32,54 + 33,79 + 35,05 + 36,30 + 37,55 + 38,80 + 40,05 + 41,30 + 42,56 + 43,81 + 45,06 + 46,31 + 47,56 + 48,81 + 50,07 + 51,32 + 52,57 + 53,82 + 55,07 + 56,32 + 57,58 + 58,83 + 60,08 + 61,33 + 62,58 + 63,83 + 65,09 + 66,34 + 67,59 + 68,84 = 1927,52 m

---

## <span style="color: #1F4E79">Hardware Inventory</span>

| Network Outlets | CAT7 Cables Length | Monomode Fibre Cables Length | Patch Panels Cobre | Patch Panels Fibre | Access Point | IC | HC | CP |
|:---------------:|:------------------:|:----------------------------:|:------------------:|:------------------:|:------------:|:--:|:--:|:--:|
|       547       |      18280,26      |            671,1             |         5          |         6          |      29      | 1  | 5  | 25 |


