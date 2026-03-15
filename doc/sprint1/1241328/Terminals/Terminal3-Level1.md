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

| To HC                   | Length of Fibre (m)  |
|:------------------------|:---------------------|
| HC1 - Room 1            | 52.7 |
| HC2 - Room 4 (ceiling)  | 34.8 |
| HC3 - Room 9 (ceiling)  | 28.6 |
| HC4 - Room 13 (ceiling) | 16.4 |
| HC5 - Room 15           | 9.3 |
| **Total**               | **141.8** |

---

## <span style="color: #1F4E79">Hardware Inventory</span>

| Network Outlets | CAT7 Cables Length | Monomode 10 Cables Length | Patch Panels (48) | Patch Panels (24) | Access Point | IC | HC |
|:---------------:|:------------------:|:-------------------------:|:-----------------:|:-----------------:|:------------:|:--:|:--:|
| 735 + Wall Outlets | 1486.2 m | 141.8 m | 15 | 2 | 24 | 1 | 5 |

---

## <span style="color: #1F4E79">Rack Dimensionament (Exemplo Room 15)</span>

| Equipamento                   | Unidades (U) |
|:------------------------------|:-------------|
| Patch Panels (Dados/APs)      | 3U |
| Switches                      | 2U |
| Fiber Patch Panel             | 1U |
| Organizadores de Cabos        | 2U |
| **Tamanho Final Recomendado** | **12U** |

---

### HC1 (in room 1) ###
|           To Room or Ap           | Length of CAT7 (m) |
|:---------------------------------:|:------------------:|
| Room 3 - floor cable passageway   | 12.8 |
| Exterior Wall Outlets (Left side) | 18.6 |
| Exterior Wall Outlets (Top side)  | 21.3 |
| Access Point 1                    | 14.7 |
| Access Point 2                    | 17.9 |
| Access Point 3                    | 19.6 |
| Access Point 4                    | 22.4 |
| Access Point 5                    | 24.1 |
| **Total**                         | **151.4** |

---

### HC2 (in room 4) ###
|          To Room or Ap          | Length of CAT7 (m) |
|:-------------------------------:|:------------------:|
| Room 4 - floor cable passageway | 6.2 |
| Room 7 - floor cable passageway | 9.4 |
| Access Point 6                  | 14.5 |
| Access Point 7                  | 17.8 |
| Access Point 8                  | 19.1 |
| Access Point 9                  | 22.6 |
| Access Point 10                 | 24.3 |
| **Total**                       | **113.9** |

---

### HC3 (in room 9) ###
|          To Room or Ap           | Length of CAT7 (m) |
|:--------------------------------:|:------------------:|
| Room 8 - floor cable passageway  | 5.8 |
| Room 10 - floor cable passageway | 7.6 |
| Access Point 11                  | 12.4 |
| Access Point 12                  | 14.7 |
| Access Point 13                  | 17.2 |
| Access Point 14                  | 20.1 |
| **Total**                        | **77.8** |

---

### HC4 (near room 13) ###
|          To Room or Ap           | Length of CAT7 (m) |
|:--------------------------------:|:------------------:|
| Room 12 - floor cable passageway | 8.4 |
| Room 13 - floor cable passageway | 10.2 |
|         Access Point 15          | 13.7 |
|         Access Point 16          | 16.8 |
|         Access Point 17          | 19.5 |
|            **Total**             | **68.6** |

---

### HC5 (near room 15) ###
|          To Room or Ap           | Length of CAT7 (m) |
|:--------------------------------:|:------------------:|
| Room 14 - floor cable passageway |        6.1         |
| Room 15 - floor cable passageway |        4.7         |
|         Access Point 18          |        11.2        |
|         Access Point 19          |        13.9        |
|         Access Point 20          |        16.4        |
|         Access Point 21          |        18.6        |
|         Access Point 22          |        20.7        |
|         Access Point 23          |        23.1        |
|         Access Point 24          |        25.3        |
|            **Total**             |     **140.0**      |

---



---

## <span style="color: #1F4E79">Detailed Outlet Cabling Calculations</span>

### Room 2 (56 outlets)
 

### Room 3 (107 outlets)
 

### Room 4 (56 outlets)
 

### Room 7 (66 outlets)
 

### Room 10 (111 outlets)
 

### Room 11 (57 outlets)
 

### Room 12 (50 outlets)
 

### Room 14 (78 outlets)
 

### Room 15 (92 outlets)
 

### Room 16 (64 outlets)
 

### Room 17 (54 outlets)
 

### Room 18 (78 outlets)
 

### Room 19 (52 outlets)

---
## <span style="color: #1F4E79">Hardware Inventory - Combined Total</span>

| Network Outlets | CAT7 Cables Length | Monomode 10 Cables Length | Access Point | IC | HC | CP | Copper Patch Panels | Fibre Patch Panels |
|:---------------:|:------------------:|:-------------------------:|:------------:|:--:|:--:|:--:|:-------------------:|:------------------:|
| 735 + Wall Outlets | 1486.2 m | 141.8 m | 24 | 1 | 5 | 8 | 17 | 6 |



