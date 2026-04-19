# RCOMP 2025-2026 Project 1 - Sprint 2 - Member 1241039

===========================================

## Overview

This repository contains the **Cisco Packet Tracer simulation and supporting documentation** for **Terminal 5**, developed as part of **Sprint 2** of the RCOMP project.

The goal of this sprint is to implement a **Layer 2 and Layer 3 network simulation** based on the structured cabling design produced in Sprint 1.

This includes:

* Layer 2 switching infrastructure
* VLAN creation and propagation
* Inter-VLAN routing
* IPv4 addressing
* Static routing

---

## Implemented Architecture

The network follows a hierarchical model:

Router → IC → HC → CP → End Devices

### Components

* **IC (Intermediate Cross-Connect)**
  Core switching point per level

* **HC (Horizontal Cross-Connect)**
  Distribution layer switches

* **CP (Consolidation Points)**
  Access layer switches connecting end devices

* **Router (Cisco 2811)**
  Provides inter-VLAN routing using router-on-a-stick

---

## VLAN Structure

The simulation uses the shared VLAN database defined by the team:

| VLAN ID | Name            | Purpose          |
| ------- | --------------- | ---------------- |
| 799     | CAMPUS_BACKBONE | Backbone         |
| 800     | SWITCHES_DMZ    | Management       |
| 813     | T5_USERS        | User devices     |
| 814     | T5_WIFI         | Wireless network |
| 815     | T5_VOIP         | VoIP             |
| 816     | T5_SERVERS      | Servers          |

All VLANs are propagated using **VTP** across the switching infrastructure.

---

## Layer 2 Configuration

* All inter-switch links are configured as **trunk ports**
* End-device connections use **access ports**
* **Spanning Tree Protocol (STP)** is enabled
* Switches operate under:

    * **VTP domain:** `rc2526dig4`
    * **VTP mode:** server/client depending on role

---

## Layer 3 Configuration

A **Cisco 2811 router (RT-T5)** provides inter-VLAN routing.

### Router-on-a-stick

Each VLAN is mapped to a subinterface:

| VLAN | Gateway IP  |
| ---- | ----------- |
| 800  | 10.76.208.1 |
| 813  | 10.76.144.1 |
| 814  | 10.76.128.1 |
| 815  | 10.76.152.1 |
| 816  | 10.76.154.1 |

---

## Static Routing

Static routes to other terminals are configured in the router based on the global addressing plan.

These routes will become fully operational after integration with the **campus backbone**.

---

## End Devices

Each level includes representative end devices for validation of connectivity.

### Level 0

* 1 User PCs
* 1 Management PC (DMZ)
* 1 Server
* 1 Wireless laptop
* 1 Access Point
* 1 VoIP phone

### Level 2

* 1 User PCs
* 1 Management PC (DMZ)
* 1 Wireless laptop
* 1 Access Point
* 1 VoIP phone

---

## Management Network

A dedicated management network (**VLAN 800 – SWITCHES_DMZ**) is implemented.

* Each switch is assigned a unique management IP address
* SSH is configured for secure remote access
* A management workstation is used for administration

---

## Final Remarks

The implemented solution provides a **fully functional and scalable network design** for Terminal 5, aligned with project requirements, team planning decisions, and best practices.

The infrastructure is ready for **integration into the campus-wide simulation**.
