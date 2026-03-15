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

### IC (in room 20) → HCs (Fibre Backbone)
| To HC                   | Length of Fibre (m) |
|:------------------------|:--------------------|
| HC1 - Room 1            |                     |
| HC2 - Room 3 (ceiling)  |                     |
| HC3 - Room 10 (ceiling) |                     |
| HC4 - Room 13 (ceiling) |                     |
| HC5 - Room 20           |                     |
| **Total**               |                     |
---

## <span style="color: #1F4E79">Rack Dimensionament (Room 20)</span>

| Equipamento                   | Unidades (U) |
|:------------------------------|:-------------|
| Patch Panels (Dados/APs)      | U            |
| Switches                      | U            |
| Fiber Patch Panel             | U            |
| Organizadores de Cabos        | U            |
| **Tamanho Final Recomendado** |              |

---

## <span style="color: #1F4E79">Horizontal Cross-Connect Details</span>

### HC1 (in room 1) ###
|           To Room or Ap           | Length of CAT7 (m) |                     
|:---------------------------------:|:------------------:|
|  Room 2 - floor cable passageway  |                    |
| Exterior Wall Outlets (Left side) |                    |       
| Exterior Wall Outlets (Top side)  |                    |     
|         Access Points 1-5         |                    |
|             **Total**             |                    |

### HC2 (in room 3) ###
|          To Room or Ap          | Length of CAT7 (m) |                     
|:-------------------------------:|:------------------:|
| Room 3 - floor cable passageway |                    |
| Room 4 - floor cable passageway |                    |       
|       Access Points 5-12        |                    |
|            **Total**            |                    |

### HC3 (in room 10) ###
|          To Room or Ap           | Length of CAT7 (m) |                     
|:--------------------------------:|:------------------:|
| Room 7 - floor cable passageway  |                    |
| Room 10 - floor cable passageway |                    |
|         Access Points            |                    |
|            **Total**             |                    |

### HC4 (in room 13) ###
|          To Room or Ap           | Length of CAT7 (m) |                     
|:--------------------------------:|:------------------:|
| Room 11 - floor cable passageway |                    |   
| Room 12 - floor cable passageway |                    | 
| Room 14 - floor cable passageway |                    |
|       Access Points 18-22        |                    | 
|            **Total**             |                    |

### HC5 (in room 20) ###
|          To Room or Ap           | Length of CAT7 (m) |                     
|:--------------------------------:|:------------------:|
| Room 15 - floor cable passageway |                    |   
| Room 16 - floor cable passageway |                    | 
| Room 17 - floor cable passageway |                    |
| Room 18 - floor cable passageway |                    |
| Room 19 - floor cable passageway |                    |
|       Access Points 23-27        |         -          |
|            **Total**             |                    |

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
## <span style="color: #1F4E79">Hardware Inventory</span>

| Network Outlets | CAT7 Cables Length | Monomode Fibre Length | Patch Panels (48) | Access Points | IC | HC |
|:---------------:|:------------------:|:---------------------:|:-----------------:|:-------------:|:--:|:--:|
|                 |                    |                       |                   |               |    |    |



