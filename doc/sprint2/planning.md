# <span style="color: #E67E22">RCOMP 2025-2026 Project 1 - Sprint 2 Planning</span>

### <span style="color: #1F4E79">Sprint master: 1241129</span>

---

# <span style="color: #1F4E79">1. Sprint's backlog</span>

The goal of Sprint 2 is to create a **Cisco Packet Tracer network simulation** based on the structured cabling project developed in Sprint 1.  
This sprint focuses on:

- **Layer 2 infrastructure**
- **VLAN definition and propagation**
- **Layer 3 fundamentals**
- **IPv4 addressing**
- **Static routing**

Each team member continues working on the **same terminal assigned in Sprint 1**.  
Each individual simulation must include:

- the member's own terminal
- the **campus backbone**
- a switch representing the **main cross-connect**
- switches representing the other terminals in the backbone structure

For teams with **4 members**, the sprint backlog includes:

- **T.2.1** – Development of a layer two and layer three Packet Tracer simulation for **Terminal 2**, the campus backbone, and the internet connection
- **T.2.2** – Development of a layer two and layer three Packet Tracer simulation for **Terminal 3**, the campus backbone, and integration of all members' simulations into a single **campus.pkt**
- **T.2.3** – Development of a layer two and layer three Packet Tracer simulation for **Terminal 5** and the campus backbone
- **T.2.4** – Development of a layer two and layer three Packet Tracer simulation for **Terminal 4** and the campus backbone

Main outputs required for each member:

- the corresponding Packet Tracer simulation file (`TerminalN.pkt`)
- a document explaining the adopted **IPv4 addressing** and **static routing**
- configuration dump files for **all switches and routers** in the member's terminal

For Terminal 3, there is one additional required output:

- the integrated simulation file **`campus.pkt`**

---

### Sprint 1 pending tasks

After reviewing all Sprint 1 deliverables, no pending corrections or incomplete tasks were identified. All team members' work from Sprint 1 was assessed as fully implemented with no issues. No additional corrective work is required during this sprint.

---

# <span style="color: #1F4E79">2. Technical decisions and coordination</span>

## Packet Tracer version

All team members must use the **same Packet Tracer version**, to avoid compatibility issues when merging all simulations into a single final file.

**Adopted version:**  
`[Cisco Packet Tracer 9.0.0]`

---

## Devices naming

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

- **Main cross-connect / terminal core switch:** `MC-Tn`
- **Intermediate cross-connects:** `IC-Tn`
- **Horizontal cross-connects:** `HCn-Ln-Tn`
- **Consolidation points:** `CPn-Ln-Tn`
- **Routers:** `RTn-Ln-Tn`
- **Switches:** `SWn-Ln-Tn`
- **Access points:** `APn-Ln-Tn`
- **End devices:** `<type>n-Ln-Tn`

Naming legend:

- `Tn` → Terminal number (e.g., T2, T3, T4, T5)
- `Ln` → Level/Floor number (e.g., L0, L1, L2)
- `n` → Sequential number of the device within that category

End devices types

| Type | Description |
|------|------------|
| `PC` | Workstation (User VLAN / Switches DMZ) |
| `SRV` | Server (Servers DMZ) |
| `LAP` | Wireless Laptop (Wi-Fi VLAN) |
| `PH` | VoIP Phone |


---

## Layer 2 representation rules

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

## VLANs

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


| VLAN ID | Name            | Description                | IPv4           |
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

## VTP

To guarantee VLAN consistency across all switches, the team will use **VTP**.

The following decisions were adopted:

- all switches will use the **same VTP domain**
- at least one switch per simulation will operate in **VTP server mode**
- remaining switches will operate in **VTP client mode**
- inter-switch links must be configured in **trunk mode**

**VTP domain:** `rc2526dig4`

---

## Routers and inter-VLAN routing

Each terminal must include **one router**, and the **only permitted model** is:

- **Cisco 2811**

> **Important:** No other router model may be used. Alternative models do not support VoIP in Packet Tracer, which is required in Sprint 3.

Each router will:

- connect the local VLANs of the terminal
- connect the terminal to the **Campus Backbone**
- support inter-VLAN routing through **subinterfaces**
- use a **single trunk link** to the terminal switch infrastructure

---

## End devices required per terminal

For each terminal simulation, there must be at least:

- **1 PC** in the User Outlets VLAN
- **1 PC** in the Switches DMZ
- **1 wireless laptop** associated with an access point in the Wi-Fi VLAN
- **1 server** in the Servers DMZ VLAN
- **1 VoIP phone (Cisco 7960)** in the VoIP VLAN

Additional decisions:

- all devices except VoIP phones will use **static IPv4 configuration**
- the VoIP phone port must use:
  - `switchport mode access`
  - `no switchport access vlan`
  - `switchport voice vlan ...`

---

## IPv4 planning

All IPv4 networks used in the project were derived from the team assigned block and sized according to the maximum number of nodes required for each VLAN, as specified in the project statement.

All network addresses are non-overlapping and belong to the assigned address block.


**Team IPv4 block:** 10.76.128.0/17


### Global allocation

- Terminal 5 block: 10.76.128.0/19
- Terminal 2 block: 10.76.160.0/20
- Terminal 3 block: 10.76.176.0/20
- Terminal 4 block: 10.76.192.0/20
- Switches DMZ: 10.76.208.0/23
- Campus Backbone: 10.76.210.0/24

#### Switches DMZ allocation

Global Switches DMZ network: 10.76.208.0/23

Because each IC, HC and CP is represented by one switch in the simulation, the number of switches per terminal is:

- Terminal 2: 2 IC + 10 HC + 58 CP = 70 switches
- Terminal 3: 1 IC + 5 HC + 6 CP = 12 switches
- Terminal 4: 2 IC + 6 HC + 41 CP = 49 switches
- Terminal 5: 2 IC + 16 HC + 56 CP = 74 switches

#### Per-terminal Switches DMZ IP ranges

| Terminal | Block           | Usable range                              | Capacity |
|:--------:|-----------------|-------------------------------------------|:--------:|
| T5       | 10.76.208.0/25  | 10.76.208.1 – 10.76.208.126               | 126      |
| T2       | 10.76.208.128/25| 10.76.208.129 – 10.76.208.254             | 126      |
| T4       | 10.76.209.0/26  | 10.76.209.1 – 10.76.209.62               | 62       |
| T3       | 10.76.209.64/28 | 10.76.209.65 – 10.76.209.78              | 14       |

Each terminal's switches must be assigned addresses exclusively within the range shown above.

#### Per-terminal allocation

- Terminal 5 switches: 10.76.208.0/25
- Terminal 2 switches: 10.76.208.128/25
- Terminal 4 switches: 10.76.209.0/26
- Terminal 3 switches: 10.76.209.64/28

### Campus Backbone router addresses

- T2 router: 10.76.210.1/24
- T3 router: 10.76.210.2/24
- T4 router: 10.76.210.3/24
- T5 router: 10.76.210.4/24


### Terminal 2 allocation

- T2_WIFI: 10.76.160.0/21
- T2_USERS: 10.76.168.0/22
- T2_VOIP: 10.76.172.0/23
- T2_SERVERS: 10.76.174.0/25


### Terminal 3 allocation

- T3_WIFI: 10.76.176.0/21
- T3_USERS: 10.76.184.0/22
- T3_VOIP: 10.76.188.0/23
- T3_SERVERS: 10.76.190.0/24


### Terminal 4 allocation

- T4_WIFI: 10.76.192.0/21
- T4_USERS: 10.76.200.0/22
- T4_VOIP: 10.76.204.0/23
- T4_SERVERS: 10.76.206.0/25


### Terminal 5 allocation

- T5_WIFI: 10.76.128.0/20
- T5_USERS: 10.76.144.0/21
- T5_VOIP: 10.76.152.0/23
- T5_SERVERS: 10.76.154.0/24


### Internet connection (Terminal 2)

Terminal 2 includes an internet connection represented by a DSL modem connected to an ISP router.

**ISP router IPv4 node address (team-assigned):** `89.73.67.238/30`

The ISP router must have a static routing table configured to forward traffic matching the team's address block into the infrastructure.

### Coordination rules

- Each member continues the work of the same terminal from Sprint 1
- All members must keep consistent:
  - Packet Tracer version
  - VLAN database
  - VTP domain
  - naming conventions
  - addressing logic
- The member responsible for **Terminal 3** will later integrate all simulations into a single `campus.pkt`
- Any task from Sprint 1 not assessed as fully completed must be corrected by the same member during this sprint

### Default gateways

Each VLAN will use the first usable IP address of its subnet as the default gateway, configured on the router subinterfaces.

---

# <span style="color: #1F4E79">3. Subtasks assignment</span>

The task distribution follows the same terminal assignment from Sprint 1.

- **1241129** – Development of the layer two and layer three Packet Tracer simulation for **Terminal 2**, the campus backbone, and the internet connection
- **1241328** – Development of the layer two and layer three Packet Tracer simulation for **Terminal 3**, the campus backbone, and integration of all members' simulations into **campus.pkt**
- **1240901** – Development of the layer two and layer three Packet Tracer simulation for **Terminal 4** and the campus backbone
- **1241039** – Development of the layer two and layer three Packet Tracer simulation for **Terminal 5** and the campus backbone

### Additional note

Any pending corrections or incomplete work from Sprint 1 must remain assigned to the same team member responsible for that terminal.