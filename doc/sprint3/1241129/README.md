# RCOMP 2025-2026 Project 1 - Sprint 3 - Member 1241129

This folder contains all Sprint 3 outcomes for Terminal 2, developed by member 1241129.

---

## Terminal 2 – Packet Tracer Simulation

| File | Description |
|------|-------------|
| `Terminal2.pkt` | Packet Tracer simulation file for Terminal 2 (updated from Sprint 2) |

---

## Documentation

| File | Description |
|------|-------------|
| [Terminal2-Level1.md](Terminal2-Level1.md) | Sprint 3 changes for Level 1 — modified and new devices |

---

## Device Access Credentials

All network devices use the following credentials:

| Field    | Value   |
|----------|---------|
| Username | `cisco` |
| Password | `cisco` |
| Enable   | `cisco` |


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