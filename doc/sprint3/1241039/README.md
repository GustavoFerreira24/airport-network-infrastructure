# RCOMP 2025-2026 Project 1 - Sprint 3 - Member 1240901

This folder contains all Sprint 3 outcomes for Terminal 5, developed by member 1240901.

---

## Terminal 5 – Packet Tracer Simulation

| File | Description |
|------|-------------|
| `Terminal5.pkt` | Packet Tracer simulation file for Terminal 5 (updated from Sprint 2) |

---

## Documentation

| File | Description |
|------|-------------|
| [Terminal5-Infrastructure.md](Terminal5-Infrastructure.md) | Sprint 3 changes for Terminal 5 — modified and new devices |

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
| OSPF dynamic routing | ✅      | Process 1, area 0 (backbone), area 5 (T5)   |
| DHCP                 | ✅      | T5_WIFI, T5_USERS, T5_VOIP (with option 150) |
| VoIP                 | ✅      | Numbers 5001 and 5002, 2 registered phones  |
| HTTP Server (SRV2)   | ✅      | 10.76.154.3, HTTP/HTTPS enabled             |
| DNS                  | ✅      | Domain terminal-5.rcomp-25-26-DI-G4         |
| NAT                  | ✅      | HTTP/HTTPS from backbone redirected to SRV2 |
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