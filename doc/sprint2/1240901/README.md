RCOMP 2025-2026 Project 1 - Sprint 2 - Member 1240901 folder
===========================================

##  Overview

This repository contains the **Cisco Packet Tracer simulation and supporting documentation** for **Terminal 4**, developed as part of **Sprint 2** of the RCOMP project.

The goal of this sprint is to implement a **logical Layer 2 and Layer 3 network simulation** based on the structured cabling design produced in Sprint 1.

This includes:

- Layer 2 switching infrastructure
- VLAN creation and propagation
- Inter-VLAN routing
- IPv4 addressing
- Static routing preparation

---

##  Implemented Architecture

The network follows a hierarchical model:
Router → IC → HC → CP → End Devices

### Components

- **IC (Intermediate Cross-Connect)**  
  Core switching point per level

- **HC (Horizontal Cross-Connect)**  
  Distribution layer switches

- **CP (Consolidation Points)**  
  Access layer switches connecting end devices

- **Router (Cisco 2811)**  
  Provides inter-VLAN routing using router-on-a-stick

---

##  VLAN Structure

The simulation uses the shared VLAN database defined by the team:

| VLAN ID | Name           | Purpose                  |
|--------|----------------|--------------------------|
| 800    | SWITCHES_DMZ   | Management               |
| 809    | T4_USERS       | User devices             |
| 810    | T4_WIFI        | Wireless network         |
| 811    | T4_VOIP        | VoIP                     |
| 812    | T4_SERVERS     | Servers                  |

All VLANs are propagated using **VTP** across all switches.

---

##  Layer 2 Configuration

- All inter-switch links are configured as **trunks**
- End-device ports are configured as **access ports**
- **Spanning Tree Protocol (STP)** is enabled on all switches
- Switches operate under a common:
    - **VTP domain:** `rc2526dig4`
    - **VTP mode:** server/client (depending on role)

---

##  Layer 3 Configuration

A **Cisco 2811 router** (`RT1-L0-T4`) is used to provide inter-VLAN routing.

### Router-on-a-stick

Each VLAN is mapped to a subinterface:

| VLAN | Gateway IP       |
|------|------------------|
| 800  | 10.76.209.1      |
| 809  | 10.76.200.1      |
| 810  | 10.76.192.1      |
| 811  | 10.76.204.1      |
| 812  | 10.76.206.1      |

---

##  Static Routing

Static routes to other terminals are **pre-configured** in the router, based on the global addressing plan.

These routes will become operational after integration with the **campus backbone** in the final stage of the project.

---

## End Devices

Each level includes representative end devices for testing:

### Level 0
- 1 User PC
- 1 Management PC
- 1 Server
- 1 Wireless laptop
- 1 Access Point
- 1 VoIP phone

### Level 2
- 1 User PC
- 1 Wireless device (smartphone)
- 1 Access Point
- 1 VoIP phone

All devices are configured with **static IPv4 addressing**, except VoIP (to be completed in Sprint 3).


---

##  Final Remarks

The implemented solution provides a **fully functional and scalable network design** for Terminal 4, aligned with project requirements, team planning decisions and industry best practices.

The infrastructure is ready for **integration into the campus-wide simulation**.
