# <span style="color: #E67E22">Terminal 2 – Level 4</span>

## Infrastructure Overview

This document provides an overview of the Level 4 network infrastructure for Terminal 2, including links to individual device configurations.

---

## <span style="color: #1F4E79">Network Devices</span>

### Core Infrastructure

| Device    | Role                       | Config                               |
|-----------|----------------------------|--------------------------------------|
| IC1-L4-T2 | Intermediate Cross-Connect | [IC1-L4-T2.md](configs/IC1-L4-T2.md) |

---

### Horizontal Cross-Connects

| Device    | Config                                |
|-----------|---------------------------------------|
| HC1-L4-T2 | [HC1-L4-T2.md](configs/HC1-L4-T2.md)  |
| HC2-L4-T2 | [HC2-L4-T2.md](configs/HC2-L4-T2.md)  |
| HC3-L4-T2 | No configuration — represented only   |
| HC4-L4-T2 | No configuration — represented only   |
| HC5-L4-T2 | No configuration — represented only   |

---

### Consolidation Points

| Device                  | Connected to | Config                               |
|-------------------------|--------------|--------------------------------------|
| CP1-L4-T2               | HC1-L4-T2    | [CP1-L4-T2.md](configs/CP1-L4-T2.md) |
| CP2-L1-T2 to CP32-L1-T2 | —            | Not represented                      |

---

### End Devices

| Device                              | Type                    | VLAN           | IP               |
|-------------------------------------|-------------------------|----------------|------------------|
| [PC2-L4-T2](configs/PC1-L4-T2.md)   | Workstation             | T2_USERS (801) | 10.76.168.3      |
| [LAP1-L4-T2](configs/LAP1-L4-T2.md) | Wireless Laptop         | T2_WIFI (802)  | 10.76.160.3      |
| [AP1-L4-T2](configs/AP1-L4-T2.md)   | Access Point            | T2_WIFI (802)  | —                |
| [IP-Phone1](configs/IP-Phone1.md)   | VoIP Phone (Cisco 7960) | T2_VOIP (803)  | Pending Sprint 3 |

---

## Management IP Addresses (Switches DMZ)

| Device     | Management IP |
|------------|---------------|
| IC1-L4-T2  | 10.76.208.135 |
| HC1-L4-T2  | 10.76.208.136 |
| HC2-L4-T2  | 10.76.208.137 |
| CP1-L4-T2  | 10.76.208.138 |