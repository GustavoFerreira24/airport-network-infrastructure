 # RCOMP 2025-2026 Project 1 - Sprint 3 Planning

### Sprint master: 1241129

---

# 1. Sprint's backlog

The goal of Sprint 3 is to extend the Cisco Packet Tracer network simulation developed in Sprint 2, adding the following features:

- **OSPF dynamic routing** (replacing static routing)
- **DHCPv4 service**
- **VoIP service**
- **HTTP servers** (second server per DMZ)
- **DNS service** (domain tree)
- **NAT** (static, for HTTP/HTTPS redirection)
- **Static Firewall** (ACLs)

Each team member continues working on the **same terminal assigned in previous sprints**, using the integrated `campus.pkt` from Sprint 2 as the starting point.

---

## Sprint tasks and distribution

| Member  | Task  | Description |
|---------|-------|-------------|
| 1241129 | T.3.1 | Update Terminal2.pkt with Sprint 3 features for Terminal 2 |
| 1241328 | T.3.2 | Update Terminal3.pkt with Sprint 3 features for Terminal 3 + integrate all into campus.pkt |
| 1240901 | T.3.3 | Update Terminal5.pkt with Sprint 3 features for Terminal 5 |
| 1241039 | T.3.4 | Update Terminal4.pkt with Sprint 3 features for Terminal 4 |

---

## Expected outputs

Each member must deliver:

- Updated Packet Tracer simulation file (`TerminalN.pkt`)
- Document detailing DNS database records on the terminal's DNS name server
- Configuration dump files for all switches and routers within the terminal

Additionally, for Terminal 3:

- The integrated simulation file `campus.pkt`

---

# 2. Technical decisions and coordination

## Starting point

All team members must start from the integrated `campus.pkt` produced at the end of Sprint 2. Each member works exclusively on their assigned terminal's devices, with one exception: every member is responsible for migrating **all routers** from static routing to OSPF, but beyond that, no other changes are to be made to routers belonging to other terminals.

---

## OSPF dynamic routing

Static routing is replaced by OSPF in all routers. The only exception is the **default route at RT-T2**, which must be kept and redistributed into OSPF using the `default-information originate` command.

### OSPF Area IDs

| Area ID | Scope |
|:-------:|-------|
| 0 | Campus Backbone (VLAN 799 — 10.76.210.0/24) |
| 2 | Terminal 2 (all T2 networks) |
| 3 | Terminal 3 (all T3 networks) |
| 4 | Terminal 4 (all T4 networks) |
| 5 | Terminal 5 (all T5 networks) |

### OSPF configuration rules

- All routers use **OSPF process ID 1**
- Each router advertises its local networks into the corresponding terminal area
- The backbone network (10.76.210.0/24) is advertised into **area 0** by all routers
- Static routes must be removed from all routers after OSPF is confirmed working
- RT-T2 keeps the default route (`ip route 0.0.0.0 0.0.0.0 89.73.67.238`) and redistributes it with `default-information originate`

### Networks per terminal area

#### Terminal 2 (area 2)
- 10.76.160.0/21 (T2_WIFI)
- 10.76.168.0/22 (T2_USERS)
- 10.76.172.0/23 (T2_VOIP)
- 10.76.174.0/25 (T2_SERVERS)

#### Terminal 3 (area 3)
- 10.76.176.0/21 (T3_WIFI)
- 10.76.184.0/22 (T3_USERS)
- 10.76.188.0/23 (T3_VOIP)
- 10.76.190.0/24 (T3_SERVERS)

#### Terminal 4 (area 4)
- 10.76.192.0/21 (T4_WIFI)
- 10.76.200.0/22 (T4_USERS)
- 10.76.204.0/23 (T4_VOIP)
- 10.76.206.0/25 (T4_SERVERS)

#### Terminal 5 (area 5)
- 10.76.128.0/20 (T5_WIFI)
- 10.76.144.0/21 (T5_USERS)
- 10.76.152.0/23 (T5_VOIP)
- 10.76.154.0/24 (T5_SERVERS)

---

## DHCPv4 service

Each terminal's router provides DHCP to all local VLANs **except**:
- DMZ networks (T2_SERVERS, T3_SERVERS, T4_SERVERS, T5_SERVERS)
- Campus Backbone (10.76.210.0/24)
- Switches DMZ (10.76.208.0/23)

These networks use static, manually assigned IPv4 addresses.

### DHCP pool rules

- **Default gateway:** first usable IP of each subnet (router subinterface)
- **DNS server:** local terminal's DNS name server IP (see DNS section)
- **Domain name:** local terminal's DNS domain name (see DNS section)
- **VoIP VLAN pools** must include **option 150** with the router's IP on that VLAN (TFTP server address for Cisco 7960 phones)

### Example DHCP configuration (Terminal 2)

```
ip dhcp excluded-address 10.76.160.1
ip dhcp excluded-address 10.76.168.1
ip dhcp excluded-address 10.76.172.1

ip dhcp pool T2_WIFI
 network 10.76.160.0 255.255.248.0
 default-router 10.76.160.1
 dns-server 10.76.174.3
 domain-name rcomp-25-26-DI-G4

ip dhcp pool T2_USERS
 network 10.76.168.0 255.255.252.0
 default-router 10.76.168.1
 dns-server 10.76.174.3
 domain-name rcomp-25-26-DI-G4

ip dhcp pool T2_VOIP
 network 10.76.172.0 255.255.254.0
 default-router 10.76.172.1
 option 150 ip 10.76.172.1
```

---

## VoIP service

Each terminal's router provides VoIP telephony service (Cisco Telephony) for its local VoIP VLAN. Each terminal must have at least **2 connected IP phones (model 7960)**.

### Phone number schema

Each terminal uses a unique prefix digit, with 4-digit phone numbers:

| Terminal | Prefix | Example numbers |
|:--------:|:------:|-----------------|
| T2 | 2 | 2001, 2002 |
| T3 | 3 | 3001, 3002 |
| T4 | 4 | 4001, 4002 |
| T5 | 5 | 5001, 5002 |

### Call forwarding rules

When a call is destined for a prefix belonging to another terminal, it must be forwarded to that terminal's router VoIP service. Dial-peer configuration must be set up on each router to forward calls based on the prefix digit.

### Switch port configuration for VoIP phones

```
switchport mode access
no switchport access vlan
switchport voice vlan [VOIP_VLAN_ID]
```

---

## HTTP servers (second server per DMZ)

A second server must be added to each terminal's DMZ network. This server:

- Has a **static IPv4 address** (second usable IP in the DMZ subnet)
- Has **HTTP and HTTPS services enabled**
- Has a simple HTML page identifying the terminal it belongs to
- Will serve as the **DNS name server** for the terminal's DNS domain

### Server IP addresses

| Terminal | Server | IP |
|:--------:|--------|----|
| T2 | SRV2-L1-T2 | 10.76.174.3 |
| T3 | SRV2-T3 | 10.76.190.3 |
| T4 | SRV2-T4 | 10.76.206.3 |
| T5 | SRV2-T5 | 10.76.154.3 |

---

## DNS service

### Domain structure

| Terminal | DNS Domain | Name Server | NS IP |
|:--------:|------------|-------------|-------|
| T2 | `rcomp-25-26-DI-G4` | `ns.rcomp-25-26-DI-G4` | 10.76.174.3 |
| T3 | `terminal-3.rcomp-25-26-DI-G4` | `ns.terminal-3.rcomp-25-26-DI-G4` | 10.76.190.3 |
| T4 | `terminal-4.rcomp-25-26-DI-G4` | `ns.terminal-4.rcomp-25-26-DI-G4` | 10.76.206.3 |
| T5 | `terminal-5.rcomp-25-26-DI-G4` | `ns.terminal-5.rcomp-25-26-DI-G4` | 10.76.154.3 |

### DNS records required per terminal

Each DNS name server must have the following records:

| Record type | Name | Value | Description |
|-------------|------|-------|-------------|
| A | `ns.[domain]` | NS server IP | Name server address |
| A | `server1.[domain]` | HTTP server IP | HTTP server (SRV1) |
| CNAME | `www.[domain]` | `server1.[domain]` | Alias for HTTP server |
| CNAME | `web.[domain]` | `server1.[domain]` | Alias for HTTP server |
| CNAME | `dns.[domain]` | `ns.[domain]` | Alias for DNS server |

### DNS tree inter-domain records

The T2 DNS server (root domain) must additionally have:

| Record type | Name | Value |
|-------------|------|-------|
| NS | `terminal-3.rcomp-25-26-DI-G4` | `ns.terminal-3.rcomp-25-26-DI-G4` |
| A | `ns.terminal-3.rcomp-25-26-DI-G4` | 10.76.190.3 |
| NS | `terminal-4.rcomp-25-26-DI-G4` | `ns.terminal-4.rcomp-25-26-DI-G4` |
| A | `ns.terminal-4.rcomp-25-26-DI-G4` | 10.76.206.3 |
| NS | `terminal-5.rcomp-25-26-DI-G4` | `ns.terminal-5.rcomp-25-26-DI-G4` |
| A | `ns.terminal-5.rcomp-25-26-DI-G4` | 10.76.154.3 |

Each other terminal's DNS server must additionally have:

| Record type | Name | Value |
|-------------|------|-------|
| NS | `rcomp-25-26-DI-G4` | `ns.rcomp-25-26-DI-G4` |
| A | `ns.rcomp-25-26-DI-G4` | 10.76.174.3 |

### DNS clients configuration

- All end devices must use the **local terminal's DNS server**
- DHCP pools must include `dns-server` and `domain-name` options
- Servers with static addresses must be manually configured with the DNS server IP and domain name

---

## NAT (Network Address Translation)

Each router must redirect **HTTP (port 80) and HTTPS (port 443)** requests received on the backbone interface to the local DNS server.

### Static NAT rules (Terminal 2 example)

```
ip nat inside source static tcp 10.76.174.3 80 10.76.210.1 80
ip nat inside source static tcp 10.76.174.3 443 10.76.210.1 443
```

- The backbone interface (`Fa0/0.799`) is configured as `ip nat outside`
- All local VLAN subinterfaces are configured as `ip nat inside`

HTTP/HTTPS service must be enabled on the DNS server (SRV2), with a simple HTML page identifying it.

---

## Static Firewall (ACLs)

> **Important:** ACLs must be the **last feature to implement**, only after all other features are tested and working.

Traffic access policies to be enforced on each router, in order of precedence:

1. **Anti-spoofing** — block packets from external sources claiming internal source addresses, and block internal packets with external source addresses
2. **ICMP** — allow all ICMP echo requests and echo replies
3. **DMZ access** — block all traffic to the DMZ except DNS (UDP/TCP port 53) and HTTP/HTTPS (ports 80/443) to the corresponding servers; allow all traffic from the DMZ outbound
4. **Router self-protection** — block all traffic destined to the router itself, except for required services:
   - DHCP (UDP port 67/68) — including packets from source `0.0.0.0` to destination `255.255.255.255` (DHCP Discover)
   - TFTP (UDP port 69) — for VoIP phones
   - OSPF (IP protocol 89) — including multicast addresses `224.0.0.5` and `224.0.0.6`
   - NAT redirected traffic (HTTP/HTTPS ports 80/443)
   - VoIP/ITS signaling (TCP port 2000)
5. **Transit traffic** — allow all remaining traffic passing through the router

---

## Coordination rules

- Start from `campus.pkt` produced in Sprint 2
- Each member is responsible for migrating **all routers** to OSPF, but only configures their own terminal's router for all other features
- The member responsible for **Terminal 3** integrates all simulations into a single `campus.pkt`
- ACLs are implemented last, after all other features are verified working
- All DNS names must be FQDN ending in `rcomp-25-26-DI-G4`