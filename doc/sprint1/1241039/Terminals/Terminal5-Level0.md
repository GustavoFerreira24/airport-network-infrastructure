# Terminal 5 – Level 0

## Descrição do Piso

O Level 0 do Terminal 5 corresponde à zona de Arrivals do terminal.

Este piso possui dimensões aproximadas de 400 m × 150 m.

O piso dispõe de uma infraestrutura de cablagem estruturada preparada para suportar a instalação da rede. Existe um underfloor cable raceway que percorre o piso, permitindo a passagem de cabos por baixo do chão.

Este sistema encontra-se ligado a uma external technical ditch, permitindo a ligação da infraestrutura de rede do terminal a infraestruturas externas.

Na planta do piso estão identificados vários floor cable passageways, que permitem a ligação entre as salas e o sistema de raceway.

O piso possui ainda um dropped ceiling com aproximadamente 4 metros de
altura, que pode ser utilizado para a instalação de equipamentos de
rede, como wireless access points.

---

## Regras Especiais do Piso

Algumas salas do Level 0 possuem requisitos específicos relativamente à instalação de network outlets.

As salas destinadas a áreas de trabalho devem possuir o número de network outlets. (3,4,5,6,7,8,9,10,11,14,15,19,20,21)

Por outro lado, algumas salas correspondem a zonas de circulação,
instalações técnicas ou áreas de apoio, não necessitam de
network outlets. (1,2,12,13,16,17,18,22).

Existem quatro passagens verticais para cabos percorrem todos os andares do edifício.
Num andar inferior, essas passagens verticais para cabos têm conexão direta com a passagem subterrânea externa. 
A distância vertical entre este andar e a conexão com a passagem subterrânea externa é de 3 metros.

Além disso, algumas destas salas podem ser utilizadas para alojar
infraestrutura de rede, como equipamentos de cross-connect. (1,2,18,22)

---

## Salas com Network Outlets

3,4,5,6,7,8,9,10,11,14,15,19,20,21

---

## Salas sem Network Outlets

1,2,12,13,16,17,18,22

---

## Salas possíveis para Infraestrutura

1,2,18,22

---

## Cálculo do Número de Network Outlets

Foi considerada a regra de:

2 network outlets a cada 10 m² de área, equivalente a 1 outlet a cada 5 m².

Assim, o número de outlets foi calculado dividindo a área da sala por 5, arredondando para o valor inteiro seguinte.

----

## Mediçōes das Salas – Level 0

| Room | Area (m²) | Number of Outlets |
|-----|----------:|-----:|
| 3 |    441.30 | 89 |
| 4 |    275.59 | 56 |
| 5 |    275.59 | 56 |
| 6 |    312.37 | 63 |
| 7 |    349.02 | 70 |
| 8 |    312.37 | 63 |
| 9 |    275.59 | 56 |
| 10 |    385.80 | 78 |
| 11 |    367.41 | 74 |
| 14 |    310.21 | 63 |
| 15 |    326.67 | 66 |
| 19 |    375.59 | 76 |
| 20 |    424.51 | 85 |
| 21 |    293.86 | 59 |

---

## Localização dos Horizontal Cross-Connects (HC)

Devido à grande dimensão do Level 0 do Terminal 5, optou-se por
distribuir a infraestrutura de rede por vários pontos do piso.

As salas 1, 2, 18 e 22, identificadas no enunciado como salas
adequadas para alojar network infrastructure hardware, foram utilizadas
para instalar algum dos HC do piso.

A distribuição dos HCs por diferentes zonas do terminal garante que
as ligações em cabo de cobre não ultrapassam as distâncias recomendadas, de 90 m;

Com isto, foram adicionados outros HC nas salas 7, 10 e 14.


## Deployment de Network Outlets - Level 0

Os network outlets foram distribuídos ao longo das paredes das salas, procurando garantir acessibilidade aos pontos de rede em toda a área das salas.

De forma a simplificar a representação gráfica na planta, os outlets foram representados por um símbolo único acompanhado da quantidade total de outlets presentes em cada sala.

Esta abordagem permite manter o diagrama legível, evitando a necessidade de desenhar individualmente cada outlet.



## Wireless Access Points - Level 0

Devido à grande dimensão do terminal, foi necessária a instalação de 48 wireless access points para garantir cobertura Wi-Fi em toda a área do piso.

Garantiu a cobertura total do piso, foram distríbuidos também de forma a ocupar o maximo de area do terminal, evitando zonas fora do terminal. 

Há muitas zonas de sobreposição para garantir que nao existiam zonas sem cobertura, e para garantir a melhor qualidade de sinal possível.

Cada access point é ligado à rede através de cabos CAT7 do teto , que estao direta ou indiretamente ligados ao Horizontal Cross-Connect que os consegue alcançar.

---

## Cable Pathways - Level 0

O Level 0 possui um sistema de underfloor cable raceway e vários floor cable passageways distribuídos ao longo do piso.

Os cabos provenientes das salas são encaminhados até ao floor cable passageway mais próximo, a partir do qual seguem pelo sistema de underfloor raceway até ao Horizontal Cross-Connect correspondente.

Para os **wireless access points**, os cabos percorrem inicialmente o espaço do dropped ceiling, podendo passar por consolidation points que facilitam a distribuição da cablagem no teto.

Esta abordagem permite reduzir o comprimento médio da cablagem e aproveitar a infraestrutura existente no edifício.

---


## Cables in meters ##


### IC (Room 18) ###
|          To HC           | Length of Fibre (m) |                     
|:------------------------:|:-------------------:|
|      HC18 - Room 18      |        2,58         |
| HC22 - Room 22 (ceiling) |       135,36        |       
|  HC1 - Room 1 (ceiling)  |       386,51        | 
| HC14 - Room 14 (ceiling) |       111,46        |
|  HC2 - Room 2 (ceiling)  |       412,90        |
| HC10 - Room 10 (ceiling) |       214,34        |
|  HC7 - Room 7 (ceiling)  |       280,52        |
|         *Total*          |       1543,67       |


### HC1 (Room 1) ###
|  To Room or Ap  | Length of CAT7 (m) |                     
|:---------------:|:------------------:|
| 3 - underground |       25,40        |
|   4 - ceiling   |       65,80        |       
|   5 - ceiling   |       54,68        |
| Access Point 1  |       23,53        |
| Access Point 2  |       70,13        |
| Access Point 5  |       67,29        |
| Access Point 6  |       83,27        |
|     *Total*     |       390,10       |

### HC2 (Room 2) ###
| To Room or Ap  | Length of CAT7 (m) |                     
|:--------------:|:------------------:|
| Access Point 3 |       34,19        |
| Access Point 4 |       15,86        |
| Access Point 7 |       70,82        |
| Access Point 8 |       54,53        |
|    *Total*     |       175,40       |


### HC7 (Room 7) ###
|  To Room or Ap  | Length of CAT7 (m) |                     
|:---------------:|:------------------:|
|   6- ceiling    |       18,38        |
|        7        |        9,49        |
|   8- ceiling    |       23,70        |
| Access Point 9  |       27,47        |
| Access Point 10 |       29,26        |
| Access Point 11 |       61,53        |
| Access Point 12 |       89,12        |
| Access Point 13 |       14,67        |
| Access Point 14 |       19,54        |
| Access Point 16 |       89,89        |
|     *Total*     |       383,05       |

### HC10 (Room 10) ###
|  To Room or Ap  | Length of CAT7 (m) |                     
|:---------------:|:------------------:|
|   9- ceiling    |       31,84        |
|       10        |        2,74        |
|   11- ceiling   |       60,39        |
| Access Point 17 |       57,19        |
| Access Point 18 |       24,75        |
| Access Point 19 |       52,50        |
| Access Point 20 |       84,77        |
| Access Point 21 |       46,05        |
| Access Point 22 |       10,50        |
| Access Point 23 |       41,90        |
| Access Point 24 |       80,30        |
| Access Point 25 |       49,92        |
| Access Point 26 |       43,86        |
|     *Total*     |       586,71       |


### HC14 (Room 14) ###
|  To Room or Ap  | Length of CAT7 (m) |                     
|:---------------:|:------------------:|
|       14        |        5,81        |
|  15 - ceiling   |       36,63        |
| Access Point 27 |       77,92        |
| Access Point 28 |       89,96        |
| Access Point 29 |       65,87        |
| Access Point 30 |       55,39        |
| Access Point 31 |       48,52        |
| Access Point 32 |       65,73        |
| Access Point 33 |       55,96        |
| Access Point 34 |       21,96        |
| Access Point 35 |       19,64        |
| Access Point 36 |       58,09        |
|     *Total*     |       601,48       |


### HC18 (Room 18) ###
|  To Room or Ap   | Length of CAT7 (m) |                     
|:----------------:|:------------------:|
| 19 - underground |       48,88        |
| Access Point 37  |       63,06        |
| Access Point 38  |       79,08        |
| Access Point 41  |       35,95        |
| Access Point 42  |       52,65        |
| Access Point 45  |       15,65        |
| Access Point 46  |       57,65        |
|     *Total*      |       352,92       |


### HC22 (Room 22) ###
|  To Room or Ap   | Length of CAT7 (m) |                     
|:----------------:|:------------------:|
| 20 - underground |       74,91        |
| 21 - underground |       47,41        |
| Access Point 39  |       75,40        |
| Access Point 40  |       59,75        |
| Access Point 43  |       67,22        |
| Access Point 44  |       33,08        |
| Access Point 47  |       42,54        |
| Access Point 48  |       11,54        |
|     *Total*      |       411,85       |


### Outlet cables for Room 3 ( 89 outlets): ###

0,69 + 1,38 + 2,07 + 2,76 + 3,45 + 4,14 + 4,83 + 5,52 + 6,21 + 6,90 + 7,59 + 8,28 + 8,97 + 9,66 + 10,35 + 11,04 + 11,73 + 12,42 + 13,11 + 13,80 + 14,49 + 15,18 + 15,88 + 16,57 + 17,26 + 17,95 + 18,64 + 19,33 + 20,02 + 20,71 + 21,40 + 22,09 + 22,78 + 23,47 + 24,16 + 24,85 + 25,54 + 26,23 + 26,92 + 27,61 + 28,30 + 28,99 + 29,68 + 30,37 + 0,69 + 1,38 + 2,07 + 2,76 + 3,45 + 4,14 + 4,83 + 5,52 + 6,21 + 6,90 + 7,59 + 8,28 + 8,97 + 9,66 + 10,35 + 11,04 + 11,73 + 12,42 + 13,11 + 13,80 + 14,49 + 15,18 + 15,88 + 16,57 + 17,26 + 17,95 + 18,64 + 19,33 + 20,02 + 20,71 + 21,40 + 22,09 + 22,78 + 23,47 + 24,16 + 24,85 + 25,54 + 26,23 + 26,92 + 27,61 + 28,30 + 28,99 + 29,68 + 30,37 + 31,06 = 1397,71 m

### Outlet cables for Room 4 ( 56 outlets): ###

1,00 + 1,99 + 2,99 + 3,98 + 4,98 + 5,97 + 6,97 + 7,96 + 8,96 + 9,95 + 10,95 + 11,94 + 12,94 + 13,93 + 14,93 + 15,92 + 16,92 + 17,91 + 18,91 + 19,90 + 20,90 + 21,89 + 22,89 + 23,88 + 24,88 + 25,87 + 26,87 + 27,86 + 28,86 + 29,85 + 30,85 + 31,84 + 32,84 + 33,83 + 34,83 + 35,82 + 36,82 + 37,81 + 38,81 + 39,80 + 40,80 + 41,79 + 42,79 + 43,78 + 44,78 + 45,77 + 46,77 + 47,76 + 48,76 + 49,75 + 50,75 + 51,74 + 52,74 + 53,73 + 54,73 + 55,72 = 1588,02 m

### Outlet cables for Room 5 ( 56 outlets): ###

1,00 + 1,99 + 2,99 + 3,98 + 4,98 + 5,97 + 6,97 + 7,96 + 8,96 + 9,95 + 10,95 + 11,94 + 12,94 + 13,93 + 14,93 + 15,92 + 16,92 + 17,91 + 18,91 + 19,90 + 20,90 + 21,89 + 22,89 + 23,88 + 24,88 + 25,87 + 26,87 + 27,86 + 28,86 + 29,85 + 30,85 + 31,84 + 32,84 + 33,83 + 34,83 + 35,82 + 36,82 + 37,81 + 38,81 + 39,80 + 40,80 + 41,79 + 42,79 + 43,78 + 44,78 + 45,77 + 46,77 + 47,76 + 48,76 + 49,75 + 50,75 + 51,74 + 52,74 + 53,73 + 54,73 + 55,72 = 1588,02 m

### Outlet cables for Room 6 ( 63 outlets): ###

0,98 + 1,95 + 2,93 + 3,90 + 4,88 + 5,85 + 6,83 + 7,80 + 8,78 + 9,75 + 10,73 + 11,70 + 12,68 + 13,65 + 14,63 + 15,60 + 16,58 + 17,55 + 18,53 + 19,50 + 20,48 + 21,46 + 22,43 + 23,41 + 24,38 + 25,36 + 26,33 + 27,31 + 28,28 + 29,26 + 30,23 + 31,21 + 32,18 + 33,16 + 34,13 + 35,11 + 36,08 + 37,06 + 38,03 + 39,01 + 39,98 + 40,96 + 41,94 + 42,91 + 43,89 + 44,86 + 45,84 + 46,81 + 47,79 + 48,76 + 49,74 + 50,71 + 51,69 + 52,66 + 53,64 + 54,61 + 55,59 + 56,56 + 57,54 + 58,51 + 59,49 + 60,46 + 61,44 = 1966,08 m

### Outlet cables for Room 7 ( 70 outlets): ###

0,96 + 1,92 + 2,88 + 3,84 + 4,80 + 5,75 + 6,71 + 7,67 + 8,63 + 9,59 + 10,55 + 11,51 + 12,47 + 13,43 + 14,39 + 15,35 + 16,31 + 17,26 + 18,22 + 19,18 + 20,14 + 21,10 + 22,06 + 23,02 + 23,98 + 24,94 + 25,90 + 26,86 + 27,82 + 28,77 + 29,73 + 30,69 + 31,65 + 32,61 + 33,57 + 0,96 + 1,92 + 2,88 + 3,84 + 4,80 + 5,75 + 6,71 + 7,67 + 8,63 + 9,59 + 10,55 + 11,51 + 12,47 + 13,43 + 14,39 + 15,35 + 16,31 + 17,26 + 18,22 + 19,18 + 20,14 + 21,10 + 22,06 + 23,02 + 23,98 + 24,94 + 25,90 + 26,86 + 27,82 + 28,77 + 29,73 + 30,69 + 31,65 + 32,61 + 33,57 = 1208,52 m

### Outlet cables for Room 8 ( 63 outlets): ###

0,98 + 1,95 + 2,93 + 3,90 + 4,88 + 5,85 + 6,83 + 7,80 + 8,78 + 9,75 + 10,73 + 11,70 + 12,68 + 13,65 + 14,63 + 15,60 + 16,58 + 17,55 + 18,53 + 19,50 + 20,48 + 21,46 + 22,43 + 23,41 + 24,38 + 25,36 + 26,33 + 27,31 + 28,28 + 29,26 + 30,23 + 31,21 + 32,18 + 33,16 + 34,13 + 35,11 + 36,08 + 37,06 + 38,03 + 39,01 + 39,98 + 40,96 + 41,94 + 42,91 + 43,89 + 44,86 + 45,84 + 46,81 + 47,79 + 48,76 + 49,74 + 50,71 + 51,69 + 52,66 + 53,64 + 54,61 + 55,59 + 56,56 + 57,54 + 58,51 + 59,49 + 60,46 + 61,44 = 1966,08 m

### Outlet cables for Room 9 ( 56 outlets): ###

1,00 + 1,99 + 2,99 + 3,98 + 4,98 + 5,97 + 6,97 + 7,96 + 8,96 + 9,95 + 10,95 + 11,94 + 12,94 + 13,93 + 14,93 + 15,92 + 16,92 + 17,91 + 18,91 + 19,90 + 20,90 + 21,89 + 22,89 + 23,88 + 24,88 + 25,87 + 26,87 + 27,86 + 1,00 + 1,99 + 2,99 + 3,98 + 4,98 + 5,97 + 6,97 + 7,96 + 8,96 + 9,95 + 10,95 + 11,94 + 12,94 + 13,93 + 14,93 + 15,92 + 16,92 + 17,91 + 18,91 + 19,90 + 20,90 + 21,89 + 22,89 + 23,88 + 24,88 + 25,87 + 26,87 + 27,86 = 807,94 m

### Outlet cables for Room 10 ( 78 outlets): ###

0,71 + 1,43 + 2,14 + 2,86 + 3,57 + 4,29 + 5,00 + 5,71 + 6,43 + 7,14 + 7,86 + 8,57 + 9,29 + 10,00 + 10,72 + 11,43 + 12,14 + 12,86 + 13,57 + 14,29 + 15,00 + 15,72 + 16,43 + 17,14 + 17,86 + 18,57 + 19,29 + 20,00 + 20,72 + 21,43 + 22,15 + 22,86 + 23,57 + 24,29 + 25,00 + 25,72 + 26,43 + 27,15 + 27,86 + 0,71 + 1,43 + 2,14 + 2,86 + 3,57 + 4,29 + 5,00 + 5,71 + 6,43 + 7,14 + 7,86 + 8,57 + 9,29 + 10,00 + 10,72 + 11,43 + 12,14 + 12,86 + 13,57 + 14,29 + 15,00 + 15,72 + 16,43 + 17,14 + 17,86 + 18,57 + 19,29 + 20,00 + 20,72 + 21,43 + 22,15 + 22,86 + 23,57 + 24,29 + 25,00 + 25,72 + 26,43 + 27,15 + 27,86 = 1114,40 m

### Outlet cables for Room 11 ( 74 outlets): ###

0,73 + 1,47 + 2,20 + 2,93 + 3,67 + 4,40 + 5,14 + 5,87 + 6,60 + 7,34 + 8,07 + 8,80 + 9,54 + 10,27 + 11,00 + 11,74 + 12,47 + 13,21 + 13,94 + 14,67 + 15,41 + 16,14 + 16,87 + 17,61 + 18,34 + 19,07 + 19,81 + 20,54 + 21,28 + 22,01 + 22,74 + 23,48 + 24,21 + 24,94 + 25,68 + 26,41 + 27,15 + 27,88 + 28,61 + 29,35 + 30,08 + 30,81 + 31,55 + 32,28 + 33,01 + 33,75 + 34,48 + 35,22 + 35,95 + 36,68 + 37,42 + 38,15 + 38,88 + 39,62 + 40,35 + 41,08 + 41,82 + 42,55 + 43,29 + 44,02 + 44,75 + 45,49 + 46,22 + 46,95 + 47,69 + 48,42 + 49,15 + 49,89 + 50,62 + 51,36 + 52,09 + 52,82 + 53,56 + 54,29 = 2035,88 m

### Outlet cables for Room 14 ( 63 outlets): ###

0,79 + 1,59 + 2,38 + 3,17 + 3,97 + 4,76 + 5,56 + 6,35 + 7,14 + 7,94 + 8,73 + 9,52 + 10,32 + 11,11 + 11,90 + 12,70 + 13,49 + 14,29 + 15,08 + 15,87 + 16,67 + 17,46 + 18,25 + 19,05 + 19,84 + 20,63 + 21,43 + 22,22 + 23,02 + 23,81 + 24,60 + 0,79 + 1,59 + 2,38 + 3,17 + 3,97 + 4,76 + 5,56 + 6,35 + 7,14 + 7,94 + 8,73 + 9,52 + 10,32 + 11,11 + 11,90 + 12,70 + 13,49 + 14,29 + 15,08 + 15,87 + 16,67 + 17,46 + 18,25 + 19,05 + 19,84 + 20,63 + 21,43 + 22,22 + 23,02 + 23,81 + 24,60 + 25,40 = 812,70 m

### Outlet cables for Room 15 ( 66 outlets): ###

0,78 + 1,56 + 2,34 + 3,12 + 3,90 + 4,68 + 5,46 + 6,24 + 7,01 + 7,79 + 8,57 + 9,35 + 10,13 + 10,91 + 11,69 + 12,47 + 13,25 + 14,03 + 14,81 + 15,59 + 16,37 + 17,15 + 17,93 + 18,71 + 19,48 + 20,26 + 21,04 + 21,82 + 22,60 + 23,38 + 24,16 + 24,94 + 25,72 + 0,78 + 1,56 + 2,34 + 3,12 + 3,90 + 4,68 + 5,46 + 6,24 + 7,01 + 7,79 + 8,57 + 9,35 + 10,13 + 10,91 + 11,69 + 12,47 + 13,25 + 14,03 + 14,81 + 15,59 + 16,37 + 17,15 + 17,93 + 18,71 + 19,48 + 20,26 + 21,04 + 21,82 + 22,60 + 23,38 + 24,16 + 24,94 + 25,72 = 874,48 m

### Outlet cables for Room 19 ( 76 outlets): ###

0,95 + 1,90 + 2,86 + 3,81 + 4,76 + 5,71 + 6,66 + 7,62 + 8,57 + 9,52 + 10,47 + 11,43 + 12,38 + 13,33 + 14,28 + 15,23 + 16,19 + 17,14 + 18,09 + 19,04 + 19,99 + 20,95 + 21,90 + 22,85 + 23,80 + 24,75 + 25,71 + 26,66 + 27,61 + 28,56 + 29,52 + 30,47 + 31,42 + 32,37 + 33,32 + 34,28 + 35,23 + 36,18 + 37,13 + 38,08 + 39,04 + 39,99 + 40,94 + 41,89 + 42,84 + 43,80 + 44,75 + 45,70 + 46,65 + 47,61 + 48,56 + 49,51 + 50,46 + 51,41 + 52,37 + 53,32 + 54,27 + 55,22 + 56,17 + 57,13 + 58,08 + 59,03 + 59,98 + 60,93 + 61,89 + 62,84 + 63,79 + 64,74 + 65,70 + 66,65 + 67,60 + 68,55 + 69,50 + 70,46 + 71,41 + 72,36 = 2785,86 m

### Outlet cables for Room 20 ( 85 outlets): ###

1,01 + 2,02 + 3,03 + 4,03 + 5,04 + 6,05 + 7,06 + 8,07 + 9,08 + 10,08 + 11,09 + 12,10 + 13,11 + 14,12 + 15,13 + 16,13 + 17,14 + 18,15 + 19,16 + 20,17 + 21,18 + 22,18 + 23,19 + 24,20 + 25,21 + 26,22 + 27,23 + 28,23 + 29,24 + 30,25 + 31,26 + 32,27 + 33,28 + 34,28 + 35,29 + 36,30 + 37,31 + 38,32 + 39,33 + 40,33 + 41,34 + 42,35 + 43,36 + 44,37 + 45,38 + 46,38 + 47,39 + 48,40 + 49,41 + 50,42 + 51,43 + 52,43 + 53,44 + 54,45 + 55,46 + 56,47 + 57,48 + 58,48 + 59,49 + 60,50 + 61,51 + 62,52 + 63,53 + 64,53 + 65,54 + 66,55 + 67,56 + 68,57 + 69,58 + 70,58 + 71,59 + 72,60 + 73,61 + 74,62 + 75,63 + 76,63 + 77,64 + 78,65 + 79,66 + 80,67 + 81,68 + 82,68 + 83,69 + 84,70 + 85,71 = 3685,53 m

### Outlet cables for Room 21 ( 59 outlets): ###

0,94 + 1,88 + 2,83 + 3,77 + 4,71 + 5,65 + 6,59 + 7,54 + 8,48 + 9,42 + 10,36 + 11,30 + 12,25 + 13,19 + 14,13 + 15,07 + 16,01 + 16,96 + 17,90 + 18,84 + 19,78 + 20,72 + 21,67 + 22,61 + 23,55 + 24,49 + 25,43 + 26,38 + 27,32 + 28,26 + 29,20 + 30,15 + 31,09 + 32,03 + 32,97 + 33,91 + 34,86 + 35,80 + 36,74 + 37,68 + 38,62 + 39,57 + 40,51 + 41,45 + 42,39 + 43,33 + 44,28 + 45,22 + 46,16 + 47,10 + 48,04 + 48,99 + 49,93 + 50,87 + 51,81 + 52,75 + 53,70 + 54,64 + 55,58 = 1667,40 m

## Outlet cables total ##

1667,40 + 3685,53 + 2785,86 + 874,48 + 812,70 + 2035,88 + 1114,40 + 807,94 + 1966,08 + 1208,52 + 1966,08 + 1588,02 + 1588,02 + 1397,71 

Resultado = 23 498,62

## Hardware Inventory ##

| Network Outlets | CAT7 Cables Length | Monomode 10 Cables Length | Patch Panels (48) | Patch Panels (24) | Access Point | IC | HC |
|:---------------:|:------------------:|:-------------------------:|:-----------------:|:-----------------:|:------------:|:--:|:--:|
|       954       |      26400,13      |          1543,67           |         ?         |         ?         |      48      | 1  | 7  |

