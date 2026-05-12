# <span style="color: #E67E22">SRV2-L0-T5 Configuration</span>

**Type:** Server  
**Terminal:** T5  
**Level:** L0  
**VLAN:** T5_SERVERS (816)

---

## <span style="color: #1F4E79">IP Configuration</span>

| Field           | Value           |
|-----------------|-----------------|
| IPv4 Address    | 10.76.154.3     |
| Subnet Mask     | 255.255.255.0   |
| Default Gateway | 10.76.154.1     |
| DNS Server      | 10.76.154.3     |

---

## <span style="color: #1F4E79">Services Active</span>

| Service | Status                       |
|---------|------------------------------|
| HTTP    | On                           |
| HTTPS   | On                           |
| DNS     | On                           |
| DHCP    | Off (static addressing used) |
| FTP     | Off                          |

---

## <span style="color: #1F4E79">DNS Records</span>

| Type  | Name                                      | Value                                     |
|-------|-------------------------------------------|-------------------------------------------|
| A     | ns.terminal-5.rcomp-25-26-DI-G4           | 10.76.154.3                               |
| A     | server1.terminal-5.rcomp-25-26-DI-G4      | 10.76.154.2                               |
| CNAME | www.terminal-5.rcomp-25-26-DI-G4          | server1.terminal-5.rcomp-25-26-DI-G4      |
| CNAME | web.terminal-5.rcomp-25-26-DI-G4          | server1.terminal-5.rcomp-25-26-DI-G4      |
| CNAME | dns.terminal-5.rcomp-25-26-DI-G4          | ns.terminal-5.rcomp-25-26-DI-G4           |
| NS    | rcomp-25-26-DI-G4                         | ns.rcomp-25-26-DI-G4                      |
| A     | ns.rcomp-25-26-DI-G4                      | 10.76.174.3                               |

---

## Notes

- **Connected to switch:** CP3-L0-T5
- **Switch port:** FastEthernet7/1
- **Switch port mode:** access
- **VLAN assigned:** 816 (T5_SERVERS)
- **Gateway:** 10.76.154.1
- **DNS name:** ns.terminal-5.rcomp-25-26-DI-G4
- **HTTP page:** identifies Terminal 5, Group 4, Sprint 3
- **NAT:** Receives HTTP/HTTPS traffic redirected from the backbone (10.76.210.4)