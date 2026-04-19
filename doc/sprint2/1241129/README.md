# <span style="color: #E67E22">RCOMP 2025-2026 Project 1 - Sprint 2 - Member 1241129 folder</span>


This folder contains all Sprint 2 outcomes for Terminal 2, developed by member 1241129.

---

## <span style="color: #1F4E79">Terminal 2 – Packet Tracer Simulation</span>

| File            | Description                                  |
|-----------------|----------------------------------------------|
| `Terminal2.pkt` | Packet Tracer simulation file for Terminal 2 |

---

## <span style="color: #1F4E79">Documentation</span>

| File                                              | Description                                                      |
|---------------------------------------------------|------------------------------------------------------------------|
| [Terminal2-Level1.md](Level1/Terminal2-Level1.md) | Level 1 (Arrivals) — infrastructure overview and device configs  |
| [Terminal2-Level4.md](Level4/Terminal2-Level4.md) | Level 4 (Departures)— infrastructure overview and device configs |

---

## <span style="color: #1F4E79">Device Access Credentials</span>

All network devices (switches and routers) use the following credentials:

| Field    | Value        |
|----------|--------------|
| Username | `cisco`      |
| Password | `classclass` |
| Enable   | `classclass` |


---

## <span style="color: #1F4E79">IPv4 Addressing Summary</span>

| Network           | Subnet           | Gateway             |
|-------------------|------------------|---------------------|
| CAMPUS_BACKBONE   | 10.76.210.0/24   | 10.76.210.1 (RT-T2) |
| SWITCHES_DMZ (T2) | 10.76.208.128/25 | — (isolated)        |
| T2_WIFI           | 10.76.160.0/21   | 10.76.160.1         |
| T2_USERS          | 10.76.168.0/22   | 10.76.168.1         |
| T2_VOIP           | 10.76.172.0/23   | 10.76.172.1         |
| T2_SERVERS        | 10.76.174.0/25   | 10.76.174.1         |

---

## <span style="color: #1F4E79">Static Routing</span>

| Destination | Mask          | Next Hop     | Description         |
|-------------|---------------|--------------|---------------------|
| 0.0.0.0     | 0.0.0.0       | 89.73.67.238 | Default route → ISP |
| 10.76.176.0 | 255.255.240.0 | 10.76.210.2  | Terminal 3          |
| 10.76.192.0 | 255.255.240.0 | 10.76.210.3  | Terminal 4          |
| 10.76.128.0 | 255.255.224.0 | 10.76.210.4  | Terminal 5          |

---

## <span style="color: #1F4E79">Internet Connection</span>

| Device      | IP              | Role                     |
|-------------|-----------------|--------------------------|
| RT-T2 (WAN) | 89.73.67.237/30 | Terminal 2 WAN interface |
| ISP-Router  | 89.73.67.238/30 | ISP gateway              |

The ISP router has a static route for `10.76.128.0/17` pointing to `89.73.67.237`, forwarding all team traffic into the infrastructure.

---

## <span style="color: #1F4E79">VTP Domain</span>

| Field      | Value        |
|------------|--------------|
| Domain     | `rc2526dig4` |
| IC-L1-T2   | VTP Server   |
| MC-Campus  | VTP Server   |
| All others | VTP Client   |