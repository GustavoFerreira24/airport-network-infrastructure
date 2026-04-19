# RCOMP 2025-2026 Project 1 - Sprint 2 - Member 1241328 folder
===========================================

##  Overview

This repository contains the **Cisco Packet Tracer simulation and supporting documentation** for **Terminal 3**, developed as part of **Sprint 2** of the RCOMP project.

The goal of this sprint is to implement a **logical Layer 2 and Layer 3 network simulation** based on the structured cabling design produced in Sprint 1.

This includes:

- Layer 2 switching infrastructure
- VLAN creation and propagation
- Inter-VLAN routing
- IPv4 addressing
- Static routing preparation
- Integration of all team members' simulations into a single `campus.pkt` file

---

##  Implemented Architecture

The network follows a hierarchical model:
Router → IC → HC → CP → End Devices

### Components

- **IC (Intermediate Cross-Connect)**  
  Core switching point per level — one per floor (`IC-T3-L1` and `IC-T3-L2`)

- **HC (Horizontal Cross-Connect)**  
  Distribution layer switches — four per floor (`HC1` to `HC4`)

- **CP (Consolidation Points)**  
  Access layer switches connecting end devices — two per floor (`CP1` and `CP2`)

- **Router (Cisco 2811)**  
  Provides inter-VLAN routing using router-on-a-stick (`RT-T3`)

---

##  VLAN Structure

The simulation uses the shared VLAN database defined by the team:

| VLAN ID | Name            | Purpose                        |
|---------|-----------------|--------------------------------|
| 799     | CAMPUS_BACKBONE | Backbone between terminals     |
| 800     | SWITCHES_DMZ    | Management                     |
| 801     | T2_USERS        | User devices Terminal 2        |
| 802     | T2_WIFI         | Wireless network Terminal 2    |
| 803     | T2_VOIP         | VoIP Terminal 2                |
| 804     | T2_SERVERS      | Servers Terminal 2             |
| 805     | T3_USERS        | User devices Terminal 3        |
| 806     | T3_WIFI         | Wireless network Terminal 3    |
| 807     | T3_VOIP         | VoIP Terminal 3                |
| 808     | T3_SERVERS      | Servers Terminal 3             |
| 809     | T4_USERS        | User devices Terminal 4        |
| 810     | T4_WIFI         | Wireless network Terminal 4    |
| 811     | T4_VOIP         | VoIP Terminal 4                |
| 812     | T4_SERVERS      | Servers Terminal 4             |
| 813     | T5_USERS        | User devices Terminal 5        |
| 814     | T5_WIFI         | Wireless network Terminal 5    |
| 815     | T5_VOIP         | VoIP Terminal 5                |
| 816     | T5_SERVERS      | Servers Terminal 5             |

All VLANs are propagated using **VTP** across all switches.

---

##  Layer 2 Configuration

- All inter-switch links are configured as **trunks**
- End-device ports are configured as **access ports**
- **Spanning Tree Protocol (STP)** is enabled on all switches
- The two ICs are interconnected via a **Copper Crossover** cable to ensure VTP propagation between floors
- Switches operate under a common:
    - **VTP domain:** `rc2526dig4`
    - **VTP mode:** `IC-T3-L1` operates as **VTP server**, all remaining switches as **VTP clients**

---

##  Layer 3 Configuration

A **Cisco 2811 router** (`RT-T3`) is used to provide inter-VLAN routing.

### Router-on-a-stick

Each VLAN is mapped to a subinterface on `FastEthernet0/0`:

| VLAN | Subinterface         | Gateway IP      | Network           |
|------|----------------------|-----------------|-------------------|
| 799  | FastEthernet0/0.799  | 10.76.210.2     | 10.76.210.0/24    |
| 805  | FastEthernet0/0.805  | 10.76.184.1     | 10.76.184.0/22    |
| 806  | FastEthernet0/0.806  | 10.76.176.1     | 10.76.176.0/21    |
| 807  | FastEthernet0/0.807  | 10.76.188.1     | 10.76.188.0/23    |
| 808  | FastEthernet0/0.808  | 10.76.190.1     | 10.76.190.0/24    |

---

##  Static Routing

Static routes to other terminals are configured in the router, forwarding traffic through the Campus Backbone:

| Destination Network  | Mask              | Next Hop      | Terminal |
|----------------------|-------------------|---------------|----------|
| 10.76.168.0          | 255.255.252.0     | 10.76.210.1   | T2       |
| 10.76.160.0          | 255.255.248.0     | 10.76.210.1   | T2       |
| 10.76.172.0          | 255.255.254.0     | 10.76.210.1   | T2       |
| 10.76.174.0          | 255.255.255.128   | 10.76.210.1   | T2       |
| 10.76.200.0          | 255.255.252.0     | 10.76.210.3   | T4       |
| 10.76.192.0          | 255.255.248.0     | 10.76.210.3   | T4       |
| 10.76.204.0          | 255.255.254.0     | 10.76.210.3   | T4       |
| 10.76.206.0          | 255.255.255.128   | 10.76.210.3   | T4       |
| 10.76.144.0          | 255.255.248.0     | 10.76.210.4   | T5       |
| 10.76.128.0          | 255.255.240.0     | 10.76.210.4   | T5       |
| 10.76.152.0          | 255.255.254.0     | 10.76.210.4   | T5       |
| 10.76.154.0          | 255.255.255.0     | 10.76.210.4   | T5       |

---

##  Switches DMZ Addressing

Each switch is assigned a management IP address within the `10.76.209.64/28` block:

| Switch      | IP Address     |
|-------------|----------------|
| IC-T3-L1    | 10.76.209.65   |
| IC-T3-L2    | 10.76.209.66   |
| HC1-L1-T3   | 10.76.209.67   |
| HC2-L1-T3   | 10.76.209.68   |
| HC3-L1-T3   | 10.76.209.69   |
| HC4-L1-T3   | 10.76.209.70   |
| HC1-L2-T3   | 10.76.209.71   |
| HC2-L2-T3   | 10.76.209.72   |
| HC3-L2-T3   | 10.76.209.73   |
| HC4-L2-T3   | 10.76.209.74   |
| CP1-L1-T3   | 10.76.209.75   |
| CP2-L1-T3   | 10.76.209.76   |
| CP1-L2-T3   | 10.76.209.77   |
| CP2-L2-T3   | 10.76.209.78   |

---

##  End Devices

Each level includes representative end devices for testing:

### Level 1 (Departures)
- 1 User PC (`PC1-L1-T3`) — VLAN 805 — `10.76.184.2/22`
- 1 User PC (`PC2-L1-T3`) — VLAN 805 — `10.76.184.3/22`
- 1 Wireless Laptop (`LAP1-L1-T3`) — VLAN 806 — `10.76.176.2/21`
- 1 Access Point (`AP1-L1-T3`) — SSID: `T3-L1-WIFI`
- 1 VoIP Phone (`PH1-L1-T3`) — VLAN 807
- 1 Management PC (`PC-DMZ-L1-T3`) — VLAN 800

### Level 2 (Arrivals)
- 1 User PC (`PC1-L2-T3`) — VLAN 805 — `10.76.184.4/22`
- 1 User PC (`PC2-L2-T3`) — VLAN 805 — `10.76.184.5/22`
- 1 Wireless Laptop (`LAP1-L2-T3`) — VLAN 806 — `10.76.176.3/21`
- 1 Access Point (`AP1-L2-T3`) — SSID: `T3-L2-WIFI`
- 1 VoIP Phone (`PH1-L2-T3`) — VLAN 807
- 1 Server (`Server-L2-T3`) — VLAN 808 — `10.76.190.2/24`

All devices are configured with **static IPv4 addressing**, except VoIP phones.

---

##  Additional Task — Campus Integration

As the member responsible for Terminal 3, an additional task was completed: integrating all team members' Packet Tracer simulations into a single **`campus.pkt`** file.

This was achieved by copying each terminal's simulation into a single Packet Tracer instance and rebuilding the backbone connections between each terminal's IC and the `MC-Campus` switch.

---

##  Final Remarks

The implemented solution provides a **fully functional and scalable network design** for Terminal 3, aligned with project requirements, team planning decisions and industry best practices.

The infrastructure is ready for **integration into the campus-wide simulation**.