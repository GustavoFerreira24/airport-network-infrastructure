# RCOMP 2025-2026 Project 1 - Sprint 3 - Member 1241328

This folder contains all Sprint 3 outcomes for Terminal 3, developed by member 1241328.

---

## Terminal 3 – Packet Tracer Simulation

| File            | Description                                                          |
|-----------------|----------------------------------------------------------------------|
| `Terminal3.pkt` | Packet Tracer simulation file for Terminal 3 (updated from Sprint 2) |
| `campus.pkt`    | Final integrated campus simulation with all terminals                |

---

## Documentation

| File                                       | Description                                             |
|--------------------------------------------|---------------------------------------------------------|
| [Terminal3-Level1.md](Terminal3-Level1.md) | Sprint 3 changes for Level 1 — modified and new devices |
| [Terminal3-Level2.md](Terminal3-Level2.md) | Sprint 3 changes for Level 2 — modified and new devices |

---

## Device Access Credentials

All network devices use the following credentials:

| Field    | Value        |
|----------|--------------|
| Username | `cisco`      |
| Password | `classclass` |
| Enable   | `classclass` |

---

## Sprint 3 Features Implemented

| Feature              | Status | Details                                      |
|----------------------|--------|----------------------------------------------|
| OSPF dynamic routing | ✅      | Process 1, area 0 (backbone), area 3 (T3)    |
| DHCP                 | ✅      | T3_WIFI, T3_USERS, T3_VOIP (com option 150)  |
| VoIP                 | ✅      | Números 3001 e 3002, 2 telefones registados  |
| HTTP Server          | ✅      | SRV1: 10.76.190.2, HTTP/HTTPS ativos         |
| DNS + HTTP Server    | ✅      | SRV2: 10.76.190.3, DNS/HTTP/HTTPS ativos     |
| DNS                  | ✅      | Domínio terminal-3.rcomp-25-26-DI-G4, ns em SRV2 |
| NAT                  | ✅      | HTTP/HTTPS do backbone → SRV2                |
| ACLs                 | ✅      | BACKBONE_IN, LOCAL_IN, DMZ_IN                |
| Final Integration    | ✅      | All terminals integrated into `campus.pkt`   |

---

## <span style="color: #1F4E79">Changes in Sprint 3</span>

| Device    | Change                                      | Config                                 |
|-----------|---------------------------------------------|----------------------------------------|
| RT-T3     | OSPF, DHCP, VoIP, NAT, ACLs                 | [RT-T3.txt](configs/RT-T3.txt)         |
| IC-T3-L1  | Backbone/trunk updates and redundancy links | [IC-T3-L1.txt](configs/IC-T3-L1.txt)   |
| IC-T3-L2  | Trunk/VLAN propagation updates              | [IC-T3-L2.txt](configs/IC-T3-L2.txt)   |
| CP1-L2-T3 | Added connection to SRV2-L2-T3              | [CP1-L2-T3.txt](configs/CP1-L2-T3.txt) |
| MC-Campus | Added/updated campus backbone trunks        | [MC-Campus.txt](configs/MC-Campus.txt) |

### New Devices

| Device                      | Role                    | VLAN             | IP          | Config                                 |
|-----------------------------|-------------------------|------------------|-------------|----------------------------------------|
| [SRV2-L2-T3](SRV2-L2-T3.md) | DNS + HTTP/HTTPS Server | T3_SERVERS (808) | 10.76.190.3 | [SRV2-L2-T3.md](configs/SRV2-L2-T3.md) |

### VoIP Phones

| Device    | Number | IP          | Connected to |
|-----------|--------|-------------|--------------|
| PH1-L1-T3 | 3001   | 10.76.188.2 | CP2-L1-T3    |
| PH1-L2-T3 | 3002   | 10.76.188.3 | CP1-L2-T3    |

---

## OSPF Configuration

| Terminal | Area | Router backbone IP |
|:--------:|:----:|--------------------|
| Backbone |  0   | —                  |
|    T2    |  2   | 10.76.210.1        |
|    T3    |  3   | 10.76.210.2        |
|    T4    |  4   | 10.76.210.3        |
|    T5    |  5   | 10.76.210.4        |

---

## VoIP Phone Numbers

| Terminal | Prefix | Numbers assigned |
|:--------:|:------:|------------------|
|    T2    |   2    | 2001, 2002       |
|    T3    |   3    | 3001, 3002       |
|    T4    |   4    | 4001, 4002       |
|    T5    |   5    | 5001, 5002       |

---

## DNS Domain

| Terminal  | Domain                         | NS IP       |
|:---------:|--------------------------------|-------------|
| T2 (root) | `rcomp-25-26-DI-G4`            | 10.76.174.3 |
|    T3     | `terminal-3.rcomp-25-26-DI-G4` | 10.76.190.3 |
|    T4     | `terminal-4.rcomp-25-26-DI-G4` | 10.76.206.3 |
|    T5     | `terminal-5.rcomp-25-26-DI-G4` | 10.76.154.3 |

---

## Terminal 3 DNS Domain

**Domain:** `terminal-3.rcomp-25-26-DI-G4`  
**Name server:** `ns.terminal-3.rcomp-25-26-DI-G4` → 10.76.190.3 (SRV2-L2-T3)

Full DNS records available in [SRV2-L2-T3.md](configs/SRV2-L2-T3.md).