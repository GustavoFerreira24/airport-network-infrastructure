# Terminal 5 – Level 2

### Descrição do Piso

O Level 2 do Terminal 5 corresponde à zona de Departures do terminal.

Este piso possui dimensões aproximadas de 400 m × 150 m.

O piso possui uma infraestrutura preparada para suportar a instalação de cablagem estruturada. Existe um underfloor cable raceway que percorre o piso, permitindo a passagem de cabos por baixo do chão.

O sistema de raceway encontra-se ligado a uma external technical ditch, permitindo a ligação da infraestrutura de rede do terminal a infraestruturas externas.

Ao longo do piso existem vários floor cable passageways, que permitem a ligação entre as salas e o sistema de raceway.

O piso possui também um dropped ceiling localizado a cerca de 4 metros de altura, que pode ser utilizado para a instalação de equipamentos de rede como wireless access points.

---

## Regras Especiais do Piso

Algumas salas do Level 0 possuem requisitos específicos relativamente à instalação de network outlets. 

As salas destinadas a áreas de trabalho devem possuir o número de network outlets. (3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,23,24,25)

Por outro lado, algumas salas correspondem a zonas de circulação,
instalações técnicas ou áreas de apoio, não necessitam de
network outlets. (1,2,18,19,20,21,22,26)

Adicionalmente, é estabelecido que ao longo da parede exterior do lado direito do piso e ao longo da parede superior do piso deve existir um outlet a cada 5 metros.

As salas 1, 2, 22 e 26 são indicadas como locais adequados para alojar infraestrutura de rede.


---

## Salas com Network Outlets
3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,23,24,25

---

## Salas sem Network Outlets
1,2,18,19,20,21,22,26

---

## Salas possíveis para Infraestrutura

1,2,22,26


---


## Cálculo do Número de Network Outlets

Foi considerada a regra de:

2 network outlets a cada 10 m² de área, equivalente a 1 outlet a cada 5 m².

Assim, o número de outlets foi calculado dividindo a área da sala por 5, arredondando para o valor inteiro seguinte.

----


## Mediçōes das Salas – Level 2

| Room | Area (m²) | Number of Outlets |
|------|----------:|------------------:|
| 3    |    238.05 |                48 |
| 4    |    238.05 |                48 |
| 5    |    306.02 |                62 |
| 6    |    325.82 |                66 |
| 7    |    368.58 |                74 |
| 8    |    407.98 |                82 |
| 9    |    203.92 |                41 |
| 10   |    441.97 |                89 |
| 11   |    595.05 |               120 |
| 12   |    475.52 |                96 |
| 13   |    543.92 |               109 |
| 14   |    272.03 |                55 |
| 15   |    509.94 |               102 |
| 16   |    325.82 |                66 |
| 17   |    368.58 |                74 |
| 23   |    436.29 |                88 |
| 24   |    514.31 |               103 |
| 25   |    342.83 |                69 |


---

## Localização dos Horizontal Cross-Connects (HC)

Devido à grande dimensão do Level 2 do Terminal 5, optou-se por
distribuir a infraestrutura de rede por vários pontos do piso.

As salas 1, 2, 18 e 22, identificadas no enunciado como salas
adequadas para alojar network infrastructure hardware, foram utilizadas
para instalar algum dos HC do piso.

A distribuição dos HCs por diferentes zonas do terminal garante que
as ligações em cabo de cobre não ultrapassam as distâncias recomendadas de 90 m;

Com isto, foram adicionados outros HC nas salas 9,11,13 e 17.



## Deployment de Network Outlets - Level 2

Os network outlets foram distribuídos ao longo das paredes das salas, procurando garantir acessibilidade aos pontos de rede em toda a área das salas.

De forma a simplificar a representação gráfica na planta, os outlets foram representados por um símbolo único acompanhado da quantidade total de outlets presentes em cada sala.

Esta abordagem permite manter o diagrama legível, evitando a necessidade de desenhar individualmente cada outlet.




## Wireless Access Points – Level 2

Devido à grande dimensão do terminal, foi necessária a instalação de 53 wireless access points para garantir cobertura Wi-Fi em toda a área do piso.

Garantiu a cobertura total do piso, foram distríbuidos também de forma a ocupar o maximo de area do terminal, evitando zonas fora do terminal.

Há muitas zonas de sobreposição para garantir que nao existiam zonas sem cobertura, e para garantir a melhor qualidade de sinal possível.

Cada access point é ligado à rede através de cabos CAT7 do teto , que estao direta ou indiretamente ligados ao Horizontal Cross-Connect que os consegue alcançar.

---

### Cable Pathways - Level 2

O Level 0 possui um sistema de underfloor cable raceway e vários floor cable passageways distribuídos ao longo do piso.

Os cabos provenientes das salas são encaminhados até ao floor cable passageway mais próximo, a partir do qual seguem pelo sistema de underfloor raceway até ao Horizontal Cross-Connect correspondente.

Para os **wireless access points**, os cabos percorrem inicialmente o espaço do dropped ceiling, podendo passar por consolidation points que facilitam a distribuição da cablagem no teto.

Esta abordagem permite reduzir o comprimento médio da cablagem e aproveitar a infraestrutura existente no edifício.


## Cables in meters ##

### IC (Room 22) ###
|          To HC           | Length of Fibre (m) |                     
|:------------------------:|:-------------------:|
|      HC22 - Room 22      |        6,04         |
| HC26 - Room 26 (ceiling) |       138,08        |       
|  HC1 - Room 1 (ceiling)  |       380,09        | 
|  HC2 - Room 2 (ceiling)  |       399,10        |
|  HC7 - Room 7 (ceiling)  |       344,38        |
| HC13 - Room 13 (ceiling) |       123,97        |
| HC11 - Room 11 (ceiling) |       205,96        |
|  HC9 - Room 9 (ceiling)  |       276,76        |
| HC17 - Room 17 (ceiling) |       113,37        |
|         *Total*          |       1987,75       |


### HC1 (Room 1) ###
| To Room or Ap  | Length of CAT7 (m) |                     
|:--------------:|:------------------:|
|  3 - ceiling   |       32,21        |
|  4 - ceiling   |       36,21        |       
|  5 - ceiling   |       52,88        |
| Access Point 1 |       19,57        |
| Access Point 2 |       57,19        |
| Access Point 5 |       47,34        |
| Access Point 6 |       67,48        |
|    *Total*     |       312,88       |

### HC2 (Room 2) ###
|  To Room or Ap  | Length of CAT7 (m) |                     
|:---------------:|:------------------:| 
| Access Point 3  |       43,48        |
| Access Point 4  |       10,40        |
|     *Total*     |       53,88        |


### HC7 (Room 7) ###
|  To Room or Ap  | Length of CAT7 (m) |                     
|:---------------:|:------------------:| 
|   6 - ceiling   |       16,65        |
|       7         |        3,16        |
| Access Point 7  |       17,60        |
| Access Point 8  |       17,38        |
| Access Point 11 |       19,88        |
| Access Point 12 |       22,07        |
| Access Point 16 |       44,50        |
|     *Total*     |       141,24       |

### HC9 (Room 9) ###
|  To Room or Ap  | Length of CAT7 (m) |                     
|:---------------:|:------------------:|
|   8 - ceiling   |       31,56        |
|        9        |        2,68        |       
| Access Point 9  |       38,94        |
| Access Point 10 |       38,24        |
| Access Point 13 |        5,78        |
| Access Point 14 |       28,73        |
| Access Point 15 |       61,60        |
| Access Point 17 |       23,86        |
| Access Point 18 |       29,28        |
| Access Point 19 |       68,01        |
| Access Point 20 |       89,90        |
|     *Total*     |       365,44       |

### HC11 (Room 11) ###
|  To Room or Ap  | Length of CAT7 (m) |                     
|:---------------:|:------------------:|
|  10 - ceiling   |       76,55        |
|       11        |        1,87        |       
| Access Point 21 |       30,42        |
| Access Point 22 |       31,47        |
| Access Point 23 |       65,21        |
| Access Point 24 |       87,28        |
| Access Point 25 |       17,78        |
| Access Point 26 |       27,66        |
| Access Point 27 |       65,18        |
| Access Point 28 |       89,12        |
|     *Total*     |       492,54       |

### HC13 (Room 13) ###
|  To Room or Ap  | Length of CAT7 (m) |                     
|:---------------:|:------------------:|
|  12 - ceiling   |       35,65        |
|       13        |        1,89        |  
|  14 - ceiling   |       18,51        |
|  15 - ceiling   |       39,58        |
| Access Point 29 |       47,77        |
| Access Point 30 |       47,42        |
| Access Point 31 |       71,39        |
| Access Point 32 |       89,50        |
| Access Point 33 |       24,35        |
| Access Point 34 |       27,87        |
| Access Point 35 |       69,18        |
| Access Point 36 |       88,01        |
| Access Point 37 |       24,84        |
| Access Point 38 |       30,76        |
| Access Point 41 |       44,63        |
| Access Point 42 |       42,56        |
|     *Total*     |       703,91       |

### HC17 (Room 17) ###
|  To Room or Ap  | Length of CAT7 (m) |                     
|:---------------:|:------------------:|
|  16 - ceiling   |       38,71        |
|       17        |        4,47        |
| Access Point 39 |       59,78        |
| Access Point 40 |       60,04        |
| Access Point 43 |       18,94        |
| Access Point 44 |       34,76        |
| Access Point 47 |       10,18        |
| Access Point 48 |       27,71        |
|     *Total*     |       254,59       |

### HC22 (Room 22) ###
|  To Room or Ap   | Length of CAT7 (m) |                     
|:----------------:|:------------------:|
| 23 - underground |       16,63        |
| Access Point 45  |       53,38        |
| Access Point 46  |       69,90        |
| Access Point 49  |       22,09        |
| Access Point 50  |       42,30        |
|     *Total*      |       204,30       |

### HC26 (Room 26) ###
|  To Room or Ap   | Length of CAT7 (m) |                     
|:----------------:|:------------------:|
| 24 - underground |       62,02        |
| 25 - underground |       34,33        |
| Access Point 51  |       63,72        |
| Access Point 52  |       32,45        |
| Access Point 53  |       31,86        |
|     *Total*      |       224,38       |

### Outlet cables for Room 3 ( 48 outlets): ###

0,99 + 1,98 + 2,98 + 3,97 + 4,96 + 5,95 + 6,94 + 7,94 + 8,93 + 9,92 + 10,91 + 11,91 + 12,90 + 13,89 + 14,88 + 15,87 + 16,87 + 17,86 + 18,85 + 19,84 + 20,83 + 21,83 + 22,82 + 23,81 + 0,99 + 1,98 + 2,98 + 3,97 + 4,96 + 5,95 + 6,94 + 7,94 + 8,93 + 9,92 + 10,91 + 11,91 + 12,90 + 13,89 + 14,88 + 15,87 + 16,87 + 17,86 + 18,85 + 19,84 + 20,83 + 21,83 + 22,82 + 23,81 = 595,25 m

### Outlet cables for Room 4 ( 48 outlets): ###

0,99 + 1,98 + 2,98 + 3,97 + 4,96 + 5,95 + 6,94 + 7,94 + 8,93 + 9,92 + 10,91 + 11,91 + 12,90 + 13,89 + 14,88 + 15,87 + 16,87 + 17,86 + 18,85 + 19,84 + 20,83 + 21,83 + 22,82 + 23,81 + 24,80 + 25,79 + 26,79 + 27,78 + 28,77 + 29,76 + 30,75 + 31,75 + 32,74 + 33,73 + 34,72 + 35,72 + 36,71 + 37,70 + 38,69 + 39,68 + 40,68 + 41,67 + 42,66 + 43,65 + 44,64 + 45,64 + 46,63 + 47,62 = 1166,69 m

### Outlet cables for Room 5 ( 62 outlets): ###

0,92 + 1,84 + 2,76 + 3,69 + 4,61 + 5,53 + 6,45 + 7,37 + 8,29 + 9,22 + 10,14 + 11,06 + 11,98 + 12,90 + 13,82 + 14,75 + 15,67 + 16,59 + 17,51 + 18,43 + 19,35 + 20,28 + 21,20 + 22,12 + 23,04 + 23,96 + 24,88 + 25,81 + 26,73 + 27,65 + 28,57 + 29,49 + 30,41 + 31,33 + 32,26 + 33,18 + 34,10 + 35,02 + 35,94 + 36,86 + 37,79 + 38,71 + 39,63 + 40,55 + 41,47 + 42,39 + 43,32 + 44,24 + 45,16 + 46,08 + 47,00 + 47,92 + 48,85 + 49,77 + 50,69 + 51,61 + 52,53 + 53,45 + 54,38 + 55,30 + 56,22 + 57,14 = 1799,91 m

### Outlet cables for Room 6 ( 66 outlets): ###

1,01 + 2,02 + 3,03 + 4,04 + 5,05 + 6,06 + 7,07 + 8,08 + 9,09 + 10,10 + 11,11 + 12,12 + 13,13 + 14,14 + 15,15 + 16,16 + 17,17 + 18,18 + 19,19 + 20,20 + 21,21 + 22,22 + 23,23 + 24,24 + 25,25 + 26,26 + 27,27 + 28,28 + 29,29 + 30,30 + 31,31 + 32,32 + 33,33 + 34,34 + 35,35 + 36,36 + 37,37 + 38,38 + 39,39 + 40,40 + 41,41 + 42,42 + 43,43 + 44,44 + 45,45 + 46,46 + 47,47 + 48,48 + 49,49 + 50,50 + 51,51 + 52,52 + 53,53 + 54,54 + 55,55 + 56,56 + 57,57 + 58,58 + 59,59 + 60,60 + 61,61 + 62,62 + 63,63 + 64,64 + 65,65 + 66,66 = 2233,11 m

### Outlet cables for Room 7 ( 74 outlets): ###

0,85 + 1,71 + 2,56 + 3,41 + 4,26 + 5,12 + 5,97 + 6,82 + 7,67 + 8,53 + 9,38 + 10,23 + 11,09 + 11,94 + 12,79 + 13,64 + 14,50 + 15,35 + 16,20 + 17,05 + 17,91 + 18,76 + 19,61 + 20,46 + 21,32 + 22,17 + 23,02 + 23,88 + 24,73 + 25,58 + 26,43 + 27,29 + 28,14 + 28,99 + 29,84 + 30,70 + 31,55 + 32,40 + 33,26 + 34,11 + 34,96 + 35,81 + 36,67 + 37,52 + 38,37 + 39,22 + 40,08 + 40,93 + 41,78 + 42,64 + 43,49 + 44,34 + 45,19 + 46,05 + 46,90 + 47,75 + 48,60 + 49,46 + 50,31 + 51,16 + 52,01 + 52,87 + 53,72 + 54,57 + 55,43 + 56,28 + 57,13 + 57,98 + 58,84 + 59,69 + 60,54 + 61,39 + 62,25 + 63,10 = 2366,25 m

### Outlet cables for Room 8 ( 82 outlets): ###

0,87 + 1,74 + 2,61 + 3,48 + 4,35 + 5,23 + 6,10 + 6,97 + 7,84 + 8,71 + 9,58 + 10,45 + 11,32 + 12,19 + 13,06 + 13,94 + 14,81 + 15,68 + 16,55 + 17,42 + 18,29 + 19,16 + 20,03 + 20,90 + 21,77 + 22,65 + 23,52 + 24,39 + 25,26 + 26,13 + 27,00 + 27,87 + 28,74 + 29,61 + 30,48 + 31,36 + 32,23 + 33,10 + 33,97 + 34,84 + 35,71 + 36,58 + 37,45 + 38,32 + 39,19 + 40,06 + 40,94 + 41,81 + 42,68 + 43,55 + 44,42 + 45,29 + 46,16 + 47,03 + 47,90 + 48,77 + 49,65 + 50,52 + 51,39 + 52,26 + 53,13 + 54,00 + 54,87 + 55,74 + 56,61 + 57,48 + 58,36 + 59,23 + 60,10 + 60,97 + 61,84 + 62,71 + 63,58 + 64,45 + 65,32 + 66,19 + 67,07 + 67,94 + 68,81 + 69,68 + 70,55 + 71,42 = 2963,93 m

### Outlet cables for Room 9 ( 41 outlets): ###

1,04 + 2,09 + 3,13 + 4,18 + 5,22 + 6,27 + 7,31 + 8,36 + 9,40 + 10,45 + 11,49 + 12,54 + 13,58 + 14,63 + 15,67 + 16,72 + 17,76 + 18,81 + 19,85 + 20,90 + 1,04 + 2,09 + 3,13 + 4,18 + 5,22 + 6,27 + 7,31 + 8,36 + 9,40 + 10,45 + 11,49 + 12,54 + 13,58 + 14,63 + 15,67 + 16,72 + 17,76 + 18,81 + 19,85 + 20,90 + 21,94 = 460,79 m

### Outlet cables for Room 10 ( 89 outlets): ###

0,86 + 1,71 + 2,57 + 3,42 + 4,28 + 5,14 + 5,99 + 6,85 + 7,70 + 8,56 + 9,42 + 10,27 + 11,13 + 11,98 + 12,84 + 13,70 + 14,55 + 15,41 + 16,26 + 17,12 + 17,98 + 18,83 + 19,69 + 20,54 + 21,40 + 22,25 + 23,11 + 23,97 + 24,82 + 25,68 + 26,53 + 27,39 + 28,25 + 29,10 + 29,96 + 30,81 + 31,67 + 32,53 + 33,38 + 34,24 + 35,09 + 35,95 + 36,81 + 37,66 + 38,52 + 39,37 + 40,23 + 41,09 + 41,94 + 42,80 + 43,65 + 44,51 + 45,37 + 46,22 + 47,08 + 47,93 + 48,79 + 49,65 + 50,50 + 51,36 + 52,21 + 53,07 + 53,93 + 54,78 + 55,64 + 56,49 + 57,35 + 58,20 + 59,06 + 59,92 + 60,77 + 61,63 + 62,48 + 63,34 + 64,20 + 65,05 + 65,91 + 66,76 + 67,62 + 68,48 + 69,33 + 70,19 + 71,04 + 71,90 + 72,76 + 73,61 + 74,47 + 75,32 + 76,18 = 3428,10 m

### Outlet cables for Room 11 ( 120 outlets): ###

0,81 + 1,63 + 2,44 + 3,25 + 4,07 + 4,88 + 5,69 + 6,51 + 7,32 + 8,14 + 8,95 + 9,76 + 10,58 + 11,39 + 12,20 + 13,02 + 13,83 + 14,64 + 15,46 + 16,27 + 17,08 + 17,90 + 18,71 + 19,52 + 20,34 + 21,15 + 21,96 + 22,78 + 23,59 + 24,41 + 25,22 + 26,03 + 26,85 + 27,66 + 28,47 + 29,29 + 30,10 + 30,91 + 31,73 + 32,54 + 33,35 + 34,17 + 34,98 + 35,79 + 36,61 + 37,42 + 38,23 + 39,05 + 39,86 + 40,68 + 41,49 + 42,30 + 43,12 + 43,93 + 44,74 + 45,56 + 46,37 + 47,18 + 48,00 + 48,81 + 0,81 + 1,63 + 2,44 + 3,25 + 4,07 + 4,88 + 5,69 + 6,51 + 7,32 + 8,14 + 8,95 + 9,76 + 10,58 + 11,39 + 12,20 + 13,02 + 13,83 + 14,64 + 15,46 + 16,27 + 17,08 + 17,90 + 18,71 + 19,52 + 20,34 + 21,15 + 21,96 + 22,78 + 23,59 + 24,41 + 25,22 + 26,03 + 26,85 + 27,66 + 28,47 + 29,29 + 30,10 + 30,91 + 31,73 + 32,54 + 33,35 + 34,17 + 34,98 + 35,79 + 36,61 + 37,42 + 38,23 + 39,05 + 39,86 + 40,68 + 41,49 + 42,30 + 43,12 + 43,93 + 44,74 + 45,56 + 46,37 + 47,18 + 48,00 + 48,81 = 2977,41 m

### Outlet cables for Room 12 ( 96 outlets): ###

0,84 + 1,69 + 2,53 + 3,37 + 4,22 + 5,06 + 5,90 + 6,75 + 7,59 + 8,43 + 9,27 + 10,12 + 10,96 + 11,80 + 12,65 + 13,49 + 14,33 + 15,18 + 16,02 + 16,86 + 17,71 + 18,55 + 19,39 + 20,24 + 21,08 + 21,92 + 22,76 + 23,61 + 24,45 + 25,29 + 26,14 + 26,98 + 27,82 + 28,67 + 29,51 + 30,35 + 31,20 + 32,04 + 32,88 + 33,73 + 34,57 + 35,41 + 36,25 + 37,10 + 37,94 + 38,78 + 39,63 + 40,47 + 41,31 + 42,16 + 43,00 + 43,84 + 44,69 + 45,53 + 46,37 + 47,22 + 48,06 + 48,90 + 49,74 + 50,59 + 51,43 + 52,27 + 53,12 + 53,96 + 54,80 + 55,65 + 56,49 + 57,33 + 58,18 + 59,02 + 59,86 + 60,71 + 61,55 + 62,39 + 63,23 + 64,08 + 64,92 + 65,76 + 66,61 + 67,45 + 68,29 + 69,14 + 69,98 + 70,82 + 71,67 + 72,51 + 73,35 + 74,20 + 75,04 + 75,88 + 76,72 + 77,57 + 78,41 + 79,25 + 80,10 + 80,94 = 3925,59 m

### Outlet cables for Room 13 ( 109 outlets): ###

0,83 + 1,66 + 2,49 + 3,32 + 4,15 + 4,98 + 5,81 + 6,64 + 7,47 + 8,30 + 9,13 + 9,96 + 10,79 + 11,62 + 12,45 + 13,28 + 14,11 + 14,94 + 15,77 + 16,60 + 17,43 + 18,26 + 19,09 + 19,92 + 20,75 + 21,58 + 22,41 + 23,24 + 24,07 + 24,90 + 25,73 + 26,56 + 27,39 + 28,22 + 29,05 + 29,88 + 30,71 + 31,54 + 32,37 + 33,20 + 34,03 + 34,86 + 35,69 + 36,52 + 37,35 + 38,18 + 39,01 + 39,84 + 40,67 + 41,50 + 42,33 + 43,16 + 43,99 + 44,82 + 0,83 + 1,66 + 2,49 + 3,32 + 4,15 + 4,98 + 5,81 + 6,64 + 7,47 + 8,30 + 9,13 + 9,96 + 10,79 + 11,62 + 12,45 + 13,28 + 14,11 + 14,94 + 15,77 + 16,60 + 17,43 + 18,26 + 19,09 + 19,92 + 20,75 + 21,58 + 22,41 + 23,24 + 24,07 + 24,90 + 25,73 + 26,56 + 27,39 + 28,22 + 29,05 + 29,88 + 30,71 + 31,54 + 32,37 + 33,20 + 34,03 + 34,86 + 35,69 + 36,52 + 37,35 + 38,18 + 39,01 + 39,84 + 40,67 + 41,50 + 42,33 + 43,16 + 43,99 + 44,82 + 45,64 = 2510,47 m

### Outlet cables for Room 14 ( 55 outlets): ###

0,87 + 1,73 + 2,60 + 3,46 + 4,33 + 5,19 + 6,06 + 6,93 + 7,79 + 8,66 + 9,52 + 10,39 + 11,25 + 12,12 + 12,98 + 13,85 + 14,72 + 15,58 + 16,45 + 17,31 + 18,18 + 19,04 + 19,91 + 20,78 + 21,64 + 22,51 + 23,37 + 0,87 + 1,73 + 2,60 + 3,46 + 4,33 + 5,19 + 6,06 + 6,93 + 7,79 + 8,66 + 9,52 + 10,39 + 11,25 + 12,12 + 12,98 + 13,85 + 14,72 + 15,58 + 16,45 + 17,31 + 18,18 + 19,04 + 19,91 + 20,78 + 21,64 + 22,51 + 23,37 + 24,24 = 678,66 m

### Outlet cables for Room 15 ( 102 outlets): ###

0,84 + 1,68 + 2,52 + 3,36 + 4,20 + 5,04 + 5,88 + 6,72 + 7,56 + 8,40 + 9,24 + 10,08 + 10,92 + 11,76 + 12,60 + 13,44 + 14,28 + 15,12 + 15,96 + 16,80 + 17,64 + 18,48 + 19,32 + 20,16 + 21,00 + 21,85 + 22,69 + 23,53 + 24,37 + 25,21 + 26,05 + 26,89 + 27,73 + 28,57 + 29,41 + 30,25 + 31,09 + 31,93 + 32,77 + 33,61 + 34,45 + 35,29 + 36,13 + 36,97 + 37,81 + 38,65 + 39,49 + 40,33 + 41,17 + 42,01 + 42,85 + 43,69 + 44,53 + 45,37 + 46,21 + 47,05 + 47,89 + 48,73 + 49,57 + 50,41 + 51,25 + 52,09 + 52,93 + 53,77 + 54,61 + 55,45 + 56,29 + 57,13 + 57,97 + 58,81 + 59,65 + 60,49 + 61,33 + 62,17 + 63,01 + 63,85 + 64,70 + 65,54 + 66,38 + 67,22 + 68,06 + 68,90 + 69,74 + 70,58 + 71,42 + 72,26 + 73,10 + 73,94 + 74,78 + 75,62 + 76,46 + 77,30 + 78,14 + 78,98 + 79,82 + 80,66 + 81,50 + 82,34 + 83,18 + 84,02 + 84,86 + 85,70 = 4413,55 m

### Outlet cables for Room 16 ( 66 outlets): ###

1,01 + 2,02 + 3,03 + 4,04 + 5,05 + 6,06 + 7,07 + 8,08 + 9,09 + 10,10 + 11,11 + 12,12 + 13,13 + 14,14 + 15,15 + 16,16 + 17,17 + 18,18 + 19,19 + 20,20 + 21,21 + 22,22 + 23,23 + 24,24 + 25,25 + 26,26 + 27,27 + 28,28 + 29,29 + 30,30 + 31,31 + 32,32 + 33,33 + 34,34 + 35,35 + 36,36 + 37,37 + 38,38 + 39,39 + 40,40 + 41,41 + 42,42 + 43,43 + 44,44 + 45,45 + 46,46 + 47,47 + 48,48 + 49,49 + 50,50 + 51,51 + 52,52 + 53,53 + 54,54 + 55,55 + 56,56 + 57,57 + 58,58 + 59,59 + 60,60 + 61,61 + 62,62 + 63,63 + 64,64 + 65,65 + 66,66 = 2233,11 m

### Outlet cables for Room 17 ( 74 outlets): ###

0,85 + 1,71 + 2,56 + 3,41 + 4,26 + 5,12 + 5,97 + 6,82 + 7,67 + 8,53 + 9,38 + 10,23 + 11,09 + 11,94 + 12,79 + 13,64 + 14,50 + 15,35 + 16,20 + 17,05 + 17,91 + 18,76 + 19,61 + 20,46 + 21,32 + 22,17 + 23,02 + 23,88 + 24,73 + 25,58 + 26,43 + 27,29 + 28,14 + 28,99 + 29,84 + 30,70 + 31,55 + 0,85 + 1,71 + 2,56 + 3,41 + 4,26 + 5,12 + 5,97 + 6,82 + 7,67 + 8,53 + 9,38 + 10,23 + 11,09 + 11,94 + 12,79 + 13,64 + 14,50 + 15,35 + 16,20 + 17,05 + 17,91 + 18,76 + 19,61 + 20,46 + 21,32 + 22,17 + 23,02 + 23,88 + 24,73 + 25,58 + 26,43 + 27,29 + 28,14 + 28,99 + 29,84 + 30,70 + 31,55 = 1198,90 m

### Outlet cables for Room 23 ( 88 outlets): ###

0,91 + 1,81 + 2,72 + 3,63 + 4,53 + 5,44 + 6,34 + 7,25 + 8,16 + 9,06 + 9,97 + 10,88 + 11,78 + 12,69 + 13,59 + 14,50 + 15,41 + 16,31 + 17,22 + 18,13 + 19,03 + 19,94 + 20,84 + 21,75 + 22,66 + 23,56 + 24,47 + 25,38 + 26,28 + 27,19 + 28,09 + 29,00 + 29,91 + 30,81 + 31,72 + 32,63 + 33,53 + 34,44 + 35,34 + 36,25 + 37,16 + 38,06 + 38,97 + 39,88 + 40,78 + 41,69 + 42,59 + 43,50 + 44,41 + 45,31 + 46,22 + 47,13 + 48,03 + 48,94 + 49,84 + 50,75 + 51,66 + 52,56 + 53,47 + 54,38 + 55,28 + 56,19 + 57,09 + 58,00 + 58,91 + 59,81 + 60,72 + 61,63 + 62,53 + 63,44 + 64,34 + 65,25 + 66,16 + 67,06 + 67,97 + 68,88 + 69,78 + 70,69 + 71,59 + 72,50 + 73,41 + 74,31 + 75,22 + 76,13 + 77,03 + 77,94 + 78,84 + 79,75 = 3548,88 m

### Outlet cables for Room 24 ( 103 outlets): ###

0,89 + 1,78 + 2,67 + 3,56 + 4,45 + 5,34 + 6,23 + 7,12 + 8,01 + 8,90 + 9,79 + 10,68 + 11,57 + 12,46 + 13,35 + 14,24 + 15,13 + 16,02 + 16,91 + 17,80 + 18,69 + 19,58 + 20,47 + 21,36 + 22,25 + 23,14 + 24,03 + 24,92 + 25,81 + 26,70 + 27,59 + 28,48 + 29,37 + 30,26 + 31,15 + 32,04 + 32,93 + 33,82 + 34,71 + 35,60 + 36,49 + 37,38 + 38,27 + 39,16 + 40,05 + 40,94 + 41,83 + 42,72 + 43,61 + 44,50 + 45,39 + 46,28 + 47,17 + 48,06 + 48,95 + 49,84 + 50,73 + 51,62 + 52,51 + 53,40 + 54,29 + 55,18 + 56,07 + 56,96 + 57,85 + 58,74 + 59,63 + 60,52 + 61,41 + 62,30 + 63,19 + 64,08 + 64,97 + 65,86 + 66,75 + 67,64 + 68,53 + 69,42 + 70,31 + 71,20 + 72,09 + 72,98 + 73,87 + 74,76 + 75,65 + 76,54 + 77,43 + 78,32 + 79,21 + 80,10 + 80,99 + 81,88 + 82,77 + 83,66 + 84,55 + 85,44 + 86,33 + 87,22 + 88,11 + 89,00 + 89,89 + 90,78 + 91,67 = 4766,84 m

### Outlet cables for Room 25 ( 103 outlets): ###

0,95 + 1,90 + 2,85 + 3,80 + 4,74 + 5,69 + 6,64 + 7,59 + 8,54 + 9,49 + 10,44 + 11,39 + 12,33 + 13,28 + 14,23 + 15,18 + 16,13 + 17,08 + 18,03 + 18,98 + 19,93 + 20,87 + 21,82 + 22,77 + 23,72 + 24,67 + 25,62 + 26,57 + 27,52 + 28,47 + 29,41 + 30,36 + 31,31 + 32,26 + 33,21 + 34,16 + 35,11 + 36,06 + 37,00 + 37,95 + 38,90 + 39,85 + 40,80 + 41,75 + 42,70 + 43,65 + 44,60 + 45,54 + 46,49 + 47,44 + 48,39 + 49,34 + 50,29 + 51,24 + 52,19 + 53,14 + 54,08 + 55,03 + 55,98 + 56,93 + 57,88 + 58,83 + 59,78 + 60,73 + 61,67 + 62,62 + 63,57 + 64,52 + 65,47 = 2291,45 m


## Outlet cables total ##
595,25 + 1166,69 + 1799,91 + 2233,11 + 2366,25 + 2963,93 + 460,79 + 3428,10 + 2977,41 + 3925,59 + 2510,47 + 678,66 + 4413,55 + 2233,11 + 1198,90 + 3548,88 + 4766,84 + 2291,45 


Resultado = 43 558,89

## Hardware Inventory ##

| Network Outlets | CAT7 Cables Length | Monomode 10 Cables Length | Patch Panels (48) | Patch Panels (24) | Access Point | IC | HC |
|:---------------:|:------------------:|:-------------------------:|:-----------------:|:-----------------:|:------------:|:--:|:--:|
|      1392       |      46312,05      |          1987,75          |         ?         |         ?         |      53      | 1  | 9  |











