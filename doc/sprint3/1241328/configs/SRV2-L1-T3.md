# <span style="color: #E67E22">SRV2-L2-T3 Configuration</span>

**Type:** Server  
**Terminal:** T3  
**Level:** L2  
**VLAN:** T3_SERVERS (808)

---

## <span style="color: #1F4E79">IP Configuration</span>

| Field           | Value           |
|-----------------|-----------------|
| IPv4 Address    | 10.76.190.3     |
| Subnet Mask     | 255.255.255.0   |
| Default Gateway | 10.76.190.1     |
| DNS Server      | 10.76.190.3     |

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

| Type  | Name                                  | Value                                  |
|-------|---------------------------------------|----------------------------------------|
| CNAME | dns.terminal-3.rcomp-25-26-DI-G4      | ns.terminal-3.rcomp-25-26-DI-G4        |
| A     | ns.rcomp-25-26-DI-G4                  | 10.76.174.3                            |
| A     | ns.terminal-3.rcomp-25-26-DI-G4       | 10.76.190.3                            |
| NS    | rcomp-25-26-DI-G4                     | ns.rcomp-25-26-DI-G4                   |
| A     | server1.terminal-3.rcomp-25-26-DI-G4  | 10.76.190.2                            |
| CNAME | web.terminal-3.rcomp-25-26-DI-G4      | server1.terminal-3.rcomp-25-26-DI-G4   |
| CNAME | www.terminal-3.rcomp-25-26-DI-G4      | server1.terminal-3.rcomp-25-26-DI-G4   |

---

## Notes

- **Connected to switch:** CP1-L2-T3
- **Switch port:** FastEthernet3/1
- **Switch port mode:** access
- **VLAN assigned:** 808 (T3_SERVERS)
- **Gateway:** 10.76.190.1
- **DNS name:** ns.terminal-3.rcomp-25-26-DI-G4
- **DNS alias:** dns.terminal-3.rcomp-25-26-DI-G4
- **HTTP page:** identifies Terminal 3, Group 4, 2DI
- **NAT:** Receives HTTP/HTTPS traffic redirected from the backbone (10.76.210.2)