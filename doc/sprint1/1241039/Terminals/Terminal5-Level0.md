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


## Deployment de Hardware – Level 0


---


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

## Cálculo de Cabos

| Sala | HC até Passageway | Outlets até Passageway | Total |
|-----|-----|-----|-----|
| | | | |
| | | | |
| | | | |

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
