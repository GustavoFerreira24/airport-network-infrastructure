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



## Deployment de Hardware – Level 2

---




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


## Cálculo de Cabos

| Sala | HC até Passageway | Outlets até Passageway | Total |
|-----|-----|-----|-----|
| | | | |

---

## Access Points

| Piso | AP1 | AP2 | AP3 |
|-----|-----|-----|-----|
| Level 2 | | | |

---

## Total de Cabos – Level 2

CAT7:

Monomode 10:

---

## Inventário de Hardware – Level 2

| Network Outlets | Cabo CAT7 | Monomode 10 | Patch Panels (48) | Patch Panels (24) | Switch | Access Points | IC | HC |
|----|----|----|----|----|----|----|----|----|
| | | | | | | | | |

---
