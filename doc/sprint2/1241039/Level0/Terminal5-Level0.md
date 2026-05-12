# <span style="color: #E67E22">Terminal 5 – Level 0 (Arrivals)

## <span style="color: #1F4E79">Infrastructure Overview

This document provides an overview of the Level 0 network infrastructure for Terminal 5, including links to individual device configurations.

---

## <span style="color: #1F4E79">Network Devices

### Core Infrastructure

| Device     | Role                                 | Config                                 |
| ---------- | ------------------------------------ | -------------------------------------- |
| IC18-L0-T5 | Intermediate Cross-Connect (Room 18) | [IC18-L0-T5.md](configs/IC18-L0-T5.md) |
| RT-T5      | Terminal 5 Router                    | [RT-T5.md](configs/RT-T5.md)           |

---

### Horizontal Cross-Connects

| Device     | Location | Config                                 |
|------------|----------|----------------------------------------|
| HC1-L0-T5  | Room 1   | [HC1-L0-T5.md](configs/HC1-L0-T5.md)   |
| HC10-L0-T5 | Room 10  | [HC10-L0-T5.md](configs/HC10-L0-T5.md) |
| HC14-L0-T5 | Room 14  | Represented only                       |
| HC2-L0-T5  | Room 2   | Represented only                       |
| HC18-L0-T5 | Room 14  | Represented only                       |
| HC7-L0-T5  | Room 7   | Represented only                       |
| HC22-L0-T5 | Room 22  | Represented only                       |

---

### Consolidation Points

| Device    | Connected to | Config                               |
| --------- | ------------ | ------------------------------------ |
| CP1-L0-T5 | HC1-L0-T5    | [CP1-L0-T5.md](configs/CP1-L0-T5.md) |
| CP2-L0-T5 | HC10-L0-T5   | [CP2-L0-T5.md](configs/CP2-L0-T5.md) |
| CP3-L0-T5 | HC10-L0-T5   | [CP3-L0-T5.md](configs/CP3-L0-T5.md) |

---

### End Devices

| Device       | Type          | VLAN               | IP               |
|--------------| ------------- | ------------------ |------------------|
| PC-L0-T5     | Workstation   | T5_USERS (813)     | 10.76.144.10     |
| PC-DMZ-L0    | Management PC | SWITCHES_DMZ (800) | 10.76.208.30     |
| Server-L0-T5 | Server        | T5_SERVERS (816)   | 10.76.154.10     |
| Laptop-L0-t5 | Wireless      | T5_WIFI (814)      | 10.76.128.10     |
| AP-L0-T5     | Access Point  | T5_WIFI (814)      | —                |
| Phone-L0-T5  | VoIP          | T5_VOIP (815)      | Pending Sprint 3 |

---

## <span style="color: #1F4E79">Management IP Addresses (Switches DMZ)

| Device     | Management IP |
| ---------- | ------------- |
| IC18-L0-T5 | 10.76.208.1   |
| HC1-L0-T5  | 10.76.208.2   |
| HC10-L0-T5 | 10.76.208.4   |
| CP1-L0-T5  | 10.76.208.3   |
| CP2-L0-T5  | 10.76.208.5   |
| CP3-L0-T5  | 10.76.208.6   |
