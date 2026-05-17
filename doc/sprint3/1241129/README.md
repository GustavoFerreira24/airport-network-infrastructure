# RCOMP 2025-2026 Project 1 - Sprint 3 - Member 1241129

This folder contains all Sprint 3 outcomes for Terminal 2, developed by member 1241129.

---

## Terminal 2 – Packet Tracer Simulation

| File            | Description                                                          |
|-----------------|----------------------------------------------------------------------|
| `Terminal2.pkt` | Packet Tracer simulation file for Terminal 2 (updated from Sprint 2) |

---

## Documentation

| File                                       | Description                                             |
|--------------------------------------------|---------------------------------------------------------|
| [Terminal2-Level1.md](Terminal2-Level1.md) | Sprint 3 changes for Level 1 — modified and new devices |

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

| Feature              | Status | Details                                     |
|----------------------|--------|---------------------------------------------|
| OSPF dynamic routing | ✅      | Process 1, area 0 (backbone), area 2 (T2)   |
| DHCP                 | ✅      | T2_WIFI, T2_USERS, T2_VOIP (com option 150) |
| VoIP                 | ✅      | Números 2001 e 2002, 2 telefones registados |
| HTTP Server (SRV2)   | ✅      | 10.76.174.3, HTTP/HTTPS ativos              |
| DNS                  | ✅      | Domínio rcomp-25-26-DI-G4, ns em SRV2       |
| NAT                  | ✅      | HTTP/HTTPS do backbone → SRV2               |
| ACLs                 | ✅      | BACKBONE_IN, LOCAL_IN, DMZ_IN               |

---

## <span style="color: #1F4E79">Changes in Sprint 3</span>

| Device    | Change                      | Config                                 |
|-----------|-----------------------------|----------------------------------------|
| RT-T2     | OSPF, DHCP, VoIP, NAT, ACLs | [RT-T2.txt](configs/RT-T2.txt)         |
| CP1-L1-T2 | Added Fa3/1 → SRV2-L1-T2    | [CP1-L1-T2.txt](configs/CP1-L1-T2.txt) |
| IC1-L1-T2 | Added ports for OSPF        | [IC1-L1-T2.txt](configs/IC1-L1-T2.txt) |
| MC-Campus | Added ports for OSPF        | [MC-Campus.txt](configs/MC-Campus.txt) |

### New Devices

| Device                      | Role                    | VLAN             | IP          | Config                                 |
|-----------------------------|-------------------------|------------------|-------------|----------------------------------------|
| [SRV2-L1-T2](SRV2-L1-T2.md) | DNS + HTTP/HTTPS Server | T2_SERVERS (804) | 10.76.174.3 | [SRV2-L1-T2.md](configs/SRV2-L1-T2.md) |

### VoIP Phones

| Device    | Number | IP          | Connected to |
|-----------|--------|-------------|--------------|
| PH1-L1-T2 | 2001   | 10.76.172.4 | CP2-L1-T2    |
| PH1-L4-T2 | 2002   | 10.76.172.5 | CP1-L4-T2    |

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

## Terminal 2 DNS Domain

**Domain:** `rcomp-25-26-DI-G4`  
**Name server:** `ns.rcomp-25-26-DI-G4` → 10.76.174.3 (SRV2-L1-T2)

Full DNS records available in [SRV2-L1-T2.md](configs/SRV2-L1-T2.md).