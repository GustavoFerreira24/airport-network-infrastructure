# <span style="color: #E67E22">Terminal 5 – Level 2 (Departures)

## <span style="color: #1F4E79">Infrastructure Overview

This document provides an overview of the Level 2 network infrastructure for Terminal 5, including links to individual device configurations.

---

## <span style="color: #1F4E79">Network Devices

### Core Infrastructure

| Device     | Role                                 | Config                                 |
| ---------- | ------------------------------------ | -------------------------------------- |
| IC22-L2-T5 | Intermediate Cross-Connect (Room 22) | [IC22-L2-T5.md](configs/IC22-L2-T5.md) |
| RT-T5      | Terminal 5 Router                    | [RT-T5.md](configs/RT-T5.md)           |

---

### Horizontal Cross-Connects

| Device     | Location | Config                                 |
|------------| -------- | -------------------------------------- |
| HC1-L2-T5  | Room 1   | [HC1-L2-T5.md](configs/HC1-L2-T5.md)   |
| HC11-L2-T5 | Room 11  | [HC11-L2-T5.md](configs/HC11-L2-T5.md) |
| HC13-L2-T5 | Room 13  | Represented only                       |
| HC17-L2-T5 | Room 17  | Represented only                       |
| HC9-L2-T5  | Room 17  | Represented only                       |
| HC22-L2-T5 | Room 17  | Represented only   
  HC26-L2-T5 | Room 17  | Represented only  
  HC7-L2-T5 | Room 17  | Represented only  
  HC2-L2-T5 | Room 17  | Represented only  

### Consolidation Points

| Device    | Connected to | Config                               |
| --------- | ------------ | ------------------------------------ |
| CP1-L2-T5 | HC1-L2-T5    | [CP1-L2-T5.md](configs/CP1-L2-T5.md) |
| CP2-L2-T5 | HC11-L2-T5   | [CP2-L2-T5.md](configs/CP2-L2-T5.md) |
| CP3-L2-T5 | HC11-L2-T5   | [CP3-L2-T5.md](configs/CP3-L2-T5.md) |

---

### End Devices

| Device       | Type                    | VLAN               | IP               |
|--------------| ----------------------- | ------------------ |------------------|
| PC-L2- T5    | Workstation             | T5_USERS (813)     | 10.76.144.20     |
| PC-DMZ-L2    | Management Workstation  | SWITCHES_DMZ (800) | 10.76.208.20     |
| Laptop-L2-T5 | Wireless Laptop         | T5_WIFI (814)      | 10.76.128.20     |
| AP-L2-T5     | Access Point            | T5_WIFI (814)      | —                |
| Phone-L2-T5  | VoIP Phone (Cisco 7960) | T5_VOIP (815)      | Pending Sprint 3 |

---

## <span style="color: #1F4E79">Management IP Addresses (Switches DMZ)

| Device     | Management IP |
| ---------- | ------------- |
| IC22-L2-T5 | 10.76.208.7   |
| HC1-L2-T5  | 10.76.208.8   |
| HC11-L2-T5 | 10.76.208.10  |
| CP1-L2-T5  | 10.76.208.9   |
| CP2-L2-T5  | 10.76.208.11  |
| CP3-L2-T5  | 10.76.208.12  |

---
