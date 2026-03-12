# Terminal 5 – Level 0

## Descrição do Piso

O Level 0 do Terminal 5 corresponde à zona de Arrivals do terminal.

Este piso possui uma infraestrutura preparada para suportar a instalação
de cablagem de rede. Ao longo do piso existe um underfloor cable raceway,
que permite a passagem de cabos por baixo do chão e facilita a distribuição
da cablagem entre as diferentes salas do terminal.

Este sistema encontra-se também ligado a uma external technical ditch,
o que permite a ligação da infraestrutura de rede do edifício a outras
infraestruturas externas.

Na planta estão identificados vários pontos de acesso ao raceway,
que permitem encaminhar os cabos provenientes das diferentes salas até
ao sistema principal de cablagem.

O piso possui ainda um dropped ceiling com aproximadamente 4 metros de
altura, que pode ser utilizado para a instalação de equipamentos de
rede, como wireless access points.

---

## Regras Especiais do Piso

De acordo com o enunciado do projeto, algumas salas do Level 0 possuem
requisitos específicos relativamente à instalação de network outlets.

As salas destinadas a áreas de trabalho devem possuir o número padrão
de network outlets, calculado com base na densidade de cablagem definida
para o projeto.

Por outro lado, algumas salas correspondem a zonas de circulação,
instalações técnicas ou áreas de apoio, pelo que não necessitam de
network outlets.

Além disso, algumas destas salas podem ser utilizadas para alojar
infraestrutura de rede, como equipamentos de cross-connect.
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

### Localização dos Horizontal Cross-Connects (HC)

Devido à grande dimensão do Level 0 do Terminal 5, optou-se por
distribuir a infraestrutura de rede por vários pontos do piso.

As Rooms 1, 2, 18 e 22, identificadas no enunciado como salas
adequadas para alojar network infrastructure hardware, foram utilizadas
para instalar os Horizontal Cross-Connects (HC) do piso.

A distribuição dos HCs por diferentes zonas do terminal permite
reduzir o comprimento médio da cablagem horizontal, garantindo que
as ligações em cabo de cobre não ultrapassam as distâncias recomendadas.

Além disso, estas salas são espaços técnicos e não áreas de utilização
pública, sendo adequadas para a instalação de racks, patch panels e
outros equipamentos de rede.


## Deployment de Network Outlets – Level 0

A distribuição dos network outlets foi realizada de forma a garantir
cobertura adequada das áreas de trabalho e acessibilidade a equipamentos
de rede em todo o piso.

Os outlets foram distribuídos ao longo das paredes das salas,
procurando garantir que qualquer ponto da sala se encontra a uma
distância razoável de um ponto de rede.

A quantidade de outlets por sala foi determinada com base na
densidade padrão de cablagem estruturada:

2 network outlets por cada 10 m² de área.

Esta abordagem permite suportar um elevado número de dispositivos
de rede e garantir flexibilidade para futuras expansões.


## Deployment de Hardware – Level 0

*(planta com outlets, cabos, APs e HC)*

---

## Wireless Access Points – Level 0

O Level 0 do Terminal 5 tem dimensões aproximadas de 400 m × 150 m,
por isso é necessário distribuir vários access points ao longo do piso
para garantir cobertura Wi-Fi em toda a área.

Em ambientes interiores, um access point consegue normalmente cobrir
uma área com cerca de 20 a 30 metros de raio, dependendo das paredes
e de outros obstáculos existentes no edifício.

Tendo em conta o tamanho do piso e a disposição das salas,
foram considerados **8 access points** para o Level 0.
Estes access points serão distribuídos de forma aproximadamente
uniforme ao longo do terminal.

Os access points serão instalados acima do dropped ceiling,
o que facilita a propagação do sinal e permite esconder
a cablagem. Cada AP será ligado por cabo Ethernet ao
HC localizado na Room 18.

---

## Cable Pathways – Level 0

O Level 0 possui um sistema de underfloor cable raceway e 9 floor cable
passageways distribuídos ao longo do piso.

A solução adotada foi encaminhar os cabos de cada sala até ao floor cable
passageway mais próximo. A partir desse ponto, os cabos seguem pelo
underfloor cable raceway até ao Horizontal Cross-Connect localizado na
Room 18.

Esta abordagem permite reduzir o comprimento médio da cablagem horizontal
e aproveitar melhor a infraestrutura já existente no piso.

No caso dos access points, os cabos partem da zona do dropped ceiling,
descem até ao pathway mais próximo e seguem depois até ao HC através
do raceway.

---

## Cálculo de Cabos

| Sala | HC até Passageway | Outlets até Passageway | Total |
|-----|-----|-----|-----|
| | | | |
| | | | |
| | | | |

---

## Access Points

| Piso | AP1 | AP2 | AP3 |
|-----|-----|-----|-----|
| Level 0 | | | |

---

## Total de Cabos – Level 0

CAT7:

Monomode 10:

---

## Inventário de Hardware – Level 0

| Network Outlets | Cabo CAT7 | Monomode 10 | Patch Panels (48) | Patch Panels (24) | Switch | Access Points | IC | HC |
|----|----|----|----|----|----|----|----|----|
| | | | | | | | | |

---

## Sala de Infraestrutura

*(sala escolhida para HC / rack)*

| Patch Panel | Size (U) | Switch (U) | Final Size (U) |
|----|----|----|----|
| | | | |

---

## Dimensionamento do Rack

*(cálculo do tamanho necessário do telecom enclosure)*

---
