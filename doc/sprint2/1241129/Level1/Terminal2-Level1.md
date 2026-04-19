# <span style="color: #E67E22">Terminal 2 – Level 1 (Arrivals)

## <span style="color: #1F4E79">Infrastructure Overview

This document provides an overview of the Level 1 network infrastructure for Terminal 2, including links to individual device configurations.

---

## <span style="color: #1F4E79">Network Devices

### Core Infrastructure

| Device     | Role                                 | Config                                 |
|------------|--------------------------------------|----------------------------------------|
| IC-L1-T2   | Intermediate Cross-Connect (Room 12) | [IC-L1-T2.md](configs/IC-L1-T2.md)     |
| MC-Campus  | Main Cross-Connect (Campus Backbone) | [MC-Campus.md](configs/MC-Campus.md)   |
| RT-T2      | Terminal 2 Router (Cisco 2811)       | [RT-T2.md](configs/RT-T2.md)           |
| ISP-Router | ISP Router (Internet Connection)     | [ISP-Router.md](configs/ISP-Router.md) |

---

### Horizontal Cross-Connects

| Device    | Location | Config                                 |
|-----------|----------|----------------------------------------|
| HC1-L1-T2 | Room 3   | [HC1-L1-T2.md](configs/HC1-L1-T2.md)   |
| HC2-L1-T2 | Room 6   | [HC2-L1-T2.md](configs/HC2-L1-T2.md)   |
| HC3-L1-T2 | Room 7   | No configuration — represented only    |
| HC4-L1-T2 | Room 11  | No configuration — represented only    |
| HC5-L1-T2 | Room 12  | No configuration — represented only    |

---

### Consolidation Points

| Device                  | Connected to | Config                               |
|-------------------------|--------------|--------------------------------------|
| CP1-L1-T2               | HC1-L1-T2    | [CP1-L1-T2.md](configs/CP1-L1-T2.md) |
| CP2-L1-T2               | HC1-L1-T2    | [CP2-L1-T2.md](configs/CP2-L1-T2.md) |
| CP3-L1-T2               | HC2-L1-T2    | [CP3-L1-T2.md](configs/CP3-L1-T2.md) |
| CP4-L1-T2 to CP26-L1-T2 | —            | Not represented                      |

---

### End Devices

| Device                                  | Type                    | VLAN               | IP               |
|-----------------------------------------|-------------------------|--------------------|------------------|
| [PC1-L1-T2](configs/PC1-L1-T2.md)       | Workstation             | T2_USERS (801)     | 10.76.168.2      |
| [PC-DMZ-L1-T2](configs/PC-DMZ-L1-T2.md) | Management Workstation  | SWITCHES_DMZ (800) | 10.76.208.200    |
| [SRV1-L1-T2](configs/SRV1-L1-T2.md)     | Server                  | T2_SERVERS (804)   | 10.76.174.2      |
| [LAP1-L1-T2](configs/LAP1-L1-T2.md)     | Wireless Laptop         | T2_WIFI (802)      | 10.76.160.2      |
| [AP1-L1-T2](configs/AP1-L1-T2.md)       | Access Point            | T2_WIFI (802)      | —                |
| [IP-Phone0](configs/IP-Phone0.md)       | VoIP Phone (Cisco 7960) | T2_VOIP (803)      | Pending Sprint 3 |

---

## Management IP Addresses (Switches DMZ)

| Device     | Management IP |
|------------|---------------|
| MC-Campus  | 10.76.208.139 |
| IC-L1-T2   | 10.76.208.129 |
| HC1-L1-T2  | 10.76.208.130 |
| HC2-L1-T2  | 10.76.208.131 |
| CP1-L1-T2  | 10.76.208.132 |
| CP2-L1-T2  | 10.76.208.133 |
| CP3-L1-T2  | 10.76.208.134 |