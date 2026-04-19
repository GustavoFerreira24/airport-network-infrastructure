# Terminal 4 – Level 2

## Infrastructure Overview

This document provides an overview of the Level 2 network infrastructure for Terminal 4, including links to individual device configurations.

---

## Network Devices

### Core Infrastructure

| Device    | Role                                 | Config                                          |
|-----------|--------------------------------------|-------------------------------------------------|
| IC-L2-T4  | Intermediate Cross-Connect (Room 14) | [IC-L2-T4](configs/IC-T4-L2_startup-config.txt) |

---

### Horizontal Cross-Connects

| Device    | Location | Config                                            |
|-----------|----------|---------------------------------------------------|
| HC1-L2-T4 | Room 3   | [HC1-L2-T4](configs/HC1-L2-T4_startup-config.txt) |
| HC2-L2-T4 | Room 17  | [HC2-L2-T4](configs/HC2-L2-T4_startup-config.txt) |
| HC3-L2-T4 | Room 21  | [HC1-L2-T4](configs/HC3-L2-T4_startup-config.txt) |

---

### Consolidation Points

| Device     | Connected to | Config                                                 |
|------------|--------------|--------------------------------------------------------|
| CP8-L2-T4  | HC2-L2-T4    | [CP8-L2-T4.md](configs/CP8-L2-T4_startup-config.txt)   |
| CP13-L2-T4 | HC3-L2-T4    | [CP13-L2-T4.md](configs/CP13-L2-T4_startup-config.txt) |
| Rest of CP | —            | No configuration — represented only                    |   

---

### End Devices

| Device       | Type                    | VLAN               | IP               |
|--------------|-------------------------|--------------------|------------------|
| PC1-L2-T4    | Workstation             | T4_USERS (809)     | 10.76.200.20     |
| AP1-L0-T4    | Access Point            | T4_WIFI (810)      | —                |
| SMPH1-L0-T4  | Smartphone              | T4_WIFI (810)      | 10.76.192.20     |
| PH1-L0-T4    | VoIP Phone (Cisco 7960) | T4_VOIP (811)      | Pending Sprint 3 |
