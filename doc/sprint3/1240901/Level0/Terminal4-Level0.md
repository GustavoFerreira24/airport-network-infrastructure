# <span style="color: #E67E22">Terminal 4 – Levels 0 

## <span style="color: #1F4E79">Infrastructure Overview

This document provides an overview of the Level 0 and Level 2 network infrastructure for Terminal 4 for Sprint 3. Only devices modified in this sprint are listed here. For the full infrastructure overview, refer to the Sprint 2 documentation.

---

## <span style="color: #1F4E79">Changes in Sprint 3

| Device | Change | Config                                      |
|--------|--------|---------------------------------------------|
| RT1-L0-T4 | OSPF, DHCP, VoIP, NAT, ACLs | [RT1-L0-T4](/configs/RT1-L0-T4_running-config.txt)          |
| CP3-L0-T4 | Added Fa5/1 → SRV2-L0-T4 | [CP3-L0-T4](configs/CP3-L0-T4_running-config.txt) |

### New Devices

| Device | Role | VLAN | IP | Config |
|--------|------|------|----|--------|
| [SRV2-L0-T4](configs/SRV2-L0-T4.md) | DNS + HTTP/HTTPS Server | T4_SERVERS (812) | 10.76.206.3 | [SRV2-L0-T4.md](configs/SRV2-L0-T4.md) |

### VoIP Phones

| Device | Number | IP | Connected to |
|--------|--------|----|-------------|
| PH1-L0-T4 | 4001 | 10.76.204.2 | CP3-L0-T4 |
| PH1-L2-T4 | 4002 | 10.76.204.3 | CP3-L2-T4 |

---

## DNS Domain

**Domain:** `terminal-4.rcomp-25-26-DI-G4`  
**Name server:** `ns.terminal-4.rcomp-25-26-DI-G4` → 10.76.206.3 (SRV2-L0-T4)

Full DNS records available in [SRV2-L0-T4.md](configs/SRV2-L0-T4.md).