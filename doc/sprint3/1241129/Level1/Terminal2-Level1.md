# <span style="color: #E67E22">Terminal 2 – Level 1 (Arrivals)

## <span style="color: #1F4E79">Infrastructure Overview

This document provides an overview of the Level 1 network infrastructure for Terminal 2 for Sprint 3. Only devices modified in this sprint are listed here. For the full infrastructure overview, refer to the [Sprint 2 documentation](../../../sprint2/1241129/README.md).

---

## <span style="color: #1F4E79">Changes in Sprint 3

| Device | Change | Config |
|--------|--------|--------|
| RT-T2 | OSPF, DHCP, VoIP, NAT, ACLs | [RT-T2.md](configs/RT-T2.md) |
| CP1-L1-T2 | Added Fa3/1 → SRV2-L1-T2 | [CP1-L1-T2.md](configs/CP1-L1-T2.md) |

### New Devices

| Device | Role | VLAN | IP | Config |
|--------|------|------|----|--------|
| [SRV2-L1-T2](configs/SRV2-L1-T2.md) | DNS + HTTP/HTTPS Server | T2_SERVERS (804) | 10.76.174.3 | [SRV2-L1-T2.md](configs/SRV2-L1-T2.md) |

### VoIP Phones

| Device | Number | IP | Connected to |
|--------|--------|----|-------------|
| PH1-L1-T2 | 2001 | 10.76.172.4 | CP2-L1-T2 |
| PH1-L4-T2 | 2002 | 10.76.172.5 | CP1-L4-T2 |

---

## DNS Domain

**Domain:** `rcomp-25-26-DI-G4`  
**Name server:** `ns.rcomp-25-26-DI-G4` → 10.76.174.3 (SRV2-L1-T2)

Full DNS records available in [SRV2-L1-T2.md](configs/SRV2-L1-T2.md).