# <span style="color: #E67E22">Terminal 5 – Level 0 & Level 2 Infrastructure</span>

## <span style="color: #1F4E79">Infrastructure Overview

This document provides an overview of the Terminal 5 network infrastructure for Sprint 3. Only devices modified in this sprint are listed here. For the full infrastructure overview, refer to the Sprint 2 documentation.

---

## <span style="color: #1F4E79">Changes in Sprint 3

| Device | Change | Config |
|--------|--------|--------|
| RT-T5 | OSPF, DHCP, VoIP, NAT, ACLs | [RT-T5.md](configs/RT-T5.md) |
| CP3-L0-T5 | Added Fa7/1 → SRV2-L0-T5 | [CP3-L0-T5.md](configs/CP3-L0-T5.md) |
| CP2-L0-T5 | Configured VoIP phone port | [CP2-L0-T5.md](configs/CP2-L0-T5.md) |
| CP3-L2-T5 | Configured VoIP phone port | [CP3-L2-T5.md](configs/CP3-L2-T5.md) |

### New Devices

| Device | Role | VLAN | IP | Config |
|--------|------|------|----|--------|
| [SRV2-L0-T5](configs/SRV2-L0-T5.md) | DNS + HTTP/HTTPS Server | T5_SERVERS (816) | 10.76.154.3 | [SRV2-L0-T5.md](configs/SRV2-L0-T5.md) |

### VoIP Phones

| Device | Number | IP | Connected to |
|--------|--------|----|-------------|
| PH1-L0-T5 | 5001 | 10.76.152.2 | CP2-L0-T5 |
| PH1-L2-T5 | 5002 | 10.76.152.3 | CP3-L2-T5 |

---

## DNS Domain

**Domain:** `terminal-5.rcomp-25-26-DI-G4`  
**Name server:** `ns.terminal-5.rcomp-25-26-DI-G4` → 10.76.154.3 (SRV2-L0-T5)

Full DNS records available in [SRV2-L0-T5.md](configs/SRV2-L0-T5.md).