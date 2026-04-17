# <span style="color: #E67E22">RCOMP 2025-2026 Project 1 - Sprint 2 Planning</span>

### <span style="color: #1F4E79">Sprint master: 1241129</span>

---

# <span style="color: #1F4E79">1. Sprint backlog and coordination</span>

The goal of Sprint 2 is to create a **Cisco Packet Tracer network simulation** based on the structured cabling project developed in Sprint 1.  
This sprint focuses on:

- **Layer 2 infrastructure**
- **VLAN definition and propagation**
- **Layer 3 fundamentals**
- **IPv4 addressing**
- **Static routing**

---

## <span style="color: #595959">Sprint tasks and distribution</span>

Each team member continues working on the **same terminal assigned in Sprint 1**.

For teams with **4 members**, the sprint backlog includes:


| Member             | Task  | Description                                                                                                                                               |
|--------------------|-------|-----------------------------------------------------------------------------------------------------------------------------------------------------------|
| [1241129](1241129) | T.2.1 | Development of a layer two and layer three Packet Tracer simulation for **Terminal 2**, the campus backbone, and the internet connection                  |
| [1241328](1241328) | T.2.2 | Development of a layer two and layer three Packet Tracer simulation for **Terminal 3**, the campus backbone, and integration into a single **campus.pkt** |
| [1240901](1240901) | T.2.4 | Development of a layer two and layer three Packet Tracer simulation for **Terminal 5** and the campus backbone                                            |
| [1241039](1241039) | T.2.3 | Development of a layer two and layer three Packet Tracer simulation for **Terminal 4** and the campus backbone                                            |

---

## <span style="color: #595959">Coordination rules</span>
- Each member continues the work of the same terminal from Sprint 1
- All members must keep consistent:
  - Packet Tracer version
  - VLAN database
  - VTP domain
  - naming conventions
  - addressing logic
- The member responsible for **Terminal 3** will integrate all simulations into a single **campus.pkt**
- Any incomplete work from Sprint 1 remains assigned to the same member

---

## <span style="color: #595959">Expected outputs</span>

Each member must deliver:

- the corresponding Packet Tracer simulation file (`TerminalN.pkt`)
- a document explaining the adopted **IPv4 addressing** and **static routing**
- configuration dump files for **all switches and routers**

Additionally, for Terminal 3:

- the integrated simulation file **`campus.pkt`**

---

## <span style="color: #595959">Sprint 1 status</span>

The structured cabling design developed in Sprint 1 serves as the basis for the network topology used in this sprint.

However, the **campus backbone designs was not defined in Sprint 1** and must now be designed and implemented as part of Sprint 2.

Additionally, a correction to the fibre usage defined in Sprint 1 is required:

- In Sprint 1, fibre connections within terminals were represented using a single fibre type
- In Sprint 2, fibre usage is refined as follows:
  - **Multimode fibre** is used for intra-terminal connections (e.g., IC–HC links)
  - **Single-mode fibre** is used exclusively for inter-terminal backbone connections (MC–IC links)

All team members must update their designs accordingly to ensure consistency across the project.

---

# <span style="color: #1F4E79">2. Technical decisions and coordination</span>

## <span style="color: #595959">Packet Tracer version</span>

All team members must use the **same Packet Tracer version**, to avoid compatibility issues when merging all simulations into a single final file.

**Adopted version:**  
`Cisco Packet Tracer 9.0.0`

---

## <span style="color: #595959">Devices naming</span> 

To ensure consistency across all simulations, the team agreed to use meaningful and standardized device names.

### Naming rules

- No spaces in hostnames
- Device display names and hostnames should be aligned whenever possible
- Names should identify:
  - terminal
  - floor or role
  - device type
  - sequence number if needed

### Suggested naming convention

- **Main cross-connect / terminal core switch:** `MC-Campus`
- **Intermediate cross-connects:** `IC-Tn`
- **Horizontal cross-connects:** `HCn-Ln-Tn`
- **Consolidation points:** `CPn-Ln-Tn`
- **Routers:** `RT-Tn`
- **Switches:** `SWn-Ln-Tn`
- **Access points:** `APn-Ln-Tn`
- **End devices:** `<type>n-Ln-Tn`

Naming legend:

- `Tn` → Terminal number (e.g., T2, T3, T4, T5)
- `Ln` → Level/Floor number (e.g., L0, L1, L2)
- `n` → Sequential number of the device within that category

End devices types:

| Type  | Description                         |
|-------|-------------------------------------|
| `PC`  | Workstation (User VLAN / Switches DMZ) |
| `SRV` | Server (Servers DMZ)                |
| `LAP` | Wireless Laptop (Wi-Fi VLAN)        |
| `PH`  | VoIP Phone                          |

---

## <span style="color: #595959">Layer 2 representation rules</span>

The simulation must be **logical and representative**, not a full physical copy of the cabling plan.

The following decisions were adopted:

- Every **cross-connect** and every **consolidation point (CP)** must be represented by a **layer 2 switch**
- The **PT-empty switch** model may be used, adding the necessary modules according to the required port types
- Inter-switch links must use the **same transmission medium** defined in Sprint 1:
  - copper where copper was used
  - fibre where fibre was used
- Redundant links between cross-connects on the same level must be preserved in the simulation
- Multiple parallel links between different hierarchy levels should be simplified into **a single logical link** when appropriate

---

## <span style="color: #595959">Switch module selection</span>

All switches use the **PT-Empty** model. The modules to add depend on the type of link and location of the switch.

### Available modules and their use

| Module               | Media             | Speed           | Use in this project                   |
|----------------------|-------------------|-----------------|---------------------------------------|
| PT-SWITCH-NM-1CFE    | Copper            | FastEthernet    | Extra copper ports if needed          |
| PT-SWITCH-NM-1FFE    | Fibre multimode   | FastEthernet    | Intra-terminal fibre links (IC-HC)    |
| PT-SWITCH-NM-1FFE-SM | Fibre single mode | FastEthernet    | Inter-terminal backbone links (MC-MC) |
| PT-SWITCH-NM-1FGE-SM | Fibre single mode | GigabitEthernet | Not used in this project              |

### Decision rationale

- **Within a terminal** (IC-HC links): distances are short (under 300 m), so **multimode fibre** is sufficient and more cost-effective. Use **PT-SWITCH-NM-1FFE**.
- **Between terminals** (backbone MC-IC links): distances may exceed 2 km, requiring **single mode fibre** for reliable transmission. Use **PT-SWITCH-NM-1FFE-SM**.
- **HC-CP and CP↔outlets**: copper CAT7 as defined in Sprint 1. The PT-Empty's built-in copper ports are sufficient; no extra modules needed in most cases.

### Modules per switch type

| Switch type             | Links                                                          | Modules to add                                  |
|-------------------------|----------------------------------------------------------------|-------------------------------------------------|
| **IC** (intra-terminal) | N HCs via multimode fibre + 1 link to MC via single mode fibre | N+1 × PT-SWITCH-NM-1FFE                         |
| **MC** (backbone)       | Links to other terminals via single mode fibre                 | 1× PT-SWITCH-NM-1FFE-SM per inter-terminal link |
| **HC**                  | 1 IC via multimode fibre + CPs via copper (built-in ports)     | 1× PT-SWITCH-NM-1FFE                            |
| **CP**                  | 1 HC via copper + outlets via copper (all built-in ports)      | none                                            |

---

## <span style="color: #595959">Spanning Tree Protocol (STP)</span>

STP is enabled by default on all Cisco switches and must remain active.  
**No switch may have STP disabled**, particularly in topologies with redundant links between switches of the same level, where STP is essential to prevent switching loops.

---

## <span style="color: #595959">VLANs</span>

All switches in all terminals must contain the **same VLAN database**, even if some VLANs are not locally used in that terminal.

There will be a total of **18 VLANs** in the project:

- **2 common VLANs**
  - Campus Backbone
  - Switches DMZ

- **4 VLANs per terminal**
  - User Outlets
  - Wi-Fi
  - VoIP
  - Servers DMZ

Since the team has 4 terminals, this results in:

- `2 + (4 × 4) = 18 VLANs`

**Default VLAN and Native VLAN decision:**  
The team agreed to keep **VLAN 1** as both the **default VLAN** and the **native VLAN** (untagged) on all trunk links. No traffic will be intentionally assigned to VLAN 1; it remains as the Cisco default and is not used for any project-specific purpose.

### VLAN database `799 to 819`

Naming structure:


| VLAN ID | Name            | Description                | IPv4 Network   |
|:-------:|-----------------|----------------------------|----------------|
|   799   | CAMPUS_BACKBONE | Backbone between terminals | 10.76.210.0/24 |
|   800   | SWITCHES_DMZ    | Switches Management        | 10.76.208.0/23 |
|         |                 |                            |                |
|         |                 |                            |                |
|   801   | T2_USERS        | User outlets Terminal 2    | 10.76.168.0/22 |
|   802   | T2_WIFI         | Wi-Fi Terminal 2           | 10.76.160.0/21 |
|   803   | T2_VOIP         | VoIP Terminal 2            | 10.76.172.0/23 |
|   804   | T2_SERVERS      | Servers DMZ Terminal 2     | 10.76.174.0/25 |
|         |                 |                            |                |
|         |                 |                            |                |
|   805   | T3_USERS        | User outlets Terminal 3    | 10.76.184.0/22 |
|   806   | T3_WIFI         | Wi-Fi Terminal 3           | 10.76.176.0/21 |
|   807   | T3_VOIP         | VoIP Terminal 3            | 10.76.188.0/23 |
|   808   | T3_SERVERS      | Servers DMZ Terminal 3     | 10.76.190.0/24 |
|         |                 |                            |                |
|         |                 |                            |                |
|   809   | T4_USERS        | User outlets Terminal 4    | 10.76.200.0/22 |
|   810   | T4_WIFI         | Wi-Fi Terminal 4           | 10.76.192.0/21 |
|   811   | T4_VOIP         | VoIP Terminal 4            | 10.76.204.0/23 |
|   812   | T4_SERVERS      | Servers DMZ Terminal 4     | 10.76.206.0/25 |
|         |                 |                            |                |
|         |                 |                            |                |
|   813   | T5_USERS        | User outlets Terminal 5    | 10.76.144.0/21 |
|   814   | T5_WIFI         | Wi-Fi Terminal 5           | 10.76.128.0/20 |
|   815   | T5_VOIP         | VoIP Terminal 5            | 10.76.152.0/23 |
|   816   | T5_SERVERS      | Servers DMZ Terminal 5     | 10.76.154.0/24 |

---

## <span style="color: #595959">VTP</span>  VTP

To guarantee VLAN consistency across all switches, the team will use **VTP**.

The following decisions were adopted:

- All switches will use the **same VTP domain**
- At least one switch per simulation will operate in **VTP server mode**
- Remaining switches will operate in **VTP client mode**
- Inter-switch links must be configured in **trunk mode**

**VTP domain:** `rc2526dig4`

---

## <span style="color: #595959">Routers and inter-VLAN routing</span> 

Each terminal must include **one router**, and the **only permitted model** is:

- **Cisco 2811**

> **Important:** No other router model may be used. Alternative models do not support VoIP in Packet Tracer, which is required in Sprint 3.

Each router will:

- connect the local VLANs of the terminal via **subinterfaces** on a single trunk link to the terminal's switch infrastructure
- connect the terminal to the **Campus Backbone**
- support inter-VLAN routing through **subinterfaces**

### Router subinterface IP addresses

Each router subinterface will use the **first usable IP address** of the corresponding subnet as its IP address. This address also serves as the **default gateway** for all end devices on that VLAN.

For example, for a subnet `10.76.168.0/22`, the router subinterface IP will be `10.76.168.1` and this is the default gateway for all devices on that VLAN.

### Configuration of routers outside the local terminal

In each simulation, routers representing terminals other than the one being developed must be present in the campus backbone. However, **their configuration must be limited to the backbone subinterface only** — that is, only the connection to VLAN 799 (CAMPUS_BACKBONE) and the corresponding IP address. Full configuration of each terminal's router is the responsibility of the team member assigned to that terminal.

---

## <span style="color: #595959">End devices required per terminal</span>

For each terminal simulation, there must be at least:

- **1 PC** in the User Outlets VLAN
- **1 PC** in the Switches DMZ
- **1 wireless laptop** associated with an access point in the Wi-Fi VLAN
- **1 server** in the Servers DMZ VLAN
- **1 VoIP phone (Cisco 7960)** in the VoIP VLAN

Additional decisions:

- All devices except VoIP phones will use **static IPv4 configuration**
- The VoIP phone port must use:
  - `switchport mode access`
  - `no switchport access vlan`
  - `switchport voice vlan ...`

---

## <span style="color: #595959">IPv4 planning</span> 

All IPv4 networks used in the project were derived from the team assigned block and sized according to the maximum number of nodes required for each VLAN, as specified in the project statement.

All network addresses are non-overlapping and belong to the assigned address block.

**Team IPv4 block:** `10.76.128.0/17`

### Global allocation

| Block            | Assignment        |
|------------------|-------------------|
| 10.76.128.0/19   | Terminal 5        |
| 10.76.160.0/20   | Terminal 2        |
| 10.76.176.0/20   | Terminal 3        |
| 10.76.192.0/20   | Terminal 4        |
| 10.76.208.0/23   | Switches DMZ      |
| 10.76.210.0/24   | Campus Backbone   |

---

### Campus Backbone router addresses

| Terminal | Router backbone IP |
|:--------:|--------------------|
| T2       | 10.76.210.1/24     |
| T3       | 10.76.210.2/24     |
| T4       | 10.76.210.3/24     |
| T5       | 10.76.210.4/24     |

---

### Switches DMZ allocation

Global Switches DMZ network: `10.76.208.0/23`

Number of switches per terminal (IC + HC + CP):

| Terminal | Switches count              |
|:--------:|-----------------------------|
| T2       | 2 IC + 10 HC + 58 CP = 70   |
| T3       | 1 IC + 5 HC + 6 CP = 12     |
| T4       | 2 IC + 6 HC + 41 CP = 49    |
| T5       | 2 IC + 16 HC + 56 CP = 74   |

#### Per-terminal Switches DMZ IP ranges

| Terminal | Block             | Usable IP range                   | Capacity |
|:--------:|-------------------|-----------------------------------|:--------:|
| T5       | 10.76.208.0/25    | 10.76.208.1 – 10.76.208.126       | 126      |
| T2       | 10.76.208.128/25  | 10.76.208.129 – 10.76.208.254     | 126      |
| T4       | 10.76.209.0/26    | 10.76.209.1 – 10.76.209.62        | 62       |
| T3       | 10.76.209.64/28   | 10.76.209.65 – 10.76.209.78       | 14       |

Each terminal's switches must be assigned addresses exclusively within the range shown above, starting from the first usable address and incrementing sequentially.

---

### Per-terminal VLAN allocation

#### Terminal 2

| VLAN         | Network           | Gateway (router subinterface) |
|--------------|-------------------|-------------------------------|
| T2_WIFI      | 10.76.160.0/21    | 10.76.160.1                   |
| T2_USERS     | 10.76.168.0/22    | 10.76.168.1                   |
| T2_VOIP      | 10.76.172.0/23    | 10.76.172.1                   |
| T2_SERVERS   | 10.76.174.0/25    | 10.76.174.1                   |

#### Terminal 3

| VLAN         | Network           | Gateway (router subinterface) |
|--------------|-------------------|-------------------------------|
| T3_WIFI      | 10.76.176.0/21    | 10.76.176.1                   |
| T3_USERS     | 10.76.184.0/22    | 10.76.184.1                   |
| T3_VOIP      | 10.76.188.0/23    | 10.76.188.1                   |
| T3_SERVERS   | 10.76.190.0/24    | 10.76.190.1                   |

#### Terminal 4

| VLAN         | Network           | Gateway (router subinterface) |
|--------------|-------------------|-------------------------------|
| T4_WIFI      | 10.76.192.0/21    | 10.76.192.1                   |
| T4_USERS     | 10.76.200.0/22    | 10.76.200.1                   |
| T4_VOIP      | 10.76.204.0/23    | 10.76.204.1                   |
| T4_SERVERS   | 10.76.206.0/25    | 10.76.206.1                   |

#### Terminal 5

| VLAN         | Network           | Gateway (router subinterface) |
|--------------|-------------------|-------------------------------|
| T5_WIFI      | 10.76.128.0/20    | 10.76.128.1                   |
| T5_USERS     | 10.76.144.0/21    | 10.76.144.1                   |
| T5_VOIP      | 10.76.152.0/23    | 10.76.152.1                   |
| T5_SERVERS   | 10.76.154.0/24    | 10.76.154.1                   |

---

### Internet connection (Terminal 2)

Terminal 2 includes an internet connection represented by a DSL modem connected to an ISP router.

**ISP router IPv4 node address (team-assigned):** `89.73.67.238/30`

The ISP router must have a static routing table configured to forward traffic matching the team's address block (`10.76.128.0/17`) into the infrastructure.
