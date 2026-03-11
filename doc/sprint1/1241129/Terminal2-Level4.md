# Terminal 2 – Level 4  

## Descrição do Piso

O Level 4 do Terminal 2 corresponde à zona de Departures do terminal.

Este piso possui uma infraestrutura preparada para suportar a instalação de cablagem de rede. Ao longo do piso existe um 
underfloor cable raceway, que permite a passagem de cabos por baixo do chão e facilita a distribuição da cablagem entre 
as diferentes salas do terminal.

Existem também quatro vertical cable passageways que percorrem todos os pisos do edifício e que permitem a ligação da 
infraestrutura de rede entre diferentes níveis do terminal.

A ligação destes vertical cable passageways ao sistema de infraestrutura externa encontra-se a um nível inferior do 
edifício, estando este piso a aproximadamente 25 metros dessa ligação.

O piso possui ainda um dropped ceiling localizado a aproximadamente 4 metros do chão, criando um espaço técnico adequado 
para a instalação de cabos de rede e equipamentos como wireless access points.

---

## Regras Especiais do Piso

Algumas salas do Level 4 possuem requisitos específicos relativamente à instalação de network outlets.

As salas destinadas a áreas de trabalho devem possuir o número padrão de network outlets, calculado com base na 
densidade de cablagem definida para o projeto.

Por outro lado, algumas salas correspondem a zonas de circulação, instalações técnicas ou áreas de apoio, pelo que não 
necessitam de network outlets.

Além disso, algumas destas salas podem ser utilizadas para alojar infraestrutura de rede, como equipamentos de 
cross-connect, permitindo a instalação de armários de telecomunicações e outros equipamentos necessários ao funcionamento 
da rede do piso.

---

### Salas com Network Outlets
1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12, 13, 14

### Salas sem Network Outlets
8, 15, 16, 17, 18

### Salas possíveis para Infraestrutura
8, 17, 18

---

## Mediçōes das Salas

| Room | Length (m) | Width (m) | Area (m²) | Number of Outlets |
|------|-----------:|----------:|----------:|------------------:|
| 1    |      21.31 |      9.84 |    209.69 |                42 |
| 2    |      21.31 |      9.84 |    209.69 |                42 |
| 3    |      19.67 |      9.84 |    193.55 |                39 |
| 4    |      20.49 |      9.84 |    201.62 |                41 |
| 5    |      37.70 |     12.30 |    463.71 |                93 |
| 6    |      32.79 |     12.30 |    403.32 |                81 |
| 7    |      36.07 |     12.30 |    443.66 |                89 |
| 9    |      18.03 |     13.11 |    234.37 |                47 |
| 10   |      18.03 |     13.11 |    234.37 |                47 |
| 11   |      18.03 |     13.11 |    234.37 |                47 |
| 12   |      18.03 |     13.11 |    234.37 |                47 |
| 13   |      18.03 |     13.11 |    234.37 |                47 |
| 14   |      12.30 |     13.11 |    161.25 |                33 |

---

## Localização do Horizontal Cross-Connect (HC)

O HC do Level 1 foi colocado na Room 12.

Esta sala foi escolhida por se encontrar próxima de duas vertical cable passageways, facilitando a ligação ao backbone
do edifício e a interligação entre pisos.

Além disso, a Room 12 localiza-se junto à parede exterior direita e à parede inferior do piso, onde o enunciado exige a
instalação de network outlets adicionais a cada cinco metros, permitindo reduzir o comprimento médio da cablagem
necessária para esses pontos.

---

## Deployment de Network Outlets

A distribuição dos network outlets foi definida de forma a garantir acessibilidade adequada a pontos de rede em todo o
piso.

Nas salas que requerem outlets, estes foram distribuídos ao longo das paredes e dimensionados segundo a densidade padrão
de cablagem estruturada de **2 network outlets por cada 10 m²** de área.

Foram também instalados outlets adicionais ao longo da parede exterior direita e da parede inferior do piso, com uma
densidade de **um outlet a cada cinco metros**.

---

## Deployment de Hardware

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

## Cable Pathways

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
|------|-------------------|------------------------|-------|
|      |                   |                        |       |
|      |                   |                        |       |
|      |                   |                        |       |

---

## Access Points

| Piso    | AP1 | AP2 | AP3 |
|---------|-----|-----|-----|
| Level 0 |     |     |     |

---

## Total de Cabos – Level 0

CAT7:

Monomode 10:

---

## Inventário de Hardware

| Network Outlets | Cabo CAT7 | Monomode 10 | Patch Panels (48) | Patch Panels (24) | Switch | Access Points | IC | HC |
|-----------------|-----------|-------------|-------------------|-------------------|--------|---------------|----|----|
|                 |           |             |                   |                   |        |               |    |    |

---

## Sala de Infraestrutura

*(sala escolhida para HC / rack)*

| Patch Panel | Size (U) | Switch (U) | Final Size (U) |
|-------------|----------|------------|----------------|
|             |          |            |                |

---

## Dimensionamento do Rack

*(cálculo do tamanho necessário do telecom enclosure)*



















