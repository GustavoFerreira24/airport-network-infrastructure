# Terminal 4 – Level 0

## Infrastructure Overview

This document provides an overview of the Level 0 network infrastructure for Terminal 4, including links to individual device configurations.

---

## Network Devices

### Core Infrastructure

| Device    | Role                                 | Config                   |
|-----------|--------------------------------------|--------------------------|
| IC-L0-T4  | Intermediate Cross-Connect (Room 14) | [IC-L0-T4](configs/IC-T4-L0_startup-config.txt) |
| RT1-L0-T4 | Terminal 4 Router (Cisco 2811)       | [RT1-L0-T4](configs/RT1-L0-T4_startup-config.txt)  |

---

### Horizontal Cross-Connects

| Device    | Location | Config                                            |
|-----------|----------|---------------------------------------------------|
| HC1-L0-T4 | Room 4   | [HC1-L0-T4](configs/HC1-L0-T4_startup-config.txt) |
| HC2-L0-T4 | Room 12  | [HC2-L0-T4](configs/HC2-L0-T4_startup-config.txt) |
| HC3-L0-T4 | Room 16  | [HC1-L0-T4](configs/HC3-L0-T4_startup-config.txt) |

---

### Consolidation Points

| Device     | Connected to | Config                                               |
|------------|--------------|------------------------------------------------------|
| CP3-L0-T4  | HC1-L1-T2    | [CP3-L0-T4.md](configs/CP3-L0-T4_startup-config.txt) |
| Rest of CP | —            | No configuration — represented only                  |   

---

### End Devices

| Device     | Type                    | VLAN               | IP               |
|------------|-------------------------|--------------------|------------------|
| PC1-L0-T4  | Workstation             | T4_USERS (809)     | 10.76.200.10     |
| PC2-l0-T4  | Management Workstation  | SWITCHES_DMZ (800) | 10.76.209.10     |
| SRV1-L0-T4 | Server                  | T4_SERVERS (812)   | 10.76.206.10     |
| LAP1-L0-T4 | Wireless Laptop         | T4_WIFI (810)      | 10.76.192.10     |
| AP1-L0-T4  | Access Point            | T4_WIFI (810)      | —                |
| PH1-L0-T4  | VoIP Phone (Cisco 7960) | T4_VOIP (811)      | Pending Sprint 3 |

----

## <span style="color: #1F4E79">Management IP Addresses (Switches DMZ - T4 L0)</span>

| Device    | Management IP |
|-----------| ------------- |
| IC-L0-T4  | 10.76.209.1   |
| HC1-L0-T4 | 10.76.209.2   |
| HC2-L0-T4 | 10.76.209.3   |
| HC3-L0-T4 | 10.76.209.4   |
| CP3-L0-T4 | 10.76.209.5   |
